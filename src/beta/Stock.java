/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beta;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author JoshBatey
 */
public class Stock extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    Connection kon;
    PreparedStatement pst;
    ResultSet rs;
    public Stock() {
        initComponents();
         kon =  new Konexio().konexio();
         tablePro();
         new Product().table(tbl_stock);
        
    }
     public void tablePro()
    {
        try
        {
            String sql ="SELECT * FROM `products`";
            pst=kon.prepareStatement(sql);
            rs=pst.executeQuery();
            tbl_stock.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_stock = new javax.swing.JTable();
        txt_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cont = new javax.swing.JTable();
        searchContain = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        SeachClient = new javax.swing.JComboBox();
        cb_Bill_Date = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        tbl_stock.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        tbl_stock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_stock.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_stock.setRowHeight(30);
        tbl_stock.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tbl_stock.getTableHeader().setResizingAllowed(false);
        tbl_stock.getTableHeader().setReorderingAllowed(false);
        tbl_stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_stockMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_stock);

        txt_search.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Product");

        tbl_cont.setAutoCreateRowSorter(true);
        tbl_cont.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        tbl_cont.setForeground(new java.awt.Color(0, 0, 153));
        tbl_cont.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Bill ID", "Product ID", "Quantity"
            }
        ));
        tbl_cont.setGridColor(new java.awt.Color(0, 0, 255));
        tbl_cont.setRequestFocusEnabled(false);
        tbl_cont.setRowHeight(26);
        tbl_cont.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tbl_cont.setShowVerticalLines(false);
        tbl_cont.getTableHeader().setReorderingAllowed(false);
        tbl_cont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_contMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_cont);

        searchContain.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        searchContain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchContainKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 64, 64));
        jLabel15.setText("Search bill ID");

        SeachClient.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        SeachClient.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0" }));
        SeachClient.setBorder(null);
        SeachClient.setOpaque(false);
        SeachClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeachClientMouseClicked(evt);
            }
        });
        SeachClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeachClientActionPerformed(evt);
            }
        });

        cb_Bill_Date.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        cb_Bill_Date.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bill Date" }));
        cb_Bill_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_Bill_DateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(searchContain, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_Bill_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SeachClient, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SeachClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_Bill_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel15))
                            .addComponent(searchContain, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beta/images/back20.png"))); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beta/images/exit20.png"))); // NOI18N
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1200, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        WindowEvent win = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         WindowEvent win = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
       this.setVisible(false);
       new Product().setVisible(true);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        this.setVisible(false);
       new Product().setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void tbl_stockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_stockMouseClicked
//        try {
//            TableModel model=tbl_stock.getModel();
//            txt_IDStock.setText(model.getValueAt(tbl_stock.getSelectedRow(),0).toString());
//            txt_qtStock.setText(model.getValueAt(tbl_stock.getSelectedRow(),1).toString());
//            Date date;
//            //date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(tbl_stock.getSelectedRow(), 2));
//            dt_stock.setDate(new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(tbl_stock.getSelectedRow(), 2)));
//            txt_stockIDProd.setText(model.getValueAt(tbl_stock.getSelectedRow(),3).toString());
//        } catch (ParseException ex) {
//            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_tbl_stockMouseClicked

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        if(txt_search.getText().equals(""))
        {
            tablePro();
        }
        else
        {
            //           try
            //           {
                //                String query ="SELECT * FROM `products` WHERE `id`='"+txt_search.getText()+"'";
                //                pst = kon.prepareStatement(query);
                //                // pst.setString(1,txt_search.getText());
                //                rs=pst.executeQuery();
                //                tbl_stock.setModel(DbUtils.resultSetToTableModel(rs));
                //          }
            //           catch(SQLException e)
            //           {
                //                JOptionPane.showMessageDialog(null,"Error:: \n"+e);
                //           }
            try
            {
                String query ="SELECT * FROM `products` WHERE `designation` like'%"+txt_search.getText()+"%'";
                pst = kon.prepareStatement(query);
                rs=pst.executeQuery();
                tbl_stock.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Error:: \n"+e);
            }
            //           try
            //           {
                //                String query ="SELECT * FROM `products` WHERE `bar_code` like '%"+txt_search.getText()+"%'";
                //                pst = kon.prepareStatement(query);
                //                // pst.setString(1,txt_search.getText());
                //                rs=pst.executeQuery();
                //                tbl_stock.setModel(DbUtils.resultSetToTableModel(rs));
                //          }
            //           catch(SQLException e)
            //           {
                //                JOptionPane.showMessageDialog(null,"Error:: \n"+e);
                //           }
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void tbl_contMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_contMouseClicked

    }//GEN-LAST:event_tbl_contMouseClicked

    private void searchContainKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchContainKeyReleased
        if(searchContain.getText().equals(""))
        {
            //tableContain();
        }
        else
        {
            try
            {
                if(!kon.isClosed()){
                    String sql ="SELECT * FROM `contain` WHERE `id_bill` like '%"+searchContain.getText()+"%'";
                    pst=kon.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tbl_cont.setModel(DbUtils.resultSetToTableModel(rs));
                }
                else
                kon.close();
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_searchContainKeyReleased

    private void SeachClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeachClientMouseClicked
        //      if(SeachClient.getSelectedItem().toString().equals("") || SeachClient.getSelectedItem().toString().equals("0") )
        //        {
            //            tableBill();
            //        }
        //        else
        //        {
            //        try
            //        {
                //            String sql ="SELECT * FROM `clients` WHERE `id` like '%"+SeachClient.getSelectedItem().toString()+"%'";
                //            pst=kon.prepareStatement(sql);
                //            rs=pst.executeQuery();
                //            tbl_Bills.setModel(DbUtils.resultSetToTableModel(rs));
                //        }
            //        catch(SQLException ex)
            //        {
                //            JOptionPane.showMessageDialog(null,ex);
                //        }
            //        }
    }//GEN-LAST:event_SeachClientMouseClicked

    private void SeachClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeachClientActionPerformed
        if(SeachClient.getSelectedItem().toString().equals("") || SeachClient.getSelectedItem().toString().equals("0") )
        {
            //tableBill();
        }
        else
        {
            try
            {
                if(!kon.isClosed()){
                    String sql ="SELECT * FROM `bills` WHERE `id_client` like '%"+SeachClient.getSelectedItem().toString()+"%'";
                    pst=kon.prepareStatement(sql);
                    rs=pst.executeQuery();
                 //   tbl_Bills.setModel(DbUtils.resultSetToTableModel(rs));
                }
                else
                kon.close();
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_SeachClientActionPerformed

    private void cb_Bill_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_Bill_DateActionPerformed
        if(0 == cb_Bill_Date.getSelectedIndex())
        {
      //      tableBill();
        }
        else
        {
            try
            {
                if(!kon.isClosed()){
                    String sql ="SELECT * FROM `bills` WHERE `bill_date` like '%"+cb_Bill_Date.getSelectedItem().toString()+"%'";
                    pst=kon.prepareStatement(sql);
                    rs=pst.executeQuery();
              //      tbl_Bills.setModel(DbUtils.resultSetToTableModel(rs));
                }
                else
                kon.close();
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null,ex);
            }
        }

    }//GEN-LAST:event_cb_Bill_DateActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox SeachClient;
    private javax.swing.JComboBox cb_Bill_Date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField searchContain;
    private javax.swing.JTable tbl_cont;
    private javax.swing.JTable tbl_stock;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
