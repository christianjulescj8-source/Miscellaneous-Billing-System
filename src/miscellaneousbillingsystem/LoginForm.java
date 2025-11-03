package miscellaneousbillingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.UIManager;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        UIManager.put("ScrollBarUI", "miscellaneousbillingsystem.ScrollBarWin11");
        initComponents();

        Passwordtxt.setEchoChar('\u2022');
        open.setVisible(false);
        forgotpass.setVisible(false);
        newpass.setVisible(false);
        loadSchoolYears();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Administrator = new javax.swing.JRadioButton();
        SchoolStaff = new javax.swing.JRadioButton();
        yearselect = new javax.swing.JComboBox<>();
        Usernamelabel = new javax.swing.JLabel();
        Passwordlabel = new javax.swing.JLabel();
        hidePass = new javax.swing.JLabel();
        Usernamered = new javax.swing.JLabel();
        bullet = new javax.swing.JLabel();
        Passwordred = new javax.swing.JLabel();
        showPass = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        open = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        incorrectUsername = new javax.swing.JLabel();
        Usernametxt = new javax.swing.JTextField();
        incorrectPassword = new javax.swing.JLabel();
        Passwordtxt = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lock = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        accounts = new javax.swing.JLabel();
        newpass = new javax.swing.JPanel();
        ConfirmPasslabel = new javax.swing.JLabel();
        Usernamelbl = new javax.swing.JLabel();
        Confirmpassredlbl = new javax.swing.JLabel();
        Usernameredlbl = new javax.swing.JLabel();
        Passwordredlbl = new javax.swing.JLabel();
        Passwordlbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ConfirmPasstxt = new javax.swing.JTextField();
        Usernametext = new javax.swing.JTextField();
        Passwordtext = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        forgotpass = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Codelbl = new javax.swing.JLabel();
        Codetxt = new javax.swing.JTextField();
        Codered = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        buttonGroup1.add(Administrator);
        Administrator.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Administrator.setForeground(new java.awt.Color(0, 0, 0));
        Administrator.setText("Administrator");
        Administrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministratorActionPerformed(evt);
            }
        });
        jPanel1.add(Administrator);
        Administrator.setBounds(250, 350, 130, 21);

        buttonGroup1.add(SchoolStaff);
        SchoolStaff.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        SchoolStaff.setForeground(new java.awt.Color(0, 0, 0));
        SchoolStaff.setText("School Staff");
        jPanel1.add(SchoolStaff);
        SchoolStaff.setBounds(250, 380, 110, 21);

        yearselect.setBackground(new java.awt.Color(255, 255, 255));
        yearselect.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        yearselect.setForeground(new java.awt.Color(255, 255, 255));
        yearselect.setMaximumRowCount(7);
        yearselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        yearselect.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        yearselect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yearselectMouseClicked(evt);
            }
        });
        yearselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearselectActionPerformed(evt);
            }
        });
        jPanel1.add(yearselect);
        yearselect.setBounds(62, 360, 130, 23);

        Usernamelabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Usernamelabel.setForeground(new java.awt.Color(204, 204, 255));
        Usernamelabel.setText("Username...");
        jPanel1.add(Usernamelabel);
        Usernamelabel.setBounds(130, 160, 160, 30);

        Passwordlabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Passwordlabel.setForeground(new java.awt.Color(204, 204, 255));
        Passwordlabel.setText("Password...");
        jPanel1.add(Passwordlabel);
        Passwordlabel.setBounds(130, 260, 160, 30);

        hidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hideIcon1.png"))); // NOI18N
        hidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidePassMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hidePassMousePressed(evt);
            }
        });
        jPanel1.add(hidePass);
        hidePass.setBounds(410, 250, 37, 30);

        Usernamered.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Usernamered.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(Usernamered);
        Usernamered.setBounds(130, 200, 160, 20);

        bullet.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        bullet.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(bullet);
        bullet.setBounds(240, 410, 130, 20);

        Passwordred.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Passwordred.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(Passwordred);
        Passwordred.setBounds(130, 300, 160, 20);

        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/showIcon1.png"))); // NOI18N
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPassMousePressed(evt);
            }
        });
        jPanel1.add(showPass);
        showPass.setBounds(410, 250, 40, 30);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 20, 118, 36);

        open.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        open.setForeground(new java.awt.Color(0, 0, 153));
        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Passopenicon.png"))); // NOI18N
        jPanel1.add(open);
        open.setBounds(80, 240, 50, 50);

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(400, 380, 90, 35);

        incorrectUsername.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        incorrectUsername.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(incorrectUsername);
        incorrectUsername.setBounds(130, 190, 321, 33);

        Usernametxt.setBackground(new java.awt.Color(255, 255, 255));
        Usernametxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        Usernametxt.setForeground(new java.awt.Color(0, 0, 0));
        Usernametxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        Usernametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernametxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernametxtFocusLost(evt);
            }
        });
        Usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernametxtActionPerformed(evt);
            }
        });
        jPanel1.add(Usernametxt);
        Usernametxt.setBounds(130, 150, 321, 40);

        incorrectPassword.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        incorrectPassword.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(incorrectPassword);
        incorrectPassword.setBounds(140, 290, 193, 27);

        Passwordtxt.setBackground(new java.awt.Color(255, 255, 255));
        Passwordtxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        Passwordtxt.setForeground(new java.awt.Color(0, 0, 0));
        Passwordtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        Passwordtxt.setFocusCycleRoot(true);
        Passwordtxt.setMargin(new java.awt.Insets(1, 2, 0, 2));
        Passwordtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordtxtFocusLost(evt);
            }
        });
        Passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordtxtActionPerformed(evt);
            }
        });
        jPanel1.add(Passwordtxt);
        Passwordtxt.setBounds(130, 250, 320, 39);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("<html><u>Sign up</u></html>");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(340, 540, 60, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Don't have an account yet?");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 540, 170, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usernameicon.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 130, 40, 70);

        lock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Passlockicon.png"))); // NOI18N
        jPanel1.add(lock);
        lock.setBounds(80, 230, 40, 70);

        jLabel2.setForeground(new java.awt.Color(102, 51, 255));
        jLabel2.setText("<html><u>Forgot Password?</u></html>");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 290, 150, 30);

        accounts.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        accounts.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(accounts);
        accounts.setBounds(150, 460, 290, 30);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 570, 600));

        newpass.setBackground(new java.awt.Color(51, 204, 0));
        newpass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ConfirmPasslabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        ConfirmPasslabel.setForeground(new java.awt.Color(204, 204, 255));
        ConfirmPasslabel.setText("Confirm Password...");
        newpass.add(ConfirmPasslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 210, -1));

        Usernamelbl.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Usernamelbl.setForeground(new java.awt.Color(204, 204, 255));
        Usernamelbl.setText("Username...");
        newpass.add(Usernamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, -1));

        Confirmpassredlbl.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Confirmpassredlbl.setForeground(new java.awt.Color(255, 0, 0));
        newpass.add(Confirmpassredlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 210, 20));

        Usernameredlbl.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Usernameredlbl.setForeground(new java.awt.Color(255, 0, 0));
        newpass.add(Usernameredlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 210, 20));

        Passwordredlbl.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Passwordredlbl.setForeground(new java.awt.Color(255, 0, 0));
        newpass.add(Passwordredlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 210, 20));

        Passwordlbl.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Passwordlbl.setForeground(new java.awt.Color(204, 204, 255));
        Passwordlbl.setText("Password...");
        newpass.add(Passwordlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 160, -1));

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Set new username and password:");
        newpass.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        ConfirmPasstxt.setBackground(new java.awt.Color(51, 204, 0));
        ConfirmPasstxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        ConfirmPasstxt.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmPasstxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        ConfirmPasstxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ConfirmPasstxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ConfirmPasstxtFocusLost(evt);
            }
        });
        ConfirmPasstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasstxtActionPerformed(evt);
            }
        });
        newpass.add(ConfirmPasstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 270, -1));

        Usernametext.setBackground(new java.awt.Color(51, 204, 0));
        Usernametext.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        Usernametext.setForeground(new java.awt.Color(255, 255, 255));
        Usernametext.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Usernametext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernametextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernametextFocusLost(evt);
            }
        });
        newpass.add(Usernametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 270, -1));

        Passwordtext.setBackground(new java.awt.Color(51, 204, 0));
        Passwordtext.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        Passwordtext.setForeground(new java.awt.Color(255, 255, 255));
        Passwordtext.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Passwordtext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordtextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordtextFocusLost(evt);
            }
        });
        newpass.add(Passwordtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 270, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 204, 0));
        jButton4.setText("Hide");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        newpass.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 90, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 204, 0));
        jButton5.setText("Confirm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        newpass.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        jPanel3.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 600));

        forgotpass.setBackground(new java.awt.Color(51, 204, 0));
        forgotpass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter your recovery code:");
        forgotpass.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        Codelbl.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Codelbl.setForeground(new java.awt.Color(204, 204, 255));
        Codelbl.setText("Recovery Code...");
        forgotpass.add(Codelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        Codetxt.setBackground(new java.awt.Color(51, 204, 0));
        Codetxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        Codetxt.setForeground(new java.awt.Color(255, 255, 255));
        Codetxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Codetxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CodetxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CodetxtFocusLost(evt);
            }
        });
        Codetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodetxtActionPerformed(evt);
            }
        });
        forgotpass.add(Codetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 260, -1));

        Codered.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Codered.setForeground(new java.awt.Color(255, 0, 0));
        forgotpass.add(Codered, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 260, 25));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 204, 0));
        jButton2.setText("Hide");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        forgotpass.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 90, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 204, 0));
        jButton3.setText("Confirm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        forgotpass.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        jPanel3.add(forgotpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 600));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/final logo for login and signup.png"))); // NOI18N
        jPanel3.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 390, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(986, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void loadSchoolYears() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String sql = "SELECT Year FROM school_year ORDER BY id DESC";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            yearselect.removeAllItems(); // clear old data
            while (rs.next()) {
                yearselect.addItem(rs.getString("Year"));
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void PasswordtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordtxtFocusGained
        if (Passwordlabel.getText().equals("Password...")) {
            Passwordlabel.setVisible(false);
        }
    }//GEN-LAST:event_PasswordtxtFocusGained

    private void PasswordtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordtxtFocusLost
        if (Passwordtxt.getText().isEmpty()) {
            Passwordlabel.setVisible(true);
        }
    }//GEN-LAST:event_PasswordtxtFocusLost

    private void PasswordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordtxtActionPerformed

    private void UsernametxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernametxtFocusGained
        if (Usernamelabel.getText().equals("Username...")) {
            Usernamelabel.setVisible(false);
        }
    }//GEN-LAST:event_UsernametxtFocusGained

    private void UsernametxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernametxtFocusLost
        if (Usernametxt.getText().isEmpty()) {
            Usernamelabel.setVisible(true);
        }
    }//GEN-LAST:event_UsernametxtFocusLost

    private void UsernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernametxtActionPerformed

    }//GEN-LAST:event_UsernametxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String userName, password, query, passworddb = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3307/Billing_system_database";
        SUser = "root";
        SPass = "";
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            if (Usernametxt.getText().isEmpty() && Passwordtxt.getText().isEmpty()) {
                Usernamered.setText("Please enter your username.");
                Passwordred.setText("Please enter your password.");
            } else if (Usernametxt.getText().isEmpty()) {
                Usernamered.setText("Please enter your username.");
            } else if (Passwordtxt.getText().isEmpty()) {
                Passwordred.setText("Please enter your password.");
            } else {
                Usernamered.setText("");
                Passwordred.setText("");
                Usernametxt.getText();
                Passwordtxt.getText();
                userName = Usernametxt.getText().trim();
                password = Passwordtxt.getText().trim();
                if (Administrator.isSelected()) {
                    query = "SELECT * FROM admin_account WHERE username = ?";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, userName);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                        passworddb = rs.getString("password");
                        int Id = rs.getInt("Admin_ID");
                        notFound = 1;

                        if (notFound == 1 && password.equals(passworddb)) {
                            String sql = "SELECT * FROM admin_account WHERE username=? AND password=?";
                            PreparedStatement pstmt = con.prepareStatement(sql);
                            pstmt.setString(1, userName);
                            pstmt.setString(2, password);
                            ResultSet rs1 = pstmt.executeQuery();

                            if (rs1.next()) {
                                String status = rs1.getString("status");
                                if (status.equals("approved")) {
                                    String role = "Administrator";
                                    String name = Usernametxt.getText();
                                    String year1 = yearselect.getSelectedItem().toString();
                                    Session.schoolyear = year1;
                                    Session.role = role;
                                    Session.username = name;
                                    Session.ID = Id;
                                    Billing_MainForm main = new Billing_MainForm();
                                    main.setVisible(true);
                                    dispose();
                                    Usernamered.setText("");
                                    Passwordred.setText("");
                                    bullet.setText("");
                                    accounts.setText("");
                                    // redirect to main page
                                
                                } else if(status.equals("rejected")){
                                    accounts.setText("Your account has been rejected by admin.");
                                } else {
                                    accounts.setText("Your account is not approved yet by admin.");
                                }
                            } else {

                            }

                        } else {
                            Usernamered.setText("");
                            Passwordred.setText("Incorrect Password!");
                            bullet.setText("");
                            accounts.setText("");
                        }
                    } else if ((Passwordtxt.getText().isEmpty()) && (notFound == 1 && password.equals(passworddb))) {
                        Usernamered.setText("");
                        Passwordred.setText("Incorrect Password!");
                        bullet.setText("");
                        accounts.setText("");
                    } else {
                        Usernamered.setText("Incorrect Username!");
                        Passwordred.setText("");
                        bullet.setText("");
                        accounts.setText("");
                    }
                } else if (SchoolStaff.isSelected()) {
                    query = "SELECT * FROM user_account WHERE username = ?";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, userName);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                        passworddb = rs.getString("password");
                        int Id = rs.getInt("user_ID");
                        notFound = 1;

                        if (notFound == 1 && password.equals(passworddb)) {
                            String sql = "SELECT * FROM user_account WHERE username=? AND password=?";
                            PreparedStatement psttms = con.prepareStatement(sql);
                            psttms.setString(1, userName);
                            psttms.setString(2, password);
                            ResultSet rs2 = psttms.executeQuery();

                            if (rs2.next()) {
                                String status = rs2.getString("status");
                                if (status.equals("approved")) {

                                    String role = "School Staff";
                                    String name = Usernamered.getText();
                                    String year1 = yearselect.getSelectedItem().toString();
                                    Session.schoolyear = year1;
                                    Session.role = role;
                                    Session.username = name;
                                    Session.ID = Id;
                                    Billing_MainForm main = new Billing_MainForm();
                                    main.setVisible(true);
                                    dispose();
                                    Usernamered.setText("");
                                    Passwordred.setText("");
                                    bullet.setText("");
                                    accounts.setText("");
                                    // redirect to main page
                                } else if(status.equals("rejected")){
                                    accounts.setText("Your account has been rejected by admin.");
                                } else {
                                    accounts.setText("Your account is not approved yet by admin.");
                                }
                            } else {

                            }

                        } else {
                            Usernamered.setText("");
                            Passwordred.setText("Incorrect Password!");
                            bullet.setText("");
                            accounts.setText("");
                        }
                    } else if ((Passwordtxt.getText().isEmpty()) && (notFound == 1 && password.equals(passworddb))) {
                        Usernamered.setText("");
                        Passwordred.setText("Incorrect Password!");
                        bullet.setText("");
                        accounts.setText("");
                    } else {
                        Passwordred.setText("");
                        Usernamered.setText("Incorrect Username!");
                        bullet.setText("");
                        accounts.setText("");
                    }
                } else {
                    bullet.setText("Please select a role.");
                }

            }

        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hidePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePassMouseClicked


    }//GEN-LAST:event_hidePassMouseClicked

    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked

    }//GEN-LAST:event_showPassMouseClicked

    private void hidePassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePassMousePressed
        if (Passwordtxt.getEchoChar() != 0) {
            Passwordtxt.setEchoChar((char) 0); // Show password
            hidePass.setVisible(false);
            lock.setVisible(false);
            open.setVisible(true);
        } else {
            // Hide password

        }

    }//GEN-LAST:event_hidePassMousePressed

    private void showPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMousePressed
        Passwordtxt.setEchoChar('\u2022');
        // Show password
        hidePass.setVisible(true);
        lock.setVisible(true);
        open.setVisible(false);


    }//GEN-LAST:event_showPassMousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        SignUpForm sign = new SignUpForm();
        sign.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void yearselectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearselectMouseClicked

    }//GEN-LAST:event_yearselectMouseClicked

    private void yearselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearselectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearselectActionPerformed

    private void CodetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodetxtActionPerformed

    private void CodetxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CodetxtFocusGained
        if (Codelbl.getText().equals("Recovery Code...")) {
            Codelbl.setVisible(false);
        }
    }//GEN-LAST:event_CodetxtFocusGained

    private void CodetxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CodetxtFocusLost
        if (Codetxt.getText().isEmpty()) {
            Codelbl.setVisible(true);
        }
    }//GEN-LAST:event_CodetxtFocusLost

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        forgotpass.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        forgotpass.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String SUrl, SUser, SPass, code, query, inputCode = Codetxt.getText().trim();
        SUrl = "jdbc:MySQL://localhost:3307/Billing_system_database";
        SUser = "root";
        SPass = "";
        if (inputCode.isEmpty()) {
            Codered.setText("Please enter the recovery code!");
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            query = "SELECT username FROM security_account WHERE recovery_Code = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, inputCode);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                newpass.setVisible(true);
                forgotpass.setVisible(false);
            } else {
                Codered.setText("Incorrect recovery code");
            }
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ConfirmPasstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPasstxtActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        newpass.setVisible(false);
        forgotpass.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String code, query, Squery;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3307/Billing_System_Database";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            String newusername = Usernametext.getText().trim();
            String newpassword = Passwordtext.getText().trim();
            String confirm = ConfirmPasstxt.getText().trim();
            code = Codetxt.getText();
            if (Usernametext.getText().isEmpty()) {
                Usernameredlbl.setText("Username is required!");
                Passwordredlbl.setText("");
                Confirmpassredlbl.setText("");
            } else if (Passwordtext.getText().isEmpty()) {
                Usernameredlbl.setText("");
                Passwordredlbl.setText("Password is required!");
                Confirmpassredlbl.setText("");
            } else if (!(newpassword.equals(confirm))) {
                Usernameredlbl.setText("");
                Passwordredlbl.setText("");
                Confirmpassredlbl.setText("Not matched!");
            } else {
                String queryget = "SELECT * FROM security_account WHERE recovery_code = ?";
                PreparedStatement ps = con.prepareStatement(queryget);
                ps.setString(1, code);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    String role = rs.getString("role");
                    if (role.equals("Administrator")) {
                        query = "UPDATE admin_account SET username = ?, password = ? WHERE recovery_code = ?";
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.setString(1, newusername);
                        pst.setString(2, newpassword);
                        pst.setString(3, code);
                        pst.executeUpdate();
                        Squery = "UPDATE security_account SET username = ?, password = ? WHERE recovery_code = ?";
                        PreparedStatement psta = con.prepareStatement(Squery);
                        psta.setString(1, newusername);
                        psta.setString(2, newpassword);
                        psta.setString(3, code);
                        psta.executeUpdate();
                        forgotpass.setVisible(false);
                        newpass.setVisible(false);
                    } else if (role.equals("School Staff")) {

                        query = "UPDATE user_account SET username = ?, password = ? WHERE recovery_code = ?";
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.setString(1, newusername);
                        pst.setString(2, newpassword);
                        pst.setString(3, code);
                        pst.executeUpdate();
                        Squery = "UPDATE security_account SET username = ?, password = ? WHERE recovery_code = ?";
                        PreparedStatement psta = con.prepareStatement(Squery);
                        psta.setString(1, newusername);
                        psta.setString(2, newpassword);
                        psta.setString(3, code);
                        psta.executeUpdate();
                        forgotpass.setVisible(false);
                        newpass.setVisible(false);
                    }

                }

            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void UsernametextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernametextFocusLost
        if (Usernametext.getText().isEmpty()) {
            Usernamelbl.setVisible(true);
        }
    }//GEN-LAST:event_UsernametextFocusLost

    private void UsernametextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernametextFocusGained
        if (Usernamelbl.getText().equals("Username...")) {
            Usernamelbl.setVisible(false);
        }
    }//GEN-LAST:event_UsernametextFocusGained

    private void PasswordtextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordtextFocusGained
        if (Passwordlbl.getText().equals("Password...")) {
            Passwordlbl.setVisible(false);
        }
    }//GEN-LAST:event_PasswordtextFocusGained

    private void PasswordtextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordtextFocusLost
        if (Passwordtext.getText().isEmpty()) {
            Passwordlbl.setVisible(true);
        }
    }//GEN-LAST:event_PasswordtextFocusLost

    private void ConfirmPasstxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPasstxtFocusGained
        if (ConfirmPasslabel.getText().equals("Confirm Password...")) {
            ConfirmPasslabel.setVisible(false);
        }
    }//GEN-LAST:event_ConfirmPasstxtFocusGained

    private void ConfirmPasstxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPasstxtFocusLost
        if (ConfirmPasstxt.getText().isEmpty()) {
            ConfirmPasslabel.setVisible(true);
        }
    }//GEN-LAST:event_ConfirmPasstxtFocusLost

    private void AdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministratorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdministratorActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>  

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Administrator;
    private javax.swing.JLabel Codelbl;
    private javax.swing.JLabel Codered;
    private javax.swing.JTextField Codetxt;
    private javax.swing.JLabel ConfirmPasslabel;
    private javax.swing.JTextField ConfirmPasstxt;
    private javax.swing.JLabel Confirmpassredlbl;
    private javax.swing.JLabel Passwordlabel;
    private javax.swing.JLabel Passwordlbl;
    private javax.swing.JLabel Passwordred;
    private javax.swing.JLabel Passwordredlbl;
    private javax.swing.JTextField Passwordtext;
    private javax.swing.JPasswordField Passwordtxt;
    private javax.swing.JRadioButton SchoolStaff;
    private javax.swing.JLabel Usernamelabel;
    private javax.swing.JLabel Usernamelbl;
    private javax.swing.JLabel Usernamered;
    private javax.swing.JLabel Usernameredlbl;
    private javax.swing.JTextField Usernametext;
    private javax.swing.JTextField Usernametxt;
    private javax.swing.JLabel accounts;
    private javax.swing.JLabel bullet;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel forgotpass;
    private javax.swing.JLabel hidePass;
    private javax.swing.JLabel incorrectPassword;
    private javax.swing.JLabel incorrectUsername;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lock;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel newpass;
    private javax.swing.JLabel open;
    private javax.swing.JLabel showPass;
    private javax.swing.JComboBox<String> yearselect;
    // End of variables declaration//GEN-END:variables
}
