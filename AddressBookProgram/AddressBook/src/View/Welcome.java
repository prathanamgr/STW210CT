package View;

import Controller.userController;
import Model.userData;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class Welcome extends javax.swing.JFrame{
               
    private javax.swing.JLabel btnAddContact, btnListContacts, lblAddContact, lblListContacts, lblWelcomeImage;
    private javax.swing.JPanel pnlLeft, pnlRight;
      userData usData= new userData();
    private String Imagespath= usData.Imagespath;

    public Welcome() {
        setUpComponents();
    }

    private void setUpComponents() {

        pnlLeft = new javax.swing.JPanel();
        lblWelcomeImage = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        btnAddContact = new javax.swing.JLabel();
        lblAddContact = new javax.swing.JLabel();
        btnListContacts = new javax.swing.JLabel();
        lblListContacts = new javax.swing.JLabel();
        
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(700, 500);
        setTitle("Welcome");
        setLocationRelativeTo(null);

        pnlLeft.setBackground(new java.awt.Color(255, 255, 255));
        pnlLeft.setLayout(null);

        lblWelcomeImage.setIcon(new javax.swing.ImageIcon(Imagespath+"welcome.png")); // NOI18N
        pnlLeft.add(lblWelcomeImage);
        lblWelcomeImage.setBounds(0, 0, 257, 470);

        pnlRight.setBackground(new java.awt.Color(0, 102, 153));
        pnlRight.setLayout(null);

        btnAddContact.setIcon(new javax.swing.ImageIcon(Imagespath+"addContact.png")); // NOI18N
        pnlRight.add(btnAddContact);
        btnAddContact.setBounds(220, 30, 60, 70);

        lblAddContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAddContact.setForeground(new java.awt.Color(255, 255, 255));
        lblAddContact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddContact.setText("Add new contact");
        pnlRight.add(lblAddContact);
        lblAddContact.setBounds(160, 100, 170, 22);

        btnListContacts.setIcon(new javax.swing.ImageIcon(Imagespath+"searchOrListContact.png")); // NOI18N
        pnlRight.add(btnListContacts);
        btnListContacts.setBounds(220, 270, 60, 70);

        lblListContacts.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblListContacts.setForeground(new java.awt.Color(255, 255, 255));
        lblListContacts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListContacts.setText("Search or list contacts");
        pnlRight.add(lblListContacts);
        lblListContacts.setBounds(130, 340, 240, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

//        pack();

    btnAddContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToAddContact(evt);
            }
        });
    
    
   lblAddContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToAddContact(evt);
            }
        });
   
   btnListContacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listContacts(evt);
            }
        });
   
    lblListContacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listContacts(evt);
            }
        });
    
    }
    
    
    
    public static void main(String args[]) {

        new Welcome().setVisible(true);

    }
    
    private void goToAddContact(MouseEvent e){
        new AddContact().setVisible(true);
        dispose();
    }
    
    private void listContacts(MouseEvent e){
        userController controller= new userController();
        controller.getAllContacts();
        dispose();
    }

   
 
                 
}
