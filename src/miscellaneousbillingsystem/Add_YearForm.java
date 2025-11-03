
package miscellaneousbillingsystem;



import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.UIManager;


public class Add_YearForm extends javax.swing.JFrame {

   
    public Add_YearForm() {
        UIManager.put("ScrollBarUI", "miscellaneousbillingsystem.ScrollBarWin11");
        initComponents();
        System.out.println(Session.role);
         if(Session.role.equals("School Staff")){        
         addyearbtn.setVisible(false);
         undoyearbtn.setVisible(false);
         jLabel2.setText("Select Year:");
         int x = 140;
         int y = 50;
         int y2 = 70;
         yearselect.setLocation(x, y2);
         jLabel3.setLocation(x, y);
         }
         undoyearbtn.setVisible(false);
         loadSchoolYears();
    }  
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Restart = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        addyear = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        yearselect = new javax.swing.JComboBox<>();
        addyearbtn = new javax.swing.JButton();
        undoyearbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Restart.setBackground(new java.awt.Color(255, 255, 255));
        Restart.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        Restart.setForeground(new java.awt.Color(0, 102, 0));
        Restart.setText("Confirm");
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });
        jPanel1.add(Restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select year:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        addyear.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        addyear.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(addyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        yearselect.setBackground(new java.awt.Color(0, 153, 0));
        yearselect.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        yearselect.setForeground(new java.awt.Color(255, 255, 255));
        yearselect.setMaximumRowCount(7);
        yearselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        yearselect.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        yearselect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yearselectMouseClicked(evt);
            }
        });
        jPanel1.add(yearselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 160, 30));

        addyearbtn.setBackground(new java.awt.Color(255, 255, 255));
        addyearbtn.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        addyearbtn.setForeground(new java.awt.Color(0, 102, 0));
        addyearbtn.setText("Add Year");
        addyearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addyearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addyearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        undoyearbtn.setBackground(new java.awt.Color(255, 255, 255));
        undoyearbtn.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        undoyearbtn.setForeground(new java.awt.Color(0, 102, 0));
        undoyearbtn.setText("Undo");
        undoyearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoyearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(undoyearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, -1));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage/Select Year:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menubackground123.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void loadSchoolYears() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String sql = "SELECT Year FROM school_year ORDER BY id DESC";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            yearselect.removeAllItems(); // clear old data
            while (rs.next()) {
                yearselect.addItem(rs.getString("Year"));
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void addyearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addyearbtnActionPerformed
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
    String SUser = "root";
    String SPass = "";

    try {
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

        // Get latest year from DB (not just from ComboBox)
        String getLastYearSql = "SELECT Year FROM school_year ORDER BY id DESC LIMIT 1";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(getLastYearSql);

        String newYear = "";
        if (rs.next()) {
            String lastYear = rs.getString("Year"); // e.g. "2024-2025"

            String[] parts = lastYear.split("-");
            int start = Integer.parseInt(parts[0]);  // 2024
            int end = Integer.parseInt(parts[1]);    // 2025

            int newStart = start + 1;
            int newEnd = end + 1;

            newYear = newStart + "-" + newEnd; // e.g. "2025-2026"
        } else {
            // If no year exists in DB, start with current year
            int start = java.time.Year.now().getValue();
            newYear = start + "-" + (start + 1);
        }

        // Insert new year into DB
        String insertSql = "INSERT INTO school_year (Year) VALUES (?)";
        PreparedStatement pst = con.prepareStatement(insertSql);
        pst.setString(1, newYear);
        pst.executeUpdate();
        pst.close();

        // Reload ComboBox from DB so it stays updated
        loadSchoolYears();
        yearselect.setSelectedItem(newYear);
        undoyearbtn.setVisible(true);
        addyear.setText("Added Successfully!");
        rs.close();
        stmt.close();
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_addyearbtnActionPerformed

    private void undoyearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoyearbtnActionPerformed
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
    String SUser = "root";
    String SPass = "";

    try {
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

        // Get the last inserted year
        String getLastYearSql = "SELECT id FROM school_year ORDER BY id DESC LIMIT 1";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(getLastYearSql);

        if (rs.next()) {
            int lastId = rs.getInt("id");

            // Delete the last year
            String deleteSql = "DELETE FROM school_year WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(deleteSql);
            pst.setInt(1, lastId);
            pst.executeUpdate();
            pst.close();

            loadSchoolYears();

            // Hide Undo button again after undo
            undoyearbtn.setVisible(false);
            addyear.setText("");
        }

        rs.close();
        stmt.close();
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_undoyearbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Billing_MainForm main = new Billing_MainForm();
       main.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartActionPerformed
       String newyear = yearselect.getSelectedItem().toString();
       Session.schoolyear = newyear;
       Billing_MainForm main = new Billing_MainForm();
       main.setVisible(true);
       dispose();
    }//GEN-LAST:event_RestartActionPerformed

    private void yearselectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearselectMouseClicked
        
    }//GEN-LAST:event_yearselectMouseClicked

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Add_YearForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_YearForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_YearForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_YearForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

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
                new Add_YearForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Restart;
    private javax.swing.JLabel addyear;
    private javax.swing.JButton addyearbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton undoyearbtn;
    private javax.swing.JComboBox<String> yearselect;
    // End of variables declaration//GEN-END:variables
}
