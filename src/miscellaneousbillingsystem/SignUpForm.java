package miscellaneousbillingsystem;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Random;
import javax.swing.JRadioButton;

public class SignUpForm extends javax.swing.JFrame {

    
    private String codeq;
    public SignUpForm() {
        
        initComponents();
        
        Passwordtxt.setEchoChar('\u2022');
        ConfirmPasstxt.setEchoChar('\u2022');

        Admin.setFocusPainted(false);
        Admin.setBackground(new Color(240, 240, 240));
        Admin.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        Staff.setFocusPainted(false);
        Staff.setBackground(new Color(240, 240, 240));
        Staff.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupbutton = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        hidePass = new javax.swing.JLabel();
        showPass = new javax.swing.JLabel();
        hidePass1 = new javax.swing.JLabel();
        showPass1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ConfirmPasslabel = new javax.swing.JLabel();
        Passwordlabel = new javax.swing.JLabel();
        Firstnamelabel = new javax.swing.JLabel();
        Usernamelabel = new javax.swing.JLabel();
        Lastnamelabel = new javax.swing.JLabel();
        Middlenamelabel = new javax.swing.JLabel();
        Confirmpassred = new javax.swing.JLabel();
        Lastnamered = new javax.swing.JLabel();
        Middlenamered = new javax.swing.JLabel();
        Passwordred = new javax.swing.JLabel();
        bullet = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Usernametxt = new javax.swing.JTextField();
        ConfirmPasstxt = new javax.swing.JPasswordField();
        Passwordtxt = new javax.swing.JPasswordField();
        Firstnametxt = new javax.swing.JTextField();
        Middlenametxt = new javax.swing.JTextField();
        Lastnametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Admin = new javax.swing.JRadioButton();
        Staff = new javax.swing.JRadioButton();
        Firstnamered = new javax.swing.JLabel();
        Usernamered = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

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
        hidePass.setBounds(310, 430, 37, 30);

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
        showPass.setBounds(310, 430, 40, 30);

        hidePass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hideIcon1.png"))); // NOI18N
        hidePass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidePass1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hidePass1MousePressed(evt);
            }
        });
        jPanel1.add(hidePass1);
        hidePass1.setBounds(310, 360, 37, 30);

        showPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/showIcon1.png"))); // NOI18N
        showPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPass1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPass1MousePressed(evt);
            }
        });
        jPanel1.add(showPass1);
        showPass1.setBounds(310, 360, 40, 30);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("SIGN UP");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 20, 150, 36);

        ConfirmPasslabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        ConfirmPasslabel.setForeground(new java.awt.Color(204, 204, 255));
        ConfirmPasslabel.setText("Confirm Password...");
        jPanel1.add(ConfirmPasslabel);
        ConfirmPasslabel.setBounds(30, 440, 210, 30);

        Passwordlabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Passwordlabel.setForeground(new java.awt.Color(204, 204, 255));
        Passwordlabel.setText("Password...");
        jPanel1.add(Passwordlabel);
        Passwordlabel.setBounds(30, 370, 160, 30);

        Firstnamelabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Firstnamelabel.setForeground(new java.awt.Color(204, 204, 255));
        Firstnamelabel.setText("Firstname...");
        jPanel1.add(Firstnamelabel);
        Firstnamelabel.setBounds(30, 90, 160, 30);

        Usernamelabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Usernamelabel.setForeground(new java.awt.Color(204, 204, 255));
        Usernamelabel.setText("Username...");
        jPanel1.add(Usernamelabel);
        Usernamelabel.setBounds(30, 300, 160, 30);

        Lastnamelabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Lastnamelabel.setForeground(new java.awt.Color(204, 204, 255));
        Lastnamelabel.setText("Lastname...");
        jPanel1.add(Lastnamelabel);
        Lastnamelabel.setBounds(30, 230, 160, 30);

        Middlenamelabel.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Middlenamelabel.setForeground(new java.awt.Color(204, 204, 255));
        Middlenamelabel.setText("Middlename...");
        jPanel1.add(Middlenamelabel);
        Middlenamelabel.setBounds(30, 160, 160, 30);

        Confirmpassred.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Confirmpassred.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(Confirmpassred);
        Confirmpassred.setBounds(30, 480, 160, 20);

        Lastnamered.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Lastnamered.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(Lastnamered);
        Lastnamered.setBounds(30, 270, 160, 20);

        Middlenamered.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Middlenamered.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(Middlenamered);
        Middlenamered.setBounds(30, 200, 160, 20);

        Passwordred.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Passwordred.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(Passwordred);
        Passwordred.setBounds(30, 410, 160, 20);

        bullet.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        bullet.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(bullet);
        bullet.setBounds(420, 160, 130, 20);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 470, 160, 20);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(30, 190, 160, 20);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 400, 160, 20);

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 520, 96, 35);

        Usernametxt.setBackground(new java.awt.Color(255, 255, 255));
        Usernametxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 26)); // NOI18N
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
        Usernametxt.setBounds(30, 300, 321, 30);

        ConfirmPasstxt.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmPasstxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 26)); // NOI18N
        ConfirmPasstxt.setForeground(new java.awt.Color(0, 0, 0));
        ConfirmPasstxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        ConfirmPasstxt.setFocusCycleRoot(true);
        ConfirmPasstxt.setMargin(new java.awt.Insets(1, 2, 0, 2));
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
        jPanel1.add(ConfirmPasstxt);
        ConfirmPasstxt.setBounds(30, 439, 320, 30);

        Passwordtxt.setBackground(new java.awt.Color(255, 255, 255));
        Passwordtxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 26)); // NOI18N
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
        Passwordtxt.setBounds(30, 369, 320, 30);

        Firstnametxt.setBackground(new java.awt.Color(255, 255, 255));
        Firstnametxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 26)); // NOI18N
        Firstnametxt.setForeground(new java.awt.Color(0, 0, 0));
        Firstnametxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        Firstnametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FirstnametxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FirstnametxtFocusLost(evt);
            }
        });
        Firstnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstnametxtActionPerformed(evt);
            }
        });
        jPanel1.add(Firstnametxt);
        Firstnametxt.setBounds(30, 90, 321, 30);

        Middlenametxt.setBackground(new java.awt.Color(255, 255, 255));
        Middlenametxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 26)); // NOI18N
        Middlenametxt.setForeground(new java.awt.Color(0, 0, 0));
        Middlenametxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        Middlenametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MiddlenametxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MiddlenametxtFocusLost(evt);
            }
        });
        Middlenametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiddlenametxtActionPerformed(evt);
            }
        });
        jPanel1.add(Middlenametxt);
        Middlenametxt.setBounds(30, 160, 321, 30);

        Lastnametxt.setBackground(new java.awt.Color(255, 255, 255));
        Lastnametxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 26)); // NOI18N
        Lastnametxt.setForeground(new java.awt.Color(0, 0, 0));
        Lastnametxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 204, 0)));
        Lastnametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LastnametxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LastnametxtFocusLost(evt);
            }
        });
        Lastnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnametxtActionPerformed(evt);
            }
        });
        jPanel1.add(Lastnametxt);
        Lastnametxt.setBounds(30, 230, 321, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Already have an account?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 570, 160, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("<html><u>Login</u></html>");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 570, 34, 20);

        groupbutton.add(Admin);
        Admin.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Admin.setForeground(new java.awt.Color(0, 0, 0));
        Admin.setText("Administrator");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        jPanel1.add(Admin);
        Admin.setBounds(420, 100, 130, 21);

        groupbutton.add(Staff);
        Staff.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Staff.setForeground(new java.awt.Color(0, 0, 0));
        Staff.setText("PTA Treasurer");
        jPanel1.add(Staff);
        Staff.setBounds(420, 130, 130, 21);

        Firstnamered.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Firstnamered.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(Firstnamered);
        Firstnamered.setBounds(30, 130, 160, 20);

        Usernamered.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Usernamered.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(Usernamered);
        Usernamered.setBounds(30, 340, 160, 20);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 400, 160, 20);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 577, 600));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/final logo for login and signup.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 390, 370));

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hidePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePassMouseClicked

    }//GEN-LAST:event_hidePassMouseClicked

    private void hidePassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePassMousePressed
        if (ConfirmPasstxt.getEchoChar() != 0) {
            ConfirmPasstxt.setEchoChar((char) 0); // Show password
            hidePass.setVisible(false);
        } else {
            // Hide password

        }

    }//GEN-LAST:event_hidePassMousePressed

    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked

    }//GEN-LAST:event_showPassMouseClicked

    private void showPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMousePressed
        ConfirmPasstxt.setEchoChar('\u2022');
        // Show password
        hidePass.setVisible(true);

    }//GEN-LAST:event_showPassMousePressed
    public String generateRecoveryCode() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder code = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            code.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return code.toString();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String firstname, middlename, lastname, userName, password, code, query, Squery, fullname;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3307/Billing_System_Database";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            firstname = Firstnametxt.getText();
            middlename = Middlenametxt.getText();
            lastname = Lastnametxt.getText();
            userName = Usernametxt.getText();
            password = Passwordtxt.getText();
            String confirm = ConfirmPasstxt.getText().trim();
            String pass = password.trim();

            code = generateRecoveryCode();
            this.codeq = code;
            if (Firstnametxt.getText().isEmpty()) {
                Firstnamered.setText("Firstname is required!");
                Middlenamered.setText("");
                Lastnamered.setText("");
                Usernamered.setText("");
                Passwordred.setText("");
            } else if (Middlenametxt.getText().isEmpty()) {
                Middlenamered.setText("Middlename is required!");
                Firstnamered.setText("");
                Lastnamered.setText("");
                Usernamered.setText("");
                Passwordred.setText("");
            } else if (Lastnametxt.getText().isEmpty()) {
                Lastnamered.setText("Lastname is required!");
                Firstnamered.setText("");
                Middlenamered.setText("");
                Usernamered.setText("");
                Passwordred.setText("");
            } else if (Usernametxt.getText().isEmpty()) {
                Usernamered.setText("Username is required!");
                Firstnamered.setText("");
                Middlenamered.setText("");
                Lastnamered.setText("");
                Passwordred.setText("");
            } else if (Passwordtxt.getText().isEmpty()) {
                Passwordred.setText("Password is required");
                Firstnamered.setText("");
                Middlenamered.setText("");
                Lastnamered.setText("");
                Usernamered.setText("");
            } else if (!(pass.equals(confirm))) {
                Confirmpassred.setText("Not matched!");
                Firstnamered.setText("");
                Middlenamered.setText("");
                Lastnamered.setText("");
                Usernamered.setText("");
                Passwordred.setText("");

            } else {
                String MiddleInitial = middlename.trim().substring(0, 1).toUpperCase() + ".";
                fullname = lastname + ", " + firstname + " " + MiddleInitial;
                if (Admin.isSelected()) {
                    query = "INSERT INTO admin_account (firstname, middlename, lastname, username, password, recovery_code, Status) VALUES (?, ?, ?, ?, ?, ?, 'pending')";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, firstname);
                    pst.setString(2, middlename);
                    pst.setString(3, lastname);
                    pst.setString(4, userName);
                    pst.setString(5, password);
                    pst.setString(6, code);
                    pst.executeUpdate();
                    String role = "Administrator";
                    Squery = "INSERT INTO security_account (role, fullname, username, password, recovery_code, Status) VALUES(?, ?, ?, ?, ?, 'pending')";
                    PreparedStatement ps = con.prepareStatement(Squery);
                    ps.setString(1, role);
                    ps.setString(2, fullname);
                    ps.setString(3, userName);
                    ps.setString(4, password);
                    ps.setString(5, code);
                    ps.executeUpdate();                   
                    LoginForm login = new LoginForm();
                    login.setVisible(true);
                    dispose();
                    System.out.println("it created!");                   
                   
                } else if (Staff.isSelected()) {
                    query = "INSERT INTO user_account (first_name, middle_name, last_name, username, password, recovery_code, Status) VALUES (?, ?, ?, ?, ?, ?, 'pending')";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, firstname);
                    pst.setString(2, middlename);
                    pst.setString(3, lastname);
                    pst.setString(4, userName);
                    pst.setString(5, password);
                    pst.setString(6, code);
                    pst.executeUpdate();
                    String role = "PTA Treasurer";
                    Squery = "INSERT INTO security_account (role, fullname, username, password, recovery_code, Status) VALUES(?, ?, ?, ?, ?, 'pending')";
                    PreparedStatement ps = con.prepareStatement(Squery);
                    ps.setString(1, role);
                    ps.setString(2, fullname);
                    ps.setString(3, userName);
                    ps.setString(4, password);
                    ps.setString(5, code);
                    ps.executeUpdate();                   
                    LoginForm login = new LoginForm();
                    login.setVisible(true);
                    dispose();
                    System.out.println("it created!");                   
                    
                } else {
                    bullet.setText("Please select a role");
                }
            }
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UsernametxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernametxtFocusGained
        if (Usernamelabel.getText().equals("Username...")) {
            Usernamelabel.setVisible(false);
        }
    }//GEN-LAST:event_UsernametxtFocusGained

    private void UsernametxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernametxtFocusLost
        if (Usernametxt.getText().isEmpty()) {
            Usernamelabel.setVisible(true);
            Color color = new Color(204, 204, 255);
            Usernamelabel.setForeground(color);
            Usernamelabel.setFont(new Font("Baskerville Old Face", Font.ITALIC, 24));
        }
    }//GEN-LAST:event_UsernametxtFocusLost

    private void UsernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernametxtActionPerformed

    }//GEN-LAST:event_UsernametxtActionPerformed

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

    private void ConfirmPasstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPasstxtActionPerformed

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

    private void FirstnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnametxtActionPerformed

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

    private void MiddlenametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiddlenametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MiddlenametxtActionPerformed

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

    private void LastnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnametxtActionPerformed

    private void hidePass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePass1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_hidePass1MouseClicked

    private void hidePass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePass1MousePressed
        if (Passwordtxt.getEchoChar() != 0) {
            Passwordtxt.setEchoChar((char) 0); // Show password
            hidePass1.setVisible(false);
        } else {

        }
    }//GEN-LAST:event_hidePass1MousePressed

    private void showPass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPass1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_showPass1MouseClicked

    private void showPass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPass1MousePressed
        Passwordtxt.setEchoChar('\u2022');
        // Show password
        hidePass1.setVisible(true);
    }//GEN-LAST:event_showPass1MousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        LoginForm login = new LoginForm();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Admin;
    private javax.swing.JLabel ConfirmPasslabel;
    private javax.swing.JPasswordField ConfirmPasstxt;
    private javax.swing.JLabel Confirmpassred;
    private javax.swing.JLabel Firstnamelabel;
    private javax.swing.JLabel Firstnamered;
    private javax.swing.JTextField Firstnametxt;
    private javax.swing.JLabel Lastnamelabel;
    private javax.swing.JLabel Lastnamered;
    private javax.swing.JTextField Lastnametxt;
    private javax.swing.JLabel Middlenamelabel;
    private javax.swing.JLabel Middlenamered;
    private javax.swing.JTextField Middlenametxt;
    private javax.swing.JLabel Passwordlabel;
    private javax.swing.JLabel Passwordred;
    private javax.swing.JPasswordField Passwordtxt;
    private javax.swing.JRadioButton Staff;
    private javax.swing.JLabel Usernamelabel;
    private javax.swing.JLabel Usernamered;
    private javax.swing.JTextField Usernametxt;
    private javax.swing.JLabel bullet;
    private javax.swing.ButtonGroup groupbutton;
    private javax.swing.JLabel hidePass;
    private javax.swing.JLabel hidePass1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel showPass;
    private javax.swing.JLabel showPass1;
    // End of variables declaration//GEN-END:variables
}
