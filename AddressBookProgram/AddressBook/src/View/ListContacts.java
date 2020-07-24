package View;

import Controller.userController;
import Model.userData;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListContacts extends javax.swing.JFrame {
    
    userData usData= new userData();
    private String Imagespath= usData.Imagespath;
    
    private javax.swing.JLabel btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblListContactImg;
    private javax.swing.JLabel lblsearchheading;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    public javax.swing.JTable tblcontacts;
    private javax.swing.JTextField txtSearchQuery;
    
    public ListContacts() {
        setUpComponents();
    }
    
    private void setUpComponents() {
        
        pnlLeft = new javax.swing.JPanel();
        lblListContactImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        txtSearchQuery = new javax.swing.JTextField();
        btnsearch = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblsearchheading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcontacts = new javax.swing.JTable();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(900, 700);
        setLocationRelativeTo(null);
        
        pnlLeft.setBackground(new java.awt.Color(0, 102, 153));
        pnlLeft.setLayout(null);
        
        lblListContactImg.setIcon(new javax.swing.ImageIcon(Imagespath+"searchOrListContact.png")); // NOI18N
        pnlLeft.add(lblListContactImg);
        lblListContactImg.setBounds(100, 160, 60, 60);
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List or search contacts");
        pnlLeft.add(jLabel1);
        jLabel1.setBounds(20, 220, 230, 50);
        
        pnlRight.setBackground(new java.awt.Color(255, 255, 255));
        pnlRight.setLayout(null);
        
        txtSearchQuery.setBackground(new java.awt.Color(204, 204, 204));
        txtSearchQuery.setBorder(null);
        pnlRight.add(txtSearchQuery);
        txtSearchQuery.setBounds(30, 40, 480, 30);
        
        btnsearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsearch.setIcon(new javax.swing.ImageIcon(Imagespath+"search.png")); // NOI18N
        pnlRight.add(btnsearch);
        btnsearch.setBounds(520, 40, 40, 30);
        
        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOpaque(true);
        pnlRight.add(jSeparator1);
        jSeparator1.setBounds(520, 40, 40, 30);
        
        lblsearchheading.setText("Enter the search query ......");
        pnlRight.add(lblsearchheading);
        lblsearchheading.setBounds(30, 10, 290, 30);
        
        jScrollPane1.setViewportView(tblcontacts);
        
        pnlRight.add(jScrollPane1);
        jScrollPane1.setBounds(30, 100, 530, 90);
        
        btnsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchContacts(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        
        pack();
    }// </editor-fold>                        

    private void searchContacts(MouseEvent e) {
        String searchQuery = txtSearchQuery.getText().toString();
        userController controller = new userController();
        
        if (searchQuery.equals("")) {
            controller.getAllContacts();
            dispose();
            
        } else {
            controller.searchSpecificcontacts(searchQuery);
            dispose();
        }
    }
    
}
