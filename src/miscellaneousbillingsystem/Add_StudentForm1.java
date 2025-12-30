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
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import javax.swing.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Add_StudentForm1 extends javax.swing.JFrame {

    private TableRowSorter<DefaultTableModel> sorter;

    public Add_StudentForm1() {
        UIManager.put("ScrollBarUI", "miscellaneousbillingsystem.ScrollBarWin11");
        initComponents();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);

        Sectionselect.setOpaque(false);
        Sectionselect.setBackground(new Color(0, 0, 0, 0));
        loadStudentData();
        loadcombobox();

    }
    private String level;

    public Add_StudentForm1(String grade) {

        initComponents();
        this.level = grade;
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);

        loadStudentData();
        loadcombobox();

        if (Session.role.equals("PTA Treasurer")) {
            data.setVisible(false);

        }
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

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDD = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Rooler = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ye = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        checkFullname = new javax.swing.JLabel();
        LRNlabel = new javax.swing.JLabel();
        LRNtxt = new javax.swing.JTextField();
        LRNred = new javax.swing.JLabel();
        data = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        IDD.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo smaller.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        Rooler.setFont(new java.awt.Font("Baskerville Old Face", 0, 58)); // NOI18N
        Rooler.setForeground(new java.awt.Color(0, 0, 0));
        Rooler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Rooler, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 4, 1180, 90));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 94));

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));
        jPanel5.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("(Note: This will also delete all the student's payment record)");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(0, 40, 470, 19);

        ye.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
        ye.setForeground(new java.awt.Color(255, 255, 255));
        ye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ye.setText("Are you sure you want to delete all?");
        jPanel5.add(ye);
        ye.setBounds(0, 20, 470, 18);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 0));
        jButton4.setText("No");
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);
        jButton4.setBounds(50, 180, 79, 27);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 0));
        jButton5.setText("Yes");
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);
        jButton5.setBounds(340, 180, 79, 27);

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 470, 230));

        jPanel4.setBackground(new java.awt.Color(0, 102, 0));
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel2.setText("(Note: This will also delete the student's payment record)");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(30, 40, 410, 19);

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Are you sure you want to delete this student/s?");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(70, 20, 330, 19);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("No");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(50, 180, 79, 27);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 0));
        jButton2.setText("Yes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(340, 180, 79, 27);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 470, 230));

        Create.setBackground(new java.awt.Color(255, 255, 255));
        Create.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Create.setForeground(new java.awt.Color(0, 153, 0));
        Create.setText("Create");
        Create.setBorderPainted(false);
        Create.setFocusPainted(false);
        Create.setFocusable(false);
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
        Refresh.setBorderPainted(false);
        Refresh.setFocusPainted(false);
        Refresh.setFocusable(false);
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
        Update.setBorderPainted(false);
        Update.setFocusPainted(false);
        Update.setFocusable(false);
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 90, -1));

        Delete.setBackground(new java.awt.Color(255, 255, 255));
        Delete.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(0, 153, 0));
        Delete.setText("Delete");
        Delete.setBorderPainted(false);
        Delete.setFocusPainted(false);
        Delete.setFocusable(false);
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
        Back.setBorderPainted(false);
        Back.setFocusPainted(false);
        Back.setFocusable(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        firstnamered.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        firstnamered.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(firstnamered, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, 20));

        Middlenamered.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Middlenamered.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(Middlenamered, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 150, 20));

        Lastnamered.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Lastnamered.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(Lastnamered, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 150, 20));

        Middlenamelabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        Middlenamelabel.setForeground(new java.awt.Color(204, 204, 255));
        Middlenamelabel.setText("Middlename...");
        jPanel2.add(Middlenamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 150, -1));

        Firstnamelabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        Firstnamelabel.setForeground(new java.awt.Color(204, 204, 255));
        Firstnamelabel.setText("Firstname...");
        jPanel2.add(Firstnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, -1));

        Lastnamelabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        Lastnamelabel.setForeground(new java.awt.Color(204, 204, 255));
        Lastnamelabel.setText("Lastname...");
        jPanel2.add(Lastnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, -1));

        Searchlabel.setBackground(new java.awt.Color(0, 153, 0));
        Searchlabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Searchlabel.setForeground(new java.awt.Color(204, 204, 255));
        Searchlabel.setText("Search...");
        jPanel2.add(Searchlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 120, -1));

        Firstnametxt.setBackground(new java.awt.Color(0, 102, 0));
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
        jPanel2.add(Firstnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 230, -1));

        Middlenametxt.setBackground(new java.awt.Color(0, 102, 0));
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
        jPanel2.add(Middlenametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 230, -1));

        Lastnametxt.setBackground(new java.awt.Color(0, 102, 0));
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
        jPanel2.add(Lastnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 230, -1));

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
        });
        jPanel2.add(Searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 380, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search icon12.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, -1, -1));

        Sectionselect.setBackground(new java.awt.Color(0, 102, 0));
        Sectionselect.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Sectionselect.setForeground(new java.awt.Color(255, 255, 255));
        Sectionselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sectionselect.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        Sectionselect.setFocusable(false);
        Sectionselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionselectActionPerformed(evt);
            }
        });
        jPanel2.add(Sectionselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 160, -1));

        checkFullname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        checkFullname.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(checkFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 350, 20));

        LRNlabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 19)); // NOI18N
        LRNlabel.setForeground(new java.awt.Color(204, 204, 255));
        LRNlabel.setText("LRN...");
        jPanel2.add(LRNlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, -1));

        LRNtxt.setBackground(new java.awt.Color(0, 102, 0));
        LRNtxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        LRNtxt.setForeground(new java.awt.Color(255, 255, 255));
        LRNtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        LRNtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LRNtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LRNtxtFocusLost(evt);
            }
        });
        jPanel2.add(LRNtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 230, -1));

        LRNred.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LRNred.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(LRNred, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 20));

        data.setBackground(new java.awt.Color(255, 255, 255));
        data.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        data.setForeground(new java.awt.Color(0, 0, 0));
        data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Addicon1.png"))); // NOI18N
        data.setText("Import data");
        data.setBorderPainted(false);
        data.setFocusPainted(false);
        data.setFocusable(false);
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });
        jPanel2.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jButton3.setBackground(new java.awt.Color(102, 0, 0));
        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete all");
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 105, -1, -1));

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

    public void sectionload() {
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

            LRNtxt.setText("");
            Firstnametxt.setText("");
            Middlenametxt.setText("");
            Lastnametxt.setText("");

            checkFullname.setText("");
            firstnamered.setText("");
            Middlenamered.setText("");
            Lastnamered.setText("");
            LRNred.setText("");
            Searchtxt.setText("");

            LRNlabel.setVisible(true);
            Firstnamelabel.setVisible(true);
            Middlenamelabel.setVisible(true);
            Lastnamelabel.setVisible(true);
            Create.setVisible(true);

            String sql = "SELECT LRN, firstname, middlename, lastname, section, grade, ID "
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

            String[] Columnheader = {
                "LRN", "First Name", "Middle Name", "Last Name", "Section", "grade", "ID"
            };
            for (String header : Columnheader) {
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
            jTable1.setFocusable(false);
            jTable1.setDefaultEditor(Object.class, null);

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


    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String SUrl = "jdbc:mysql://localhost:3307/java_user_database";
        String SUser = "root";
        String SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            int selectedrow = jTable1.getSelectedRow();
            if (selectedrow > -1) {
                String LRN = jTable1.getValueAt(selectedrow, 0).toString();
                String firstname = jTable1.getValueAt(selectedrow, 1).toString();
                String middlename = jTable1.getValueAt(selectedrow, 2).toString();
                String lastname = jTable1.getValueAt(selectedrow, 3).toString();
                String section = jTable1.getValueAt(selectedrow, 4).toString();
                String studid = jTable1.getValueAt(selectedrow, 6).toString();
                IDD.setText(studid);
                LRNtxt.setText(LRN);
                Firstnametxt.setText(firstname);
                Middlenametxt.setText(middlename);
                Lastnametxt.setText(lastname);
                Sectionselect.setSelectedItem(section);
                LRNlabel.setVisible(false);
                Firstnamelabel.setVisible(false);
                Middlenamelabel.setVisible(false);
                Lastnamelabel.setVisible(false);

                Create.setVisible(false);

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

            String firstname, middlename, lastname, section, grade, code, LRN, query1;
            LRN = LRNtxt.getText().trim().toUpperCase();
            firstname = Firstnametxt.getText().trim().toUpperCase();
            middlename = Middlenametxt.getText().trim().toUpperCase();
            lastname = Lastnametxt.getText().trim().toUpperCase();
            section = Sectionselect.getSelectedItem().toString();

            grade = this.level;
            if (LRN.isEmpty()) {
                LRNred.setText("LRN is required!");
                firstnamered.setText("");
                Middlenamered.setText("");
                Lastnamered.setText("");
            } else if (LRN.length() > 12) {
                LRNred.setText("the limit is 12 numbers");
                firstnamered.setText("");
                Middlenamered.setText("");
                Lastnamered.setText("");
            } else if (firstname.isEmpty()) {
                LRNred.setText("");
                firstnamered.setText("Firstname is required!");
                Middlenamered.setText("");
                Lastnamered.setText("");

            } else if (lastname.isEmpty()) {
                LRNred.setText("");
                Lastnamered.setText("Lastname is required!");
                firstnamered.setText("");
                Middlenamered.setText("");

            } else {

                String Check = "SELECT COUNT(*) AS cnt FROM student_info "
                        + "WHERE lrn=? "
                        + "AND grade = ? AND section = ? AND school_year = ?";
                PreparedStatement checking = con.prepareStatement(Check);
                checking.setString(1, LRN);
                checking.setString(2, grade);
                checking.setString(3, section);
                checking.setString(4, Session.schoolyear);

                ResultSet checkname = checking.executeQuery();
                if (checkname.next() && checkname.getInt("cnt") > 0) {
                    checkFullname.setText("this student is already been added");
                } else {
                    checkFullname.setText("");

                    String sql = "INSERT INTO student_info( lrn, firstname, middlename, lastname, section, grade,  school_Year)VALUES(?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, LRN);
                    pst.setString(2, firstname);
                    pst.setString(3, middlename);
                    pst.setString(4, lastname);
                    pst.setString(5, section);
                    pst.setString(6, grade);
                    pst.setString(7, Session.schoolyear);
                    pst.executeUpdate();
                    query1 = "SELECT * FROM student_info WHERE lrn=? ";
                    PreparedStatement ps = con.prepareStatement(query1);
                    ps.setString(1, LRN);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        String id = rs.getString("ID");
                        String payment = "INSERT INTO student_payment(student_ID, Fee_Paid, Total_Paid, 1st_Quarter, 2nd_Quarter, 3rd_Quarter, 4th_Quarter, Date_Q1, Date_Q2, Date_Q3, Date_Q4, School_Year, remarks) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement pstm = con.prepareStatement(payment);
                        pstm.setString(1, id);
                        pstm.setString(2, "");
                        pstm.setInt(3, 0);
                        pstm.setInt(4, 0);
                        pstm.setInt(5, 0);
                        pstm.setInt(6, 0);
                        pstm.setInt(7, 0);
                        pstm.setString(8, "");
                        pstm.setString(9, "");
                        pstm.setString(10, "");
                        pstm.setString(11, "");
                        pstm.setString(12, Session.schoolyear);
                        pstm.setString(13, "");
                        pstm.executeUpdate();
                    }
                    loadStudentData();
                    sectionload();

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
            String firstname, middlename, lastname, section, grade, LRN, query1;
            LRN = LRNtxt.getText().trim().toUpperCase();
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
                        + "WHERE lrn=? "
                        + "AND grade = ? AND section = ? AND school_year = ?";
                PreparedStatement checking = con.prepareStatement(Check);
                checking.setString(1, LRN);
                checking.setString(2, grade);
                checking.setString(3, section);
                checking.setString(4, Session.schoolyear);

                ResultSet checkname = checking.executeQuery();
                if (checkname.next() && checkname.getInt("cnt") > 0) {
                    checkFullname.setText("this student is already been added");
                } else {
                    int ID = Integer.parseInt(IDD.getText());
                    checkFullname.setText("");
                    query = "UPDATE student_info SET lrn=?, firstname=?, middlename=?, lastname=?, section=? WHERE ID =? ";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, LRN);
                    pst.setString(2, firstname);
                    pst.setString(3, middlename);
                    pst.setString(4, lastname);
                    pst.setString(5, section);
                    pst.setInt(6, ID);
                    pst.executeUpdate();

                    Firstnamelabel.setVisible(true);
                    Middlenamelabel.setVisible(true);
                    Lastnamelabel.setVisible(true);

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

    }//GEN-LAST:event_RefreshActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int selectedrow = jTable1.getSelectedRow();

        if (!LRNtxt.getText().isEmpty() && !Firstnametxt.getText().isEmpty() && !Lastnametxt.getText().isEmpty()) {
            Create.setVisible(false);
            Update.setVisible(false);
            Refresh.setVisible(false);
            Delete.setVisible(false);
            Back.setVisible(false);
            jPanel4.setVisible(true);
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

    private void LRNtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LRNtxtFocusGained
        if (LRNlabel.getText().equals("LRN...")) {
            LRNlabel.setVisible(false);
        }
    }//GEN-LAST:event_LRNtxtFocusGained

    private void LRNtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LRNtxtFocusLost
        if (LRNtxt.getText().isEmpty()) {
            LRNlabel.setVisible(true);

        }
    }//GEN-LAST:event_LRNtxtFocusLost

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Excel File");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Excel Files", "xlsx"));
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            importExcelToDatabase(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_dataActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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

            Create.setVisible(true);
            Update.setVisible(true);
            Refresh.setVisible(true);
            Delete.setVisible(true);
            Back.setVisible(true);
            jPanel4.setVisible(false);
            loadStudentData();
            sectionload();
            loadStudentData();

        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel4.setVisible(false);
        Create.setVisible(false);
        Update.setVisible(true);
        Refresh.setVisible(true);
        Delete.setVisible(true);
        Back.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jPanel5.setVisible(false);

        Refresh.setVisible(true);
        Delete.setVisible(true);
        Back.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String SUrl, SUser, SPass, query, query2;
        SUrl = "jdbc:MySQL://localhost:3307/Billing_system_database";
        SUser = "root";
        SPass = "";
        try {
            String sect = Sectionselect.getSelectedItem().toString();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            query = "DELETE FROM student_info WHERE section=? AND school_Year= ? AND grade = ? ";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, sect);
            pst.setString(2, Session.schoolyear);
            pst.setString(3, this.level);
            pst.executeUpdate();
            jPanel5.setVisible(false);
            Firstnamelabel.setVisible(true);
            Middlenamelabel.setVisible(true);
            Lastnamelabel.setVisible(true);

            Create.setVisible(true);
            Update.setVisible(true);
            Refresh.setVisible(true);
            Delete.setVisible(true);
            Back.setVisible(true);

            loadStudentData();
            sectionload();
            loadStudentData();

        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String section = Sectionselect.getSelectedItem().toString();
        ye.setText("Are you sure you want to delete all this student from " + section + "?");

        Refresh.setVisible(false);
        Delete.setVisible(false);
        Back.setVisible(false);
        jPanel5.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    private void importExcelToDatabase(String filePath) {
        String SUrl = "jdbc:MySQL://localhost:3307/Billing_system_database";
        String SUser = "root";
        String SPass = "";

        String query = "INSERT INTO student_info(lrn, firstname, middlename, lastname, section, grade, school_Year) VALUES (?, ?, ?, ?, ?, ?, ?)";
        String query2 = "INSERT INTO student_payment(student_ID, Fee_Paid, Total_Paid, `1st_Quarter`, `2nd_Quarter`, `3rd_Quarter`, `4th_Quarter`, Date_Q1, Date_Q2, Date_Q3, Date_Q4, School_Year, remarks) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(SUrl, SUser, SPass); FileInputStream fis = new FileInputStream(new File(filePath)); Workbook workbook = new XSSFWorkbook(fis)) {

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            PreparedStatement psts = con.prepareStatement(query2);
            Sheet sheet = workbook.getSheetAt(0);
            int count = 0;

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row == null) {
                    continue;
                }

                String lrn = getCellValue(row.getCell(0)).toUpperCase();
                String firstname = getCellValue(row.getCell(1)).toUpperCase();
                String middlename = getCellValue(row.getCell(2)).toUpperCase();
                String lastname = getCellValue(row.getCell(3)).toUpperCase();
                String section = Sectionselect.getSelectedItem().toString();
                String grade = this.level;

                if (lrn.isEmpty() && firstname.isEmpty()) {
                    continue;
                }

                ps.setString(1, lrn);
                ps.setString(2, firstname);
                ps.setString(3, middlename);
                ps.setString(4, lastname);
                ps.setString(5, section);
                ps.setString(6, grade);
                ps.setString(7, Session.schoolyear);
                ps.executeUpdate();

                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int studentId = generatedKeys.getInt(1);

                    psts.setInt(1, studentId);
                    psts.setString(2, "");
                    psts.setInt(3, 0);
                    psts.setInt(4, 0);
                    psts.setInt(5, 0);
                    psts.setInt(6, 0);
                    psts.setInt(7, 0);
                    psts.setString(8, "");
                    psts.setString(9, "");
                    psts.setString(10, "");
                    psts.setString(11, "");
                    psts.setString(12, Session.schoolyear);
                    psts.setString(13, "");
                    psts.executeUpdate();
                    loadStudentData();
                }

                count++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getCellValue(Cell cell) {
        if (cell == null) {
            return "";
        }
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue().trim();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    return String.valueOf((long) cell.getNumericCellValue()).trim();
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            default:
                return "";
        }
    }

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
            java.util.logging.Logger.getLogger(Add_StudentForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_StudentForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_StudentForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_StudentForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Add_StudentForm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Create;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel Firstnamelabel;
    private javax.swing.JTextField Firstnametxt;
    private javax.swing.JLabel IDD;
    private javax.swing.JLabel LRNlabel;
    private javax.swing.JLabel LRNred;
    private javax.swing.JTextField LRNtxt;
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
    private javax.swing.JButton Update;
    private javax.swing.JLabel checkFullname;
    private javax.swing.JButton data;
    private javax.swing.JLabel firstnamered;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel ye;
    // End of variables declaration//GEN-END:variables
}
