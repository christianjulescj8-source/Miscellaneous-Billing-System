package miscellaneousbillingsystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Random;
import java.util.regex.Pattern;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

public class Billing_MainForm extends javax.swing.JFrame {

    private TableRowSorter<DefaultTableModel> sorter;
    private int numofsib;

    public Billing_MainForm() {
        initComponents();
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(153,255,153));
        curriculum.setSelectedIndex(0);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        sorter = new TableRowSorter<>(model);   // create the sorter
        jTable1.setRowSorter(sorter);
        Yearrool.setText(Session.schoolyear);
        if (Session.role.equals("Administrator")) {
            Rooler.setText("Administrator");
            report.setVisible(false);
            loadcombobox();
            loadTableStudentData();
        } else if (Session.role.equals("PTA Treasurer")) {
            Rooler.setText("PTA Treasurer");
            Accounts.setVisible(false);
            Fee.setVisible(false);
            Section.setVisible(false);
            report1.setVisible(false);
            loadcombobox();
            loadTableStudentData();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        feeprev = new javax.swing.JLabel();
        studentID = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        curriculum = new javax.swing.JComboBox<>();
        Sectionselect = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Yearrool = new javax.swing.JLabel();
        Rooler = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Menu = new javax.swing.JPanel();
        Student = new javax.swing.JButton();
        Section = new javax.swing.JButton();
        Year = new javax.swing.JButton();
        Accounts = new javax.swing.JButton();
        Fee = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        report = new javax.swing.JButton();
        report1 = new javax.swing.JButton();
        Backhome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        OpenMenuBtn = new javax.swing.JLabel();
        Add_Student = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        student8 = new javax.swing.JLabel();
        student7 = new javax.swing.JLabel();
        student10 = new javax.swing.JLabel();
        student11 = new javax.swing.JLabel();
        student12 = new javax.swing.JLabel();
        student9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Add_Section = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Section8 = new javax.swing.JLabel();
        Section7 = new javax.swing.JLabel();
        Section10 = new javax.swing.JLabel();
        Section11 = new javax.swing.JLabel();
        Section12 = new javax.swing.JLabel();
        Section9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Q2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        LRN = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Q3 = new javax.swing.JLabel();
        Q4 = new javax.swing.JLabel();
        Q1 = new javax.swing.JLabel();
        DateQ3 = new javax.swing.JLabel();
        DateQ2 = new javax.swing.JLabel();
        DateQ4 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        DateQ1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Searchlabel = new javax.swing.JLabel();
        Searchtxt = new javax.swing.JTextField();
        Pay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarks = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Pay1 = new javax.swing.JButton();
        viewQ2 = new javax.swing.JButton();
        viewQ3 = new javax.swing.JButton();
        viewQ4 = new javax.swing.JButton();
        viewQ1 = new javax.swing.JButton();

        feeprev.setText("jLabel7");

        studentID.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Refresh");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 110, 35));

        curriculum.setBackground(new java.awt.Color(0, 102, 0));
        curriculum.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
        curriculum.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(curriculum, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        Sectionselect.setBackground(new java.awt.Color(0, 102, 0));
        Sectionselect.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
        Sectionselect.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(Sectionselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 170, -1));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo smaller.png"))); // NOI18N
        jPanel3.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        Yearrool.setFont(new java.awt.Font("Baskerville Old Face", 0, 48)); // NOI18N
        Yearrool.setForeground(new java.awt.Color(0, 0, 0));
        Yearrool.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(Yearrool, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 50, 240, 50));

        Rooler.setFont(new java.awt.Font("Baskerville Old Face", 0, 70)); // NOI18N
        Rooler.setForeground(new java.awt.Color(0, 0, 0));
        Rooler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Rooler, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 90));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 94));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 840, 440));

        Menu.setBackground(new java.awt.Color(0, 51, 0));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Student.setBackground(new java.awt.Color(255, 255, 255));
        Student.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Student.setForeground(new java.awt.Color(0, 0, 0));
        Student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Addicon1.png"))); // NOI18N
        Student.setText("Student");
        Student.setBorderPainted(false);
        Student.setFocusPainted(false);
        Student.setFocusable(false);
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });
        Menu.add(Student, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 40));

        Section.setBackground(new java.awt.Color(255, 255, 255));
        Section.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Section.setForeground(new java.awt.Color(0, 0, 0));
        Section.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Manage_Section123.png"))); // NOI18N
        Section.setText("Section");
        Section.setBorderPainted(false);
        Section.setFocusPainted(false);
        Section.setFocusable(false);
        Section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionActionPerformed(evt);
            }
        });
        Menu.add(Section, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 140, 40));

        Year.setBackground(new java.awt.Color(255, 255, 255));
        Year.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Year.setForeground(new java.awt.Color(0, 0, 0));
        Year.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Yearicon123.png"))); // NOI18N
        Year.setText("Year");
        Year.setBorderPainted(false);
        Year.setFocusPainted(false);
        Year.setFocusable(false);
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });
        Menu.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, 40));

        Accounts.setBackground(new java.awt.Color(255, 255, 255));
        Accounts.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Accounts.setForeground(new java.awt.Color(0, 0, 0));
        Accounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/securityicon12.jpg"))); // NOI18N
        Accounts.setText("Accounts");
        Accounts.setBorderPainted(false);
        Accounts.setFocusPainted(false);
        Accounts.setFocusable(false);
        Accounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountsActionPerformed(evt);
            }
        });
        Menu.add(Accounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 140, 40));

        Fee.setBackground(new java.awt.Color(255, 255, 255));
        Fee.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Fee.setForeground(new java.awt.Color(0, 0, 0));
        Fee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misce12.png"))); // NOI18N
        Fee.setText("Fees");
        Fee.setBorderPainted(false);
        Fee.setFocusPainted(false);
        Fee.setFocusable(false);
        Fee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeeActionPerformed(evt);
            }
        });
        Menu.add(Fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 140, 40));

        Profile.setBackground(new java.awt.Color(255, 255, 255));
        Profile.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Profile.setForeground(new java.awt.Color(0, 0, 0));
        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Profile12.png"))); // NOI18N
        Profile.setText("Profile");
        Profile.setBorderPainted(false);
        Profile.setFocusPainted(false);
        Profile.setFocusable(false);
        Menu.add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 40));

        Logout.setBackground(new java.awt.Color(255, 255, 255));
        Logout.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(0, 0, 0));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout123.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setBorderPainted(false);
        Logout.setFocusPainted(false);
        Logout.setFocusable(false);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        Menu.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 140, 40));

        report.setBackground(new java.awt.Color(255, 255, 255));
        report.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        report.setForeground(new java.awt.Color(0, 0, 0));
        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reportsunfinished1.png"))); // NOI18N
        report.setText("Reports");
        report.setBorderPainted(false);
        report.setFocusPainted(false);
        report.setFocusable(false);
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        Menu.add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 140, 40));

        report1.setBackground(new java.awt.Color(255, 255, 255));
        report1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        report1.setForeground(new java.awt.Color(0, 0, 0));
        report1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reportsunfinished1.png"))); // NOI18N
        report1.setText("Reports");
        report1.setBorderPainted(false);
        report1.setFocusPainted(false);
        report1.setFocusable(false);
        report1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report1ActionPerformed(evt);
            }
        });
        Menu.add(report1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 140, 40));

        Backhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back123.png"))); // NOI18N
        Backhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackhomeMouseClicked(evt);
            }
        });
        Menu.add(Backhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menubackground123.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 436));

        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 0, 500));

        OpenMenuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuicon.png"))); // NOI18N
        OpenMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenMenuBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OpenMenuBtnMouseEntered(evt);
            }
        });
        jPanel1.add(OpenMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        Add_Student.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back123.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        Add_Student.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        student8.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        student8.setForeground(new java.awt.Color(255, 255, 255));
        student8.setText("8th Grade (Junior High School)");
        student8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student8MouseClicked(evt);
            }
        });
        Add_Student.add(student8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        student7.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        student7.setForeground(new java.awt.Color(255, 255, 255));
        student7.setText("7th Grade (Junior High School)");
        student7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student7MouseClicked(evt);
            }
        });
        Add_Student.add(student7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 300, 20));

        student10.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        student10.setForeground(new java.awt.Color(255, 255, 255));
        student10.setText("10th Grade (Junior High School)");
        student10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student10MouseClicked(evt);
            }
        });
        Add_Student.add(student10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        student11.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        student11.setForeground(new java.awt.Color(255, 255, 255));
        student11.setText("11th Grade (Senior High School)");
        student11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student11MouseClicked(evt);
            }
        });
        Add_Student.add(student11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        student12.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        student12.setForeground(new java.awt.Color(255, 255, 255));
        student12.setText("12th Grade (Senior High School)");
        student12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student12MouseClicked(evt);
            }
        });
        Add_Student.add(student12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        student9.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        student9.setForeground(new java.awt.Color(255, 255, 255));
        student9.setText("9th Grade (Junior High School)");
        student9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student9MouseClicked(evt);
            }
        });
        Add_Student.add(student9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select a curriculum:");
        Add_Student.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menubackground123.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        Add_Student.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(Add_Student, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 0, 235));

        Add_Section.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back123.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        Add_Section.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        Section8.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        Section8.setForeground(new java.awt.Color(255, 255, 255));
        Section8.setText("8th Grade (Junior High School)");
        Section8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Section8MouseClicked(evt);
            }
        });
        Add_Section.add(Section8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 300, -1));

        Section7.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        Section7.setForeground(new java.awt.Color(255, 255, 255));
        Section7.setText("7th Grade (Junior High School)");
        Section7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Section7MouseClicked(evt);
            }
        });
        Add_Section.add(Section7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 300, -1));

        Section10.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        Section10.setForeground(new java.awt.Color(255, 255, 255));
        Section10.setText("10th Grade (Junior High School)");
        Section10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Section10MouseClicked(evt);
            }
        });
        Add_Section.add(Section10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        Section11.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        Section11.setForeground(new java.awt.Color(255, 255, 255));
        Section11.setText("11th Grade (Senior High School)");
        Section11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Section11MouseClicked(evt);
            }
        });
        Add_Section.add(Section11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        Section12.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        Section12.setForeground(new java.awt.Color(255, 255, 255));
        Section12.setText("12th Grade (Senior High School)");
        Section12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Section12MouseClicked(evt);
            }
        });
        Add_Section.add(Section12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        Section9.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        Section9.setForeground(new java.awt.Color(255, 255, 255));
        Section9.setText("9th Grade (Junior High School)");
        Section9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Section9MouseClicked(evt);
            }
        });
        Add_Section.add(Section9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Select a curriculum:");
        Add_Section.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menubackground123.jpg"))); // NOI18N
        jLabel17.setText("jLabel2");
        Add_Section.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(Add_Section, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 0, 235));

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Student selected:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        Name.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 300, 20));

        Q2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Q2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, 20));

        jLabel20.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("2nd Quarter:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel22.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("3rd Quarter:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel24.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("4th Quarter:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        LRN.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        LRN.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 260, 20));

        jLabel27.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("1st Quarter:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, -1));

        Q3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Q3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 80, 20));

        Q4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Q4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 80, 20));

        Q1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Q1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 80, 20));

        DateQ3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        DateQ3.setForeground(new java.awt.Color(255, 255, 255));
        DateQ3.setText("Date:");
        jPanel1.add(DateQ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 370, -1));

        DateQ2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        DateQ2.setForeground(new java.awt.Color(255, 255, 255));
        DateQ2.setText("Date:");
        jPanel1.add(DateQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 370, -1));

        DateQ4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        DateQ4.setForeground(new java.awt.Color(255, 255, 255));
        DateQ4.setText("Date:");
        jPanel1.add(DateQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 370, -1));

        jLabel32.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Remarks:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        Total.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Total.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 60, 20));

        DateQ1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        DateQ1.setForeground(new java.awt.Color(255, 255, 255));
        DateQ1.setText("Date:");
        jPanel1.add(DateQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 370, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search icon12.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, -1, -1));

        Searchlabel.setBackground(new java.awt.Color(0, 153, 0));
        Searchlabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Searchlabel.setForeground(new java.awt.Color(204, 204, 255));
        Searchlabel.setText("Search...");
        jPanel1.add(Searchlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 120, -1));

        Searchtxt.setBackground(new java.awt.Color(0, 102, 0));
        Searchtxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 22)); // NOI18N
        Searchtxt.setForeground(new java.awt.Color(255, 255, 255));
        Searchtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Searchtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchtxtFocusLost(evt);
            }
        });
        Searchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchtxtActionPerformed(evt);
            }
        });
        Searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchtxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchtxtKeyTyped(evt);
            }
        });
        jPanel1.add(Searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 320, -1));

        Pay.setBackground(new java.awt.Color(255, 255, 255));
        Pay.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Pay.setForeground(new java.awt.Color(0, 102, 0));
        Pay.setText("Pay");
        Pay.setFocusPainted(false);
        Pay.setFocusable(false);
        Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayActionPerformed(evt);
            }
        });
        jPanel1.add(Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 90, -1));

        remarks.setBackground(new java.awt.Color(255, 255, 255));
        remarks.setColumns(20);
        remarks.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        remarks.setForeground(new java.awt.Color(0, 0, 0));
        remarks.setRows(5);
        jScrollPane1.setViewportView(remarks);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 390, 100));

        jLabel33.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Total:");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel26.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Name:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel28.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("LRN:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        Pay1.setBackground(new java.awt.Color(255, 255, 255));
        Pay1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Pay1.setForeground(new java.awt.Color(0, 102, 0));
        Pay1.setText("Discount");
        Pay1.setFocusPainted(false);
        Pay1.setFocusable(false);
        Pay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pay1ActionPerformed(evt);
            }
        });
        jPanel1.add(Pay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 110, -1));

        viewQ2.setBackground(new java.awt.Color(255, 255, 255));
        viewQ2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        viewQ2.setForeground(new java.awt.Color(0, 102, 0));
        viewQ2.setText("View");
        viewQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewQ2ActionPerformed(evt);
            }
        });
        jPanel1.add(viewQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        viewQ3.setBackground(new java.awt.Color(255, 255, 255));
        viewQ3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        viewQ3.setForeground(new java.awt.Color(0, 102, 0));
        viewQ3.setText("View");
        viewQ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewQ3ActionPerformed(evt);
            }
        });
        jPanel1.add(viewQ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        viewQ4.setBackground(new java.awt.Color(255, 255, 255));
        viewQ4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        viewQ4.setForeground(new java.awt.Color(0, 102, 0));
        viewQ4.setText("View");
        viewQ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewQ4ActionPerformed(evt);
            }
        });
        jPanel1.add(viewQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        viewQ1.setBackground(new java.awt.Color(255, 255, 255));
        viewQ1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        viewQ1.setForeground(new java.awt.Color(0, 102, 0));
        viewQ1.setText("View");
        viewQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewQ1ActionPerformed(evt);
            }
        });
        jPanel1.add(viewQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1234, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void loadcombobox() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear old items first
            Sectionselect.removeAllItems();

            remarks.setBorder(null);
            remarks.setFocusable(false);
            remarks.setEditable(false);
            remarks.setBackground(Color.WHITE);

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

    public void loadTableStudentData() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            JTableHeader Theader = jTable1.getTableHeader();
            Theader.setBackground(new java.awt.Color(153, 255, 153)); //[153,255,153]
            String grade = curriculum.getSelectedItem().toString();
            viewQ1.setVisible(false);
            viewQ2.setVisible(false);
            viewQ3.setVisible(false);
            viewQ4.setVisible(false);
            Name.setText("");
            LRN.setText("");
            Q1.setText("");
            Q2.setText("");
            Q3.setText("");
            Q4.setText("");
            DateQ1.setText("Date: ");
            DateQ2.setText("Date: ");
            DateQ3.setText("Date: ");
            DateQ4.setText("Date: ");
            Total.setText("");
            feeprev.setText("");
            studentID.setText("");
            remarks.setText("");
            Pay.setVisible(false);

            String sql = "SELECT si.lrn, CONCAT( "
                    + "    si.lastname, ', ', "
                    + "    si.firstname, ' ', "
                    + "    IF(si.middlename = '' OR si.middlename IS NULL, '', CONCAT(LEFT(si.middlename, 1), '.')) "
                    + ") AS fullname, "
                    + " si.section, si.grade, si.ID, "
                    + "sp.student_ID, sp.Fee_Paid, sp.`1st_Quarter`, sp.`2nd_Quarter`, sp.`3rd_Quarter`, sp.`4th_Quarter`, sp.Total_Paid, sp.Date_Q1, sp.Date_Q2, sp.Date_Q3, sp.Date_Q4, sp.remarks "
                    + "FROM student_info si "
                    + "LEFT JOIN student_payment sp ON si.ID = sp.student_ID "
                    + "WHERE si.grade = ? AND si.school_Year = ? "
                    + "ORDER BY si.lastname ASC, si.firstname ASC";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, grade);
            stmt.setString(2, Session.schoolyear);
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();

            String[] columnHeaders = {
                "LRN", "Full Name", "Section", "Grade",
                "Student ID", "Payment ID", "Fee Paid",
                "1st Quarter", "2nd Quarter", "3rd Quarter", "4th Quarter", "Total Paid",
                "Date Q1", "Date Q2", "Date Q3", "Date Q4", "Remarks"
            };

            for (String header : columnHeaders) {
                model.addColumn(header);
            }

            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            jTable1.setModel(model);
            jTable1.setModel(model);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.setFocusable(false);
            jTable1.setDefaultEditor(Object.class, null);
            int[] hiddenCols = {2, 3, 4, 5, 6, 12, 13, 14, 15, 16}; // indexes start at 0
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
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String SQL = "";
            int selectedrow = jTable1.getSelectedRow();
            if (selectedrow > -1) {
                if (Session.role.equals("Administrator")) {
                    Pay.setVisible(false);
                } else if (Session.role.equals("PTA Treasurer")) {
                    Pay.setVisible(true);
                }
                //this is a jTextArea
                //"Full Name", "Section", "Grade",
                //"Identifier", "Student ID", "Payment ID", "Fee Paid",
                //"1st Quarter", "2nd Quarter", "3rd Quarter", "4th Quarter", "Total Paid",
                //"Date Q1", "Date Q2", "Date Q3", "Date Q4"
                String lrn = jTable1.getValueAt(selectedrow, 0).toString();
                String name = jTable1.getValueAt(selectedrow, 1).toString();
                String id = jTable1.getValueAt(selectedrow, 4).toString();
                String qo1 = jTable1.getValueAt(selectedrow, 7).toString();
                String qo2 = jTable1.getValueAt(selectedrow, 8).toString();
                String qo3 = jTable1.getValueAt(selectedrow, 9).toString();
                String qo4 = jTable1.getValueAt(selectedrow, 10).toString();
                String sum = jTable1.getValueAt(selectedrow, 11).toString();
                String dq1 = jTable1.getValueAt(selectedrow, 12).toString();
                String dq2 = jTable1.getValueAt(selectedrow, 13).toString();
                String dq3 = jTable1.getValueAt(selectedrow, 14).toString();
                String dq4 = jTable1.getValueAt(selectedrow, 15).toString();
                String feed = jTable1.getValueAt(selectedrow, 6).toString();
                String remark = jTable1.getValueAt(selectedrow, 16).toString();
                Name.setText(name);
                LRN.setText(lrn);
                Q1.setText(qo1);
                Q2.setText(qo2);
                Q3.setText(qo3);
                Q4.setText(qo4);              
                DateQ1.setText("Date: " + dq1);
                DateQ2.setText("Date: " + dq2);
                DateQ3.setText("Date: " + dq3);
                DateQ4.setText("Date: " + dq4);               
                Total.setText(sum);
                feeprev.setText(feed);
                studentID.setText(id);
                remarks.setText(remark);
                if(!dq1.isEmpty()){viewQ1.setVisible(true);}
                if(!dq2.isEmpty()){viewQ2.setVisible(true);}
                if(!dq3.isEmpty()){viewQ3.setVisible(true);}
                if(!dq4.isEmpty()){viewQ4.setVisible(true);}

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked

    }//GEN-LAST:event_jScrollPane2MouseClicked
    private javax.swing.Timer menuTimer;
    int y = 0;
    int A = 0;
    int M = 0;
    private void OpenMenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenMenuBtnMouseClicked
        if (y == 0) {
            Menu.setVisible(true);
            Menu.setSize(0, 500); // start closed
            y = 159;              // target width
            M = 360;
            A = 360;

            menuTimer = new javax.swing.Timer(2, e -> {
                int width = Menu.getWidth();
                if (width < y) {
                    Menu.setSize(width + 5, 500); // animate expand
                } else {
                    ((javax.swing.Timer) e.getSource()).stop(); // stop at target
                }
            });
            menuTimer.start();
        }
    }//GEN-LAST:event_OpenMenuBtnMouseClicked

    private void BackhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackhomeMouseClicked
        if (y == 159) {
            Menu.setSize(159, 500);  // start fully open       
            y = 0;                   // target width when closed

            menuTimer = new javax.swing.Timer(2, e -> {
                int width = Menu.getWidth();
                if (width > y) {
                    Menu.setSize(width - 5, 500); // animate shrink
                } else {
                    ((javax.swing.Timer) e.getSource()).stop(); // stop when closed
                }
            });
            menuTimer.start();
        }
    }//GEN-LAST:event_BackhomeMouseClicked

    private void FeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeeActionPerformed
        Add_FeeForm addfee = new Add_FeeForm();
        addfee.setVisible(true);
        dispose();
    }//GEN-LAST:event_FeeActionPerformed

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        Add_YearForm addyear = new Add_YearForm();
        addyear.setVisible(true);
        dispose();
    }//GEN-LAST:event_YearActionPerformed

    private void AccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountsActionPerformed
        Security_AccountForm secure = new Security_AccountForm();
        secure.setVisible(true);
        dispose();
    }//GEN-LAST:event_AccountsActionPerformed

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        if (y == 159) {
            Menu.setSize(159, 500);   // menu starts open

            y = 0;                    // menu target (closed)
            A = 300;                  // Add_student target width

            menuTimer = new javax.swing.Timer(2, e -> {
                int menuWidth = Menu.getWidth();
                int studentWidth = Add_Student.getWidth();

                if (menuWidth > y) {
                    Menu.setSize(menuWidth - 5, 500); // close menu
                } else if (studentWidth < A) {
                    Add_Student.setSize(studentWidth + 5, 235); // expand Add_student
                } else {
                    ((javax.swing.Timer) e.getSource()).stop(); // stop when done
                }
            });
            menuTimer.start();
        }
    }//GEN-LAST:event_StudentActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        if (y == 0) {
            Menu.setVisible(true);
            Menu.setSize(y, 500);  // start collapsed
            y = 159;               // target width for Menu

            menuTimer = new javax.swing.Timer(2, e -> {
                int addWidth = Add_Student.getWidth();
                int menuWidth = Menu.getWidth();

                if (addWidth > 0) {
                    Add_Student.setSize(addWidth - 5, 235); // shrink Add_student
                } else if (menuWidth < y) {
                    Menu.setSize(menuWidth + 5, 500);       // expand Menu
                } else {
                    ((javax.swing.Timer) e.getSource()).stop(); // stop when done
                }
            });
            menuTimer.start();
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void student7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student7MouseClicked
        String grade = "7th";
        Add_StudentForm1 student = new Add_StudentForm1(grade);
        student.setVisible(true);
        dispose();
    }//GEN-LAST:event_student7MouseClicked

    private void student8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student8MouseClicked
        String grade = "8th";
        Add_StudentForm1 student = new Add_StudentForm1(grade);
        student.setVisible(true);
        dispose();
    }//GEN-LAST:event_student8MouseClicked

    private void student9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student9MouseClicked
        String grade = "9th";
        Add_StudentForm1 student = new Add_StudentForm1(grade);
        student.setVisible(true);
        dispose();
    }//GEN-LAST:event_student9MouseClicked

    private void student10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student10MouseClicked
        String grade = "10th";
        Add_StudentForm1 student = new Add_StudentForm1(grade);
        student.setVisible(true);
        dispose();
    }//GEN-LAST:event_student10MouseClicked

    private void student11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student11MouseClicked
        String grade = "11th";
        Add_StudentForm1 student = new Add_StudentForm1(grade);
        student.setVisible(true);
        dispose();
    }//GEN-LAST:event_student11MouseClicked

    private void student12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student12MouseClicked
        String grade = "12th";
        Add_StudentForm1 student = new Add_StudentForm1(grade);
        student.setVisible(true);
        dispose();
    }//GEN-LAST:event_student12MouseClicked
    private javax.swing.Timer manageTimer;
    private void SectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectionActionPerformed
        if (y == 159) {
            Menu.setSize(159, 500);

            y = 0;   // collapsed
            M = 360; // reset Manage_section width

            manageTimer = new javax.swing.Timer(2, e -> {
                int menuWidth = Menu.getWidth();
                int manageWidth = Add_Section.getWidth();

                if (menuWidth > 0) {
                    Menu.setSize(menuWidth - 5, 500);  // shrink Menu
                } else if (manageWidth < 360) {
                    Add_Section.setSize(manageWidth + 5, 235); // expand Manage_section
                } else {
                    ((javax.swing.Timer) e.getSource()).stop(); // stop when done
                }
            });
            manageTimer.start();
        }
    }//GEN-LAST:event_SectionActionPerformed
    private javax.swing.Timer manageOpenTimer;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (y == 0) {
            Menu.setVisible(true);
            Menu.setSize(y, 500);
            y = 159; // expanded state

            manageOpenTimer = new javax.swing.Timer(2, e -> {
                int manageWidth = Add_Section.getWidth();
                int menuWidth = Menu.getWidth();

                if (manageWidth > 0) {
                    Add_Section.setSize(manageWidth - 5, 235); // shrink Manage_section
                } else if (menuWidth < 159) {
                    Menu.setSize(menuWidth + 5, 500); // expand Menu
                } else {
                    ((javax.swing.Timer) e.getSource()).stop(); // stop animation
                }
            });
            manageOpenTimer.start();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        LoginForm login = new LoginForm();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void curriculumAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_curriculumAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_curriculumAncestorMoved

    private void curriculumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculumMouseClicked
        y = 0;
    }//GEN-LAST:event_curriculumMouseClicked

    private void curriculumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curriculumActionPerformed
        loadcombobox();
        Menu.setVisible(false);
        y = 0;
        Menu.setSize(0, 500);
        loadTableStudentData();

    }//GEN-LAST:event_curriculumActionPerformed

    private void SectionselectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SectionselectMouseClicked
        y = 0;
        Menu.setVisible(false);
    }//GEN-LAST:event_SectionselectMouseClicked

    private void SectionselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectionselectActionPerformed
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            y = 0;
            Menu.setVisible(false);
            Menu.setSize(0, 500);
            String searchText = Sectionselect.getSelectedItem().toString();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
            jTable1.setRowSorter(sorter);

            if (searchText.length() == 0) {
                sorter.setRowFilter(null);
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)^" + searchText + "$"));

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_SectionselectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        y = 0;
        Menu.setVisible(false);
        Menu.setSize(0, 500);
        loadcombobox();
        loadTableStudentData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SearchtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchtxtFocusGained
        if (Searchlabel.getText().equals("Search...")) {
            y = 0;
            Menu.setVisible(false);
            Menu.setSize(0, 500);
            Searchlabel.setVisible(false);
        }
    }//GEN-LAST:event_SearchtxtFocusGained

    private void SearchtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchtxtFocusLost
        if (Searchtxt.getText().isEmpty()) {
            Searchlabel.setVisible(true);

        }
    }//GEN-LAST:event_SearchtxtFocusLost

    private void SearchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchtxtActionPerformed
        String searchText = Searchtxt.getText().toString();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);
        if (searchText.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(searchText)));
        }
    }//GEN-LAST:event_SearchtxtActionPerformed

    private void SearchtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchtxtKeyTyped

    }//GEN-LAST:event_SearchtxtKeyTyped

    private void OpenMenuBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenMenuBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenMenuBtnMouseEntered

    private void SearchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchtxtKeyReleased

        String searchText = Searchtxt.getText().trim();
        if (searchText.isEmpty()) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(searchText)));
        }
    }//GEN-LAST:event_SearchtxtKeyReleased

    private void PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayActionPerformed

        int sid = Integer.parseInt(studentID.getText());
        String feeles = feeprev.getText();
        String name = Name.getText();
        String Lrn = LRN.getText();
        String remark = remarks.getText();
        PaymentForm pay = new PaymentForm(sid, name, feeles, this.numofsib, Lrn, remark);
        pay.setVisible(true);
        dispose();
    }//GEN-LAST:event_PayActionPerformed

    private void Section7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Section7MouseClicked
        String grade = "7th";
        Add_SectionForm section = new Add_SectionForm(grade);
        section.setVisible(true);
        dispose();
    }//GEN-LAST:event_Section7MouseClicked

    private void Section8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Section8MouseClicked
        String grade = "8th";
        Add_SectionForm section = new Add_SectionForm(grade);
        section.setVisible(true);
        dispose();
    }//GEN-LAST:event_Section8MouseClicked

    private void Section9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Section9MouseClicked
        String grade = "9th";
        Add_SectionForm section = new Add_SectionForm(grade);
        section.setVisible(true);
        dispose();
    }//GEN-LAST:event_Section9MouseClicked

    private void Section10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Section10MouseClicked
        String grade = "10th";
        Add_SectionForm section = new Add_SectionForm(grade);
        section.setVisible(true);
        dispose();
    }//GEN-LAST:event_Section10MouseClicked

    private void Section11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Section11MouseClicked
        String grade = "11th";
        Add_SectionForm section = new Add_SectionForm(grade);
        section.setVisible(true);
        dispose();
    }//GEN-LAST:event_Section11MouseClicked

    private void Section12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Section12MouseClicked
        String grade = "12th";
        Add_SectionForm section = new Add_SectionForm(grade);
        section.setVisible(true);
        dispose();
    }//GEN-LAST:event_Section12MouseClicked

    private void Pay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pay1ActionPerformed

        Session.studentID = Integer.parseInt(studentID.getText().toString());
        SPSdiscountForm discount = new SPSdiscountForm();
        discount.setVisible(true);
        dispose();
    }//GEN-LAST:event_Pay1ActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        ExportForm export = new ExportForm();
        export.setVisible(true);
        dispose();
    }//GEN-LAST:event_reportActionPerformed

    private void report1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report1ActionPerformed
        ExportForm export = new ExportForm();
        export.setVisible(true);
        dispose();
    }//GEN-LAST:event_report1ActionPerformed

    private void viewQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewQ1ActionPerformed
        
        Session.Quarter = "1st";
        Session.Discount = false;
        Session.studentID = Integer.parseInt(studentID.getText().toString());
        Official_RecieptForm reciept = new Official_RecieptForm();
        reciept.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_viewQ1ActionPerformed

    private void viewQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewQ2ActionPerformed
        Session.Quarter = "2nd";
        Session.Discount = false;
        Session.studentID = Integer.parseInt(studentID.getText().toString());
        Official_RecieptForm reciept = new Official_RecieptForm();
        reciept.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewQ2ActionPerformed

    private void viewQ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewQ3ActionPerformed
        Session.Quarter = "3rd";
        Session.Discount = false;
        Session.studentID = Integer.parseInt(studentID.getText().toString());
        Official_RecieptForm reciept = new Official_RecieptForm();
        reciept.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewQ3ActionPerformed

    private void viewQ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewQ4ActionPerformed
        Session.Quarter = "4th";
        Session.Discount = false;
        Session.studentID = Integer.parseInt(studentID.getText().toString());
        Official_RecieptForm reciept = new Official_RecieptForm();
        reciept.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewQ4ActionPerformed

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
            java.util.logging.Logger.getLogger(Billing_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing_MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accounts;
    private javax.swing.JPanel Add_Section;
    private javax.swing.JPanel Add_Student;
    private javax.swing.JLabel Backhome;
    private javax.swing.JLabel DateQ1;
    private javax.swing.JLabel DateQ2;
    private javax.swing.JLabel DateQ3;
    private javax.swing.JLabel DateQ4;
    private javax.swing.JButton Fee;
    private javax.swing.JLabel LRN;
    private javax.swing.JButton Logout;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel OpenMenuBtn;
    private javax.swing.JButton Pay;
    private javax.swing.JButton Pay1;
    private javax.swing.JButton Profile;
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JLabel Rooler;
    private javax.swing.JLabel Searchlabel;
    private javax.swing.JTextField Searchtxt;
    private javax.swing.JButton Section;
    private javax.swing.JLabel Section10;
    private javax.swing.JLabel Section11;
    private javax.swing.JLabel Section12;
    private javax.swing.JLabel Section7;
    private javax.swing.JLabel Section8;
    private javax.swing.JLabel Section9;
    private javax.swing.JComboBox<String> Sectionselect;
    private javax.swing.JButton Student;
    private javax.swing.JLabel Total;
    private javax.swing.JButton Year;
    private javax.swing.JLabel Yearrool;
    private javax.swing.JComboBox<String> curriculum;
    private javax.swing.JLabel feeprev;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
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
    private javax.swing.JButton report;
    private javax.swing.JButton report1;
    private javax.swing.JLabel student10;
    private javax.swing.JLabel student11;
    private javax.swing.JLabel student12;
    private javax.swing.JLabel student7;
    private javax.swing.JLabel student8;
    private javax.swing.JLabel student9;
    private javax.swing.JLabel studentID;
    private javax.swing.JButton viewQ1;
    private javax.swing.JButton viewQ2;
    private javax.swing.JButton viewQ3;
    private javax.swing.JButton viewQ4;
    // End of variables declaration//GEN-END:variables
}
