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

// ✅ Now load data (don’t skip)
        loadsum();
        loadTableStudentData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Rooler = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Sectionselect = new javax.swing.JComboBox<>();
        curriculum = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(51, 204, 0));
        jPanel3.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo4.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        Rooler.setFont(new java.awt.Font("Baskerville Old Face", 0, 70)); // NOI18N
        Rooler.setForeground(new java.awt.Color(0, 0, 0));
        Rooler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rooler.setText("Report");
        Rooler.setToolTipText("");
        jPanel2.add(Rooler, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, 980, 88));

        jPanel3.add(jPanel2);
        jPanel2.setBounds(0, 0, 1100, 100);

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
        jScrollPane1.setBounds(10, 150, 970, 480);

        Sectionselect.setBackground(new java.awt.Color(255, 255, 255));
        Sectionselect.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
        Sectionselect.setForeground(new java.awt.Color(0, 0, 0));
        Sectionselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sectionselect.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
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
        Sectionselect.setBounds(240, 120, 160, 22);

        curriculum.setBackground(new java.awt.Color(255, 255, 255));
        curriculum.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
        curriculum.setForeground(new java.awt.Color(0, 0, 0));
        curriculum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7th", "8th", "9th", "10th", "11th", "12th" }));
        curriculum.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
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
        curriculum.setBounds(150, 120, 80, 22);

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
        jButton1.setBounds(430, 120, 100, 25);

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Export to Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(630, 110, 170, 40);

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(10, 110, 76, 30);

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

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Export to PDF");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(810, 110, 170, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
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
    public void exportTableToExcel(JTable jTable1) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save as Excel");
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try (org.apache.poi.ss.usermodel.Workbook workbook = new org.apache.poi.xssf.usermodel.XSSFWorkbook()) {
                org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("Data");
                javax.swing.table.TableModel model = jTable1.getModel();

                // Header
                org.apache.poi.ss.usermodel.Row headerRow = sheet.createRow(0);
                for (int i = 0; i < model.getColumnCount(); i++) {
                    headerRow.createCell(i).setCellValue(model.getColumnName(i));
                }

                // Data
                for (int i = 0; i < model.getRowCount(); i++) {
                    org.apache.poi.ss.usermodel.Row row = sheet.createRow(i + 1);
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        Object value = model.getValueAt(i, j);
                        row.createCell(j).setCellValue(value != null ? value.toString() : "");
                    }
                }

                // Save file
                try (java.io.FileOutputStream fileOut = new java.io.FileOutputStream(fileChooser.getSelectedFile() + ".xlsx")) {
                    workbook.write(fileOut);
                }

            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error exporting Excel: " + e.getMessage());
            }
        }
    }
    //"Grade_" + this.gradelevel + "-" + this.sectionlevel+"_"+ Session.schoolyear +"student_reports.pdf")
    public void exportTableToPDF(JTable jTable1) {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Save PDF");
    fileChooser.setSelectedFile(new File("Grade_" + this.gradelevel + "-" + this.sectionlevel+"_"+ Session.schoolyear + "_" +"student_reports.pdf"));

    int userSelection = fileChooser.showSaveDialog(null);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();

        if (!fileToSave.getAbsolutePath().toLowerCase().endsWith(".pdf")) {
            fileToSave = new File(fileToSave.getAbsolutePath() + ".pdf");
        }

        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            PDType0Font timesRoman = PDType0Font.load(document,
                    new FileInputStream("C:/Windows/Fonts/times.ttf")); // change path if needed

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            TableModel model = jTable1.getModel();

            float margin = 50;
            float yStart = page.getMediaBox().getHeight() - margin;
            float rowHeight = 20;
            float cellMargin = 5;

            // 1. Measure max width per column
            int cols = model.getColumnCount();
            float[] colWidths = new float[cols];
            for (int col = 0; col < cols; col++) {
                float maxWidth = timesRoman.getStringWidth(model.getColumnName(col)) / 1000 * 12; // header width
                for (int row = 0; row < model.getRowCount(); row++) {
                    Object val = model.getValueAt(row, col);
                    if (val != null) {
                        float textWidth = timesRoman.getStringWidth(val.toString()) / 1000 * 10;
                        if (textWidth > maxWidth) {
                            maxWidth = textWidth;
                        }
                    }
                }
                colWidths[col] = maxWidth + cellMargin * 2; // add padding
            }

            float tableWidth = 0;
            for (float w : colWidths) tableWidth += w;

            // 2. Draw table grid
            float yPosition = yStart;
            float xPosition = margin;

            // Draw horizontal lines
            for (int i = 0; i <= model.getRowCount() + 1; i++) {
                contentStream.moveTo(margin, yPosition - i * rowHeight);
                contentStream.lineTo(margin + tableWidth, yPosition - i * rowHeight);
            }

            // Draw vertical lines
            float nextX = margin;
            for (int col = 0; col <= cols; col++) {
                contentStream.moveTo(nextX, yPosition);
                contentStream.lineTo(nextX, yPosition - (model.getRowCount() + 1) * rowHeight);
                if (col < cols) nextX += colWidths[col];
            }
            contentStream.stroke();

            // 3. Write header row
            contentStream.setFont(timesRoman, 12);
            nextX = margin;
            for (int col = 0; col < cols; col++) {
                String text = model.getColumnName(col);
                contentStream.beginText();
                contentStream.newLineAtOffset(nextX + cellMargin, yPosition - 15);
                contentStream.showText(text);
                contentStream.endText();
                nextX += colWidths[col];
            }

            // 4. Write table content
            for (int row = 0; row < model.getRowCount(); row++) {
                nextX = margin;
                for (int col = 0; col < cols; col++) {
                    Object cellValue = model.getValueAt(row, col);
                    String text = (cellValue == null) ? "" : cellValue.toString();

                    contentStream.beginText();
                    contentStream.setFont(timesRoman, 10);
                    contentStream.newLineAtOffset(nextX + cellMargin,
                            yPosition - (row + 2) * rowHeight + 5);
                    contentStream.showText(text);
                    contentStream.endText();

                    nextX += colWidths[col];
                }
            }

            contentStream.close();
            document.save(fileToSave);

           

        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}

    public void loadsum() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String section = Sectionselect.getSelectedItem().toString();
            String grade = curriculum.getSelectedItem().toString();
            String query0 = "SELECT COUNT(*) AS total FROM student_info WHERE grade = ? AND section = ? AND school_year = ?";
            PreparedStatement pst = con.prepareStatement(query0);
            pst.setString(1, grade);
            pst.setString(2, section);
            pst.setString(3, Session.schoolyear);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int Total = rs.getInt("total");
                TotalStudent.setText(String.valueOf(Total));
                String query = "SELECT "
                        + " SUM(sp.`1st_Quarter`) AS totalQ1, "
                        + " SUM(sp.`2nd_Quarter`) AS totalQ2, "
                        + " SUM(sp.`3rd_Quarter`) AS totalQ3, "
                        + " SUM(sp.`4th_Quarter`) AS totalQ4, "
                        + " SUM(sp.Total_Paid)   AS overall "
                        + "FROM student_payment sp "
                        + "JOIN student_info si ON sp.student_ID = si.ID "
                        + "WHERE si.grade = ? AND si.section = ? AND si.school_year = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, grade);              // from curriculum.getSelectedItem()
                ps.setString(2, section);            // from Sectionselect.getSelectedItem()
                ps.setString(3, Session.schoolyear); // current school year

                ResultSet rsm = ps.executeQuery();
                if (rsm.next()) {
                    int totalQ1 = rsm.getInt("totalQ1");
                    int totalQ2 = rsm.getInt("totalQ2");
                    int totalQ3 = rsm.getInt("totalQ3");
                    int totalQ4 = rsm.getInt("totalQ4");
                    int overall = rsm.getInt("overall");

                    Q1.setText(String.valueOf(totalQ1));
                    Q2.setText(String.valueOf(totalQ2));
                    Q3.setText(String.valueOf(totalQ3));
                    Q4.setText(String.valueOf(totalQ4));
                    Overall.setText(String.valueOf(overall));

                    // Debug output
                    System.out.println("DEBUG => Q1:" + totalQ1 + " Q2:" + totalQ2
                            + " Q3:" + totalQ3 + " Q4:" + totalQ4 + " Overall:" + overall);
                    System.out.println("grade: " + grade);
                    System.out.println("section: " + section);
                    System.out.println("year: " + Session.schoolyear);
                }
            }
        } catch (Exception e) {
             System.out.println("Error loading combo box: " + e.getMessage());
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
                loadsum();
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
        loadsum();
        loadTableStudentData();


    }//GEN-LAST:event_curriculumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        loadcombobox();
        loadsum();
        loadTableStudentData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Billing_MainForm main = new Billing_MainForm();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        exportTableToExcel(jTable1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        exportTableToPDF(jTable1);
    }//GEN-LAST:event_jButton4ActionPerformed

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
    private javax.swing.JLabel Overall;
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JLabel Rooler;
    private javax.swing.JComboBox<String> Sectionselect;
    private javax.swing.JLabel TotalStudent;
    private javax.swing.JComboBox<String> curriculum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
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
    // End of variables declaration//GEN-END:variables
}
