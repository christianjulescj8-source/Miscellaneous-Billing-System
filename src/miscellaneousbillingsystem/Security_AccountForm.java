package miscellaneousbillingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Security_AccountForm extends javax.swing.JFrame {

    private String co;

    public Security_AccountForm() {
        UIManager.put("ScrollBarUI", "miscellaneousbillingsystem.ScrollBarWin11");
        initComponents();
        delete.setVisible(false);
        approve.setVisible(false);
        Reject.setVisible(false);
        loadAccountData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Rooler = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        approve = new javax.swing.JButton();
        Reject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo4.png"))); // NOI18N

        Rooler.setFont(new java.awt.Font("Baskerville Old Face", 0, 70)); // NOI18N
        Rooler.setForeground(new java.awt.Color(0, 0, 0));
        Rooler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rooler.setText("Accounts");
        Rooler.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(962, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Rooler, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rooler, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Middle Name", "Last Name", "1st Quarter", "2nd Quarter", "3rd Quarter", "4th Quarter", "Total Paid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(230, 230, 230));
        jTable1.setRowHeight(28);
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(51, 0, 0));
        delete.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        approve.setBackground(new java.awt.Color(0, 0, 153));
        approve.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        approve.setForeground(new java.awt.Color(255, 255, 255));
        approve.setText("Approve");
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });

        Reject.setBackground(new java.awt.Color(255, 0, 0));
        Reject.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Reject.setForeground(new java.awt.Color(255, 255, 255));
        Reject.setText("Reject");
        Reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(284, 284, 284)
                        .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Reject, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(approve)
                    .addComponent(Reject)
                    .addComponent(delete))
                .addContainerGap())
        );

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void loadAccountData() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear text fields           
            delete.setVisible(false);
            approve.setVisible(false);
            Reject.setVisible(false);
            // Query with all needed columns
            String sql = "SELECT * From security_account";

            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = new DefaultTableModel();

            // 👇 Define custom user-friendly headers
            String[] columnHeaders = {
                "ID", "Role", "Full Name", "Username", "Password",
                "Code", "Time Created", "Status"
            };

            for (String header : columnHeaders) {
                model.addColumn(header);
            }

            // Fill rows
            int columnCount = columnHeaders.length;
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            // Apply model
            jTable1.setModel(model);

            // Hide unwanted columns (example: hide Grade, Identifier, IDs, etc.)
            int[] hiddenCols = {0};
            for (int colIndex : hiddenCols) {
                jTable1.getColumnModel().getColumn(colIndex).setMinWidth(0);
                jTable1.getColumnModel().getColumn(colIndex).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(colIndex).setWidth(0);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            //"ID", "Role", "Full Name", "Username", "Password", 
            //"Code", "Time Created"
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String Code = model.getValueAt(selectedRow, 5).toString();
            this.co = Code;
            delete.setVisible(true);
            approve.setVisible(true);
            Reject.setVisible(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Billing_MainForm main = new Billing_MainForm();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        loadAccountData();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {

            return;
        }

        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String Code = jTable1.getValueAt(selectedRow, 5).toString();
            String role = jTable1.getValueAt(selectedRow, 1).toString();
            String query = "DELETE FROM security_account WHERE recovery_code=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Code);
            pst.executeUpdate();
            if (role.equals("Administrator")) {
                String query1 = "DELETE FROM admin_account WHERE recovery_code=?";
                PreparedStatement pst1 = con.prepareStatement(query1);
                pst1.setString(1, Code);
                pst1.executeUpdate();
                delete.setVisible(false);
                loadAccountData();
            } else if (role.equals("School Staff")) {
                String query1 = "DELETE FROM user_account WHERE recovery_code=?";
                PreparedStatement pst1 = con.prepareStatement(query1);
                pst1.setString(1, Code);
                pst1.executeUpdate();
                delete.setVisible(false);
                loadAccountData();
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_deleteActionPerformed

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {

            return;
        }

        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String Code = jTable1.getValueAt(selectedRow, 5).toString();
            String role = jTable1.getValueAt(selectedRow, 1).toString();
            String query = "UPDATE security_account SET Status=? WHERE recovery_code=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "approved");
            pst.setString(2, Code);
            pst.executeUpdate();
            if (role.equals("Administrator")) {
                String query1 = "UPDATE admin_account SET Status=? WHERE recovery_code=?";
                PreparedStatement pst1 = con.prepareStatement(query1);
                pst1.setString(1, "approved");
                pst1.setString(2, Code);
                pst1.executeUpdate();
                delete.setVisible(false);
                loadAccountData();
            } else if (role.equals("School Staff")) {
                String query1 = "UPDATE user_account SET Status=? WHERE recovery_code=?";
                PreparedStatement pst1 = con.prepareStatement(query1);
                pst1.setString(1, "approved");
                pst1.setString(2, Code);
                pst1.executeUpdate();
                delete.setVisible(false);
                loadAccountData();
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_approveActionPerformed

    private void RejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {

            return;
        }

        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String Code = jTable1.getValueAt(selectedRow, 5).toString();
            String role = jTable1.getValueAt(selectedRow, 1).toString();
            String query = "UPDATE security_account SET Status=? WHERE recovery_code=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "rejected");
            pst.setString(2, Code);
            pst.executeUpdate();
            if (role.equals("Administrator")) {
                String query1 = "UPDATE admin_account SET Status=? WHERE recovery_code=?";
                PreparedStatement pst1 = con.prepareStatement(query1);
                pst1.setString(1, "rejected");
                pst1.setString(2, Code);
                pst1.executeUpdate();
                delete.setVisible(false);
                loadAccountData();
            } else if (role.equals("School Staff")) {
                String query1 = "UPDATE user_account SET Status=? WHERE recovery_code=?";
                PreparedStatement pst1 = con.prepareStatement(query1);
                pst1.setString(1, "rejected");
                pst1.setString(2, Code);
                pst1.executeUpdate();
                delete.setVisible(false);
                loadAccountData();
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_RejectActionPerformed

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
            java.util.logging.Logger.getLogger(Security_AccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Security_AccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Security_AccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Security_AccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            // Set look and feel first (optional)
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            // Apply custom scrollbar globally
            UIManager.put("ScrollBarUI", "miscellaneousbillingsystem.ScrollBarWin11");
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Security_AccountForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reject;
    private javax.swing.JLabel Rooler;
    private javax.swing.JButton approve;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
