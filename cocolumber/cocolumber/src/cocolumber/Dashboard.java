package cocolumber;


public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null); // center on screen
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnStaff = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();
        btnProducts = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COCOLUMBER SALES & INVENTORY SYSTEM");
        setBackground(new java.awt.Color(0, 102, 102));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setBackground(new java.awt.Color(102, 102, 102));
        btnLogout.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 170, -1));

        btnReports.setBackground(new java.awt.Color(102, 102, 102));
        btnReports.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnReports.setForeground(new java.awt.Color(255, 255, 255));
        btnReports.setText("View Reports");
        btnReports.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });
        jPanel2.add(btnReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 170, -1));

        btnStaff.setBackground(new java.awt.Color(102, 102, 102));
        btnStaff.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnStaff.setForeground(new java.awt.Color(255, 255, 255));
        btnStaff.setText("Manage Staff");
        btnStaff.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffActionPerformed(evt);
            }
        });
        jPanel2.add(btnStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 170, -1));

        btnSales.setBackground(new java.awt.Color(102, 102, 102));
        btnSales.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnSales.setForeground(new java.awt.Color(255, 255, 255));
        btnSales.setText("Sales Transactions");
        btnSales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });
        jPanel2.add(btnSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 170, -1));

        btnProducts.setBackground(new java.awt.Color(102, 102, 102));
        btnProducts.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnProducts.setText("Manage Products");
        btnProducts.setFocusPainted(false);
        btnProducts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsActionPerformed(evt);
            }
        });
        jPanel2.add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 170, -1));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("COCOLUMBER SALES SYSTEM ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 240, 140));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 450));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 70));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("Welcome, Admin!️");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 174, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 320, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        new SalesForm("admin").setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_btnSalesActionPerformed

    private void btnStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffActionPerformed
        new StaffForm().setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_btnStaffActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new LoginForm().setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        new ReportsForm().setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
        new ProductForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProductsActionPerformed

    
    public static void main(String args[]) {
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

  
}
