/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beta;

//import AdminCategory;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Batey
 */
public final class Invoices extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    Connection kon;
    PreparedStatement pst;
    ResultSet rs;

    public Invoices() {
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
//        tableClient();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        cart = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        cb_Clients = new javax.swing.JComboBox();
        cb_datBill = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

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
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

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
        jLabel11.setText("Sales Reports");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 20));

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

        cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Bill  ID", "Product Name", "Price", "Quantity", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(cart);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 980, 360));

        jPanel3.setBackground(new java.awt.Color(254, 247, 247));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter Invoices", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(1, 1, 1))); // NOI18N
        jPanel3.setToolTipText("");

        cb_Clients.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cb_Clients.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Clients" }));
        cb_Clients.setMinimumSize(new java.awt.Dimension(100, 35));

        cb_datBill.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cb_datBill.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date" }));
        cb_datBill.setBorder(null);
        cb_datBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_datBillActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 64, 64));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Search");
        jLabel22.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 64, 64)));

        jPanel5.setBackground(new java.awt.Color(0, 64, 64));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Print");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 64, 64));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Report");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cb_Clients, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_datBill, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Clients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_datBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 400, 170));

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
    
//    public void tableClient() {
//        try {
//            if (!kon.isClosed()) {
//                String sql = "SELECT * FROM `clients`";
//                pst = kon.prepareStatement(sql);
//                rs = pst.executeQuery();
//                tbl_client.setModel(DbUtils.resultSetToTableModel(rs));
//            } else {
//                kon.close();
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//    }
    
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

    private void cb_datBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_datBillActionPerformed
        if (cb_datBill.getSelectedIndex() == 0  && (cb_Clients.getSelectedIndex() == 0))
        {
            tabl();
        }
        else if (cb_datBill.getSelectedIndex() != 0 && (cb_Clients.getSelectedIndex() == 0))
        {
            try
            {
                String q = "SELECT * FROM billreceipt where Bill_DATE='" + cb_datBill.getSelectedItem().toString() + "'";
                pst = kon.prepareStatement(q);
                rs = pst.executeQuery();
                tbl_facture.setModel(DbUtils.resultSetToTableModel(rs));
                try
                {
                    String qi = "SELECT sum(Amount) FROM billreceipt where Bill_DATE='" + cb_datBill.getSelectedItem().toString() + "'";
                    pst = kon.prepareStatement(qi);
                    rs = pst.executeQuery();
                    if(rs.next())
                    {
                        String sum = rs.getString("sum(Amount)");
                        lbl_total.setText(sum+" RwF");
                    }
                }
                catch(SQLException e)
                {

                }
            }
            catch(SQLException e)
            {

            }
        }
        else if (cb_datBill.getSelectedIndex() != 0 && (cb_Clients.getSelectedIndex() != 0) && (cb_Products.getSelectedIndex() == 0))
        {
            try
            {
                String q = "SELECT * FROM billreceipt where Bill_DATE LIKE '%" + cb_datBill.getSelectedItem().toString() + "%' "
                + "AND "
                + "name  LIKE '%"+cb_Clients.getSelectedItem().toString()+"%'";
                pst = kon.prepareStatement(q);
                rs = pst.executeQuery();
                tbl_facture.setModel(DbUtils.resultSetToTableModel(rs));
                try
                {
                    String qi = "SELECT sum(Amount) FROM billreceipt where Bill_DATE LIKE '%" + cb_datBill.getSelectedItem().toString() + "%' "
                    + "AND "
                    + "name  LIKE '%"+cb_Clients.getSelectedItem().toString()+"%'";
                    pst = kon.prepareStatement(qi);
                    rs = pst.executeQuery();
                    if(rs.next())
                    {
                        String sum = rs.getString("sum(Amount)");
                        if (sum == null)
                        lbl_total.setText("0.00 RwF");
                        else
                        lbl_total.setText(sum+" RwF");
                    }
                }
                catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(null,"Not Set On CHart" + e);
                }
            }
            catch(SQLException e)
            {

            }
        }
    }//GEN-LAST:event_cb_datBillActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        MessageFormat h = new MessageFormat("All Operations Performed");
        MessageFormat f = new MessageFormat("Page{0,number, integer}");
        try
        {
            tbl_facture.print(JTable.PrintMode.FIT_WIDTH,h,f);
        }
        catch(java.awt.print.PrinterException e)
        {
            JOptionPane.showMessageDialog(null,"Can't Print" + e);
        }
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        //        try
        //        {
            //            JasperDesign jd = JRXmlLoader.load("C:\\Users\\JoshBatey\\Desktop\\New Folder\\fac_subreport1.jrxml");
            //            String sql = "SELECT * FROM `billreceipt`";
            //            JRDesignQuery newQuery = new JRDesignQuery();
            //            newQuery.setText(sql);
            //            jd.setQuery(newQuery);
            //            JasperReport jr = JasperCompileManager.compileReport(jd);
            //            JasperPrint jp = JasperFillManager.fillReport(jr,null,kon);
            //            JasperViewer.viewReport(jp);
            //        }
        //        catch (JRException ex)
        //        {
            //            Logger.getLogger(Bills.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_jPanel4MouseClicked
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
            java.util.logging.Logger.getLogger(Invoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Invoices().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cart;
    private javax.swing.JComboBox cb_Clients;
    private javax.swing.JComboBox cb_datBill;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_BarCode_Search;
    // End of variables declaration//GEN-END:variables
}
