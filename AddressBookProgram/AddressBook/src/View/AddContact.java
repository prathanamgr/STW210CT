package View;

import Controller.userController;
import Model.userData;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AddContact extends javax.swing.JFrame {
    
    userData usData= new userData();
    private String Imagespath= usData.Imagespath;

    private javax.swing.JButton btnAddContact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddContactImg;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfname;
    private javax.swing.JLabel lbllname;
    private javax.swing.JLabel lblmobile;
    private javax.swing.JLabel lbltelephone;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txttelephone;

    public AddContact() {
        setUpComponents();
    }

    private void setUpComponents() {

        pnlLeft = new javax.swing.JPanel();
        lblAddContactImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        txtfname = new javax.swing.JTextField();
        lblfname = new javax.swing.JLabel();
        lbllname = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        lblmobile = new javax.swing.JLabel();
        txttelephone = new javax.swing.JTextField();
        lbltelephone = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        btnAddContact = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(750, 600);
        setTitle("Add contact");
        setLocationRelativeTo(null);

        pnlLeft.setBackground(new java.awt.Color(0, 102, 153));
        pnlLeft.setLayout(null);

        lblAddContactImg.setIcon(new javax.swing.ImageIcon(Imagespath+"addContact.png")); // NOI18N
        pnlLeft.add(lblAddContactImg);
        lblAddContactImg.setBounds(120, 140, 70, 80);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add new contact");
        pnlLeft.add(jLabel1);
        jLabel1.setBounds(60, 240, 180, 22);

        pnlRight.setBackground(new java.awt.Color(255, 255, 255));
        pnlRight.setLayout(null);

        txtfname.setBackground(new java.awt.Color(204, 204, 204));

        pnlRight.add(txtfname);
        txtfname.setBounds(30, 60, 360, 30);

        lblfname.setText("Enter first name *");
        pnlRight.add(lblfname);
        lblfname.setBounds(30, 40, 110, 14);

        lbllname.setText("Enter last name *");
        pnlRight.add(lbllname);
        lbllname.setBounds(30, 100, 120, 14);

        txtlname.setBackground(new java.awt.Color(204, 204, 204));

        pnlRight.add(txtlname);
        txtlname.setBounds(30, 120, 360, 30);

        txtemail.setBackground(new java.awt.Color(204, 204, 204));

        pnlRight.add(txtemail);
        txtemail.setBounds(30, 180, 360, 30);

        lblemail.setText("Enter email *");
        pnlRight.add(lblemail);
        lblemail.setBounds(30, 160, 120, 14);

        txtmobile.setBackground(new java.awt.Color(204, 204, 204));

        pnlRight.add(txtmobile);
        txtmobile.setBounds(30, 240, 360, 30);

        lblmobile.setText("Enter mobile number *");
        pnlRight.add(lblmobile);
        lblmobile.setBounds(30, 220, 150, 14);

        txttelephone.setBackground(new java.awt.Color(204, 204, 204));

        pnlRight.add(txttelephone);
        txttelephone.setBounds(30, 300, 360, 30);

        lbltelephone.setText("Enter telephone number");
        pnlRight.add(lbltelephone);
        lbltelephone.setBounds(30, 280, 220, 14);

        lbladdress.setText("Enter address *");
        pnlRight.add(lbladdress);
        lbladdress.setBounds(30, 340, 120, 14);

        txtaddress.setBackground(new java.awt.Color(204, 204, 204));

        pnlRight.add(txtaddress);
        txtaddress.setBounds(30, 360, 360, 30);

        btnAddContact.setBackground(new java.awt.Color(0, 102, 51));
        btnAddContact.setForeground(new java.awt.Color(255, 255, 255));
        btnAddContact.setText("Add contact");

        pnlRight.add(btnAddContact);
        btnAddContact.setBounds(103, 433, 220, 40);
        btnAddContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateInputFields();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void validateInputFields() {
        String fname = txtfname.getText().toString();
        String lname = txtlname.getText().toString();
        String email = txtemail.getText().toString();
        String mobile = txtmobile.getText().toString();
        String tel = txttelephone.getText().toString();
        String address = txtaddress.getText().toString();

        if (!fname.matches("[a-z a-z A-Z A-Z]+")) {
            JOptionPane.showMessageDialog(null, "Please enter valid first name");
            txtfname.requestFocus();
        } else if (!lname.matches("[a-z a-z A-Z A-Z]+")) {
            JOptionPane.showMessageDialog(null, "Please enter last valid name");
            txtlname.requestFocus();
        } else if (!email.matches("^[0-9a-zA-Z!#$%&;'*+\\-/\\=\\?\\^_`\\.{|}~]{1,64}@[0-9a-zA-Z]{1,255}\\.[a-zA-Z]{1,10}")) {
            JOptionPane.showMessageDialog(null, "Please enter valid email");
            txtemail.requestFocus();
        } else if (!mobile.matches("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$")) {
            JOptionPane.showMessageDialog(null, "Please enter valid mobiile number");
            txtmobile.requestFocus();
        }
        
        else if(address.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter address");
            txtaddress.requestFocus();
        }
        
        else{
            userData data= new userData();
            data.setFname(fname);
            data.setLname(lname);
            data.setEmail(email);
            data.setTel(tel);
            data.setAddress(address);
            data.setMobile(mobile);
            
            userController controller= new userController();
            int insertContactResponse= controller.addContacts(data);
            
            if(insertContactResponse==0){
               JOptionPane.showMessageDialog(null, "Email already exist, enter different email");
               txtemail.requestFocus();
            }
            
            else if(insertContactResponse==1){
                JOptionPane.showMessageDialog(null, "Mobile number already exist, enter different number");
               txtmobile.requestFocus();
            }
            
            else if(insertContactResponse==2){
                
                int yesNoButton = JOptionPane.YES_NO_OPTION;
                int confirmMessage = JOptionPane.showConfirmDialog(null, "New contact added successfully, would you like browse contacts?", "Continue", yesNoButton);
                if (confirmMessage == 0) {
                    userController controller1= new userController();
                    controller.getAllContacts();
                    dispose();
                }
                
                else{
                    txtfname.setText(null);
                    txtlname.setText(null);
                    txtaddress.setText(null);
                    txttelephone.setText(null);
                    txtmobile.setText(null);
                    txtemail.setText(null);
                }
                
            }
            
            else if(insertContactResponse==3){
                 JOptionPane.showConfirmDialog(null, "Something went wrong please try again");
            }
        }
        
        

    }

}
