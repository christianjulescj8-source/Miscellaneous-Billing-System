/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miscellaneousbillingsystem;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JRadioButton;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import javax.swing.UIManager;

public class SPSdiscountForm extends javax.swing.JFrame {

    private ArrayList<Integer> ids = new ArrayList<>();
    private ArrayList<Double> Itemprice = new ArrayList<>();
    private ArrayList<Double> discountedItems = new ArrayList<>();
    private ArrayList<Double> discountAmounts = new ArrayList<>();

    public SPSdiscountForm() {
        initComponents();
        ids.clear();
        Itemprice.clear();
        discountedItems.clear();
        discountAmounts.clear();
        confirm.setVisible(false);
        loadPaidFees();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Rooler = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        cityMeet = new javax.swing.JRadioButton();
        provincialMeet = new javax.swing.JRadioButton();
        regionalMeet = new javax.swing.JRadioButton();
        nationalMeet = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo smaller.png"))); // NOI18N
        jPanel2.add(logo);
        logo.setBounds(0, 5, 95, 95);

        Rooler.setFont(new java.awt.Font("Baskerville Old Face", 0, 70)); // NOI18N
        Rooler.setForeground(new java.awt.Color(0, 0, 0));
        Rooler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rooler.setText("SPS Discount");
        jPanel2.add(Rooler);
        Rooler.setBounds(0, 20, 610, 71);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 610, 100);

        confirm.setBackground(new java.awt.Color(255, 255, 255));
        confirm.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        confirm.setForeground(new java.awt.Color(0, 153, 0));
        confirm.setText("Confirm");
        confirm.setBorderPainted(false);
        confirm.setFocusPainted(false);
        confirm.setFocusable(false);
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel1.add(confirm);
        confirm.setBounds(499, 410, 100, 27);

        buttonGroup1.add(cityMeet);
        cityMeet.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        cityMeet.setForeground(new java.awt.Color(255, 255, 255));
        cityMeet.setText("25% - City Meet");
        cityMeet.setFocusPainted(false);
        cityMeet.setFocusable(false);
        cityMeet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cityMeetMouseClicked(evt);
            }
        });
        cityMeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityMeetActionPerformed(evt);
            }
        });
        jPanel1.add(cityMeet);
        cityMeet.setBounds(20, 170, 120, 20);

        buttonGroup1.add(provincialMeet);
        provincialMeet.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        provincialMeet.setForeground(new java.awt.Color(255, 255, 255));
        provincialMeet.setText("50% - Provincial Meet");
        provincialMeet.setFocusPainted(false);
        provincialMeet.setFocusable(false);
        provincialMeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provincialMeetActionPerformed(evt);
            }
        });
        jPanel1.add(provincialMeet);
        provincialMeet.setBounds(20, 260, 160, 20);

        buttonGroup1.add(regionalMeet);
        regionalMeet.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        regionalMeet.setForeground(new java.awt.Color(255, 255, 255));
        regionalMeet.setText("75% - Regional Meet");
        regionalMeet.setFocusPainted(false);
        regionalMeet.setFocusable(false);
        regionalMeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionalMeetActionPerformed(evt);
            }
        });
        jPanel1.add(regionalMeet);
        regionalMeet.setBounds(332, 170, 150, 20);

        buttonGroup1.add(nationalMeet);
        nationalMeet.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        nationalMeet.setForeground(new java.awt.Color(255, 255, 255));
        nationalMeet.setText("100% - National Meet");
        nationalMeet.setFocusPainted(false);
        nationalMeet.setFocusable(false);
        nationalMeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalMeetActionPerformed(evt);
            }
        });
        jPanel1.add(nationalMeet);
        nationalMeet.setBounds(330, 260, 150, 20);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 0));
        jButton2.setText("Back");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 408, 76, 30);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("This form is for discounts only for attended events.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 120, 610, 30);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("participated in the City Meet.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(43, 210, 330, 15);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Discount granted to students who ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(43, 190, 330, 15);

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" for and attended the Provincial Meet.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(350, 210, 330, 15);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Discount granted to students who qualified");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(353, 190, 330, 15);

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Discount granted to students who ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(43, 280, 330, 15);

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("represented the school in the Regional Meet.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(43, 300, 330, 15);

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Discount granted to students who ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(355, 280, 330, 15);

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("represented the school in the Regional Meet.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(355, 300, 330, 15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void loadPaidFees() {

        try {
            String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
            String SUser = "root";
            String SPass = "";
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String sqlPaid = "SELECT Fee_paid FROM student_payment WHERE student_ID = ?";
            PreparedStatement pstPaid = con.prepareStatement(sqlPaid);
            pstPaid.setInt(1, Session.studentID);
            ResultSet rsPaid = pstPaid.executeQuery();

            String feePaid = "";
            if (rsPaid.next()) {
                feePaid = rsPaid.getString("Fee_paid");

                if (feePaid == null) {
                    feePaid = "";
                }
            }

            Set<String> paidSet = new HashSet<>();
            for (String token : feePaid.split(",")) {
                paidSet.add(token.trim());
            }

            String sqlFees = "SELECT ID_Contribution, Fee, amount FROM contribution_paid WHERE student_ID =? AND School_Year =? ";
            PreparedStatement pstFees = con.prepareStatement(sqlFees);
            pstFees.setInt(1, Session.studentID);
            pstFees.setString(2, Session.schoolyear);
            ResultSet rsFees = pstFees.executeQuery();

            DefaultTableModel model = new DefaultTableModel(new String[]{"ID_Contribution", "Fee", "amount"}, 0);
            jTable1.setModel(model);

            while (rsFees.next()) {
                String name = rsFees.getString("Fee");
                int amount = rsFees.getInt("amount");
                String ID = rsFees.getString("ID_Contribution");

                model.addRow(new Object[]{ID, name, amount});

            }
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(0).setWidth(0);
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(0).setWidth(0);
            jTable1.setFocusable(false);
            jTable1.setDefaultEditor(Object.class, null);

            for (int i = 0; i < model.getRowCount(); i++) {
                Object value = model.getValueAt(i, 0);
                ids.add(Integer.parseInt(value.toString()));
            }
            for (int i = 0; i < model.getRowCount(); i++) {
                Object value = model.getValueAt(i, 2);

                Itemprice.add(Double.parseDouble(value.toString()));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private String forRemark;

    private void applyDiscount(double discountPercent) {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";
        try {
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String sql = "SELECT * FROM student_payment where student_ID = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Session.studentID);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String remark = rs.getString("remarks");
                discountedItems.clear();
                discountAmounts.clear();
                confirm.setVisible(true);
                if (discountPercent == 25.0) {
                    if (remark == null || remark.isEmpty()) {
                        this.forRemark = "25% discount granted for City Meet participation.";
                    } else {
                        this.forRemark = remark + "\n25% discount granted for City Meet participation.";
                    }
                } else if (discountPercent == 50.0) {
                    if (remark == null || remark.isEmpty()) {
                        this.forRemark = "50% discount granted for Provincial Meet participation.";
                    } else {
                        this.forRemark = remark + "\n25% discount granted for Provincial Meet participation.";
                    }
                } else if (discountPercent == 75.0) {
                    if (remark == null || remark.isEmpty()) {
                        this.forRemark = "75% discount granted for Regional Meet participation.";
                    } else {
                        this.forRemark = remark + "\n25% discount granted for Regional Meet participation.";
                    }
                } else if (discountPercent == 100.0) {
                    if (remark == null || remark.isEmpty()) {
                        this.forRemark = "100% discount granted for National Meet participation.";
                    } else {
                        this.forRemark = remark + "\n25% discount granted for National Meet participation.";
                    }
                }
                double discountRate = discountPercent / 100;

                for (double price : Itemprice) {
                    double discountAmount = price * discountRate;
                    double finalPrice = price - discountAmount;

                    discountedItems.add(finalPrice);
                    discountAmounts.add(discountAmount);
                }
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        Session.Discount = true;

        try (Connection con = DriverManager.getConnection(SUrl, SUser, SPass)) {

            String updateFeeSQL = "UPDATE contribution_paid SET amount = ? WHERE ID_Contribution = ?";
            try (PreparedStatement pst = con.prepareStatement(updateFeeSQL)) {
                for (int i = 0; i < ids.size(); i++) {
                    pst.setDouble(1, discountedItems.get(i));
                    pst.setInt(2, ids.get(i));
                    pst.executeUpdate();
                }
            }
            String rema = "UPDATE student_payment SET remarks = ? WHERE student_ID = ? AND School_Year =? ";
            PreparedStatement ps = con.prepareStatement(rema);
            ps.setString(1, this.forRemark);
            ps.setInt(2, Session.studentID);
            ps.setString(3, Session.schoolyear);
            ps.executeUpdate();
            String Q1 = "1st";
            String Q2 = "2nd";
            String Q3 = "3rd";
            String Q4 = "4th";
            String sql1 = "SELECT SUM(amount) AS TOTAL1 FROM contribution_paid WHERE Quarter = ? AND student_ID = ? AND School_Year=?";
            String sql2 = "SELECT SUM(amount) AS TOTAL2 FROM contribution_paid WHERE Quarter = ? AND student_ID = ? AND School_Year=?";
            String sql3 = "SELECT SUM(amount) AS TOTAL3 FROM contribution_paid WHERE Quarter = ? AND student_ID = ? AND School_Year=?";
            String sql4 = "SELECT SUM(amount) AS TOTAL4 FROM contribution_paid WHERE Quarter = ? AND student_ID = ? AND School_Year=?";
            String sql5 = "SELECT SUM(amount) AS TOTAL5 FROM contribution_paid WHERE student_ID = ? AND School_Year=?";
            String Query1 = "UPDATE student_payment SET 1st_Quarter = ?, 2nd_Quarter = ?, 3rd_Quarter= ?, 4th_Quarter = ?, Total_Paid = ? WHERE student_ID = ?";
            PreparedStatement pst1 = con.prepareStatement(sql1);
            pst1.setString(1, Q1);
            pst1.setInt(2, Session.studentID);
            pst1.setString(3, Session.schoolyear);
            ResultSet rs1 = pst1.executeQuery();
            PreparedStatement pst2 = con.prepareStatement(sql2);
            pst2.setString(1, Q2);
            pst2.setInt(2, Session.studentID);
            pst2.setString(3, Session.schoolyear);
            ResultSet rs2 = pst2.executeQuery();
            PreparedStatement pst3 = con.prepareStatement(sql3);
            pst3.setString(1, Q3);
            pst3.setInt(2, Session.studentID);
            pst3.setString(3, Session.schoolyear);
            ResultSet rs3 = pst3.executeQuery();
            PreparedStatement pst4 = con.prepareStatement(sql4);
            pst4.setString(1, Q4);
            pst4.setInt(2, Session.studentID);
            pst4.setString(3, Session.schoolyear);
            ResultSet rs4 = pst4.executeQuery();
            PreparedStatement pst5 = con.prepareStatement(sql5);
            pst5.setInt(1, Session.studentID);
            pst5.setString(2, Session.schoolyear);
            ResultSet rs5 = pst5.executeQuery();
            PreparedStatement pmt = con.prepareStatement(Query1);
            if (rs1.next() && rs2.next() && rs3.next() && rs4.next() && rs5.next()) {
                double Quarter1 = rs1.getDouble("TOTAL1");
                double Quarter2 = rs2.getDouble("TOTAL2");
                double Quarter3 = rs3.getDouble("TOTAL3");
                double Quarter4 = rs4.getDouble("TOTAL4");
                double total = rs5.getDouble("TOTAL5");
                pmt.setDouble(1, Quarter1);
                pmt.setDouble(2, Quarter2);
                pmt.setDouble(3, Quarter3);
                pmt.setDouble(4, Quarter4);
                pmt.setDouble(5, total);
                pmt.setInt(6, Session.studentID);
                pmt.executeUpdate();
            }
           
            Session.IDoffee = ids;
            Session.AmountItem = Itemprice;
            Session.dicountedAmount = discountAmounts;

            
            Official_RecieptForm reciept = new Official_RecieptForm();
            reciept.setVisible(true);
            dispose();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void cityMeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityMeetActionPerformed

        applyDiscount(25);
    }//GEN-LAST:event_cityMeetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Billing_MainForm Main = new Billing_MainForm();
        Main.setVisible(true);
        dispose();
        Session.Fees.clear();
        Session.AmountItem.clear();
        Session.dicountedPrice.clear();
        Session.dicountedAmount.clear();
        Session.IDoffee.clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nationalMeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalMeetActionPerformed
        applyDiscount(100);
    }//GEN-LAST:event_nationalMeetActionPerformed

    private void provincialMeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provincialMeetActionPerformed
        applyDiscount(50);

    }//GEN-LAST:event_provincialMeetActionPerformed

    private void cityMeetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityMeetMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cityMeetMouseClicked

    private void regionalMeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionalMeetActionPerformed
        applyDiscount(75);

    }//GEN-LAST:event_regionalMeetActionPerformed

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
            java.util.logging.Logger.getLogger(SPSdiscountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPSdiscountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPSdiscountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPSdiscountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SPSdiscountForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Rooler;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cityMeet;
    private javax.swing.JButton confirm;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logo;
    private javax.swing.JRadioButton nationalMeet;
    private javax.swing.JRadioButton provincialMeet;
    private javax.swing.JRadioButton regionalMeet;
    // End of variables declaration//GEN-END:variables
}
