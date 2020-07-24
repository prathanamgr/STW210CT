package Controller;

import DB.DBConnection;
import Model.userData;
import View.ListContacts;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class userController {

    private DBConnection db = new DBConnection();
    private Connection connect;
    private String table = "user";

    public int addContacts(userData u) {

        String fname = u.getFname();
        String lname = u.getLname();
        String email = u.getEmail();
        String mobile = u.getMobile();
        String tel = u.getTel();
        String address = u.getAddress();

        String chkEmail = "";
        String chkMobile = "";

        try {
            connect = db.getCOnnectedToDatabase();
            Statement state = (Statement) connect.createStatement();

            String sql = "SELECT * FROM " + table + " WHERE email ='" + email + "' or mobile ='" + mobile + "'";

            ResultSet result = state.executeQuery(sql);
            while (result.next()) {
                chkEmail = result.getString("email");
                chkMobile = result.getString("mobile");
            }

            if (chkEmail.equals(email)) {
                return 0;
            } else if (chkMobile.equals(mobile)) {
                return 1;
            } else {
                String sql1 = "INSERT INTO " + table + "(id, fname, lname, email, mobile, tel, address) "
                        + "values(NULL, '" + fname + "',  '" + lname + "',  '" + email + "',  '" + mobile + "', '" + tel + "',  '" + address + "')";
                state.executeUpdate(sql1);
                return 2;
            }

        } catch (SQLException e) {
            System.err.print(e);
            return 3;
        }
    }

    public void getAllContacts() {

        DefaultTableModel model = new DefaultTableModel(new String[]{
            "First name",
            "Last name",
            "Email",
            "Mobile",
            "Tel",
            "Address"}, 0);

        ListContacts listContact = new ListContacts();

        try {
            connect = db.getCOnnectedToDatabase();
            Statement state = (Statement) connect.createStatement();

            String sql = "SELECT * FROM " + table;

            ResultSet result = state.executeQuery(sql);
            while (result.next()) {
                String fname = result.getString("fname");
                String lname = result.getString("lname");
                String email = result.getString("email");
                String mobile = result.getString("mobile");
                String tel = result.getString("tel");
                String address = result.getString("address");

                model.addRow(new Object[]{fname, lname, email, mobile, tel, address});
            }
            listContact.setVisible(true);
            listContact.tblcontacts.setModel(model);

        } catch (SQLException e) {
            System.err.print(e);

        }
    }

    public void searchSpecificcontacts(String query) {

        DefaultTableModel model = new DefaultTableModel(new String[]{
            "First name",
            "Last name",
            "Email",
            "Mobile",
            "Tel",
            "Address"}, 0);

        ListContacts listContact = new ListContacts();

        try {
            connect = db.getCOnnectedToDatabase();
            Statement state = (Statement) connect.createStatement();

            String sql = "SELECT * FROM " + table + " WHERE "
                    + " mobile LIKE '%" + query + "%' "
                    + " or fname LIKE '%" + query + "%' "
                    + " or lname LIKE '%" + query + "%' "
                    + " or email LIKE '%" + query + "%' "
                    + " or address LIKE '%" + query + "%' "
                    + " or tel LIKE '%" + query + "%' ";

            ResultSet result = state.executeQuery(sql);

            while (result.next()) {
                String fname = result.getString("fname");
                String lname = result.getString("lname");
                String email = result.getString("email");
                String mobile = result.getString("mobile");
                String tel = result.getString("tel");
                String address = result.getString("address");

                model.addRow(new Object[]{fname, lname, email, mobile, tel, address});

            }
            listContact.setVisible(true);
            listContact.tblcontacts.setModel(model);

        } catch (SQLException e) {
            System.err.print(e);

        }
    }
}
