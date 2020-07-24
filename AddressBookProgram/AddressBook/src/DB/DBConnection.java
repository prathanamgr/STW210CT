
package DB;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
    
//    Defining variable for database connectioin
    private Connection con = null;
    private String conStrng = "jdbc:mysql://localhost/";
    private String database = "addressbook";
    private String username = "root";
    private String password = "";

//    Returning connection variable of database
    public Connection getCOnnectedToDatabase() throws SQLException {

        try {
            con = DriverManager.getConnection(conStrng+database, username, password);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (con == null) {
                con.close();
            }
        }

        return con;

    }

}
