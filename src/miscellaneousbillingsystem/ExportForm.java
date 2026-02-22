package miscellaneousbillingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.io.FileOutputStream;
import javax.swing.JTable;
import org.apache.poi.ss.usermodel.*;
import javax.swing.*;
import javax.swing.table.TableModel;
import java.io.*;
import java.awt.Desktop;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExportForm extends javax.swing.JFrame {

    private String Quarter;
    private List<String> IDofFees = new ArrayList<>();
    private List<String> Feesss = new ArrayList<>();

    public ExportForm() {
        UIManager.put("ScrollBarUI", "miscellaneousbillingsystem.ScrollBarWin11");
        initComponents();

        curriculum.setSelectedIndex(0);
        Quarterly.setSelectedIndex(0);
        Categorie.setSelectedIndex(0);
        loadcombobox();

        if (Sectionselect.getItemCount() > 0) {
            Sectionselect.setSelectedIndex(0);  // select first
        }
        if (Categorie.getSelectedIndex() == 0) {
            //Payment Records
            PaymentRecords();
        } else if (Categorie.getSelectedIndex() == 1) {
            //Class Sections
            ClassSections();
        } else if (Categorie.getSelectedIndex() == 2) {
            //Quarterly Payments
            QuarterlyPayments();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Rooler = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Sectionselect = new javax.swing.JComboBox<>();
        curriculum = new javax.swing.JComboBox<>();
        Categorie = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Date = new com.toedter.calendar.JDateChooser();
        Quarterly = new javax.swing.JComboBox<>();
        change = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1234, 583));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(51, 204, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1234, 583));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 0));
        jButton2.setText("Export to Excel");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(1060, 60, 150, 30);

        Rooler.setFont(new java.awt.Font("Baskerville Old Face", 0, 70)); // NOI18N
        Rooler.setForeground(new java.awt.Color(0, 0, 0));
        Rooler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rooler.setText("Report");
        Rooler.setToolTipText("");
        jPanel2.add(Rooler);
        Rooler.setBounds(0, 10, 1230, 88);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo smaller.png"))); // NOI18N
        jPanel2.add(logo);
        logo.setBounds(0, 0, 95, 95);

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1234, 100));

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, 1234, 439));

        Sectionselect.setBackground(new java.awt.Color(255, 255, 255));
        Sectionselect.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
        Sectionselect.setForeground(new java.awt.Color(0, 0, 0));
        Sectionselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sectionselect.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        Sectionselect.setFocusable(false);
        Sectionselect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SectionselectMouseClicked(evt);
            }
        });
        Sectionselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionselectActionPerformed(evt);
            }
        });
        jPanel3.add(Sectionselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, 160, -1));

        curriculum.setBackground(new java.awt.Color(255, 255, 255));
        curriculum.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
        curriculum.setForeground(new java.awt.Color(0, 0, 0));
        curriculum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7th", "8th", "9th", "10th", "11th", "12th" }));
        curriculum.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        curriculum.setFocusable(false);
        curriculum.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                curriculumAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        curriculum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curriculumMouseClicked(evt);
            }
        });
        curriculum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curriculumActionPerformed(evt);
            }
        });
        jPanel3.add(curriculum, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 80, -1));

        Categorie.setBackground(new java.awt.Color(255, 255, 255));
        Categorie.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
        Categorie.setForeground(new java.awt.Color(0, 0, 0));
        Categorie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Payment Records", "Class Sections", "Quarterly Payments" }));
        Categorie.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        Categorie.setFocusable(false);
        Categorie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategorieMouseClicked(evt);
            }
        });
        Categorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategorieActionPerformed(evt);
            }
        });
        jPanel3.add(Categorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 180, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("Refresh");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 110, 100, 25));

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.setBorderPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        Date.setFocusable(false);
        Date.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jPanel3.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 170, -1));

        Quarterly.setBackground(new java.awt.Color(255, 255, 255));
        Quarterly.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
        Quarterly.setForeground(new java.awt.Color(0, 0, 0));
        Quarterly.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quarter 1", "Quarter 2", "Quarter 3", "Quarter 4" }));
        Quarterly.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        Quarterly.setFocusable(false);
        Quarterly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuarterlyMouseClicked(evt);
            }
        });
        Quarterly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuarterlyActionPerformed(evt);
            }
        });
        jPanel3.add(Quarterly, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 180, -1));

        change.setBackground(new java.awt.Color(255, 255, 255));
        change.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        change.setForeground(new java.awt.Color(0, 153, 0));
        change.setText("All");
        change.setBorderPainted(false);
        change.setFocusPainted(false);
        change.setFocusable(false);
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        jPanel3.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 150, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    public void PaymentRecords() {
        curriculum.setVisible(false);
        Sectionselect.setVisible(false);
        Date.setVisible(false);
        Quarterly.setVisible(true);
        change.setVisible(false);
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Query with all needed columns
            String sql = "SELECT "
                    + "mf.Name_of_contribution AS Fee, "
                    + "COUNT(cp.ID_Contribution) AS Count_Fee, "
                    + "IFNULL(SUM(cp.amount), 0) AS Total_Paid "
                    + "FROM miscellaneous_fee mf "
                    + "LEFT JOIN contribution_paid cp "
                    + "ON mf.Name_of_contribution = cp.Fee "
                    + "AND cp.School_Year = ? "
                    + "AND cp.Quarter = ? "
                    + "GROUP BY mf.Name_of_contribution "
                    + "ORDER BY mf.Name_of_contribution";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, Session.schoolyear);
            stmt.setString(2, this.Quarter);
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();

            String[] columnHeaders = {"Fee", "Count", "Total"};

            for (String header : columnHeaders) {
                model.addColumn(header);
            }

            // Fill rows
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            jTable1.setRowSorter(null);
            jTable1.clearSelection();
            jTable1.setModel(model);
            jTable1.revalidate();
            jTable1.repaint();

            int[] hiddenCols = {};
            for (int colIndex : hiddenCols) {
                jTable1.getColumnModel().getColumn(colIndex).setMinWidth(0);
                jTable1.getColumnModel().getColumn(colIndex).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(colIndex).setWidth(0);
                jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void ClassSections() {
        Date.setVisible(false);
        Quarterly.setVisible(false);
        change.setVisible(true);
        curriculum.setVisible(true);
        Sectionselect.setVisible(true);
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String grade = curriculum.getSelectedItem().toString();
            String section = Sectionselect.getSelectedItem().toString();

            String sql = "SELECT CONCAT( "
                    + "si.lastname, ', ', "
                    + "si.firstname, ' ', "
                    + "IF(si.middlename = '' OR si.middlename IS NULL, '', CONCAT(LEFT(si.middlename, 1), '.')) "
                    + ") AS fullname, "
                    + "sp.`1st_Quarter`, "
                    + "sp.`2nd_Quarter`, "
                    + "sp.`3rd_Quarter`, "
                    + "sp.`4th_Quarter`, "
                    + "sp.Total_Paid, "
                    + "COALESCE(sp.remarks, '') AS remarks "
                    + "FROM student_info si "
                    + "LEFT JOIN student_payment sp ON si.ID = sp.student_ID "
                    + "WHERE si.grade = ? AND si.school_Year = ? AND si.section = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, grade);
            stmt.setString(2, Session.schoolyear);
            stmt.setString(3, section);
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();

            String[] columnHeaders = {
                "Full Name",
                "1st Quarter", "2nd Quarter", "3rd Quarter", "4th Quarter", "Total Paid", "Remarks",
                };

            for (String header : columnHeaders) {
                model.addColumn(header);
            }

            // Fill rows
            while (rs.next()) {
                Object[] row = new Object[9]; // must match columnHeaders
                row[0] = rs.getString("fullname");
                row[1] = rs.getObject("1st_Quarter");
                row[2] = rs.getObject("2nd_Quarter");
                row[3] = rs.getObject("3rd_Quarter");
                row[4] = rs.getObject("4th_Quarter");
                row[5] = rs.getObject("Total_Paid");
                row[6] = rs.getString("remarks"); // <-- make sure this column exists               
                model.addRow(row);
            }
            jTable1.setRowSorter(null);
            jTable1.clearSelection();
            jTable1.setModel(model);
            jTable1.revalidate();
            jTable1.repaint();

            

                jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
                jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
                jTable1.getColumnModel().getColumn(2).setPreferredWidth(70);
                jTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
                jTable1.getColumnModel().getColumn(4).setPreferredWidth(70);
                jTable1.getColumnModel().getColumn(5).setPreferredWidth(70);
                jTable1.getColumnModel().getColumn(6).setPreferredWidth(600);

            

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void QuarterlyPayments() {

        Date.setVisible(false);
        Quarterly.setVisible(true);
        change.setVisible(false);
        curriculum.setVisible(true);
        Sectionselect.setVisible(false);

        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        ArrayList<String> feeIDs = new ArrayList<>();
        ArrayList<String> feeNames = new ArrayList<>();
        ArrayList<Double> feeAmounts = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String grade = curriculum.getSelectedItem().toString();
            String schoolYear = Session.schoolyear;

            // ===============================
            // 1️⃣ GET ALL FEES (ACRONYM)
            // ===============================
            String sqlFees = "SELECT ID, Acronym, amount FROM miscellaneous_fee";
            PreparedStatement pstFees = con.prepareStatement(sqlFees);
            ResultSet rsFees = pstFees.executeQuery();

            while (rsFees.next()) {
                feeIDs.add(rsFees.getString("ID"));
                feeNames.add(rsFees.getString("Acronym"));
                feeAmounts.add(rsFees.getDouble("amount"));
            }

            rsFees.close();
            pstFees.close();

            // ===============================
            // 2️⃣ CREATE TABLE MODEL
            // ===============================
            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("No.");
            model.addColumn("Date");
            model.addColumn("Full Name");
            model.addColumn("Section");

            for (String fee : feeNames) {
                model.addColumn(fee);
            }

            model.addColumn("Total Paid");

            // ===============================
            // 3️⃣ GET STUDENTS
            // ===============================
            String sqlStudents = "SELECT ID, CONCAT(lastname, ', ', firstname) AS fullname, "
                    + "section "
                    + "FROM student_info "
                    + "WHERE grade = ? AND school_Year = ?";

            PreparedStatement pstStudents = con.prepareStatement(sqlStudents);
            pstStudents.setString(1, grade);
            pstStudents.setString(2, schoolYear);

            ResultSet rsStudents = pstStudents.executeQuery();

            int count = 1;

            // ===============================
            // 4️⃣ LOOP STUDENTS
            // ===============================
            while (rsStudents.next()) {

                String studentID = rsStudents.getString("ID");

                Vector<Object> row = new Vector<>();

                row.add(count++);

                // 🔹 GET LATEST PAYMENT DATE
                String paymentDate = "";

                String sqlDate = "SELECT MAX(Date) AS payDate "
                        + "FROM contribution_paid "
                        + "WHERE student_ID = ? "
                        + "AND Quarter = ? "
                        + "AND School_Year = ?";

                PreparedStatement pstDate = con.prepareStatement(sqlDate);
                pstDate.setString(1, studentID);
                pstDate.setString(2, this.Quarter);
                pstDate.setString(3, schoolYear);

                ResultSet rsDate = pstDate.executeQuery();

                if (rsDate.next()) {
                    paymentDate = rsDate.getString("payDate");
                    if (paymentDate == null) {
                        paymentDate = "";
                    }
                }

                rsDate.close();
                pstDate.close();

                row.add(paymentDate);
                row.add(rsStudents.getString("fullname"));
                row.add(rsStudents.getString("section"));

                double totalPaid = 0;
                double totalRequired = 0;

                // 🔹 LOOP FEES
                for (int i = 0; i < feeIDs.size(); i++) {

                    String feeID = feeIDs.get(i);
                    double requiredAmount = feeAmounts.get(i);
                    totalRequired += requiredAmount;

                    String sqlPayment = "SELECT SUM(amount) AS paid "
                            + "FROM contribution_paid "
                            + "WHERE student_ID = ? "
                            + "AND Fee_ID = ? "
                            + "AND Quarter = ? "
                            + "AND School_Year = ?";

                    PreparedStatement pstPayment = con.prepareStatement(sqlPayment);
                    pstPayment.setString(1, studentID);
                    pstPayment.setString(2, feeID);
                    pstPayment.setString(3, this.Quarter);
                    pstPayment.setString(4, schoolYear);

                    ResultSet rsPayment = pstPayment.executeQuery();

                    double paid = 0;

                    if (rsPayment.next()) {
                        paid = rsPayment.getDouble("paid");
                    }

                    rsPayment.close();
                    pstPayment.close();

                    row.add(String.format("%.2f", paid));
                    totalPaid += paid;
                }

                row.add(String.format("%.2f", totalPaid));

                model.addRow(row);
            }

            jTable1.setRowSorter(null);
            jTable1.clearSelection();
            jTable1.setModel(model);
            jTable1.revalidate();
            jTable1.repaint();
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(210);

            rsStudents.close();
            pstStudents.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadTableStudentData() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String grade = curriculum.getSelectedItem().toString();
            String section = Sectionselect.getSelectedItem().toString();

            System.out.println("table secton: " + section);
            // Query with all needed columns
            String sql = "SELECT CONCAT( "
                    + "    si.lastname, ', ', "
                    + "    si.firstname, ' ', "
                    + "    IF(si.middlename = '' OR si.middlename IS NULL, '', CONCAT(LEFT(si.middlename, 1), '.')) "
                    + ") AS fullname, "
                    + "sp.`1st_Quarter`, sp.`2nd_Quarter`, sp.`3rd_Quarter`, sp.`4th_Quarter`, sp.Total_Paid, "
                    + " si.section, si.grade, sp.remarks "
                    + "FROM student_info si "
                    + "LEFT JOIN student_payment sp ON si.ID = sp.student_ID "
                    + "WHERE si.grade = ? AND si.school_Year = ? AND si.section = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, grade);
            stmt.setString(2, Session.schoolyear);
            stmt.setString(3, section);
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();

            String[] columnHeaders = {
                "Full Name",
                "1st Quarter", "2nd Quarter", "3rd Quarter", "4th Quarter", "Total Paid",
                "Section", "Grade",};

            for (String header : columnHeaders) {
                model.addColumn(header);
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
            //= "SELECT si.firstname, si.middlename, si.lastname, si.section, si.grade, si.Identifier, si.ID, "
            //       + "sp.student_ID, sp.Fee_paid, sp.Total_Paid, sp.`1st_Quarter`, sp.`2nd_Quarter`, sp.`3rd_Quarter`, sp.`4th_Quarter`, sp.Date_Q1, sp.Date_Q2, sp.Date_Q3, sp.Date_Q4 "
            //       + "FROM student_info si "
            // Hide unwanted columns (keep only LRN_Students, firstname, middlename, lastname, section)
            int[] hiddenCols = {6, 7}; // indexes start at 0
            for (int colIndex : hiddenCols) {
                jTable1.getColumnModel().getColumn(colIndex).setMinWidth(0);
                jTable1.getColumnModel().getColumn(colIndex).setMaxWidth(0);
                jTable1.getColumnModel().getColumn(colIndex).setWidth(0);
                jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadcombobox() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear old items first
            Sectionselect.removeAllItems();

            // Get selected curriculum
            String level = curriculum.getSelectedItem().toString();

            // Map curriculum to grade
            // Only query if grade is valid
            String query = "SELECT Section FROM school_section WHERE Grade = ? ORDER BY Section ASC";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, level);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Sectionselect.addItem(rs.getString("Section"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error loading combo box: " + e.getMessage());
        }
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void SectionselectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SectionselectMouseClicked

    }//GEN-LAST:event_SectionselectMouseClicked

    private void SectionselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectionselectActionPerformed
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";
        change.setText("All");
        this.number = 0;
        changes();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String searchText = Sectionselect.getSelectedItem().toString();

            if (Sectionselect.getSelectedItem() != null) {

                if (Categorie.getSelectedIndex() == 0) {
                    //Payment Records
                    PaymentRecords();
                } else if (Categorie.getSelectedIndex() == 1) {
                    //Class Sections
                    ClassSections();
                } else if (Categorie.getSelectedIndex() == 2) {
                    //Quarterly Payments
                    QuarterlyPayments();
                }
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_SectionselectActionPerformed

    private void curriculumAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_curriculumAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_curriculumAncestorMoved

    private void curriculumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculumMouseClicked

    }//GEN-LAST:event_curriculumMouseClicked

    private void curriculumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curriculumActionPerformed
        if (Sectionselect.isVisible()) {
            loadcombobox();
        }
        change.setText("All");
        this.number = 0;
        changes();
        if (!Sectionselect.isVisible()) {
            if (Categorie.getSelectedIndex() == 0) {
                //Payment Records
                PaymentRecords();
            } else if (Categorie.getSelectedIndex() == 1) {
                //Class Sections
                ClassSections();
            } else if (Categorie.getSelectedIndex() == 2) {
                //Quarterly Payments
                QuarterlyPayments();
            }
        }

    }//GEN-LAST:event_curriculumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        loadcombobox();
        if (Categorie.getSelectedIndex() == 0) {
            //Payment Records
            PaymentRecords();
        } else if (Categorie.getSelectedIndex() == 1) {
            //Class Sections
            ClassSections();
        } else if (Categorie.getSelectedIndex() == 2) {
            //Quarterly Payments
            QuarterlyPayments();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Billing_MainForm main = new Billing_MainForm();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CategorieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategorieMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CategorieMouseClicked

    private void CategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategorieActionPerformed
        if (Categorie.getSelectedIndex() == 0) {
            //Payment Records
            PaymentRecords();
        } else if (Categorie.getSelectedIndex() == 1) {
            //Class Sections
            ClassSections();
        } else if (Categorie.getSelectedIndex() == 2) {
            //Quarterly Payments
            QuarterlyPayments();
        }
    }//GEN-LAST:event_CategorieActionPerformed

    private void QuarterlyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuarterlyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_QuarterlyMouseClicked

    private void QuarterlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuarterlyActionPerformed
        String Q = Quarterly.getSelectedItem().toString();
        if (Q == "Quarter 1") {
            this.Quarter = "1st";
            if (Categorie.getSelectedIndex() == 0) {
                //Payment Records
                PaymentRecords();
            } else if (Categorie.getSelectedIndex() == 1) {
                //Class Sections
                ClassSections();
            } else if (Categorie.getSelectedIndex() == 2) {
                //Quarterly Payments
                QuarterlyPayments();
            }
        } else if (Q == "Quarter 2") {
            this.Quarter = "2nd";
            if (Categorie.getSelectedIndex() == 0) {
                PaymentRecords();
            } else if (Categorie.getSelectedIndex() == 1) {
                //Class Sections
                ClassSections();
            } else if (Categorie.getSelectedIndex() == 2) {
                //Quarterly Payments
                QuarterlyPayments();
            }
        } else if (Q == "Quarter 3") {
            this.Quarter = "3rd";
            if (Categorie.getSelectedIndex() == 0) {
                //Payment Records
                PaymentRecords();
            } else if (Categorie.getSelectedIndex() == 1) {
                //Class Sections
                ClassSections();
            } else if (Categorie.getSelectedIndex() == 2) {
                //Quarterly Payments
                QuarterlyPayments();
            }
        } else if (Q == "Quarter 4") {
            this.Quarter = "4th";
            if (Categorie.getSelectedIndex() == 0) {
                //Payment Records
                PaymentRecords();
            } else if (Categorie.getSelectedIndex() == 1) {
                //Class Sections
                ClassSections();
            } else if (Categorie.getSelectedIndex() == 2) {
                //Quarterly Payments
                QuarterlyPayments();
            }
        }
    }//GEN-LAST:event_QuarterlyActionPerformed
    int number = 0;

    public void changes() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";
        double expectedAmount = 0;
        try (Connection con = DriverManager.getConnection(SUrl, SUser, SPass)) {
            String sql = "SELECT SUM(amount) AS total_amount FROM miscellaneous_fee";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                expectedAmount = rs.getDouble("total_amount");
            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);

        if (this.number == 0) {
            sorter.setRowFilter(null);
            change.setText("All");
            this.number += 1;
        } else if (this.number == 1) {
            sorter.setRowFilter(RowFilter.regexFilter(".+", 6)); // remarks column
            change.setText("Discounted");
            this.number += 1;
        } else if (this.number == 2) {
            change.setText("Unpaid");
            this.number += 1;
            sorter.setRowFilter(new RowFilter<DefaultTableModel, Integer>() {
                @Override
                public boolean include(RowFilter.Entry<? extends DefaultTableModel, ? extends Integer> entry) {

                    Object totalObj = entry.getValue(5);   // Total Paid column
                    Object remarksObj = entry.getValue(6); // Remarks column

                    double total = 0;
                    if (totalObj != null) {
                        try {
                            total = Double.parseDouble(totalObj.toString());
                        } catch (NumberFormatException e) {
                            total = 0;
                        }
                    }

                    String remarks = (remarksObj == null) ? "" : remarksObj.toString().trim();

                    // Show ONLY if total == 0 AND remarks is empty
                    if (total == 0 && remarks.isEmpty()) {
                        return true;  // include row
                    }

                    return false; // exclude everything else
                }
            });
        } else if (this.number == 3) {
            change.setText("Fully Paid");
            this.number += 1;
            final double expected = expectedAmount;

            sorter.setRowFilter(new RowFilter<DefaultTableModel, Integer>() {
                @Override
                public boolean include(RowFilter.Entry<? extends DefaultTableModel, ? extends Integer> entry) {

                    double totalPaid = parse(entry.getValue(5));
                    String remarks = value(entry.getValue(6));

                    return totalPaid >= expected
                            && expected > 0
                            && remarks.isEmpty();
                }

                private double parse(Object obj) {
                    if (obj == null) {
                        return 0;
                    }
                    try {
                        return Double.parseDouble(obj.toString());
                    } catch (Exception e) {
                        return 0;
                    }
                }

                private String value(Object obj) {
                    return obj == null ? "" : obj.toString().trim();
                }
            });
        } else if (this.number == 4) {
            change.setText("Partially Paid");
            this.number -= 4;
            final double expected = expectedAmount;

            sorter.setRowFilter(new RowFilter<DefaultTableModel, Integer>() {
                @Override
                public boolean include(RowFilter.Entry<? extends DefaultTableModel, ? extends Integer> entry) {

                    double totalPaid = parse(entry.getValue(5));
                    String remarks = value(entry.getValue(6));

                    return totalPaid > 0
                            && totalPaid < expected
                            && remarks.isEmpty();
                }

                private double parse(Object obj) {
                    if (obj == null) {
                        return 0;
                    }
                    try {
                        return Double.parseDouble(obj.toString());
                    } catch (Exception e) {
                        return 0;
                    }
                }

                private String value(Object obj) {
                    return obj == null ? "" : obj.toString().trim();
                }
            });
        }
    }
    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        changes();
    }//GEN-LAST:event_changeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {

            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Sheet1");

            TableModel model = jTable1.getModel();

            // Header
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < model.getColumnCount(); i++) {
                headerRow.createCell(i).setCellValue(model.getColumnName(i));
            }

            // Data
            for (int i = 0; i < model.getRowCount(); i++) {
                Row row = sheet.createRow(i + 1);
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Object value = model.getValueAt(i, j);
                    row.createCell(j).setCellValue(value == null ? "" : value.toString());
                }
            }

            FileOutputStream out = new FileOutputStream(chooser.getSelectedFile() + ".xlsx");
            workbook.write(out);
            out.close();
            workbook.close();

            System.out.println("exported");

        }

    } catch (Exception e) {
        
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ExportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ExportForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Categorie;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JComboBox<String> Quarterly;
    private javax.swing.JLabel Rooler;
    private javax.swing.JComboBox<String> Sectionselect;
    private javax.swing.JButton change;
    private javax.swing.JComboBox<String> curriculum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
