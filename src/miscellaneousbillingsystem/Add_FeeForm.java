package miscellaneousbillingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import miscellaneousbillingsystem.Session;

public class Add_FeeForm extends javax.swing.JFrame {

    public Add_FeeForm() {
        initComponents();
        loaddata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new miscellaneousbillingsystem.ScrollPaneWin11();
        jTable1 = new javax.swing.JTable();
        Amountred = new javax.swing.JLabel();
        Acronymlbl = new javax.swing.JLabel();
        Feelbl = new javax.swing.JLabel();
        Acronymred = new javax.swing.JLabel();
        Rooler = new javax.swing.JLabel();
        Feenamered = new javax.swing.JLabel();
        Amountlbl = new javax.swing.JLabel();
        Create = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Amounttxt = new javax.swing.JTextField();
        Feetxt = new javax.swing.JTextField();
        Acronymtxt = new javax.swing.JTextField();
        Parent = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 440, 310));

        Amountred.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Amountred.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(Amountred, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 20));

        Acronymlbl.setFont(new java.awt.Font("Baskerville Old Face", 2, 20)); // NOI18N
        Acronymlbl.setForeground(new java.awt.Color(204, 204, 255));
        Acronymlbl.setText("Acronym...");
        jPanel3.add(Acronymlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 20));

        Feelbl.setFont(new java.awt.Font("Baskerville Old Face", 2, 20)); // NOI18N
        Feelbl.setForeground(new java.awt.Color(204, 204, 255));
        Feelbl.setText("Fee name....");
        jPanel3.add(Feelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        Acronymred.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Acronymred.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(Acronymred, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, 20));

        Rooler.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
        Rooler.setForeground(new java.awt.Color(255, 255, 255));
        Rooler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rooler.setText("Add Fee Contribution");
        jPanel3.add(Rooler, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 700, 40));

        Feenamered.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Feenamered.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(Feenamered, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 170, 20));

        Amountlbl.setFont(new java.awt.Font("Baskerville Old Face", 2, 20)); // NOI18N
        Amountlbl.setForeground(new java.awt.Color(204, 204, 255));
        Amountlbl.setText("Amount...");
        jPanel3.add(Amountlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

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
        jPanel3.add(Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, -1));

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
        jPanel3.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, -1));

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
        jPanel3.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 100, -1));

        Update.setBackground(new java.awt.Color(255, 255, 255));
        Update.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(0, 153, 0));
        Update.setText("Upadate");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel3.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, -1));

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
        jPanel3.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 95, -1));

        Amounttxt.setBackground(new java.awt.Color(0, 102, 0));
        Amounttxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        Amounttxt.setForeground(new java.awt.Color(255, 255, 255));
        Amounttxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Amounttxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AmounttxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AmounttxtFocusLost(evt);
            }
        });
        Amounttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmounttxtActionPerformed(evt);
            }
        });
        Amounttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AmounttxtKeyTyped(evt);
            }
        });
        jPanel3.add(Amounttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, -1));

        Feetxt.setBackground(new java.awt.Color(0, 102, 0));
        Feetxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        Feetxt.setForeground(new java.awt.Color(255, 255, 255));
        Feetxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Feetxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FeetxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FeetxtFocusLost(evt);
            }
        });
        Feetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeetxtActionPerformed(evt);
            }
        });
        jPanel3.add(Feetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, -1));

        Acronymtxt.setBackground(new java.awt.Color(0, 102, 0));
        Acronymtxt.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        Acronymtxt.setForeground(new java.awt.Color(255, 255, 255));
        Acronymtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Acronymtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AcronymtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AcronymtxtFocusLost(evt);
            }
        });
        Acronymtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcronymtxtActionPerformed(evt);
            }
        });
        jPanel3.add(Acronymtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, -1));

        Parent.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Parent.setForeground(new java.awt.Color(255, 255, 255));
        Parent.setText("Per Perant");
        Parent.setFocusPainted(false);
        Parent.setFocusable(false);
        Parent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParentActionPerformed(evt);
            }
        });
        jPanel3.add(Parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void loaddata() {
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Acronymtxt.setText("");
            Acronymlbl.setVisible(true);
            Feetxt.setText("");
            Feelbl.setVisible(true);
            Amounttxt.setText("");
            Amountlbl.setVisible(true);
            Create.setVisible(true);
            Feenamered.setText("");
            Amountred.setText("");
            Acronymred.setText("");

            String sql = "SELECT Name_of_contribution, Acronym, acronym_of_Fee, amount, ID FROM `miscellaneous_fee` ";

            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();

            String[] columnheader = {"Name of Contribution", "Acronym", "Acronym of Fee", "Amount", "ID"};
            for (String Header : columnheader) {
                model.addColumn(Header);
            }

            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            jTable1.setModel(model);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.setFocusable(false);
            jTable1.setDefaultEditor(Object.class, null);

            int[] hiddenCols = {1, 4};
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
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String feename = model.getValueAt(selectedRow, 0).toString();
            String acronym = model.getValueAt(selectedRow, 2).toString();
            String amount = model.getValueAt(selectedRow, 3).toString();

            Feetxt.setText(feename);
            Feelbl.setVisible(false);
            Amounttxt.setText(amount);
            Amountlbl.setVisible(false);
            Acronymtxt.setText(acronym);
            Acronymlbl.setVisible(false);
            Create.setVisible(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked

    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        String SUrl = "jdbc:mysql://localhost:3307/billing_system_database";
        String SUser = "root";
        String SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            String namefee = Feetxt.getText().toUpperCase().trim();
            String amount = Amounttxt.getText().toUpperCase().trim();
            String acronym = Acronymtxt.getText().toUpperCase().trim();
            String acronymq = acronym + "(" + amount + ")";
            if (Feetxt.getText().isEmpty()) {
                Feenamered.setText("It's empty!");
                Amountred.setText("");
                Acronymred.setText("");
            } else if (Acronymtxt.getText().isEmpty()) {
                Feenamered.setText("");
                Amountred.setText("");
                Acronymred.setText("It's empty!");
            } else if (Amounttxt.getText().isEmpty()) {
                Feenamered.setText("");
                Amountred.setText("It's empty!");
                Acronymred.setText("");
            } else {
                if (Parent.isSelected()) {
                    String query = "INSERT INTO `miscellaneous_fee` (Name_of_contribution, Acronym, amount, acronym_of_Fee, Per_Parent) VALUES (?, ?, ?, ?, ?) ";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, namefee);
                    pst.setString(2, acronymq);
                    pst.setString(3, amount);
                    pst.setString(4, acronym);
                    pst.setBoolean(5, true);
                    pst.executeUpdate();
                    Acronymtxt.setText("");
                    Acronymlbl.setVisible(true);
                    Feetxt.setText("");
                    Feelbl.setVisible(true);
                    Amounttxt.setText("");
                    Amountlbl.setVisible(true);
                    Create.setVisible(true);
                } else if (!Parent.isSelected()) {
                    String query = "INSERT INTO `miscellaneous_fee` (Name_of_contribution, Acronym, amount, acronym_of_Fee, Per_Parent) VALUES (?, ?, ?, ?, ?) ";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, namefee);
                    pst.setString(2, acronymq);
                    pst.setString(3, amount);
                    pst.setString(4, acronym);
                    pst.setBoolean(5, false);
                    pst.executeUpdate();
                    Acronymtxt.setText("");
                    Acronymlbl.setVisible(true);
                    Feetxt.setText("");
                    Feelbl.setVisible(true);
                    Amounttxt.setText("");
                    Amountlbl.setVisible(true);
                    Create.setVisible(true);
                }
                loaddata();
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_CreateActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        loaddata();
    }//GEN-LAST:event_RefreshActionPerformed

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

            String ID = jTable1.getValueAt(selectedRow, 4).toString();

            String query = "DELETE FROM `miscellaneous_fee` WHERE ID = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, ID);

            pst.executeUpdate();

            Feetxt.setText("");
            Feelbl.setVisible(true);
            Amounttxt.setText("");
            Amountlbl.setVisible(true);
            Create.setVisible(true);
            loaddata();
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

            String namefee = Feetxt.getText().toUpperCase().trim();
            String amount = Amounttxt.getText().toUpperCase().trim();
            String acronym = Acronymtxt.getText().toUpperCase().trim();
            String acronymq = acronym + "(" + amount + ")";
            String ID = jTable1.getValueAt(selectedRow, 4).toString();

            if (Feetxt.getText().isEmpty()) {
                Feenamered.setText("It's empty!");
                Amountred.setText("");

            } else if (Acronymtxt.getText().isEmpty()) {
                Feenamered.setText("");
                Amountred.setText("");
                Acronymred.setText("It's empty!");
            } else if (Amounttxt.getText().isEmpty()) {
                Feenamered.setText("");
                Amountred.setText("It's empty!");

            } else {
                String query = "UPDATE `miscellaneous_fee` SET Name_of_contribution = ?, amount= ?, Acronym = ?, acronym_of_Fee = ? WHERE ID =?";
                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, namefee);
                pst.setString(2, amount);
                pst.setString(3, acronymq);
                pst.setString(4, acronym);
                pst.setString(5, ID);
                pst.executeUpdate();
                Feetxt.setText("");
                Feelbl.setVisible(true);
                Amounttxt.setText("");
                Amountlbl.setVisible(true);
                Create.setVisible(true);
                loaddata();
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

    private void AmounttxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AmounttxtFocusGained
        if (Amountlbl.getText().equals("Amount...")) {
            Amountlbl.setVisible(false);
        }
    }//GEN-LAST:event_AmounttxtFocusGained

    private void AmounttxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AmounttxtFocusLost
        if (Amounttxt.getText().isEmpty()) {
            Amountlbl.setVisible(true);

        }
    }//GEN-LAST:event_AmounttxtFocusLost

    private void AmounttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmounttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmounttxtActionPerformed

    private void FeetxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FeetxtFocusGained
        if (Feelbl.getText().equals("Fee name....")) {
            Feelbl.setVisible(false);
        }
    }//GEN-LAST:event_FeetxtFocusGained

    private void FeetxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FeetxtFocusLost
        if (Feetxt.getText().isEmpty()) {
            Feelbl.setVisible(true);

        }
    }//GEN-LAST:event_FeetxtFocusLost

    private void FeetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeetxtActionPerformed

    private void AmounttxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmounttxtKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // ignore non-digit
        }
    }//GEN-LAST:event_AmounttxtKeyTyped

    private void AcronymtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcronymtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcronymtxtActionPerformed

    private void AcronymtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AcronymtxtFocusGained
        if (Acronymlbl.getText().equals("Acronym...")) {
            Acronymlbl.setVisible(false);
        }
    }//GEN-LAST:event_AcronymtxtFocusGained

    private void AcronymtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AcronymtxtFocusLost
        if (Acronymtxt.getText().isEmpty()) {
            Acronymlbl.setVisible(true);
        }
    }//GEN-LAST:event_AcronymtxtFocusLost

    private void ParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParentActionPerformed
        if (Parent.isSelected()) {
            Rooler.setText("Add Fee Contribution (PER PARENT)");
        } else if (!Parent.isSelected()) {
            Rooler.setText("Add Fee Contribution");
        }
    }//GEN-LAST:event_ParentActionPerformed

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
            java.util.logging.Logger.getLogger(Add_FeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_FeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_FeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_FeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_FeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acronymlbl;
    private javax.swing.JLabel Acronymred;
    private javax.swing.JTextField Acronymtxt;
    private javax.swing.JLabel Amountlbl;
    private javax.swing.JLabel Amountred;
    private javax.swing.JTextField Amounttxt;
    private javax.swing.JButton Back;
    private javax.swing.JButton Create;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel Feelbl;
    private javax.swing.JLabel Feenamered;
    private javax.swing.JTextField Feetxt;
    private javax.swing.JCheckBox Parent;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel Rooler;
    private javax.swing.JButton Update;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
