/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beta;

//import AdminCategory;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Batey
 */
public final class CashierClient extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    Connection kon;
    PreparedStatement pst;
    ResultSet rs;

    public CashierClient() {
        initComponents();
//        user.setVisible(false);
//        product.setVisible(false);
//        home.setVisible(true);
//        client.setVisible(false);
        kon = Konexio.konexio();
//        tablePro();
//        new Product().table(tbl_Product);
        // new Admin().table();
//        new Product().table(tbl_User);
        new ClientsA().table();
//        new Product().table(tbl_client);
        tableClient();
//        tableUsers();
//        numberOfUser("users", jLabel25);
//        numberOfUser("clients", jLabel19);
//        numberOfUser("bills", jLabel31);
//        numberOfUser("contain", jLabel33);
//        numberOfUser("products", jLabel28);
        outStock();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_BarCode_Search = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pane_Total1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        MAIL = new javax.swing.JTextField();
        PHONE = new javax.swing.JTextField();
        FULLNAME = new javax.swing.JTextField();
        GENDER = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_client = new javax.swing.JTable();
        SEARCH = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel10.setBackground(new java.awt.Color(0, 64, 64));
        jPanel10.setPreferredSize(new java.awt.Dimension(233, 499));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Home");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 63, -1));

        jLabel40.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Invoices");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 63, -1));

        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Log Out");
        jLabel42.setName(""); // NOI18N
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 63, -1));

        jLabel43.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Clients");
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 70, -1));

        jLabel44.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Bills");
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 50, -1));

        jPanel11.setBackground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 20, -1));

        jLabel45.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel45.setText("CASHIER DASHBOARD");
        jPanel10.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 28));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beta/images/32/bakery.png"))); // NOI18N
        jPanel10.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beta/images/32/logoutwhite.png"))); // NOI18N
        jPanel10.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beta/images/32/product.png"))); // NOI18N
        jPanel10.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 329, -1, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beta/images/32/category.png"))); // NOI18N
        jPanel10.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 279, -1, -1));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beta/images/32/homewhite.png"))); // NOI18N
        jPanel10.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beta/images/32/client.png"))); // NOI18N
        jPanel10.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 64, 64));
        jLabel11.setText("Client");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 20));

        txt_BarCode_Search.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        txt_BarCode_Search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 64, 64)));
        txt_BarCode_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BarCode_SearchKeyReleased(evt);
            }
        });
        jPanel2.add(txt_BarCode_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jSeparator1.setToolTipText("");
        jSeparator1.setName(""); // NOI18N
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 980, -1));
        jSeparator1.getAccessibleContext().setAccessibleName("");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTS INFORMATIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(0, 64, 64))); // NOI18N
        jPanel4.setToolTipText("");
        jPanel4.setOpaque(false);

        jLabel18.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 64, 64));
        jLabel18.setText("ID");

        ID.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 64, 64));
        jLabel19.setText("FULL NAME");

        pane_Total1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        pane_Total1.setForeground(new java.awt.Color(0, 64, 64));
        pane_Total1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pane_Total1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beta/images/add.png"))); // NOI18N
        pane_Total1.setText("Add Client");
        pane_Total1.setToolTipText("");
        pane_Total1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 59, 49)));
        pane_Total1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pane_Total1MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 64, 64));
        jLabel25.setText("GENDER");

        jLabel26.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 64, 64));
        jLabel26.setText("MAIL");

        jLabel27.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 64, 64));
        jLabel27.setText("PHONE");

        MAIL.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N

        PHONE.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N

        FULLNAME.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N

        GENDER.setForeground(new java.awt.Color(187, 187, 187));
        GENDER.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose", "Male", "Female", "Others" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel19))
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel25))
                                .addGap(284, 284, 284))
                            .addComponent(GENDER, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(ID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pane_Total1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FULLNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FULLNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GENDER, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pane_Total1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 400, 430));
        jPanel4.getAccessibleContext().setAccessibleName("CLIENTS INFORMATIONS");

        table_client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bill  ID", "Bill Date", "Client ID", "Client name"
            }
        ));
        table_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_clientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_client);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 570, 490));

        SEARCH.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        SEARCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SEARCHKeyReleased(evt);
            }
        });
        jPanel2.add(SEARCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 280, 30));

        jLabel1.setForeground(new java.awt.Color(179, 179, 179));
        jLabel1.setText("Search by Client Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//public void tablePro() {
//        try {
//            if (!kon.isClosed()) {
//                String sql = "SELECT bar_code as \"Product Number\","
//                        + "designation,price,stock_qty as \"Quantity in stock\","
//                        + "exp_date as \"Expiration date\" FROM `products`";
//                pst = kon.prepareStatement(sql);
//                rs = pst.executeQuery();
//                tbl_Product.setModel(DbUtils.resultSetToTableModel(rs));
//            } else {
//                kon.close();
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//    }
    
    public void tableClient() {
        try {
            if (!kon.isClosed()) {
                String sql = "SELECT * FROM `tbl_Clients`";
                pst = kon.prepareStatement(sql);
                rs = pst.executeQuery();
                table_client.setModel(DbUtils.resultSetToTableModel(rs));
            } else {
                kon.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
//    public void tableUsers() {
//        try {
//            if (!kon.isClosed()) {
//                String sql = "SELECT * FROM `users`";
//                pst = kon.prepareStatement(sql);
//                rs = pst.executeQuery();
//                tbl_User.setModel(DbUtils.resultSetToTableModel(rs));
//            } else {
//                kon.close();
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//    }
    
    private void numberOfUser(String s1, JLabel label) {
        try {
            if (!kon.isClosed()) {
                String sql = "Select count(id)  from " + s1 + " ";
                pst = kon.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    String name = rs.getString("count(id)");
                    label.setText(name);
                }
            } else {
                kon.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void outStock() {
        try {
            if (!kon.isClosed()) {
                String sql = "Select count(`stock_qty`) from products where `stock_qty`<5  ";
                pst = kon.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    String name = rs.getString("count(`stock_qty`)");
//                    jLabel22.setText(name);
                }
            } else {
                kon.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new CashierDashboard().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Invoices().setVisible(true);
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ViewLogin().setVisible(true);
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new CashierClient().setVisible(true);
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new CashierBills().setVisible(true);
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited

    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered

    }//GEN-LAST:event_jPanel2MouseEntered

    private void txt_BarCode_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BarCode_SearchKeyReleased
        if(txt_BarCode_Search.getText().equals(""))
        {
//            txt_ID_Product.setText("");
//            txt_Des_Product.setText("");
//            txt_PRICE_Product.setText("");
//            txt_NATURE_Product.setText("");
//            txt_Stock_Qty.setText("");
        }
        else if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            try
            {
                if(!kon.isClosed()){
                    String query ="SELECT * FROM `products` WHERE `bar_code`='"+txt_BarCode_Search.getText()+"'";
                    pst = kon.prepareStatement(query);
                    rs=pst.executeQuery();
                    if(rs.next())
                    {
//                        String add=rs.getString("id");
//                        txt_ID_Product.setText(add);
//                        String add1=rs.getString("designation");
//                        txt_Des_Product.setText(add1);
//                        String add2=rs.getString("price");
//                        txt_PRICE_Product.setText(add2);
//                        String add3=rs.getString("nature");
//                        txt_NATURE_Product.setText(add3);
//                        String add4=rs.getString("stock_qty");
//                        txt_Stock_Qty.setText(add4);
                    }
                }
                else
                kon.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Error:: \n"+e);
            }
        }
        //        else
        //        {
            //            JOptionPane.showMessageDialog(null,"Product Not Found");
            //        }
    }//GEN-LAST:event_txt_BarCode_SearchKeyReleased

    private void table_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_clientMouseClicked
        TableModel model=table_client.getModel();
        ID.setText(model.getValueAt(table_client.getSelectedRow(),0).toString());
        FULLNAME.setText(model.getValueAt(table_client.getSelectedRow(),1).toString());
        GENDER.setSelectedItem(model.getValueAt(table_client.getSelectedRow(),2).toString());
        MAIL.setText(model.getValueAt(table_client.getSelectedRow(),3).toString());
        PHONE.setText(model.getValueAt(table_client.getSelectedRow(),4).toString());
    }//GEN-LAST:event_table_clientMouseClicked

    private void pane_Total1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pane_Total1MouseClicked
        try
        {
            String query="INSERT INTO `tbl_Clients`"
            + "( `full_name`,`gender`,`mail`, `phone`,`created_at`) "
            + "VALUES (?,?,?,?,now())";
            pst=kon.prepareStatement(query);
            pst.setString(1,FULLNAME.getText());
            pst.setString(3,MAIL.getText());
            pst.setString(2,GENDER.getSelectedItem().toString());
            pst.setString(4,PHONE.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Succefully Saved");
            ID.setText("");
            FULLNAME.setText("");
            MAIL.setText("");
            GENDER.setSelectedItem(null);
            PHONE.setText("");
            tableClient();
        }
        catch(SQLException | HeadlessException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_pane_Total1MouseClicked

    private void SEARCHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCHKeyReleased
        if (SEARCH.getText().equals("")) {
            tableClient();
        } else {
            try {
                if (!kon.isClosed()) {
                    String query = "SELECT * from tbl_Clients WHERE `full_name` like '%" + SEARCH.getText() + "%'";
                    pst = kon.prepareStatement(query);
                    rs = pst.executeQuery();
                    table_client.setModel(DbUtils.resultSetToTableModel(rs));
                } else {
                    kon.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error:: \n" + e);
            }
        }
    }//GEN-LAST:event_SEARCHKeyReleased
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CashierClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CashierClient().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FULLNAME;
    private javax.swing.JComboBox GENDER;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField MAIL;
    private javax.swing.JTextField PHONE;
    private javax.swing.JTextField SEARCH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel pane_Total1;
    private javax.swing.JTable table_client;
    private javax.swing.JTextField txt_BarCode_Search;
    // End of variables declaration//GEN-END:variables
}
