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

    private String lrn;
    private ArrayList<String> fee;
    private ArrayList<String> amount;
    private int total = 0;

    public Official_RecieptForm() {
        setUndecorated(true);
        initComponents();

    }

    public Official_RecieptForm(int totalPaid,
            String feeName,
            String time,
            String Name,
            int studentid,
            String tol,
            String LRn,
            ArrayList<String> Feesss,
            ArrayList<String> amounts,
            String remark) {
        setUndecorated(true);
        initComponents();
        name.setText(Name);
        LRN.setText(LRn);
        this.lrn = LRn;
        this.fee = Feesss;
        this.amount = amounts;
        remarkss.setText(remark);
        Date.setText(time);
        infoStudent();
        feeload();
        amountload();
        if (tol.equals("450")) {

        } else {

        }
        System.out.println(totalPaid);

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
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(796, 565));
        jPanel1.setPreferredSize(new java.awt.Dimension(397, 1123));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Republic ot the Phillipines");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 795, 30));

        print.setBackground(new java.awt.Color(0, 0, 0));
        print.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        print.setForeground(new java.awt.Color(0, 0, 0));
        print.setText("Print");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deped logo patial2 finished.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 100, -1));

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Department of Education");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 795, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tangub City National High School");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 795, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Region X - Nothern Mindanao");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 795, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Division of Tangub City");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 795, -1));

        name.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Christian Jules A. Albatera");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 138, 270, 20));

        Section.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        Section.setForeground(new java.awt.Color(0, 0, 0));
        Section.setText("ICT");
        jPanel1.add(Section, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 121, 110, 13));

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Receipt");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 800, -1));

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Remarks:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        Grade.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        Grade.setForeground(new java.awt.Color(0, 0, 0));
        Grade.setText("12");
        jPanel1.add(Grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 141, 70, 13));

        LRN.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        LRN.setForeground(new java.awt.Color(0, 0, 0));
        LRN.setText("1223434536363");
        jPanel1.add(LRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 121, 200, 13));

        Date.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        Date.setForeground(new java.awt.Color(0, 0, 0));
        Date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 130, 13));

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Grade:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Section:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jLabel17.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Date:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 150, 20));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jScrollPane1.setHorizontalScrollBar(null);

        Amount.setBackground(new java.awt.Color(255, 255, 255));
        Amount.setColumns(20);
        Amount.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        Amount.setForeground(new java.awt.Color(0, 0, 0));
        Amount.setRows(5);
        Amount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(Amount);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 40, 270));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jScrollPane2.setHorizontalScrollBar(null);

        Fees.setBackground(new java.awt.Color(255, 255, 255));
        Fees.setColumns(20);
        Fees.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        Fees.setForeground(new java.awt.Color(0, 0, 0));
        Fees.setRows(5);
        Fees.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(Fees);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 680, 270));

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Paid Fees:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Name:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel18.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Signiture");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 90, 20));

        TOTAL.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        TOTAL.setForeground(new java.awt.Color(0, 0, 0));
        TOTAL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 60, 16));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        remarkss.setBackground(new java.awt.Color(255, 255, 255));
        remarkss.setColumns(20);
        remarkss.setRows(5);
        remarkss.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(remarkss);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 440, -1));

        jLabel20.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Total:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, -1, -1));

        jLabel21.setFont(new java.awt.Font("Baskerville Old Face", 0, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("LRN:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void infoStudent() {
        try {
            String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
            String SUser = "root";
            String SPass = "";
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String sql = "SELECT * FROM student_info WHERE lrn = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, this.lrn);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String grade = rs.getString("grade");
                String sect = rs.getString("section");
                Section.setText(sect);
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

                } else if (grade.equals("12th")) {
                    Grade.setText("12");

                } else {
                    System.out.println("not good");
                }
                Grade.setText(grade);

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
        
        for (int i = 0; i < fee.size(); i++) {
            Fees.append(fee.get(i) + "\n");
        }
    }

    public void amountload() {
        Amount.setBorder(null);
        Amount.setFocusable(false);
        Amount.setEditable(false);
        Amount.setBackground(Color.WHITE);
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        
        for (int i = 0; i < amount.size(); i++) {
            Amount.append(amount.get(i) + "\n");
            int value = Integer.parseInt(amount.get(i));
            this.total += value;
        }
        TOTAL.setText(String.valueOf(total));
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

            boolean ok = job.printDialog();
            if (ok) {
                job.print();
            }
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
