
package miscellaneousbillingsystem;

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

public class Official_RecieptForm extends javax.swing.JFrame {

    
    public Official_RecieptForm() {
        setUndecorated(true);
        initComponents();
        
    }
    public Official_RecieptForm(int totalPaid, String feeName, String time, String Name, int studentid, String tol ) {
        setUndecorated(true);
        initComponents();
        total.setText(String.valueOf(totalPaid));
        if(tol.equals("450")){
            feen.setText("Fully Paid!");
        } else{
        feen.setText(feeName);
        }
        System.out.println(totalPaid);
        Date.setText(time);
        nametxt.setText(Name);
        No.setText(String.valueOf(studentid));
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        No = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nametxt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        feen = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        print = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Reciept");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        Date.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        Date.setForeground(new java.awt.Color(0, 0, 0));
        Date.setText("DDS");
        Date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 59, 120, -1));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Date:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        No.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        No.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, 10));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("RECIEVED ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        nametxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        nametxt.setForeground(new java.awt.Color(0, 0, 0));
        nametxt.setText("ALBATERA, CHRISTIAN JULES A.");
        nametxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 97, 290, -1));

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("P");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 10, 20));

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 140, 20));

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 0, 8)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("AUTHORIZED SIGNITURE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 20));

        feen.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        feen.setForeground(new java.awt.Color(0, 0, 0));
        feen.setText("GPS(30), SSGF(50)");
        feen.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(feen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 127, 400, -1));

        total.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 0));
        total.setText("450");
        total.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 167, 30, -1));

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("as Payment for:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 34));

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("from:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 84, -1, 40));

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("No.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tcnhs_logo12.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("National High School");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Tangub City");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        print.setBackground(new java.awt.Color(0, 0, 0));
        print.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        print.setForeground(new java.awt.Color(0, 0, 0));
        print.setText("Print");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
    private javax.swing.JLabel Date;
    private javax.swing.JLabel No;
    private javax.swing.JLabel feen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nametxt;
    private javax.swing.JLabel print;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
