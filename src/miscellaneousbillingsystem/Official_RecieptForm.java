package miscellaneousbillingsystem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;

public class Official_RecieptForm extends javax.swing.JFrame {

    

    public Official_RecieptForm() {
        setUndecorated(true);
        initComponents();

        infoStudent();
        feeload();
        amountload();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        Section = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Grade = new javax.swing.JLabel();
        LRN = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Amount = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Fees = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        remarkss = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(599, 421));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(796, 565));
        jPanel1.setPreferredSize(new java.awt.Dimension(595, 421));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Republic ot the Phillipines");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 20);

        print.setBackground(new java.awt.Color(0, 0, 0));
        print.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        print.setForeground(new java.awt.Color(0, 0, 0));
        print.setText("Print");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        jPanel1.add(print);
        print.setBounds(540, 10, 47, 29);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deped logo patial2 finished.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 10, 100, 58);

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Department of Education");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 20, 590, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tangub City National High School");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 60, 590, 10);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Region X - Nothern Mindanao");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 40, 590, 10);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Division of Tangub City");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 50, 590, 10);

        name.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Christian Jules A. Albatera");
        jPanel1.add(name);
        name.setBounds(40, 128, 160, 20);

        Section.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        Section.setForeground(new java.awt.Color(0, 0, 0));
        Section.setText("ICT");
        jPanel1.add(Section);
        Section.setBounds(262, 120, 70, 13);

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Receipt");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 100, 590, 19);

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Remarks:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 370, 45, 12);

        Grade.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        Grade.setForeground(new java.awt.Color(0, 0, 0));
        Grade.setText("12");
        jPanel1.add(Grade);
        Grade.setBounds(259, 130, 30, 13);

        LRN.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        LRN.setForeground(new java.awt.Color(0, 0, 0));
        LRN.setText("1223434536363");
        jPanel1.add(LRN);
        LRN.setBounds(35, 119, 140, 13);

        Date.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        Date.setForeground(new java.awt.Color(0, 0, 0));
        Date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(Date);
        Date.setBounds(440, 120, 110, 13);

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Grade:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(230, 130, 27, 11);

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Section:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(230, 120, 31, 11);

        jLabel17.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Date:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(410, 120, 22, 11);

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(310, 370, 150, 20);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jScrollPane1.setHorizontalScrollBar(null);

        Amount.setBackground(new java.awt.Color(255, 255, 255));
        Amount.setColumns(20);
        Amount.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        Amount.setForeground(new java.awt.Color(0, 0, 0));
        Amount.setRows(5);
        Amount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(Amount);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(520, 160, 40, 200);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jScrollPane2.setHorizontalScrollBar(null);

        Fees.setBackground(new java.awt.Color(255, 255, 255));
        Fees.setColumns(20);
        Fees.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        Fees.setForeground(new java.awt.Color(0, 0, 0));
        Fees.setRows(5);
        Fees.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(Fees);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 160, 490, 200);

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Paid Fees:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(270, 149, 56, 15);

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Name:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 132, 27, 11);

        jLabel18.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Signiture");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(370, 390, 90, 20);

        TOTAL.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        TOTAL.setForeground(new java.awt.Color(0, 0, 0));
        TOTAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TOTAL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(TOTAL);
        TOTAL.setBounds(510, 370, 60, 16);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        remarkss.setBackground(new java.awt.Color(255, 255, 255));
        remarkss.setColumns(20);
        remarkss.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        remarkss.setRows(5);
        remarkss.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(remarkss);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(60, 370, 220, 40);

        jLabel20.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Total:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(480, 370, 38, 16);

        jLabel21.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("LRN:");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(10, 120, 22, 11);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void infoStudent() {
        try {
            String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
            String SUser = "root";
            String SPass = "";
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            
            String sql = "SELECT si.lrn, CONCAT( "
                    + "    si.lastname, ', ', "
                    + "    si.firstname, ' ', "
                    + "    IF(si.middlename = '' OR si.middlename IS NULL, '', CONCAT(LEFT(si.middlename, 1), '.')) "
                    + ") AS fullname, "
                    + " si.section, si.grade, si.ID, "
                    + "sp.student_ID, sp.Fee_Paid, sp.`1st_Quarter`, sp.`2nd_Quarter`, sp.`3rd_Quarter`, sp.`4th_Quarter`, sp.Total_Paid, sp.Date_Q1, sp.Date_Q2, sp.Date_Q3, sp.Date_Q4, sp.remarks "
                    + "FROM student_info si "
                    + "LEFT JOIN student_payment sp ON si.ID = sp.student_ID "
                    + "WHERE si.ID = ? AND si.school_Year = ? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Session.studentID);
            pst.setString(2, Session.schoolyear);
            System.out.println("DEBUG studentID = " + Session.studentID);
            System.out.println("DEBUG schoolyear = " + Session.schoolyear);
            System.out.println("DEBUG timer = " + Session.timer);
            System.out.println("---- Running SQL ----");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String grade = rs.getString("grade");
                String sect = rs.getString("section");
                String fullname = rs.getString("fullname");
                String fullpaid = rs.getString("Total_Paid");
                String LRn = rs.getString("lrn");
                String remarks = rs.getString("remarks");
                
                Section.setText(sect);
                LRN.setText(LRn);
                name.setText(fullname);
                Date.setText(Session.timer);
                TOTAL.setText(fullpaid);
                remarkss.setText(remarks);
                
                System.out.println(grade);
                System.out.println(sect);
                System.out.println(fullname);
                System.out.println(fullpaid);
                System.out.println(LRn);
                System.out.println(remarks);

                if (grade.equals("7th")) {
                    Grade.setText("7");

                } else if (grade.equals("8th")) {
                    Grade.setText("8");

                } else if (grade.equals("9th")) {
                    Grade.setText("9");

                } else if (grade.equals("10th")) {
                    Grade.setText("10");

                } else if (grade.equals("11th")) {
                    Grade.setText("11");
                    jLabel16.setText("Strand");
                } else if (grade.equals("12th")) {
                    Grade.setText("12");
                    jLabel16.setText("Strand:");
                } else {
                    System.out.println("not good");
                }
                Grade.setText(grade);

            }
            String query = "SELECT Fee, amount FROM contribution_Paid WHERE student_ID = ? AND School_Year = ? AND Quarter = ?";
            PreparedStatement pmt = con.prepareStatement(query);
            pmt.setInt(1, Session.studentID);
            pmt.setString(2, Session.schoolyear);
            pmt.setString(3, Session.Quarter);
            ResultSet rso = pmt.executeQuery();
            while(rso.next()){
            Session.Fees.add(rso.getString("Fee"));
            Session.AmountItem.add(rso.getString("amount"));
            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void feeload() {
        
        Fees.setBorder(null);
        Fees.setFocusable(false);
        Fees.setEditable(false);
        Fees.setBackground(Color.WHITE);
        jScrollPane2.setBorder(BorderFactory.createEmptyBorder());

        remarkss.setBorder(null);
        remarkss.setFocusable(false);
        remarkss.setEditable(false);
        remarkss.setBackground(Color.WHITE);
        jScrollPane3.setBorder(BorderFactory.createEmptyBorder());

        for (int i = 0; i < Session.Fees.size(); i++) {
            Fees.append(Session.Fees.get(i) + "\n");
            System.out.println(Session.Fees.get(i));
        }
    }

    public void amountload() {
        Amount.setBorder(null);
        Amount.setFocusable(false);
        Amount.setEditable(false);
        Amount.setBackground(Color.WHITE);
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());

        for (int i = 0; i < Session.AmountItem.size(); i++) {
            Amount.append(Session.AmountItem.get(i) + "\n");
            System.out.println(Session.AmountItem.get(i));
        }

    }

    private void printReceipt() {
        try {
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Receipt Print");

            job.setPrintable((graphics, pageFormat, pageIndex) -> {
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2d = (Graphics2D) graphics;

                // Move to the printable area of the page
                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                // 🟢 Print the JFrame at its actual size (no scaling)
                jPanel1.printAll(g2d);   // <-- "this" refers to your JFrame

                return Printable.PAGE_EXISTS;
            });

            job.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }

    }


    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        print.setText("");
        printReceipt();
        Billing_MainForm main = new Billing_MainForm();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_printMouseClicked

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
            java.util.logging.Logger.getLogger(Official_RecieptForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Official_RecieptForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Official_RecieptForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Official_RecieptForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Official_RecieptForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Amount;
    private javax.swing.JLabel Date;
    private javax.swing.JTextArea Fees;
    private javax.swing.JLabel Grade;
    private javax.swing.JLabel LRN;
    private javax.swing.JLabel Section;
    private javax.swing.JLabel TOTAL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel name;
    private javax.swing.JLabel print;
    private javax.swing.JTextArea remarkss;
    // End of variables declaration//GEN-END:variables
}
