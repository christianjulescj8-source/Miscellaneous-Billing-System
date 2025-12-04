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

public class PaymentForm extends javax.swing.JFrame {

    private List<String> selectedItems = new ArrayList<>();
    private List<String> Feesss = new ArrayList<>();
    private List<String> amounts = new ArrayList<>();
    private Stack<Object[]> removedRows = new Stack<>();

    private ArrayList<Double> Itemprice = new ArrayList<>();
    private List<String> IDofFees = new ArrayList<>();
    private int totalAmount = 0;

    public PaymentForm() {
        UIManager.put("ScrollBarUI", "miscellaneousbillingsystem.ScrollBarWin11");
        initComponents();
        startClock();
        loadTable();
        FeePaid();
    }
    private String Name;
    private String fee;
    private int studentid;
    private int numbersib;
    private String LRn;

    public PaymentForm(int studID, String Name, String feeq, int numberofsib, String Lrn, String remark) {
        UIManager.put("ScrollBarUI", "miscellaneousbillingsystem.ScrollBarWin11");
        initComponents();
        startClock();
        loadTable();
        this.Name = Name;
        this.fee = feeq;
        this.LRn = Lrn;
        Session.studentID = studID;
        this.studentid = studID;
        this.numbersib = numberofsib;

        System.out.println("Siblings " + numberofsib);
        System.out.println(studID);
        LRN.setText(Lrn);
        Nameshow.setText(Name);
        remarks.setText(remark);
        System.out.println(feeq);

        startClock();
        loadTable();
        FeePaid();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fiscalyear = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Rooler = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        CLOCK = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        LRN = new javax.swing.JLabel();
        Paymentfor = new javax.swing.JLabel();
        Nameshow = new javax.swing.JLabel();
        Confirm = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Total = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Qu2 = new javax.swing.JRadioButton();
        Qu3 = new javax.swing.JRadioButton();
        Qu4 = new javax.swing.JRadioButton();
        Qu1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        remarks = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Rooler.setFont(new java.awt.Font("Baskerville Old Face", 0, 58)); // NOI18N
        Rooler.setForeground(new java.awt.Color(0, 0, 0));
        Rooler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rooler.setText("PAYMENT");
        jPanel3.add(Rooler, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 990, 60));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo4.png"))); // NOI18N
        jPanel3.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CLOCK.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        CLOCK.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(CLOCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 400, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 94));

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "LRN", "Firstname", "Middlename", "Lastname", "Section", "Grade", "address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 169, 980, 230));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        LRN.setFont(new java.awt.Font("Baskerville Old Face", 0, 35)); // NOI18N
        LRN.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 520, 40));

        Paymentfor.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Paymentfor.setForeground(new java.awt.Color(255, 255, 255));
        Paymentfor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(Paymentfor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 820, 28));

        Nameshow.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        Nameshow.setForeground(new java.awt.Color(255, 255, 255));
        Nameshow.setText("Albatera, Christian Jules A.");
        jPanel1.add(Nameshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 135, 717, -1));

        Confirm.setBackground(new java.awt.Color(255, 255, 255));
        Confirm.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        Confirm.setForeground(new java.awt.Color(0, 153, 0));
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 0));
        jButton3.setText("Undo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 79, -1));

        Total.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        Total.setForeground(new java.awt.Color(255, 255, 255));
        Total.setText("0");
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 115, -1));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("For:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        buttonGroup1.add(Qu2);
        Qu2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Qu2.setForeground(new java.awt.Color(255, 255, 255));
        Qu2.setText("2nd Quarter");
        jPanel1.add(Qu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        buttonGroup1.add(Qu3);
        Qu3.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Qu3.setForeground(new java.awt.Color(255, 255, 255));
        Qu3.setText("3rd Quarter");
        jPanel1.add(Qu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        buttonGroup1.add(Qu4);
        Qu4.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Qu4.setForeground(new java.awt.Color(255, 255, 255));
        Qu4.setText("4th Quarter");
        jPanel1.add(Qu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        buttonGroup1.add(Qu1);
        Qu1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Qu1.setForeground(new java.awt.Color(255, 255, 255));
        Qu1.setText("1st Quarter");
        Qu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Qu1ActionPerformed(evt);
            }
        });
        jPanel1.add(Qu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Remarks:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        remarks.setBackground(new java.awt.Color(255, 255, 255));
        remarks.setColumns(20);
        remarks.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        remarks.setForeground(new java.awt.Color(0, 0, 0));
        remarks.setRows(5);
        jScrollPane2.setViewportView(remarks);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 580, -1));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, -1));

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LRN:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 0));
        jButton2.setText("Relations");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void FeePaid() {
        try {
            String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
            String SUser = "root";
            String SPass = "";
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // 1. Get Fee_paid for this student
            String sqlPaid = "SELECT Fee_paid FROM student_payment WHERE student_ID = ?";
            PreparedStatement pstPaid = con.prepareStatement(sqlPaid);
            pstPaid.setInt(1, this.studentid);
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
                if (!paidSet.contains(ID)) {
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
            
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadTable() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String sql = "SELECT Name_of_contribution, Acronym,	amount, acronym_of_Fee, ID FROM `miscellaneous_fee` ";
            String sql2 = "SELECT * FROM student_payment WHERE student_ID=?";

            PreparedStatement stmt = con.prepareStatement(sql);
            PreparedStatement stsmt = con.prepareStatement(sql2);
            stsmt.setInt(1, this.studentid);
            ResultSet rst = stsmt.executeQuery();
            ResultSet rs = stmt.executeQuery();
            if (rst.next()) {
                int quarter1 = rst.getInt("1st_Quarter");
                int quarter2 = rst.getInt("2nd_Quarter");
                int quarter3 = rst.getInt("3rd_Quarter");
                int quarter4 = rst.getInt("4th_Quarter");
                if (quarter1 > 0) {
                    Qu1.setEnabled(false);
                    Qu2.setSelected(true);
                    if (quarter3 > 0) {
                        Qu3.setEnabled(false);
                    }
                    if (quarter4 > 0) {
                        Qu4.setEnabled(false);
                    }
                    System.out.println("naa sa first");
                    if (quarter2 > 0) {
                        Qu2.setEnabled(false);
                        Qu3.setSelected(true);
                        System.out.println("naa sa second");
                        if (quarter3 > 0) {
                            Qu3.setEnabled(false);
                            Qu4.setSelected(true);
                            System.out.println("naa sa third");
                        }
                    }
                } else if (quarter2 > 0) {

                    Qu2.setEnabled(false);
                    Qu3.setSelected(true);
                    if (quarter3 > 0) {
                        Qu3.setEnabled(false);
                        Qu4.setSelected(true);
                    }
                } else if (quarter3 > 0) {
                    Qu3.setEnabled(false);
                    Qu4.setSelected(true);
                } else {
                    Qu1.setSelected(true);
                }

            }
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();

            // Add all columns to the model
            String[] columnheader = {"Name of Contribution", "Acronym", "Amount", "Acronym of Fee", "ID"};
            for (String Header : columnheader) {
                model.addColumn(Header);
            }

            // Fill rows
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            // Apply model
            jTable1.setModel(model);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            // Hide unwanted columns (keep only LRN_Students, firstname, middlename, lastname, section)
            int[] hiddenCols = {1, 3, 4}; // indexes start at 0
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

    class SelectedFee {

        int feeId;        // ID
        String feeName;   // Full name
        String acronym;   // Already contains Acronym(amount)
        int amount;       // Fee amount

        public SelectedFee(int feeId, String feeName, String acronym, int amount) {
            this.feeId = feeId;
            this.feeName = feeName;
            this.acronym = acronym;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return acronym;  // show only Acronym column
        }
    }

    private void updateSelectedLabel() {
        if (selectedItems.isEmpty()) {
            Paymentfor.setText("");
        } else {
            Paymentfor.setText(String.join(", ", selectedItems));
        }
    }

    private void updateTotalLabel() {
        Total.setText(String.valueOf(totalAmount + ".00"));
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();
        if (row != -1) {
            String value = jTable1.getValueAt(row, 3).toString(); // Acronym(amount)
            String value2 = jTable1.getValueAt(row, 2).toString();
            String value3 = jTable1.getValueAt(row, 1).toString();
            String value5 = jTable1.getValueAt(row, 0).toString();
            double value4 = Integer.parseInt(jTable1.getValueAt(row, 2).toString());
            if (!selectedItems.contains(value)) {
                selectedItems.add(value);
                amounts.add(value2);
                Feesss.add(value3);
                Itemprice.add(value4);
                IDofFees.add(value5);
                Object[] rowData = new Object[tableModel.getColumnCount()];
                for (int i = 0; i < tableModel.getColumnCount(); i++) {
                    rowData[i] = tableModel.getValueAt(row, i);
                }
                removedRows.push(rowData);

                int amount = Integer.parseInt(jTable1.getValueAt(row, 2).toString()); // Amount
                totalAmount += amount;

                updateTotalLabel();
                tableModel.removeRow(row);
                updateSelectedLabel();
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

        if (!selectedItems.isEmpty() && !removedRows.isEmpty()) {
            // Remove last from label list
            selectedItems.remove(selectedItems.size() - 1);
            amounts.remove(amounts.size() - 1);
            Feesss.remove(Feesss.size() - 1);
            Itemprice.remove(Itemprice.size() - 1);

            IDofFees.remove(IDofFees.size() - 1);
            // Restore row back to table
            Object[] lastRow = removedRows.pop();
            tableModel.addRow(lastRow);

            int amount = Integer.parseInt(lastRow[2].toString()); // Amount column
            totalAmount -= amount;

            updateTotalLabel();
            updateSelectedLabel();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Billing_MainForm main = new Billing_MainForm();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed

        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";
        try (Connection con = DriverManager.getConnection(SUrl, SUser, SPass)) {
            Session.Discount = false;
            // 2. Get entered amount
            double amount = Double.parseDouble(Total.getText());
            int size = selectedItems.size();
            int count = 0;
            while (size == count) {

                String recordpayment = "UPDATE student_payment set Fee_paid =?";
                PreparedStatement fee = con.prepareStatement(recordpayment);
                fee.setString(1, selectedItems.get(count));
                fee.executeUpdate();
                count++;
            }
            // 3. Get current payment recor            
            String sqlPayment = "SELECT * FROM student_payment WHERE student_ID = ?";
            PreparedStatement psPay = con.prepareStatement(sqlPayment);
            psPay.setInt(1, this.studentid);
            ResultSet rsPay = psPay.executeQuery();

            if (rsPay.next()) {
                double q1 = rsPay.getInt("1st_Quarter");
                double q2 = rsPay.getInt("2nd_Quarter");
                double q3 = rsPay.getInt("3rd_Quarter");
                double q4 = rsPay.getInt("4th_Quarter");
                String date1 = rsPay.getString("Date_Q1");
                String date2 = rsPay.getString("Date_Q2");
                String date3 = rsPay.getString("Date_Q3");
                String date4 = rsPay.getString("Date_Q4");
                String feePaid = rsPay.getString("Fee_paid");

                String sql = "SELECT SUM(amount) AS total_amount FROM miscellaneous_fee";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    int totalfull = rs.getInt("total_amount");

                    if (feePaid == null) {
                        feePaid = "";
                    }
                    if (amount != 0) {
                        // 4. Find next unpaid quarter
                        if (Qu1.isSelected()) {
                            q1 = amount;
                            date1 = CLOCK.getText().toString();
                        } else if (Qu2.isSelected()) {
                            q2 = amount;
                            date2 = CLOCK.getText().toString();
                        } else if (Qu3.isSelected()) {
                            q3 = amount;
                            date3 = CLOCK.getText().toString();
                        } else if (Qu4.isSelected()) {
                            q4 = amount;
                            date4 = CLOCK.getText().toString();
                        } else {
                            // all quarters paid already
                            return;
                        }

                        // 5. Append the new fee into Fee_paid
                        if (!feePaid.isEmpty()) {
                            for (String i : IDofFees) {
                                feePaid += ", " + i;
                            }
                        } else {
                            for (String i : IDofFees) {
                                feePaid = feePaid += ", " + i;;
                            }
                        }

                        // 6. Calculate total paid
                        double totalPaid = q1 + q2 + q3 + q4;
                        double amountpaid = Double.parseDouble(Total.getText());

                        String remark = remarks.getText();

                        // 8. Update record
                        String updateSql = "UPDATE student_payment SET Fee_Paid=?, 1st_Quarter=?, 2nd_Quarter=?, 3rd_Quarter=?, 4th_Quarter=?, Total_Paid=?, Date_Q1 = ?, Date_Q2 = ?, Date_Q3 = ?, Date_Q4 = ?, remarks = ? WHERE student_ID=?";
                        PreparedStatement psUpdate = con.prepareStatement(updateSql);
                        psUpdate.setString(1, feePaid);
                        psUpdate.setDouble(2, q1);
                        psUpdate.setDouble(3, q2);
                        psUpdate.setDouble(4, q3);
                        psUpdate.setDouble(5, q4);
                        psUpdate.setDouble(6, totalPaid);
                        psUpdate.setString(7, date1);
                        psUpdate.setString(8, date2);
                        psUpdate.setString(9, date3);
                        psUpdate.setString(10, date4);
                        psUpdate.setString(11, remark);
                        psUpdate.setInt(12, this.studentid);
                        psUpdate.executeUpdate();
                        String updateSql2 = "INSERT INTO Contribution_paid (student_ID, Fee, amount, Quarter, School_Year, Fee_ID) VALUES (?, ?, ?, ?, ?, ?)";
                        PreparedStatement psUpdate2 = con.prepareStatement(updateSql2);
                        for (int i = 0; i < Feesss.size(); i++) {
                            if (Qu1.isSelected()) {
                                String Fess = Feesss.get(i); // SSGF(50)
                                String amountStr = amounts.get(i);    // 50
                                String feeId = IDofFees.get(i);
                                double amountss = Double.parseDouble(amountStr); // convert from String → int
                                psUpdate2.setInt(1, this.studentid);
                                psUpdate2.setString(2, Fess);  // Feess
                                psUpdate2.setDouble(3, amountss);       // REAL amount integer
                                psUpdate2.setString(4, "1st");
                                psUpdate2.setString(5, Session.schoolyear);
                                psUpdate2.setString(6, feeId);
                                psUpdate2.executeUpdate();
                                System.out.println("Feesss size: " + Feesss.size());
                                System.out.println("Amounts size: " + amounts.size());
                                Session.Quarter = "1st";
                            } else if (Qu2.isSelected()) {
                                String Fess = Feesss.get(i); // SSGF(50)
                                String amountStr = amounts.get(i);    // 50
                                String feeId = IDofFees.get(i);
                                double amountss = Double.parseDouble(amountStr); // convert from String → int
                                psUpdate2.setInt(1, this.studentid);
                                psUpdate2.setString(2, Fess);  // Feess
                                psUpdate2.setDouble(3, amountss);       // REAL amount integer
                                psUpdate2.setString(4, "2nd");
                                psUpdate2.setString(5, Session.schoolyear);
                                psUpdate2.setString(6, feeId);
                                psUpdate2.executeUpdate();
                                Session.Quarter = "2nd";
                            } else if (Qu3.isSelected()) {
                                String Fess = Feesss.get(i); // SSGF(50)
                                String amountStr = amounts.get(i);    // 50
                                String feeId = IDofFees.get(i);
                                double amountss = Double.parseDouble(amountStr); // convert from String → int
                                psUpdate2.setInt(1, this.studentid);
                                psUpdate2.setString(2, Fess);  // Feess
                                psUpdate2.setDouble(3, amountss);       // REAL amount integer
                                psUpdate2.setString(4, "3rd");
                                psUpdate2.setString(5, Session.schoolyear);
                                psUpdate2.setString(6, feeId);
                                psUpdate2.executeUpdate();
                                Session.Quarter = "3rd";
                            } else if (Qu4.isSelected()) {
                                String Fess = Feesss.get(i); // SSGF(50)
                                String amountStr = amounts.get(i);    // 50
                                String feeId = IDofFees.get(i);
                                double amountss = Double.parseDouble(amountStr); // convert from String → int
                                psUpdate2.setInt(1, this.studentid);
                                psUpdate2.setString(2, Fess);  // Feess
                                psUpdate2.setDouble(3, amountss);       // REAL amount integer
                                psUpdate2.setString(4, "4th");
                                psUpdate2.setString(5, Session.schoolyear);
                                psUpdate2.setString(6, feeId);
                                psUpdate2.executeUpdate();
                                Session.Quarter = "4th";
                            }
                        }
                        String time = CLOCK.getText();
                        String tol = Total.getText();
                        
                        Session.timer = CLOCK.getText();
                        this.Feesss = Session.Fees;
                        this.amounts = Session.AmountItem;
                        remarks.setText(Session.remarkss);
                        Official_RecieptForm reciept = new Official_RecieptForm();
                        reciept.setVisible(true);
                        if (sibling != null) {
                            sibling.setVisible(false);
                        }
                        dispose();
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_ConfirmActionPerformed

    private void Qu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Qu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Qu1ActionPerformed
    private static Siblings_Form sibling;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";
        int ID = this.studentid;
        String lrn = LRN.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String query = "SELECT * FROM student_info WHERE lrn=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, lrn);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String lastname = rs.getString("lastname");
                if (sibling == null || !sibling.isShowing()) {
                    sibling = new Siblings_Form(lastname, ID);
                    sibling.setVisible(true);
                } else {
                    sibling.toFront();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton2ActionPerformed
    private javax.swing.Timer clockTimer;

    public void startClock() {
        clockTimer = new Timer(1000, e -> {
            SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");
            String currentDateTime = sdf.format(new Date());
            CLOCK.setText(currentDateTime);

        });

        clockTimer.start();
    }

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
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PaymentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CLOCK;
    private javax.swing.JButton Confirm;
    private javax.swing.ButtonGroup Fiscalyear;
    private javax.swing.JLabel LRN;
    private javax.swing.JLabel Nameshow;
    private javax.swing.JLabel Paymentfor;
    private javax.swing.JRadioButton Qu1;
    private javax.swing.JRadioButton Qu2;
    private javax.swing.JRadioButton Qu3;
    private javax.swing.JRadioButton Qu4;
    private javax.swing.JLabel Rooler;
    private javax.swing.JLabel Total;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextArea remarks;
    // End of variables declaration//GEN-END:variables
}
