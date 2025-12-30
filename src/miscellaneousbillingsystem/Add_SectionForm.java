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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.geom.RoundRectangle2D;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.UIManager;

public class Add_SectionForm extends javax.swing.JFrame {

    private String level;

    public Add_SectionForm() {
        UIManager.put("ScrollBarUI", "miscellaneousbillingsystem.ScrollBarWin11");
        initComponents();

        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setWidth(0);
        Sectiontxt.setForeground(Color.WHITE);
    }

    public Add_SectionForm(String grade) {
        initComponents();
        this.level = grade;

        if (grade.equals("7th")) {
            Rooler.setText("Add Section 7th Grade");
            loadStudentData7th();
        } else if (grade.equals("8th")) {
            Rooler.setText("Add Section 8th Grade");
            loadStudentData8th();
        } else if (grade.equals("9th")) {
            Rooler.setText("Add Section 9th Grade");
            loadStudentData9th();
        } else if (grade.equals("10th")) {
            Rooler.setText("Add Section 10th Grade");
            loadStudentData10th();
        } else if (grade.equals("11th")) {
            Rooler.setText("Add Section 11th Grade");
            loadStudentData11th();
        } else if (grade.equals("12th")) {
            Rooler.setText("Add Section 12th Grade");
            loadStudentData12th();
        } else {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Labelsection = new javax.swing.JLabel();
        Sectionred = new javax.swing.JLabel();
        Rooler = new javax.swing.JLabel();
        Sectionlebel = new javax.swing.JLabel();
        Create = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Sectiontxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "LRN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
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
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 200, 310));

        Labelsection.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(Labelsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 20));

        Sectionred.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Sectionred.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(Sectionred, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, 20));

        Rooler.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
        Rooler.setForeground(new java.awt.Color(255, 255, 255));
        Rooler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rooler.setText("Add Section");
        jPanel2.add(Rooler, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 40));

        Sectionlebel.setFont(new java.awt.Font("Baskerville Old Face", 2, 20)); // NOI18N
        Sectionlebel.setForeground(new java.awt.Color(204, 204, 255));
        Sectionlebel.setText("Section...");
        jPanel2.add(Sectionlebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        Create.setBackground(new java.awt.Color(255, 255, 255));
        Create.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Create.setForeground(new java.awt.Color(0, 102, 0));
        Create.setText("Create");
        Create.setBorderPainted(false);
        Create.setFocusPainted(false);
        Create.setFocusable(false);
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        jPanel2.add(Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, -1));

        Refresh.setBackground(new java.awt.Color(255, 255, 255));
        Refresh.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Refresh.setForeground(new java.awt.Color(0, 102, 0));
        Refresh.setText("Refresh");
        Refresh.setBorderPainted(false);
        Refresh.setFocusPainted(false);
        Refresh.setFocusable(false);
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel2.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, -1));

        Delete.setBackground(new java.awt.Color(255, 255, 255));
        Delete.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(0, 102, 0));
        Delete.setText("Delete");
        Delete.setBorderPainted(false);
        Delete.setFocusPainted(false);
        Delete.setFocusable(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 100, -1));

        Update.setBackground(new java.awt.Color(0, 153, 0));
        Update.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Upadate");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, -1));

        Back.setBackground(new java.awt.Color(255, 255, 255));
        Back.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 102, 0));
        Back.setText("Back");
        Back.setBorderPainted(false);
        Back.setFocusPainted(false);
        Back.setFocusable(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 95, -1));

        Sectiontxt.setBackground(new java.awt.Color(0, 102, 0));
        Sectiontxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        Sectiontxt.setForeground(new java.awt.Color(0, 0, 0));
        Sectiontxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Sectiontxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SectiontxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SectiontxtFocusLost(evt);
            }
        });
        Sectiontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectiontxtActionPerformed(evt);
            }
        });
        jPanel2.add(Sectiontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 170, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void loadStudentData7th() {

        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String sql = "SELECT Section FROM school_section WHERE Grade = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "7th");
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();

            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(rsmd.getColumnName(i));
            }

            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            jTable1.setModel(model);

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadStudentData8th() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String sql = "SELECT Section FROM school_section WHERE Grade = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "8th");
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();

            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(rsmd.getColumnName(i));
            }

            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            jTable1.setModel(model);

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadStudentData9th() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String sql = "SELECT Section FROM school_section WHERE Grade = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "9th");
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();

            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(rsmd.getColumnName(i));
            }

            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            jTable1.setModel(model);

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadStudentData10th() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String sql = "SELECT Section FROM school_section WHERE Grade = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "10th");
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();

            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(rsmd.getColumnName(i));
            }

            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            jTable1.setModel(model);

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadStudentData11th() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String sql = "SELECT Section FROM school_section WHERE Grade = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "11th");
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();

            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(rsmd.getColumnName(i));
            }

            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            jTable1.setModel(model);

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadStudentData12th() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String sql = "SELECT Section FROM school_section WHERE Grade = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "12th");
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();

            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(rsmd.getColumnName(i));
            }

            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            jTable1.setModel(model);

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String section = model.getValueAt(selectedRow, 0).toString();
            Sectiontxt.setText(section);
            Sectionlebel.setVisible(false);
            Create.setVisible(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked

    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        if (this.level.equals("7th")) {
            Create.setVisible(true);
            Sectiontxt.setText("");
            Sectionlebel.setVisible(true);
            loadStudentData7th();
        } else if (this.level.equals("8th")) {
            Create.setVisible(true);
            Sectiontxt.setText("");
            Sectionlebel.setVisible(true);
            loadStudentData8th();
        } else if (this.level.equals("9th")) {
            Create.setVisible(true);
            Sectiontxt.setText("");
            Sectionlebel.setVisible(true);
            loadStudentData9th();
        } else if (this.level.equals("10th")) {
            Create.setVisible(true);
            Sectiontxt.setText("");
            Sectionlebel.setVisible(true);
            loadStudentData10th();
        } else if (this.level.equals("11th")) {
            Create.setVisible(true);
            Sectiontxt.setText("");
            Sectionlebel.setVisible(true);
            loadStudentData11th();
        } else if (this.level.equals("12th")) {
            Create.setVisible(true);
            Sectiontxt.setText("");
            Sectionlebel.setVisible(true);
            loadStudentData12th();
        } else {

        }
    }//GEN-LAST:event_RefreshActionPerformed

    private void SectiontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectiontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SectiontxtActionPerformed

    private void SectiontxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SectiontxtFocusGained
        if (Sectionlebel.getText().equals("Section...")) {
            Sectionlebel.setVisible(false);
        }
    }//GEN-LAST:event_SectiontxtFocusGained

    private void SectiontxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SectiontxtFocusLost
        if (Sectiontxt.getText().isEmpty()) {
            Sectionlebel.setVisible(true);

        }
    }//GEN-LAST:event_SectiontxtFocusLost

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            if (Sectiontxt.getText().isEmpty()) {
                Sectionred.setText("Please enter a section.");
                Labelsection.setText("");
            } else {
                if (this.level.equals("7th")) {
                    String section = Sectiontxt.getText().trim().toUpperCase();
                    String query = "INSERT INTO school_section (Section, Grade) VALUES (?, ?)";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, section);
                    pst.setString(2, this.level);
                    pst.executeUpdate();
                    Sectiontxt.setText("");
                    Sectionlebel.setVisible(true);
                    loadStudentData7th();
                } else if (this.level.equals("8th")) {
                    String section = Sectiontxt.getText().trim().toUpperCase();
                    String query = "INSERT INTO school_section (Section, Grade) VALUES (?, ?)";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, section);
                    pst.setString(2, this.level);
                    pst.executeUpdate();
                    Sectiontxt.setText("");
                    Sectionlebel.setVisible(true);
                    loadStudentData8th();
                } else if (this.level.equals("9th")) {
                    String section = Sectiontxt.getText().trim().toUpperCase();
                    String query = "INSERT INTO school_section (Section, Grade) VALUES (?, ?)";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, section);
                    pst.setString(2, this.level);
                    pst.executeUpdate();
                    Sectiontxt.setText("");
                    Sectionlebel.setVisible(true);
                    loadStudentData9th();
                } else if (this.level.equals("10th")) {
                    String section = Sectiontxt.getText().trim().toUpperCase();
                    String query = "INSERT INTO school_section (Section, Grade) VALUES (?, ?)";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, section);
                    pst.setString(2, this.level);
                    pst.executeUpdate();
                    Sectiontxt.setText("");
                    Sectionlebel.setVisible(true);
                    loadStudentData10th();
                } else if (this.level.equals("11th")) {
                    String section = Sectiontxt.getText().trim().toUpperCase();
                    String query = "INSERT INTO school_section (Section, Grade) VALUES (?, ?)";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, section);
                    pst.setString(2, this.level);
                    pst.executeUpdate();
                    Sectiontxt.setText("");
                    Sectionlebel.setVisible(true);
                    loadStudentData11th();
                } else if (this.level.equals("12th")) {
                    String section = Sectiontxt.getText().trim().toUpperCase();
                    String query = "INSERT INTO school_section (Section, Grade) VALUES (?, ?)";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, section);
                    pst.setString(2, this.level);
                    pst.executeUpdate();
                    Sectiontxt.setText("");
                    Sectionlebel.setVisible(true);
                    loadStudentData12th();
                } else {

                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_CreateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {

            return;
        }

        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String oldSection = jTable1.getValueAt(selectedRow, 0).toString();

            String query = "DELETE FROM school_section WHERE Section=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, oldSection);

            pst.executeUpdate();

            Sectionlebel.setVisible(true);
            Sectiontxt.setText("");
            Create.setVisible(true);

            if (this.level.equals("7th")) {
                loadStudentData7th();
            } else if (this.level.equals("8th")) {
                loadStudentData8th();
            } else if (this.level.equals("9th")) {
                loadStudentData9th();
            } else if (this.level.equals("10th")) {
                loadStudentData10th();
            } else if (this.level.equals("11th")) {
                loadStudentData11th();
            } else if (this.level.equals("12th")) {
                loadStudentData12th();
            } else {

            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            return;
        }

        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String section = Sectiontxt.getText().trim().toUpperCase();

            String oldSection = jTable1.getValueAt(selectedRow, 0).toString();

            if (Sectiontxt.getText().isEmpty()) {
                Sectionred.setText("Please enter a section.");
            } else {
                String query = "UPDATE school_section SET Section=? WHERE Section=?";
                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, section);
                pst.setString(2, oldSection);
                pst.executeUpdate();

                Sectionlebel.setVisible(true);
                Sectiontxt.setText("");
                Create.setVisible(true);

                if (this.level.equals("7th")) {
                    loadStudentData7th();
                } else if (this.level.equals("8th")) {
                    loadStudentData8th();
                } else if (this.level.equals("9th")) {
                    loadStudentData9th();
                } else if (this.level.equals("10th")) {
                    loadStudentData10th();
                } else if (this.level.equals("11th")) {
                    loadStudentData11th();
                } else if (this.level.equals("12th")) {
                    loadStudentData12th();
                } else {

                }

                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_UpdateActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed

        Billing_MainForm main = new Billing_MainForm();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Add_SectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_SectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_SectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_SectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Add_SectionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Create;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel Labelsection;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel Rooler;
    private javax.swing.JLabel Sectionlebel;
    private javax.swing.JLabel Sectionred;
    private javax.swing.JTextField Sectiontxt;
    private javax.swing.JButton Update;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
