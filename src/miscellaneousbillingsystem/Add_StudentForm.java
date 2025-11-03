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

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Add_StudentForm extends javax.swing.JFrame {
    private TableRowSorter<DefaultTableModel> sorter;
    public Add_StudentForm() {
        UIManager.put("ScrollBarUI", "miscellaneousbillingsystem.ScrollBarWin11");
        initComponents();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        sorter = new TableRowSorter<>(model);   // create the sorter
        jTable1.setRowSorter(sorter);
        Create.setVisible(false);
        sibling.setVisible(false);
        check.setVisible(false);
        Sectionselect.setOpaque(false);
        Sectionselect.setBackground(new Color(0, 0, 0, 0));
        loadStudentData();
        loadcombobox();
        loadcombosib1();
        loadcombosib2();
        loadcombosib3();
        loadcombosib4();
        loadcombosib5();
        loadcombosib6();
        loadcombosib7();
        loadcombosib8();
        loadcombosib9();

    }
    private String level;

    public Add_StudentForm(String grade) {

        initComponents();
        this.level = grade;
        sibling.setVisible(false);
        Create.setVisible(false);
        check.setVisible(false);
        loadcombosib1();
        loadcombosib2();
        loadcombosib3();
        loadcombosib4();
        loadcombosib5();
        loadcombosib6();
        loadcombosib7();
        loadcombosib8();
        loadcombosib9();
        loadStudentData();
        loadcombobox();

        if (grade.equals("7th")) {
            Rooler.setText("Add Student 7th Grade");

        } else if (grade.equals("8th")) {
            Rooler.setText("Add Student 8th Grade");

        } else if (grade.equals("9th")) {
            Rooler.setText("Add Student 9th Grade");

        } else if (grade.equals("10th")) {
            Rooler.setText("Add Student 10th Grade");

        } else if (grade.equals("11th")) {
            Rooler.setText("Add Student 11th Grade");
        } else if (grade.equals("12th")) {
            Rooler.setText("Add Student 12th Grade");

        } else {
            System.out.println("not good");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDD = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        check = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Rooler = new javax.swing.JLabel();
        sibling = new javax.swing.JPanel();
        sibling1lebel = new javax.swing.JLabel();
        sibling1txt = new javax.swing.JTextField();
        sibling2lebel = new javax.swing.JLabel();
        sibling2txt = new javax.swing.JTextField();
        sibling3lebel = new javax.swing.JLabel();
        sibling3txt = new javax.swing.JTextField();
        sibling4lebel = new javax.swing.JLabel();
        sibling4txt = new javax.swing.JTextField();
        sibling5lebel = new javax.swing.JLabel();
        sibling5txt = new javax.swing.JTextField();
        sibling6lebel = new javax.swing.JLabel();
        sibling6txt = new javax.swing.JTextField();
        sibling7lebel = new javax.swing.JLabel();
        sibling7txt = new javax.swing.JTextField();
        curriculum3 = new javax.swing.JComboBox<>();
        Sectionselect3 = new javax.swing.JComboBox<>();
        Sectionselect1 = new javax.swing.JComboBox<>();
        curriculum1 = new javax.swing.JComboBox<>();
        Sectionselect2 = new javax.swing.JComboBox<>();
        curriculum2 = new javax.swing.JComboBox<>();
        Sectionselect4 = new javax.swing.JComboBox<>();
        curriculum4 = new javax.swing.JComboBox<>();
        Sectionselect5 = new javax.swing.JComboBox<>();
        curriculum5 = new javax.swing.JComboBox<>();
        Sectionselect6 = new javax.swing.JComboBox<>();
        curriculum6 = new javax.swing.JComboBox<>();
        Sectionselect7 = new javax.swing.JComboBox<>();
        curriculum7 = new javax.swing.JComboBox<>();
        sibling8lebel = new javax.swing.JLabel();
        sibling8txt = new javax.swing.JTextField();
        curriculum8 = new javax.swing.JComboBox<>();
        Sectionselect8 = new javax.swing.JComboBox<>();
        sibling9lebel = new javax.swing.JLabel();
        sibling9txt = new javax.swing.JTextField();
        curriculum9 = new javax.swing.JComboBox<>();
        Sectionselect9 = new javax.swing.JComboBox<>();
        Create1 = new javax.swing.JButton();
        Create = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        firstnamered = new javax.swing.JLabel();
        Middlenamered = new javax.swing.JLabel();
        Lastnamered = new javax.swing.JLabel();
        Middlenamelabel = new javax.swing.JLabel();
        Firstnamelabel = new javax.swing.JLabel();
        Lastnamelabel = new javax.swing.JLabel();
        Searchlabel = new javax.swing.JLabel();
        Firstnametxt = new javax.swing.JTextField();
        Middlenametxt = new javax.swing.JTextField();
        Lastnametxt = new javax.swing.JTextField();
        Searchtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Sectionselect = new javax.swing.JComboBox<>();
        checksib = new javax.swing.JCheckBox();
        checkFullname = new javax.swing.JLabel();

        IDD.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        check.setBackground(new java.awt.Color(0, 153, 0));
        check.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("does this student have sibling/s?");
        check.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("YES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        check.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 153, 0));
        jButton2.setText("NO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        check.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jPanel1.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 470, 320));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 770, 440));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo4.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        Rooler.setFont(new java.awt.Font("Baskerville Old Face", 0, 58)); // NOI18N
        Rooler.setForeground(new java.awt.Color(0, 0, 0));
        Rooler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Rooler, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 4, 1180, 90));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 94));

        sibling.setBackground(new java.awt.Color(0, 153, 0));
        sibling.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sibling1lebel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        sibling1lebel.setForeground(new java.awt.Color(204, 204, 255));
        sibling1lebel.setText("1. Sibling name...");
        sibling.add(sibling1lebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, -1));

        sibling1txt.setBackground(new java.awt.Color(0, 153, 0));
        sibling1txt.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        sibling1txt.setForeground(new java.awt.Color(255, 255, 255));
        sibling1txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        sibling1txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sibling1txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sibling1txtFocusLost(evt);
            }
        });
        sibling1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sibling1txtActionPerformed(evt);
            }
        });
        sibling.add(sibling1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        sibling2lebel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        sibling2lebel.setForeground(new java.awt.Color(204, 204, 255));
        sibling2lebel.setText("2. Sibling name...");
        sibling.add(sibling2lebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 140, -1));

        sibling2txt.setBackground(new java.awt.Color(0, 153, 0));
        sibling2txt.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        sibling2txt.setForeground(new java.awt.Color(255, 255, 255));
        sibling2txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        sibling2txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sibling2txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sibling2txtFocusLost(evt);
            }
        });
        sibling.add(sibling2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, -1));

        sibling3lebel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        sibling3lebel.setForeground(new java.awt.Color(204, 204, 255));
        sibling3lebel.setText("3. Sibling name...");
        sibling.add(sibling3lebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 140, -1));

        sibling3txt.setBackground(new java.awt.Color(0, 153, 0));
        sibling3txt.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        sibling3txt.setForeground(new java.awt.Color(255, 255, 255));
        sibling3txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        sibling3txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sibling3txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sibling3txtFocusLost(evt);
            }
        });
        sibling.add(sibling3txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, -1));

        sibling4lebel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        sibling4lebel.setForeground(new java.awt.Color(204, 204, 255));
        sibling4lebel.setText("4. Sibling name...");
        sibling.add(sibling4lebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 140, -1));

        sibling4txt.setBackground(new java.awt.Color(0, 153, 0));
        sibling4txt.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        sibling4txt.setForeground(new java.awt.Color(255, 255, 255));
        sibling4txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        sibling4txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sibling4txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sibling4txtFocusLost(evt);
            }
        });
        sibling.add(sibling4txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, -1));

        sibling5lebel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        sibling5lebel.setForeground(new java.awt.Color(204, 204, 255));
        sibling5lebel.setText("5. Sibling name...");
        sibling.add(sibling5lebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 140, -1));

        sibling5txt.setBackground(new java.awt.Color(0, 153, 0));
        sibling5txt.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        sibling5txt.setForeground(new java.awt.Color(255, 255, 255));
        sibling5txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        sibling5txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sibling5txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sibling5txtFocusLost(evt);
            }
        });
        sibling.add(sibling5txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, -1));

        sibling6lebel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        sibling6lebel.setForeground(new java.awt.Color(204, 204, 255));
        sibling6lebel.setText("6. Sibling name...");
        sibling.add(sibling6lebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, -1));

        sibling6txt.setBackground(new java.awt.Color(0, 153, 0));
        sibling6txt.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        sibling6txt.setForeground(new java.awt.Color(255, 255, 255));
        sibling6txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        sibling6txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sibling6txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sibling6txtFocusLost(evt);
            }
        });
        sibling.add(sibling6txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, -1));

        sibling7lebel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        sibling7lebel.setForeground(new java.awt.Color(204, 204, 255));
        sibling7lebel.setText("7. Sibling name...");
        sibling.add(sibling7lebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 140, -1));

        sibling7txt.setBackground(new java.awt.Color(0, 153, 0));
        sibling7txt.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        sibling7txt.setForeground(new java.awt.Color(255, 255, 255));
        sibling7txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        sibling7txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sibling7txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sibling7txtFocusLost(evt);
            }
        });
        sibling.add(sibling7txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, -1));

        curriculum3.setBackground(new java.awt.Color(0, 153, 0));
        curriculum3.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        curriculum3.setForeground(new java.awt.Color(255, 255, 255));
        curriculum3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7th", "8th", "9th", "10th", "11th", "12th" }));
        curriculum3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        curriculum3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curriculum3MouseClicked(evt);
            }
        });
        curriculum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curriculum3ActionPerformed(evt);
            }
        });
        sibling.add(curriculum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, 20));

        Sectionselect3.setBackground(new java.awt.Color(0, 153, 0));
        Sectionselect3.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Sectionselect3.setForeground(new java.awt.Color(255, 255, 255));
        Sectionselect3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sectionselect3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        sibling.add(Sectionselect3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 160, 20));

        Sectionselect1.setBackground(new java.awt.Color(0, 153, 0));
        Sectionselect1.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Sectionselect1.setForeground(new java.awt.Color(255, 255, 255));
        Sectionselect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sectionselect1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        sibling.add(Sectionselect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 160, 20));

        curriculum1.setBackground(new java.awt.Color(0, 153, 0));
        curriculum1.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        curriculum1.setForeground(new java.awt.Color(255, 255, 255));
        curriculum1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7th", "8th", "9th", "10th", "11th", "12th" }));
        curriculum1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        curriculum1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curriculum1MouseClicked(evt);
            }
        });
        curriculum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curriculum1ActionPerformed(evt);
            }
        });
        sibling.add(curriculum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, 20));

        Sectionselect2.setBackground(new java.awt.Color(0, 153, 0));
        Sectionselect2.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Sectionselect2.setForeground(new java.awt.Color(255, 255, 255));
        Sectionselect2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sectionselect2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        sibling.add(Sectionselect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 160, 20));

        curriculum2.setBackground(new java.awt.Color(0, 153, 0));
        curriculum2.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        curriculum2.setForeground(new java.awt.Color(255, 255, 255));
        curriculum2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7th", "8th", "9th", "10th", "11th", "12th" }));
        curriculum2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        curriculum2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curriculum2MouseClicked(evt);
            }
        });
        curriculum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curriculum2ActionPerformed(evt);
            }
        });
        sibling.add(curriculum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 20));

        Sectionselect4.setBackground(new java.awt.Color(0, 153, 0));
        Sectionselect4.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Sectionselect4.setForeground(new java.awt.Color(255, 255, 255));
        Sectionselect4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sectionselect4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        sibling.add(Sectionselect4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 160, 20));

        curriculum4.setBackground(new java.awt.Color(0, 153, 0));
        curriculum4.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        curriculum4.setForeground(new java.awt.Color(255, 255, 255));
        curriculum4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7th", "8th", "9th", "10th", "11th", "12th" }));
        curriculum4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        curriculum4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curriculum4MouseClicked(evt);
            }
        });
        curriculum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curriculum4ActionPerformed(evt);
            }
        });
        sibling.add(curriculum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, 20));

        Sectionselect5.setBackground(new java.awt.Color(0, 153, 0));
        Sectionselect5.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Sectionselect5.setForeground(new java.awt.Color(255, 255, 255));
        Sectionselect5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sectionselect5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        sibling.add(Sectionselect5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 160, 20));

        curriculum5.setBackground(new java.awt.Color(0, 153, 0));
        curriculum5.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        curriculum5.setForeground(new java.awt.Color(255, 255, 255));
        curriculum5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7th", "8th", "9th", "10th", "11th", "12th" }));
        curriculum5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        curriculum5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curriculum5MouseClicked(evt);
            }
        });
        curriculum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curriculum5ActionPerformed(evt);
            }
        });
        sibling.add(curriculum5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, 20));

        Sectionselect6.setBackground(new java.awt.Color(0, 153, 0));
        Sectionselect6.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Sectionselect6.setForeground(new java.awt.Color(255, 255, 255));
        Sectionselect6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sectionselect6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        sibling.add(Sectionselect6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 160, 20));

        curriculum6.setBackground(new java.awt.Color(0, 153, 0));
        curriculum6.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        curriculum6.setForeground(new java.awt.Color(255, 255, 255));
        curriculum6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7th", "8th", "9th", "10th", "11th", "12th" }));
        curriculum6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        curriculum6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curriculum6MouseClicked(evt);
            }
        });
        curriculum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curriculum6ActionPerformed(evt);
            }
        });
        sibling.add(curriculum6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, 20));

        Sectionselect7.setBackground(new java.awt.Color(0, 153, 0));
        Sectionselect7.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Sectionselect7.setForeground(new java.awt.Color(255, 255, 255));
        Sectionselect7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sectionselect7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        sibling.add(Sectionselect7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 160, 20));

        curriculum7.setBackground(new java.awt.Color(0, 153, 0));
        curriculum7.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        curriculum7.setForeground(new java.awt.Color(255, 255, 255));
        curriculum7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7th", "8th", "9th", "10th", "11th", "12th" }));
        curriculum7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        curriculum7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curriculum7MouseClicked(evt);
            }
        });
        curriculum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curriculum7ActionPerformed(evt);
            }
        });
        sibling.add(curriculum7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, 20));

        sibling8lebel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        sibling8lebel.setForeground(new java.awt.Color(204, 204, 255));
        sibling8lebel.setText("8. Sibling name...");
        sibling.add(sibling8lebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 140, -1));

        sibling8txt.setBackground(new java.awt.Color(0, 153, 0));
        sibling8txt.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        sibling8txt.setForeground(new java.awt.Color(255, 255, 255));
        sibling8txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        sibling8txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sibling8txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sibling8txtFocusLost(evt);
            }
        });
        sibling.add(sibling8txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, -1));

        curriculum8.setBackground(new java.awt.Color(0, 153, 0));
        curriculum8.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        curriculum8.setForeground(new java.awt.Color(255, 255, 255));
        curriculum8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7th", "8th", "9th", "10th", "11th", "12th" }));
        curriculum8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        curriculum8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curriculum8MouseClicked(evt);
            }
        });
        curriculum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curriculum8ActionPerformed(evt);
            }
        });
        sibling.add(curriculum8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, 20));

        Sectionselect8.setBackground(new java.awt.Color(0, 153, 0));
        Sectionselect8.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Sectionselect8.setForeground(new java.awt.Color(255, 255, 255));
        Sectionselect8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sectionselect8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        sibling.add(Sectionselect8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 160, 20));

        sibling9lebel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        sibling9lebel.setForeground(new java.awt.Color(204, 204, 255));
        sibling9lebel.setText("9. Sibling name...");
        sibling.add(sibling9lebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 140, -1));

        sibling9txt.setBackground(new java.awt.Color(0, 153, 0));
        sibling9txt.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        sibling9txt.setForeground(new java.awt.Color(255, 255, 255));
        sibling9txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        sibling9txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sibling9txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sibling9txtFocusLost(evt);
            }
        });
        sibling.add(sibling9txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, -1));

        curriculum9.setBackground(new java.awt.Color(0, 153, 0));
        curriculum9.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        curriculum9.setForeground(new java.awt.Color(255, 255, 255));
        curriculum9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7th", "8th", "9th", "10th", "11th", "12th" }));
        curriculum9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        curriculum9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curriculum9MouseClicked(evt);
            }
        });
        curriculum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curriculum9ActionPerformed(evt);
            }
        });
        sibling.add(curriculum9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, 20));

        Sectionselect9.setBackground(new java.awt.Color(0, 153, 0));
        Sectionselect9.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Sectionselect9.setForeground(new java.awt.Color(255, 255, 255));
        Sectionselect9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sectionselect9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        sibling.add(Sectionselect9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 160, 20));

        jPanel2.add(sibling, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 460, 280));

        Create1.setBackground(new java.awt.Color(255, 255, 255));
        Create1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Create1.setForeground(new java.awt.Color(0, 153, 0));
        Create1.setText("Create");
        Create1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create1ActionPerformed(evt);
            }
        });
        jPanel2.add(Create1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 90, -1));

        Create.setBackground(new java.awt.Color(255, 255, 255));
        Create.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Create.setForeground(new java.awt.Color(0, 153, 0));
        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        jPanel2.add(Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 90, -1));

        Refresh.setBackground(new java.awt.Color(255, 255, 255));
        Refresh.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Refresh.setForeground(new java.awt.Color(0, 153, 0));
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel2.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 90, -1));

        Update.setBackground(new java.awt.Color(255, 255, 255));
        Update.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(0, 153, 0));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        Delete.setBackground(new java.awt.Color(255, 255, 255));
        Delete.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(0, 153, 0));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 90, -1));

        Back.setBackground(new java.awt.Color(255, 255, 255));
        Back.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 153, 0));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        firstnamered.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        firstnamered.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(firstnamered, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 20));

        Middlenamered.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Middlenamered.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(Middlenamered, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, 20));

        Lastnamered.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Lastnamered.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(Lastnamered, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 150, 20));

        Middlenamelabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        Middlenamelabel.setForeground(new java.awt.Color(204, 204, 255));
        Middlenamelabel.setText("Middlename...");
        jPanel2.add(Middlenamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, -1));

        Firstnamelabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        Firstnamelabel.setForeground(new java.awt.Color(204, 204, 255));
        Firstnamelabel.setText("Firstname...");
        jPanel2.add(Firstnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, -1));

        Lastnamelabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        Lastnamelabel.setForeground(new java.awt.Color(204, 204, 255));
        Lastnamelabel.setText("Lastname...");
        jPanel2.add(Lastnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, -1));

        Searchlabel.setBackground(new java.awt.Color(0, 153, 0));
        Searchlabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Searchlabel.setForeground(new java.awt.Color(204, 204, 255));
        Searchlabel.setText("Search...");
        jPanel2.add(Searchlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 120, -1));

        Firstnametxt.setBackground(new java.awt.Color(0, 153, 0));
        Firstnametxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Firstnametxt.setForeground(new java.awt.Color(255, 255, 255));
        Firstnametxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Firstnametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FirstnametxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FirstnametxtFocusLost(evt);
            }
        });
        jPanel2.add(Firstnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, -1));

        Middlenametxt.setBackground(new java.awt.Color(0, 153, 0));
        Middlenametxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Middlenametxt.setForeground(new java.awt.Color(255, 255, 255));
        Middlenametxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Middlenametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MiddlenametxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MiddlenametxtFocusLost(evt);
            }
        });
        jPanel2.add(Middlenametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, -1));

        Lastnametxt.setBackground(new java.awt.Color(0, 153, 0));
        Lastnametxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Lastnametxt.setForeground(new java.awt.Color(255, 255, 255));
        Lastnametxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Lastnametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LastnametxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LastnametxtFocusLost(evt);
            }
        });
        jPanel2.add(Lastnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 230, -1));

        Searchtxt.setBackground(new java.awt.Color(0, 153, 0));
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
        });
        jPanel2.add(Searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 320, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search icon12.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, -1, -1));

        Sectionselect.setBackground(new java.awt.Color(0, 153, 0));
        Sectionselect.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Sectionselect.setForeground(new java.awt.Color(255, 255, 255));
        Sectionselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sectionselect.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        Sectionselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionselectActionPerformed(evt);
            }
        });
        jPanel2.add(Sectionselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 160, -1));

        checksib.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        checksib.setForeground(new java.awt.Color(255, 255, 255));
        checksib.setText("With siblings");
        checksib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checksibActionPerformed(evt);
            }
        });
        jPanel2.add(checksib, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 120, -1));

        checkFullname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        checkFullname.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(checkFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 350, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 582));

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
     public void sectionload(){
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

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
     }
    public void loadStudentData() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear text fields           
            Firstnametxt.setText("");
            Middlenametxt.setText("");
            Lastnametxt.setText("");
            sibling1txt.setText("");
            sibling2txt.setText("");
            sibling3txt.setText("");
            sibling4txt.setText("");
            sibling5txt.setText("");
            sibling6txt.setText("");
            sibling7txt.setText("");
            sibling8txt.setText("");
            sibling9txt.setText("");
            checkFullname.setText("");
            firstnamered.setText("");
            Middlenamered.setText("");
            Lastnamered.setText("");
            Searchtxt.setText("");
            // set index 1 
            curriculum1.setSelectedItem("7th");
            curriculum2.setSelectedItem("7th");
            curriculum3.setSelectedItem("7th");
            curriculum4.setSelectedItem("7th");
            curriculum5.setSelectedItem("7th");
            curriculum6.setSelectedItem("7th");
            curriculum7.setSelectedItem("7th");
            curriculum8.setSelectedItem("7th");
            curriculum9.setSelectedItem("7th");
            loadcombosib1();
            loadcombosib2();
            loadcombosib3();
            loadcombosib4();
            loadcombosib5();
            loadcombosib6();
            loadcombosib7();
            loadcombosib8();
            loadcombosib9();
            // Show labels          
            Firstnamelabel.setVisible(true);
            Middlenamelabel.setVisible(true);
            Lastnamelabel.setVisible(true);
            sibling1lebel.setVisible(true);
            sibling2lebel.setVisible(true);
            sibling3lebel.setVisible(true);
            sibling4lebel.setVisible(true);
            sibling5lebel.setVisible(true);
            sibling6lebel.setVisible(true);
            sibling7lebel.setVisible(true);
            sibling8lebel.setVisible(true);
            sibling9lebel.setVisible(true);
            Create.setVisible(true);
            // Query with all needed columns
            String sql = "SELECT firstname, middlename, lastname, section, grade, Identifier, ID "
                    + "FROM student_info "
                    + "WHERE grade = ? AND school_Year = ? "
                    + "ORDER BY lastname ASC, section ASC";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, this.level);
            stmt.setString(2, Session.schoolyear);
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();

            // Add all columns to the model
            String[] Columnheader = {
                "First Name", "Middle Name", "Last Name", "Section", "grade", "Identifier", "ID"
            };
            for (String header : Columnheader) {
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

            // Hide unwanted columns (keep only LRN_Students, firstname, middlename, lastname, section)
            int[] hiddenCols = {4, 5, 6}; // indexes start at 0
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

    public void loadcombobox() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear old items
            Sectionselect.removeAllItems();

            String query = "SELECT Section FROM school_section WHERE Grade = ? ORDER BY Section ASC";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, this.level);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Sectionselect.addItem(rs.getString("Section"));
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("" + e.getMessage());
        }
    }

    public void loadcombosib1() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear old items
            Sectionselect1.removeAllItems();
            String grade = curriculum1.getSelectedItem().toString();
            String query = "SELECT Section FROM school_section WHERE Grade = ? ORDER BY Section ASC";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, grade);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Sectionselect1.addItem(rs.getString("Section"));
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("" + e.getMessage());
        }
    }

    public void loadcombosib2() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear old items
            Sectionselect2.removeAllItems();
            String grade = curriculum2.getSelectedItem().toString();
            String query = "SELECT Section FROM school_section WHERE Grade = ? ORDER BY Section ASC";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, grade);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Sectionselect2.addItem(rs.getString("Section"));
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("" + e.getMessage());
        }
    }

    public void loadcombosib3() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear old items
            Sectionselect3.removeAllItems();
            String grade = curriculum3.getSelectedItem().toString();
            String query = "SELECT Section FROM school_section WHERE Grade = ? ORDER BY Section ASC";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, grade);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Sectionselect3.addItem(rs.getString("Section"));
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("" + e.getMessage());
        }
    }

    public void loadcombosib4() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear old items
            Sectionselect4.removeAllItems();
            String grade = curriculum4.getSelectedItem().toString();
            String query = "SELECT Section FROM school_section WHERE Grade = ? ORDER BY Section ASC";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, grade);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Sectionselect4.addItem(rs.getString("Section"));
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("" + e.getMessage());
        }
    }

    public void loadcombosib5() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear old items
            Sectionselect5.removeAllItems();
            String grade = curriculum5.getSelectedItem().toString();
            String query = "SELECT Section FROM school_section WHERE Grade = ? ORDER BY Section ASC";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, grade);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Sectionselect5.addItem(rs.getString("Section"));
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("" + e.getMessage());
        }
    }

    public void loadcombosib6() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear old items
            Sectionselect6.removeAllItems();
            String grade = curriculum6.getSelectedItem().toString();
            String query = "SELECT Section FROM school_section WHERE Grade = ? ORDER BY Section ASC";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, grade);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Sectionselect6.addItem(rs.getString("Section"));
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("" + e.getMessage());
        }
    }

    public void loadcombosib7() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear old items
            Sectionselect7.removeAllItems();
            String grade = curriculum7.getSelectedItem().toString();
            String query = "SELECT Section FROM school_section WHERE Grade = ? ORDER BY Section ASC";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, grade);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Sectionselect7.addItem(rs.getString("Section"));
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("" + e.getMessage());
        }
    }

    public void loadcombosib8() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear old items
            Sectionselect8.removeAllItems();
            String grade = curriculum8.getSelectedItem().toString();
            String query = "SELECT Section FROM school_section WHERE Grade = ? ORDER BY Section ASC";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, grade);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Sectionselect8.addItem(rs.getString("Section"));
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("" + e.getMessage());
        }
    }

    public void loadcombosib9() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            // Clear old items
            Sectionselect9.removeAllItems();
            String grade = curriculum9.getSelectedItem().toString();
            String query = "SELECT Section FROM school_section WHERE Grade = ? ORDER BY Section ASC";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, grade);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Sectionselect9.addItem(rs.getString("Section"));
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("" + e.getMessage());
        }
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String SUrl = "jdbc:mysql://localhost:3307/java_user_database";
        String SUser = "root";
        String SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            int selectedrow = jTable1.getSelectedRow();
            if (selectedrow > -1) {
                String firstname = jTable1.getValueAt(selectedrow, 0).toString();
                String middlename = jTable1.getValueAt(selectedrow, 1).toString();
                String lastname = jTable1.getValueAt(selectedrow, 2).toString();
                String section = jTable1.getValueAt(selectedrow, 3).toString();
                String studid = jTable1.getValueAt(selectedrow, 6).toString();
                IDD.setText(studid);
                Firstnametxt.setText(firstname);
                Middlenametxt.setText(middlename);
                Lastnametxt.setText(lastname);
                Sectionselect.setSelectedItem(section);

                Firstnamelabel.setVisible(false);
                Middlenamelabel.setVisible(false);
                Lastnamelabel.setVisible(false);
                Create.setVisible(false);
                Create1.setVisible(false);
                checksib.setVisible(false);
                sibling.setVisible(false);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked

    }//GEN-LAST:event_jScrollPane2MouseClicked
    public String generateRecoveryCode() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder code = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            code.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return code.toString();
    }
    private String code;
    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        String SUrl, SUser, SPass, query, query2;
        SUrl = "jdbc:MySQL://localhost:3307/Billing_system_database";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            

           sectionload();

       
            String firstname, middlename, lastname, section, grade, code;

            firstname = Firstnametxt.getText().trim().toUpperCase();
            middlename = Middlenametxt.getText().trim().toUpperCase();
            lastname = Lastnametxt.getText().trim().toUpperCase();
            section = Sectionselect.getSelectedItem().toString();
            this.code = code = generateRecoveryCode();
            grade = this.level;

            if (firstname.isEmpty()) {
                firstnamered.setText("Firstname is required!");
                Middlenamered.setText("");
                Lastnamered.setText("");

            } else if (lastname.isEmpty()) {
                Lastnamered.setText("Lastname is required!");
                firstnamered.setText("");
                Middlenamered.setText("");

            } else {
                
                String name1 = sibling1txt.getText().toUpperCase().trim();
                String name2 = sibling2txt.getText().toUpperCase().trim();
                String name3 = sibling3txt.getText().toUpperCase().trim();
                String name4 = sibling4txt.getText().toUpperCase().trim();
                String name5 = sibling5txt.getText().toUpperCase().trim();
                String name6 = sibling6txt.getText().toUpperCase().trim();
                String name7 = sibling7txt.getText().toUpperCase().trim();
                String name8 = sibling8txt.getText().toUpperCase().trim();
                String name9 = sibling9txt.getText().toUpperCase().trim();
                String section1 = Sectionselect1.getSelectedItem().toString();
                String section2 = Sectionselect2.getSelectedItem().toString();
                String section3 = Sectionselect3.getSelectedItem().toString();
                String section4 = Sectionselect4.getSelectedItem().toString();
                String section5 = Sectionselect5.getSelectedItem().toString();
                String section6 = Sectionselect6.getSelectedItem().toString();
                String section7 = Sectionselect7.getSelectedItem().toString();
                String section8 = Sectionselect8.getSelectedItem().toString();
                String section9 = Sectionselect9.getSelectedItem().toString();
                String grade1 = curriculum1.getSelectedItem().toString();
                String grade2 = curriculum2.getSelectedItem().toString();
                String grade3 = curriculum3.getSelectedItem().toString();
                String grade4 = curriculum4.getSelectedItem().toString();
                String grade5 = curriculum5.getSelectedItem().toString();
                String grade6 = curriculum6.getSelectedItem().toString();
                String grade7 = curriculum7.getSelectedItem().toString();
                String grade8 = curriculum8.getSelectedItem().toString();
                String grade9 = curriculum9.getSelectedItem().toString();
                String Check = "SELECT COUNT(*) AS cnt FROM student_info "
                        + "WHERE firstname = ? AND lastname = ? AND middlename = ? "
                        + "AND grade = ? AND section = ? AND school_year = ?";
                PreparedStatement checking = con.prepareStatement(Check);
                checking.setString(1, firstname);
                checking.setString(2, lastname);
                checking.setString(3, middlename);
                checking.setString(4, grade);
                checking.setString(5, section);
                checking.setString(6, Session.schoolyear);

                ResultSet checkname = checking.executeQuery();
                if (checkname.next() && checkname.getInt("cnt") > 0) {
                    checkFullname.setText("this student is already been added");
                } else {
                    checkFullname.setText("");
                    if (checksib.isSelected()) {
                        String sql = "INSERT INTO student_info( firstname, middlename, lastname, section, grade, Identifier, school_Year )VALUES(?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement pst = con.prepareStatement(sql);
                        pst.setString(1, firstname);
                        pst.setString(2, middlename);
                        pst.setString(3, lastname);
                        pst.setString(4, section);
                        pst.setString(5, grade);
                        pst.setString(6, code);
                        pst.setString(7, Session.schoolyear);
                        pst.executeUpdate();
                        String sql2 = "SELECT * FROM student_info WHERE firstname = ? AND middlename = ?  AND lastname = ? AND Identifier = ?";
                        PreparedStatement ps = con.prepareStatement(sql2);
                        ps.setString(1, firstname);
                        ps.setString(2, middlename);
                        ps.setString(3, lastname);
                        ps.setString(4, this.code);
                        ResultSet rs = ps.executeQuery();
                        if (rs.next()) {
                            int id = rs.getInt("ID");
                            String sql3 = "INSERT INTO student_payment (student_ID, Fee_paid, Total_Paid, 1st_Quarter, 2nd_Quarter, 3rd_Quarter, 4th_Quarter, Date_Q1, Date_Q2, Date_Q3, Date_Q4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement p = con.prepareStatement(sql3);
                            p.setInt(1, id);
                            p.setString(2, "");
                            p.setInt(3, 0);
                            p.setInt(4, 0);
                            p.setInt(5, 0);
                            p.setInt(6, 0);
                            p.setInt(7, 0);
                            p.setString(8, "");
                            p.setString(9, "");
                            p.setString(10, "");
                            p.setString(11, "");
                            p.executeUpdate();
                            loadStudentData();
                        }
                        loadStudentData();
                        if (!(name1.isEmpty())) {
                            String sql1 = "INSERT INTO student_info( firstname, middlename, lastname, section, grade, Identifier, school_Year )VALUES(?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement st1 = con.prepareStatement(sql1);
                            st1.setString(1, name1);
                            st1.setString(2, middlename);
                            st1.setString(3, lastname);
                            st1.setString(4, section1);
                            st1.setString(5, grade1);
                            st1.setString(6, this.code);
                            st1.setString(7, Session.schoolyear);
                            st1.executeUpdate();
                            String sql4 = "SELECT * FROM student_info WHERE firstname = ? AND middlename = ?  AND lastname = ? AND Identifier = ?";
                            PreparedStatement st2 = con.prepareStatement(sql4);
                            st2.setString(1, name1);
                            st2.setString(2, middlename);
                            st2.setString(3, lastname);
                            st2.setString(4, this.code);
                            ResultSet r = st2.executeQuery();
                            if (r.next()) {
                                int id = r.getInt("ID");
                                String sql3 = "INSERT INTO student_payment (student_ID, Fee_paid, Total_Paid, 1st_Quarter, 2nd_Quarter, 3rd_Quarter, 4th_Quarter, Date_Q1, Date_Q2, Date_Q3, Date_Q4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                PreparedStatement p = con.prepareStatement(sql3);
                                p.setInt(1, id);
                                p.setString(2, "");
                                p.setInt(3, 0);
                                p.setInt(4, 0);
                                p.setInt(5, 0);
                                p.setInt(6, 0);
                                p.setInt(7, 0);
                                p.setString(8, "");
                                p.setString(9, "");
                                p.setString(10, "");
                                p.setString(11, "");
                                p.executeUpdate();
                                loadStudentData();
                            }
                            loadStudentData();
                        }
                        if (!(name2.isEmpty())) {
                            String sql1 = "INSERT INTO student_info( firstname, middlename, lastname, section, grade, Identifier, school_Year )VALUES(?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement st1 = con.prepareStatement(sql1);
                            st1.setString(1, name2);
                            st1.setString(2, middlename);
                            st1.setString(3, lastname);
                            st1.setString(4, section2);
                            st1.setString(5, grade2);
                            st1.setString(6, this.code);
                            st1.setString(7, Session.schoolyear);
                            st1.executeUpdate();
                            String sql4 = "SELECT * FROM student_info WHERE firstname = ? AND middlename = ?  AND lastname = ? AND Identifier = ?";
                            PreparedStatement st2 = con.prepareStatement(sql4);
                            st2.setString(1, name2);
                            st2.setString(2, middlename);
                            st2.setString(3, lastname);
                            st2.setString(4, this.code);
                            ResultSet r = st2.executeQuery();
                            if (r.next()) {
                                int id = r.getInt("ID");
                                String sql3 = "INSERT INTO student_payment (student_ID, Fee_paid, Total_Paid, 1st_Quarter, 2nd_Quarter, 3rd_Quarter, 4th_Quarter, Date_Q1, Date_Q2, Date_Q3, Date_Q4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                PreparedStatement p = con.prepareStatement(sql3);
                                p.setInt(1, id);
                                p.setString(2, "");
                                p.setInt(3, 0);
                                p.setInt(4, 0);
                                p.setInt(5, 0);
                                p.setInt(6, 0);
                                p.setInt(7, 0);
                                p.setString(8, "");
                                p.setString(9, "");
                                p.setString(10, "");
                                p.setString(11, "");
                                p.executeUpdate();
                                loadStudentData();
                            }
                            loadStudentData();
                        }
                        if (!(name3.isEmpty())) {
                            String sql1 = "INSERT INTO student_info( firstname, middlename, lastname, section, grade, Identifier, school_Year )VALUES(?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement st1 = con.prepareStatement(sql1);
                            st1.setString(1, name3);
                            st1.setString(2, middlename);
                            st1.setString(3, lastname);
                            st1.setString(4, section3);
                            st1.setString(5, grade3);
                            st1.setString(6, this.code);
                            st1.setString(7, Session.schoolyear);
                            st1.executeUpdate();
                            String sql4 = "SELECT * FROM student_info WHERE firstname = ? AND middlename = ?  AND lastname = ? AND Identifier = ?";
                            PreparedStatement st2 = con.prepareStatement(sql4);
                            st2.setString(1, name3);
                            st2.setString(2, middlename);
                            st2.setString(3, lastname);
                            st2.setString(4, this.code);
                            ResultSet r = st2.executeQuery();
                            if (r.next()) {
                                int id = r.getInt("ID");
                                String sql3 = "INSERT INTO student_payment (student_ID, Fee_paid, Total_Paid, 1st_Quarter, 2nd_Quarter, 3rd_Quarter, 4th_Quarter, Date_Q1, Date_Q2, Date_Q3, Date_Q4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                PreparedStatement p = con.prepareStatement(sql3);
                                p.setInt(1, id);
                                p.setString(2, "");
                                p.setInt(3, 0);
                                p.setInt(4, 0);
                                p.setInt(5, 0);
                                p.setInt(6, 0);
                                p.setInt(7, 0);
                                p.setString(8, "");
                                p.setString(9, "");
                                p.setString(10, "");
                                p.setString(11, "");
                                p.executeUpdate();
                                loadStudentData();
                            }
                            loadStudentData();
                        }
                        if (!(name4.isEmpty())) {
                            String sql1 = "INSERT INTO student_info( firstname, middlename, lastname, section, grade, Identifier, school_Year )VALUES(?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement st1 = con.prepareStatement(sql1);
                            st1.setString(1, name4);
                            st1.setString(2, middlename);
                            st1.setString(3, lastname);
                            st1.setString(4, section4);
                            st1.setString(5, grade4);
                            st1.setString(6, this.code);
                            st1.setString(7, Session.schoolyear);
                            st1.executeUpdate();
                            String sql4 = "SELECT * FROM student_info WHERE firstname = ? AND middlename = ?  AND lastname = ? AND Identifier = ?";
                            PreparedStatement st2 = con.prepareStatement(sql4);
                            st2.setString(1, name4);
                            st2.setString(2, middlename);
                            st2.setString(3, lastname);
                            st2.setString(4, this.code);
                            ResultSet r = st2.executeQuery();
                            if (r.next()) {
                                int id = r.getInt("ID");
                                String sql3 = "INSERT INTO student_payment (student_ID, Fee_paid, Total_Paid, 1st_Quarter, 2nd_Quarter, 3rd_Quarter, 4th_Quarter, Date_Q1, Date_Q2, Date_Q3, Date_Q4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                PreparedStatement p = con.prepareStatement(sql3);
                                p.setInt(1, id);
                                p.setString(2, "");
                                p.setInt(3, 0);
                                p.setInt(4, 0);
                                p.setInt(5, 0);
                                p.setInt(6, 0);
                                p.setInt(7, 0);
                                p.setString(8, "");
                                p.setString(9, "");
                                p.setString(10, "");
                                p.setString(11, "");
                                p.executeUpdate();
                                loadStudentData();
                            }
                            loadStudentData();
                        }
                        if (!(name5.isEmpty())) {
                            String sql1 = "INSERT INTO student_info( firstname, middlename, lastname, section, grade, Identifier, school_Year )VALUES(?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement st1 = con.prepareStatement(sql1);
                            st1.setString(1, name5);
                            st1.setString(2, middlename);
                            st1.setString(3, lastname);
                            st1.setString(4, section5);
                            st1.setString(5, grade5);
                            st1.setString(6, this.code);
                            st1.setString(7, Session.schoolyear);
                            st1.executeUpdate();
                            String sql4 = "SELECT * FROM student_info WHERE firstname = ? AND middlename = ?  AND lastname = ? AND Identifier = ?";
                            PreparedStatement st2 = con.prepareStatement(sql4);
                            st2.setString(1, name5);
                            st2.setString(2, middlename);
                            st2.setString(3, lastname);
                            st2.setString(4, this.code);
                            ResultSet r = st2.executeQuery();
                            if (r.next()) {
                                int id = r.getInt("ID");
                                String sql3 = "INSERT INTO student_payment (student_ID, Fee_paid, Total_Paid, 1st_Quarter, 2nd_Quarter, 3rd_Quarter, 4th_Quarter, Date_Q1, Date_Q2, Date_Q3, Date_Q4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                PreparedStatement p = con.prepareStatement(sql3);
                                p.setInt(1, id);
                                p.setString(2, "");
                                p.setInt(3, 0);
                                p.setInt(4, 0);
                                p.setInt(5, 0);
                                p.setInt(6, 0);
                                p.setInt(7, 0);
                                p.setString(8, "");
                                p.setString(9, "");
                                p.setString(10, "");
                                p.setString(11, "");
                                p.executeUpdate();
                                loadStudentData();
                            }
                            loadStudentData();
                            
                        }
                        if (!(name6.isEmpty())) {
                            String sql1 = "INSERT INTO student_info( firstname, middlename, lastname, section, grade, Identifier, school_Year )VALUES(?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement st1 = con.prepareStatement(sql1);
                            st1.setString(1, name6);
                            st1.setString(2, middlename);
                            st1.setString(3, lastname);
                            st1.setString(4, section6);
                            st1.setString(5, grade6);
                            st1.setString(6, this.code);
                            st1.setString(7, Session.schoolyear);
                            st1.executeUpdate();
                            String sql4 = "SELECT * FROM student_info WHERE firstname = ? AND middlename = ?  AND lastname = ? AND Identifier = ?";
                            PreparedStatement st2 = con.prepareStatement(sql4);
                            st2.setString(1, name6);
                            st2.setString(2, middlename);
                            st2.setString(3, lastname);
                            st2.setString(4, this.code);
                            ResultSet r = st2.executeQuery();
                            if (r.next()) {
                                int id = r.getInt("ID");
                                String sql3 = "INSERT INTO student_payment (student_ID, Fee_paid, Total_Paid, 1st_Quarter, 2nd_Quarter, 3rd_Quarter, 4th_Quarter, Date_Q1, Date_Q2, Date_Q3, Date_Q4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                PreparedStatement p = con.prepareStatement(sql3);
                                p.setInt(1, id);
                                p.setString(2, "");
                                p.setInt(3, 0);
                                p.setInt(4, 0);
                                p.setInt(5, 0);
                                p.setInt(6, 0);
                                p.setInt(7, 0);
                                p.setString(8, "");
                                p.setString(9, "");
                                p.setString(10, "");
                                p.setString(11, "");
                                p.executeUpdate();
                                loadStudentData();
                            }
                            loadStudentData();
                        }
                        if (!(name7.isEmpty())) {
                            String sql1 = "INSERT INTO student_info( firstname, middlename, lastname, section, grade, Identifier, school_Year )VALUES(?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement st1 = con.prepareStatement(sql1);
                            st1.setString(1, name7);
                            st1.setString(2, middlename);
                            st1.setString(3, lastname);
                            st1.setString(4, section7);
                            st1.setString(5, grade7);
                            st1.setString(6, this.code);
                            st1.setString(7, Session.schoolyear);
                            st1.executeUpdate();
                            String sql4 = "SELECT * FROM student_info WHERE firstname = ? AND middlename = ?  AND lastname = ? AND Identifier = ?";
                            PreparedStatement st2 = con.prepareStatement(sql4);
                            st2.setString(1, name7);
                            st2.setString(2, middlename);
                            st2.setString(3, lastname);
                            st2.setString(4, this.code);
                            ResultSet r = st2.executeQuery();
                            if (r.next()) {
                                int id = r.getInt("ID");
                                String sql3 = "INSERT INTO student_payment (student_ID, Fee_paid, Total_Paid, 1st_Quarter, 2nd_Quarter, 3rd_Quarter, 4th_Quarter, Date_Q1, Date_Q2, Date_Q3, Date_Q4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                PreparedStatement p = con.prepareStatement(sql3);
                                p.setInt(1, id);
                                p.setString(2, "");
                                p.setInt(3, 0);
                                p.setInt(4, 0);
                                p.setInt(5, 0);
                                p.setInt(6, 0);
                                p.setInt(7, 0);
                                p.setString(8, "");
                                p.setString(9, "");
                                p.setString(10, "");
                                p.setString(11, "");
                                p.executeUpdate();
                                loadStudentData();
                            }
                            loadStudentData();
                        }
                        if (!(name8.isEmpty())) {
                            String sql1 = "INSERT INTO student_info( firstname, middlename, lastname, section, grade, Identifier, school_Year )VALUES(?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement st1 = con.prepareStatement(sql1);
                            st1.setString(1, name8);
                            st1.setString(2, middlename);
                            st1.setString(3, lastname);
                            st1.setString(4, section8);
                            st1.setString(5, grade8);
                            st1.setString(6, this.code);
                            st1.setString(7, Session.schoolyear);
                            st1.executeUpdate();
                            String sql4 = "SELECT * FROM student_info WHERE firstname = ? AND middlename = ?  AND lastname = ? AND Identifier = ?";
                            PreparedStatement st2 = con.prepareStatement(sql4);
                            st2.setString(1, name8);
                            st2.setString(2, middlename);
                            st2.setString(3, lastname);
                            st2.setString(4, this.code);
                            ResultSet r = st2.executeQuery();
                            if (r.next()) {
                                int id = r.getInt("ID");
                                String sql3 = "INSERT INTO student_payment (student_ID, Fee_paid, Total_Paid, 1st_Quarter, 2nd_Quarter, 3rd_Quarter, 4th_Quarter, Date_Q1, Date_Q2, Date_Q3, Date_Q4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                PreparedStatement p = con.prepareStatement(sql3);
                                p.setInt(1, id);
                                p.setString(2, "");
                                p.setInt(3, 0);
                                p.setInt(4, 0);
                                p.setInt(5, 0);
                                p.setInt(6, 0);
                                p.setInt(7, 0);
                                p.setString(8, "");
                                p.setString(9, "");
                                p.setString(10, "");
                                p.setString(11, "");
                                p.executeUpdate();
                                loadStudentData();
                            }
                            loadStudentData();
                        }
                        if (!(name9.isEmpty())) {
                            String sql1 = "INSERT INTO student_info( firstname, middlename, lastname, section, grade, Identifier, school_Year )VALUES(?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement st1 = con.prepareStatement(sql1);
                            st1.setString(1, name9);
                            st1.setString(2, middlename);
                            st1.setString(3, lastname);
                            st1.setString(4, section9);
                            st1.setString(5, grade9);
                            st1.setString(6, this.code);
                            st1.setString(7, Session.schoolyear);
                            st1.executeUpdate();
                            String sql4 = "SELECT * FROM student_info WHERE firstname = ? AND middlename = ?  AND lastname = ? AND Identifier = ?";
                            PreparedStatement st2 = con.prepareStatement(sql4);
                            st2.setString(1, name9);
                            st2.setString(2, middlename);
                            st2.setString(3, lastname);
                            st2.setString(4, this.code);
                            ResultSet r = st2.executeQuery();
                            if (r.next()) {
                                int id = r.getInt("ID");
                                String sql3 = "INSERT INTO student_payment (student_ID, Fee_paid, Total_Paid, 1st_Quarter, 2nd_Quarter, 3rd_Quarter, 4th_Quarter, Date_Q1, Date_Q2, Date_Q3, Date_Q4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                PreparedStatement p = con.prepareStatement(sql3);
                                p.setInt(1, id);
                                p.setString(2, "");
                                p.setInt(3, 0);
                                p.setInt(4, 0);
                                p.setInt(5, 0);
                                p.setInt(6, 0);
                                p.setInt(7, 0);
                                p.setString(8, "");
                                p.setString(9, "");
                                p.setString(10, "");
                                p.setString(11, "");
                                p.executeUpdate();
                                loadStudentData();
                            }
                            loadStudentData();
                        }
                        sectionload();
                    } else if (!(checksib.isSelected())) {
                        String sql = "INSERT INTO student_info( firstname, middlename, lastname, section, grade, Identifier, school_Year )VALUES(?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement pst = con.prepareStatement(sql);
                        pst.setString(1, firstname);
                        pst.setString(2, middlename);
                        pst.setString(3, lastname);
                        pst.setString(4, section);
                        pst.setString(5, grade);
                        pst.setString(6, code);
                        pst.setString(7, Session.schoolyear);
                        pst.executeUpdate();
                        String sql2 = "SELECT * FROM student_info WHERE firstname = ? AND middlename = ?  AND lastname = ? AND Identifier = ?";
                        PreparedStatement st23 = con.prepareStatement(sql2);
                        st23.setString(1, firstname);
                        st23.setString(2, middlename);
                        st23.setString(3, lastname);
                        st23.setString(4, this.code);
                        ResultSet r = st23.executeQuery();
                        if (r.next()) {
                            int id = r.getInt("ID");
                            String sql3 = "INSERT INTO student_payment (student_ID, Fee_paid, Total_Paid, 1st_Quarter, 2nd_Quarter, 3rd_Quarter, 4th_Quarter, Date_Q1, Date_Q2, Date_Q3, Date_Q4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement pqw = con.prepareStatement(sql3);
                            pqw.setInt(1, id);
                            pqw.setString(2, "");
                            pqw.setInt(3, 0);
                            pqw.setInt(4, 0);
                            pqw.setInt(5, 0);
                            pqw.setInt(6, 0);
                            pqw.setInt(7, 0);
                            pqw.setString(8, "");
                            pqw.setString(9, "");
                            pqw.setString(10, "");
                            pqw.setString(11, "");
                            pqw.executeUpdate();

                            loadStudentData();
                            sectionload();
                        }
                        loadStudentData();
                        sectionload();
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());

        }

    }//GEN-LAST:event_CreateActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String SUrl, SUser, SPass, query, query2;
        SUrl = "jdbc:MySQL://localhost:3307/Billing_system_database";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String firstname, middlename, lastname, section, grade;
            
            
            firstname = Firstnametxt.getText().trim().toUpperCase();
            middlename = Middlenametxt.getText().trim().toUpperCase();
            lastname = Lastnametxt.getText().trim().toUpperCase();
            section = Sectionselect.getSelectedItem().toString();
            
            
            grade = this.level;
            if (firstname.isEmpty()) {
                firstnamered.setText("Firstname is required!");
                Middlenamered.setText("");
                Lastnamered.setText("");

            } else if (middlename.isEmpty()) {
                Middlenamered.setText("Middlename is required!");
                firstnamered.setText("");
                Lastnamered.setText("");

            } else if (lastname.isEmpty()) {
                Lastnamered.setText("Lastname is required!");
                firstnamered.setText("");
                Middlenamered.setText("");

            } else {
                String Check = "SELECT COUNT(*) AS cnt FROM student_info "
                        + "WHERE firstname = ? AND lastname = ? AND middlename = ? "
                        + "AND grade = ? AND section = ? AND school_year = ?";
                PreparedStatement checking = con.prepareStatement(Check);
                checking.setString(1, firstname);
                checking.setString(2, lastname);
                checking.setString(3, middlename);
                checking.setString(4, grade);
                checking.setString(5, section);
                checking.setString(6, Session.schoolyear);

                ResultSet checkname = checking.executeQuery();
                if (checkname.next() && checkname.getInt("cnt") > 0) {
                    checkFullname.setText("this student is already been added");
                } else {
                    int ID = Integer.parseInt(IDD.getText());
                    checkFullname.setText("");
                    query = "UPDATE student_info SET firstname=?, middlename=?, lastname=?, section=? WHERE ID =? ";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, firstname);
                    pst.setString(2, middlename);
                    pst.setString(3, lastname);
                    pst.setString(4, section);
                    pst.setInt(5, ID);
                    pst.executeUpdate();
                    checksib.setVisible(true);
                    Firstnamelabel.setVisible(true);
                    Middlenamelabel.setVisible(true);
                    Lastnamelabel.setVisible(true);
                    Create1.setVisible(true);
                    sibling.setVisible(false);
                    Create.setVisible(true);
                    loadStudentData();
                }
            }

        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());

        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        loadStudentData();
         sectionload();
        checksib.setVisible(true);
    }//GEN-LAST:event_RefreshActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int selectedrow = jTable1.getSelectedRow();
        
        String SUrl, SUser, SPass, query, query2;
        SUrl = "jdbc:MySQL://localhost:3307/Billing_system_database";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            int ID = Integer.parseInt(IDD.getText());
            query = "DELETE FROM student_info WHERE ID = ? ";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, ID);
            pst.executeUpdate();
            query2 = "DELETE FROM student_payment WHERE student_ID = ? ";
            PreparedStatement ps = con.prepareStatement(query2);
            ps.setInt(1, ID);
            ps.executeUpdate();
            Firstnamelabel.setVisible(true);
            Middlenamelabel.setVisible(true);
            Lastnamelabel.setVisible(true);
            Create1.setVisible(true);
            checksib.setVisible(true);
            sibling.setVisible(false);
            Create.setVisible(true);
            loadStudentData();
            sectionload();
            loadStudentData();

        } catch (Exception e) {

        }


    }//GEN-LAST:event_DeleteActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed

        Billing_MainForm Main = new Billing_MainForm();
        Main.setVisible(true);
        dispose();

    }//GEN-LAST:event_BackActionPerformed

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

    private void FirstnametxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FirstnametxtFocusGained
        if (Firstnamelabel.getText().equals("Firstname...")) {
            Firstnamelabel.setVisible(false);
        }
    }//GEN-LAST:event_FirstnametxtFocusGained

    private void FirstnametxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FirstnametxtFocusLost
        if (Firstnametxt.getText().isEmpty()) {
            Firstnamelabel.setVisible(true);

        }
    }//GEN-LAST:event_FirstnametxtFocusLost

    private void MiddlenametxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MiddlenametxtFocusGained
        if (Middlenamelabel.getText().equals("Middlename...")) {
            Middlenamelabel.setVisible(false);
        }
    }//GEN-LAST:event_MiddlenametxtFocusGained

    private void MiddlenametxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MiddlenametxtFocusLost
        if (Middlenametxt.getText().isEmpty()) {
            Middlenamelabel.setVisible(true);

        }
    }//GEN-LAST:event_MiddlenametxtFocusLost

    private void LastnametxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LastnametxtFocusGained
        if (Lastnamelabel.getText().equals("Lastname...")) {
            Lastnamelabel.setVisible(false);
        }
    }//GEN-LAST:event_LastnametxtFocusGained

    private void LastnametxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LastnametxtFocusLost
        if (Lastnametxt.getText().isEmpty()) {
            Lastnamelabel.setVisible(true);

        }
    }//GEN-LAST:event_LastnametxtFocusLost

    private void SearchtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchtxtFocusGained
        if (Searchlabel.getText().equals("Search...")) {
            Searchlabel.setVisible(false);
        }
    }//GEN-LAST:event_SearchtxtFocusGained

    private void SearchtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchtxtFocusLost
        if (Searchtxt.getText().isEmpty()) {
            Searchlabel.setVisible(true);

        }
    }//GEN-LAST:event_SearchtxtFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        check.setVisible(false);
        checksib.setSelected(true);
        sibling.setVisible(true);
        Create.setVisible(true);
        Back.setVisible(true);
        Update.setVisible(true);
        Refresh.setVisible(true);
        Delete.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        check.setVisible(false);
        Create1.setVisible(false);
        Create.setVisible(true);
        Back.setVisible(true);
        Update.setVisible(true);
        Refresh.setVisible(true);
        Delete.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void checksibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checksibActionPerformed
        if (checksib.isSelected()) {
            sibling.setVisible(true);

            Create1.setVisible(false);
            Create.setVisible(true);
        } else if (!(checksib.isSelected())) {
            sibling.setVisible(false);

        }
    }//GEN-LAST:event_checksibActionPerformed

    private void sibling1txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling1txtFocusGained
        if (sibling1lebel.getText().equals("1. Sibling name...")) {
            sibling1lebel.setVisible(false);
        }
    }//GEN-LAST:event_sibling1txtFocusGained

    private void sibling1txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling1txtFocusLost
        if (sibling1txt.getText().isEmpty()) {
            sibling1lebel.setVisible(true);

        }
    }//GEN-LAST:event_sibling1txtFocusLost

    private void sibling2txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling2txtFocusGained
        if (sibling2lebel.getText().equals("2. Sibling name...")) {
            sibling2lebel.setVisible(false);
        }
    }//GEN-LAST:event_sibling2txtFocusGained

    private void sibling2txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling2txtFocusLost
        if (sibling2txt.getText().isEmpty()) {
            sibling2lebel.setVisible(true);

        }
    }//GEN-LAST:event_sibling2txtFocusLost

    private void sibling3txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling3txtFocusGained
        if (sibling3lebel.getText().equals("3. Sibling name...")) {
            sibling3lebel.setVisible(false);
        }
    }//GEN-LAST:event_sibling3txtFocusGained

    private void sibling3txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling3txtFocusLost
        if (sibling3txt.getText().isEmpty()) {
            sibling3lebel.setVisible(true);

        }
    }//GEN-LAST:event_sibling3txtFocusLost

    private void sibling4txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling4txtFocusGained
        if (sibling4lebel.getText().equals("4. Sibling name...")) {
            sibling4lebel.setVisible(false);
        }
    }//GEN-LAST:event_sibling4txtFocusGained

    private void sibling4txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling4txtFocusLost
        if (sibling4txt.getText().isEmpty()) {
            sibling4lebel.setVisible(true);

        }
    }//GEN-LAST:event_sibling4txtFocusLost

    private void sibling5txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling5txtFocusGained
        if (sibling5lebel.getText().equals("5. Sibling name...")) {
            sibling5lebel.setVisible(false);
        }
    }//GEN-LAST:event_sibling5txtFocusGained

    private void sibling5txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling5txtFocusLost
        if (sibling5txt.getText().isEmpty()) {
            sibling5lebel.setVisible(true);

        }
    }//GEN-LAST:event_sibling5txtFocusLost

    private void sibling6txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling6txtFocusGained
        if (sibling6lebel.getText().equals("6. Sibling name...")) {
            sibling6lebel.setVisible(false);
        }
    }//GEN-LAST:event_sibling6txtFocusGained

    private void sibling6txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling6txtFocusLost
        if (sibling6txt.getText().isEmpty()) {
            sibling6lebel.setVisible(true);

        }
    }//GEN-LAST:event_sibling6txtFocusLost

    private void sibling7txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling7txtFocusGained
        if (sibling7lebel.getText().equals("7. Sibling name...")) {
            sibling7lebel.setVisible(false);
        }
    }//GEN-LAST:event_sibling7txtFocusGained

    private void sibling7txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling7txtFocusLost
        if (sibling7txt.getText().isEmpty()) {
            sibling7lebel.setVisible(true);

        }
    }//GEN-LAST:event_sibling7txtFocusLost

    private void curriculum3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculum3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_curriculum3MouseClicked

    private void curriculum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curriculum3ActionPerformed
        loadcombosib3();
    }//GEN-LAST:event_curriculum3ActionPerformed

    private void curriculum1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculum1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_curriculum1MouseClicked

    private void curriculum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curriculum1ActionPerformed
        loadcombosib1();
    }//GEN-LAST:event_curriculum1ActionPerformed

    private void curriculum2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculum2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_curriculum2MouseClicked

    private void curriculum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curriculum2ActionPerformed
        loadcombosib2();
    }//GEN-LAST:event_curriculum2ActionPerformed

    private void curriculum4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculum4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_curriculum4MouseClicked

    private void curriculum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curriculum4ActionPerformed
        loadcombosib4();
    }//GEN-LAST:event_curriculum4ActionPerformed

    private void curriculum5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculum5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_curriculum5MouseClicked

    private void curriculum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curriculum5ActionPerformed
        loadcombosib5();
    }//GEN-LAST:event_curriculum5ActionPerformed

    private void curriculum6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculum6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_curriculum6MouseClicked

    private void curriculum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curriculum6ActionPerformed
        loadcombosib6();
    }//GEN-LAST:event_curriculum6ActionPerformed

    private void curriculum7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculum7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_curriculum7MouseClicked

    private void curriculum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curriculum7ActionPerformed
        loadcombosib7();
    }//GEN-LAST:event_curriculum7ActionPerformed

    private void sibling8txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling8txtFocusGained
        if (sibling8lebel.getText().equals("8. Sibling name...")) {
            sibling8lebel.setVisible(false);
        }
    }//GEN-LAST:event_sibling8txtFocusGained

    private void sibling8txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling8txtFocusLost
        if (sibling8txt.getText().isEmpty()) {
            sibling8lebel.setVisible(true);

        }
    }//GEN-LAST:event_sibling8txtFocusLost

    private void curriculum8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculum8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_curriculum8MouseClicked

    private void curriculum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curriculum8ActionPerformed
        loadcombosib8();
    }//GEN-LAST:event_curriculum8ActionPerformed

    private void sibling9txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling9txtFocusGained
        if (sibling9lebel.getText().equals("9. Sibling name...")) {
            sibling9lebel.setVisible(false);
        }
    }//GEN-LAST:event_sibling9txtFocusGained

    private void sibling9txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sibling9txtFocusLost
        if (sibling9txt.getText().isEmpty()) {
            sibling9lebel.setVisible(true);

        }
    }//GEN-LAST:event_sibling9txtFocusLost

    private void curriculum9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curriculum9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_curriculum9MouseClicked

    private void curriculum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curriculum9ActionPerformed
        loadcombosib9();
    }//GEN-LAST:event_curriculum9ActionPerformed

    private void Create1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create1ActionPerformed
        check.setVisible(true);
        Create.setVisible(false);
        Create1.setVisible(false);
        Back.setVisible(false);
        Update.setVisible(false);
        Refresh.setVisible(false);
        Delete.setVisible(false);
    }//GEN-LAST:event_Create1ActionPerformed

    private void sibling1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sibling1txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sibling1txtActionPerformed

    private void SectionselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectionselectActionPerformed
       sectionload();
    }//GEN-LAST:event_SectionselectActionPerformed

    private void SearchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchtxtKeyReleased
       if (sorter != null) { // avoid null pointer
        String searchText = Searchtxt.getText().trim();
        if (searchText.isEmpty()) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
        }
    }
    }//GEN-LAST:event_SearchtxtKeyReleased

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
            java.util.logging.Logger.getLogger(Add_StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Add_StudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Create;
    private javax.swing.JButton Create1;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel Firstnamelabel;
    private javax.swing.JTextField Firstnametxt;
    private javax.swing.JLabel IDD;
    private javax.swing.JLabel Lastnamelabel;
    private javax.swing.JLabel Lastnamered;
    private javax.swing.JTextField Lastnametxt;
    private javax.swing.JLabel Middlenamelabel;
    private javax.swing.JLabel Middlenamered;
    private javax.swing.JTextField Middlenametxt;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel Rooler;
    private javax.swing.JLabel Searchlabel;
    private javax.swing.JTextField Searchtxt;
    private javax.swing.JComboBox<String> Sectionselect;
    private javax.swing.JComboBox<String> Sectionselect1;
    private javax.swing.JComboBox<String> Sectionselect2;
    private javax.swing.JComboBox<String> Sectionselect3;
    private javax.swing.JComboBox<String> Sectionselect4;
    private javax.swing.JComboBox<String> Sectionselect5;
    private javax.swing.JComboBox<String> Sectionselect6;
    private javax.swing.JComboBox<String> Sectionselect7;
    private javax.swing.JComboBox<String> Sectionselect8;
    private javax.swing.JComboBox<String> Sectionselect9;
    private javax.swing.JButton Update;
    private javax.swing.JPanel check;
    private javax.swing.JLabel checkFullname;
    private javax.swing.JCheckBox checksib;
    private javax.swing.JComboBox<String> curriculum1;
    private javax.swing.JComboBox<String> curriculum2;
    private javax.swing.JComboBox<String> curriculum3;
    private javax.swing.JComboBox<String> curriculum4;
    private javax.swing.JComboBox<String> curriculum5;
    private javax.swing.JComboBox<String> curriculum6;
    private javax.swing.JComboBox<String> curriculum7;
    private javax.swing.JComboBox<String> curriculum8;
    private javax.swing.JComboBox<String> curriculum9;
    private javax.swing.JLabel firstnamered;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel sibling;
    private javax.swing.JLabel sibling1lebel;
    private javax.swing.JTextField sibling1txt;
    private javax.swing.JLabel sibling2lebel;
    private javax.swing.JTextField sibling2txt;
    private javax.swing.JLabel sibling3lebel;
    private javax.swing.JTextField sibling3txt;
    private javax.swing.JLabel sibling4lebel;
    private javax.swing.JTextField sibling4txt;
    private javax.swing.JLabel sibling5lebel;
    private javax.swing.JTextField sibling5txt;
    private javax.swing.JLabel sibling6lebel;
    private javax.swing.JTextField sibling6txt;
    private javax.swing.JLabel sibling7lebel;
    private javax.swing.JTextField sibling7txt;
    private javax.swing.JLabel sibling8lebel;
    private javax.swing.JTextField sibling8txt;
    private javax.swing.JLabel sibling9lebel;
    private javax.swing.JTextField sibling9txt;
    // End of variables declaration//GEN-END:variables
}
