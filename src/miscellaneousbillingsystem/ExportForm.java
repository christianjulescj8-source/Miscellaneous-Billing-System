package miscellaneousbillingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.io.File;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import java.awt.Desktop;
import java.io.FileInputStream;

public class ExportForm extends javax.swing.JFrame {

    private String gradelevel;
    private String sectionlevel;

    public ExportForm() {
        UIManager.put("ScrollBarUI", "miscellaneousbillingsystem.ScrollBarWin11");
        initComponents();

        curriculum.setSelectedIndex(0);
        loadcombobox();

        if (Sectionselect.getItemCount() > 0) {
            Sectionselect.setSelectedIndex(0);  // select first
        }

        loadTableStudentData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Overall = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Q2 = new javax.swing.JLabel();
        Q1 = new javax.swing.JLabel();
        TotalStudent = new javax.swing.JLabel();
        Q3 = new javax.swing.JLabel();
        Q4 = new javax.swing.JLabel();
        Quarterly = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1234, 583));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(51, 204, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1234, 583));
        jPanel3.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(null);

        Rooler.setFont(new java.awt.Font("Baskerville Old Face", 0, 70)); // NOI18N
        Rooler.setForeground(new java.awt.Color(0, 0, 0));
        Rooler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rooler.setText("Report");
        Rooler.setToolTipText("");
        jPanel2.add(Rooler);
        Rooler.setBounds(0, 10, 1220, 88);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo smaller.png"))); // NOI18N
        jPanel2.add(logo);
        logo.setBounds(0, 0, 95, 95);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(0, 0, 1230, 100);

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

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(0, 144, 1218, 400);

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
        jPanel3.add(Sectionselect);
        Sectionselect.setBounds(840, 110, 160, 22);

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
        jPanel3.add(curriculum);
        curriculum.setBounds(710, 110, 80, 22);

        Categorie.setBackground(new java.awt.Color(255, 255, 255));
        Categorie.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
        Categorie.setForeground(new java.awt.Color(0, 0, 0));
        Categorie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Payment Records", "Class Sections", "Student Records", "Quarterly Payments" }));
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
        jPanel3.add(Categorie);
        Categorie.setBounds(130, 110, 180, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(1090, 110, 100, 25);

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
        jPanel3.add(jButton3);
        jButton3.setBounds(10, 110, 76, 30);

        Date.setFocusable(false);
        Date.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jPanel3.add(Date);
        Date.setBounds(520, 110, 170, 26);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Q2:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(430, 640, 30, 19);

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Q1:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(280, 640, 30, 20);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Q4:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(710, 640, 30, 19);

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(860, 640, 50, 19);

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Q3:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(570, 640, 30, 19);

        Overall.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Overall.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(Overall);
        Overall.setBounds(910, 640, 70, 20);

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Number of students:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 640, 150, 19);

        Q2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Q2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(Q2);
        Q2.setBounds(460, 640, 80, 20);

        Q1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Q1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(Q1);
        Q1.setBounds(310, 640, 80, 20);

        TotalStudent.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        TotalStudent.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(TotalStudent);
        TotalStudent.setBounds(170, 640, 80, 20);

        Q3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Q3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(Q3);
        Q3.setBounds(600, 640, 80, 20);

        Q4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Q4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(Q4);
        Q4.setBounds(740, 640, 80, 20);

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
        jPanel3.add(Quarterly);
        Quarterly.setBounds(510, 110, 180, 22);

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

    //Payment Records
    //Class Sections
    //Student Records
    //Quarterly Payments

    public void PaymentRecords(){
    
    
    }
    
    public void ClassSections(){
    
    
    }
    
    public void StudentRecords(){
    
    
    }
    public void QuarterlyPayments(){
    String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String grade = curriculum.getSelectedItem().toString();
            String section = Sectionselect.getSelectedItem().toString();
            this.gradelevel = grade;
            this.sectionlevel = section;
            System.out.println("table secton: " + section);
            // Query with all needed columns
            String sql = "SELECT CONCAT( "
                    + "    si.lastname, ', ', "
                    + "    si.firstname, ' ', "
                    + "    IF(si.middlename = '' OR si.middlename IS NULL, '', CONCAT(LEFT(si.middlename, 1), '.')) "
                    + ") AS fullname, "
                    + "sp.`1st_Quarter`, sp.`2nd_Quarter`, sp.`3rd_Quarter`, sp.`4th_Quarter`, sp.Total_Paid, "
                    + " si.section, si.grade "
                    + "FROM student_info si "
                    + "LEFT JOIN student_payment sp ON si.ID = sp.student_ID "
                    + "RIGTH JOIN contribution_paid cp ON si.ID = cp.student_ID "
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
    
    
    public void loadTableStudentData() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String grade = curriculum.getSelectedItem().toString();
            String section = Sectionselect.getSelectedItem().toString();
            this.gradelevel = grade;
            this.sectionlevel = section;
            System.out.println("table secton: " + section);
            // Query with all needed columns
            String sql = "SELECT CONCAT( "
                    + "    si.lastname, ', ', "
                    + "    si.firstname, ' ', "
                    + "    IF(si.middlename = '' OR si.middlename IS NULL, '', CONCAT(LEFT(si.middlename, 1), '.')) "
                    + ") AS fullname, "
                    + "sp.`1st_Quarter`, sp.`2nd_Quarter`, sp.`3rd_Quarter`, sp.`4th_Quarter`, sp.Total_Paid, "
                    + " si.section, si.grade "
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

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String searchText = Sectionselect.getSelectedItem().toString();

            if (Sectionselect.getSelectedItem() != null) {

                loadTableStudentData();
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
        loadcombobox();

        loadTableStudentData();


    }//GEN-LAST:event_curriculumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        loadcombobox();

        loadTableStudentData();
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

        } else if (Categorie.getSelectedIndex() == 1) {
            //Class Sections

        } else if (Categorie.getSelectedIndex() == 2) {
            //Student Records

        } else if (Categorie.getSelectedIndex() == 4) {
            //Quarterly Payments
            Quarterly.setVisible(true);
            Date.setVisible(false);
            Sectionselect.setVisible(false);

        }
    }//GEN-LAST:event_CategorieActionPerformed

    private void QuarterlyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuarterlyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_QuarterlyMouseClicked

    private void QuarterlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuarterlyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuarterlyActionPerformed

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
    private javax.swing.JLabel Overall;
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JComboBox<String> Quarterly;
    private javax.swing.JLabel Rooler;
    private javax.swing.JComboBox<String> Sectionselect;
    private javax.swing.JLabel TotalStudent;
    private javax.swing.JComboBox<String> curriculum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
