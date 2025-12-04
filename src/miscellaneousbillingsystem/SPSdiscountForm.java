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
        confirm.setVisible(false);
        loadPaidFees();
        laodDiscount();
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

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
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
        jPanel1.add(regionalMeet);
        regionalMeet.setBounds(332, 170, 150, 20);

        buttonGroup1.add(nationalMeet);
        nationalMeet.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        nationalMeet.setForeground(new java.awt.Color(255, 255, 255));
        nationalMeet.setText("100% - National Meet");
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

            // 1. Get Fee_paid for this student
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

            // 2. Put all paid acronyms into a HashSet for quick lookup
            Set<String> paidSet = new HashSet<>();
            for (String token : feePaid.split(",")) {
                paidSet.add(token.trim()); // trim spaces
            }

            // 3. Query all fees
            String sqlFees = "SELECT ID, Name_of_contribution, amount, Acronym FROM miscellaneous_fee";
            PreparedStatement pstFees = con.prepareStatement(sqlFees);
            ResultSet rsFees = pstFees.executeQuery();

            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name of Contribution", "Amount", "Acronym"}, 0);
            jTable1.setModel(model);
            System.out.println("Raw Fee_paid: " + feePaid);
            // 4. Only add fees that are NOT in paidSet
            while (rsFees.next()) {
                String name = rsFees.getString("Name_of_contribution");
                int amount = rsFees.getInt("amount");
                String ID = rsFees.getString("ID");
                String acronym = rsFees.getString("Acronym");
                if (paidSet.contains(ID)) {
                    model.addRow(new Object[]{ID, name, amount, acronym});
                }
            }
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(0).setWidth(0);
            jTable1.getColumnModel().getColumn(3).setMinWidth(0);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(3).setWidth(0);
            jTable1.setFocusable(false);
            jTable1.setDefaultEditor(Object.class, null);
            
            

            for (int i = 0; i < model.getRowCount(); i++) {
            Object value = model.getValueAt(i, 0); // column 0 = ID
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

    public void laodDiscount() {

        double discount1 = 25;
        double discount2 = 50;
        double discount3 = 75;
        double discount4 = 100;

        if (cityMeet.isSelected()) {
            confirm.setVisible(true);
            double discountRate = (discount1 / 100);
            for (double price : Itemprice) {
                double discountAmount = price * discountRate;
                double finalPrice = price - discountAmount;

                discountedItems.add(finalPrice);
                discountAmounts.add(discountAmount);

            }
            double totalDiscount = 0;

            for (double d : discountAmounts) {
                totalDiscount += d;
            }
            
        } else if (provincialMeet.isSelected()) {
            confirm.setVisible(true);
            double discountRate = (discount2 / 100);
            for (double price : Itemprice) {
                double discountAmount = price * discountRate;
                double finalPrice = price - discountAmount;

                discountedItems.add(finalPrice);
                discountAmounts.add(discountAmount);
                System.out.println(price);

            }
            double totalDiscount = 0;
            for (double d : discountAmounts) {
                totalDiscount += d;
            }
        } else if (regionalMeet.isSelected()) {
            confirm.setVisible(true);
            double discountRate = (discount3 / 100);
            for (double price : Itemprice) {
                double discountAmount = price * discountRate;
                double finalPrice = price - discountAmount;

                discountedItems.add(finalPrice);
                discountAmounts.add(discountAmount);

            }
            double totalDiscount = 0;
            for (double d : discountAmounts) {
                totalDiscount += d;
            }
        } else if (nationalMeet.isSelected()) {
            confirm.setVisible(true);
            double discountRate = (discount4 / 100);
            for (double price : Itemprice) {
                double discountAmount = price * discountRate;
                double finalPrice = price - discountAmount;

                discountedItems.add(finalPrice);
                discountAmounts.add(discountAmount);

            }
            double totalDiscount = 0;
            for (double d : discountAmounts) {
                totalDiscount += d;
            }
        }

    }
    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
       String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
        for(int i = 0; i < ids.size(); i++){
        double discountedItem = discountedItems.get(i);
        
        int feeID = ids.get(i);
        
        Session.Discount = true;
        Session.IDoffee = ids;
        Session.dicountedAmount = discountAmounts;
        Session.dicountedPrice = discountedItems;
        String sql = "UPDATE contribution_paid SET amount = ? WHERE Fee_ID =?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, feeID);
        pst.setDouble(2, discountedItem);
        pst.executeUpdate();
        Official_RecieptForm reciept = new Official_RecieptForm();
        reciept.setVisible(true);
        dispose();
        }
        }catch(Exception e){
        
        
        
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void cityMeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityMeetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityMeetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nationalMeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalMeetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalMeetActionPerformed

    private void provincialMeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provincialMeetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provincialMeetActionPerformed

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
