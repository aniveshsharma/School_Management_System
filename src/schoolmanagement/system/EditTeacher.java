/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schoolmanagement.system;
import java.awt.HeadlessException;
import javax.swing.JOptionPane; 
import java.sql.*;

/**
 *
 * @author it's Anivesh
 */
public class EditTeacher extends javax.swing.JFrame {

    /**
     * Creates new form EditTeacher
     */
    public EditTeacher() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Heading1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fathername = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        education = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        department = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        adharno = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        jhguyf1 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        backclick1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        teacherid = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDIT TEACHER DETAILS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-friend.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(25, 25, 25))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Heading1.setBackground(new java.awt.Color(0, 102, 102));
        Heading1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Heading1.setForeground(new java.awt.Color(0, 102, 102));
        Heading1.setText("EDIT TEACHER INFO.");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Full Name");

        fathername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fathername.setForeground(new java.awt.Color(51, 51, 51));
        fathername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fathernameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Father Name");

        name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        name.setForeground(new java.awt.Color(51, 51, 51));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Education");

        education.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        education.setForeground(new java.awt.Color(51, 51, 51));
        education.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                educationActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Department");

        department.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        department.setForeground(new java.awt.Color(51, 51, 51));
        department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Adhar No.");

        adharno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        adharno.setForeground(new java.awt.Color(51, 51, 51));
        adharno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adharnoActionPerformed(evt);
            }
        });

        phoneno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        phoneno.setForeground(new java.awt.Color(51, 51, 51));
        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Phone No.");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("E-mail");

        email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        email.setForeground(new java.awt.Color(51, 51, 51));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        dob.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        dob.setForeground(new java.awt.Color(51, 51, 51));
        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });

        jhguyf1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jhguyf1.setForeground(new java.awt.Color(153, 153, 153));
        jhguyf1.setText("D.O.B.");

        address.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        address.setForeground(new java.awt.Color(51, 51, 51));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("Address");

        submit.setBackground(new java.awt.Color(0, 102, 102));
        submit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        backclick1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        backclick1.setForeground(new java.awt.Color(0, 102, 102));
        backclick1.setText("<Back");
        backclick1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backclick1MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Teacher Id");

        teacherid.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        teacherid.setForeground(new java.awt.Color(51, 51, 51));
        teacherid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacheridActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("© Copyright 2024 anivesh. All rights reserved");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Heading1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(backclick1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(fathername, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(education, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(adharno, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269)
                        .addComponent(jhguyf1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(teacherid, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Heading1))
                    .addComponent(backclick1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fathername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(education, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adharno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jhguyf1))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(submit)))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 900, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fathernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fathernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fathernameActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void educationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_educationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_educationActionPerformed

    private void departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentActionPerformed

    private void adharnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adharnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adharnoActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String id = teacherid.getText();
        String nme = name.getText();
        String fname = fathername.getText();
        String edu = education.getText();
        String depart = department.getText();
        String Adhar_no = adharno.getText();
        String pnum = phoneno.getText();
        String mail = email.getText();
        String d = dob.getText();
        String Add = address.getText();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","2202");
            String sql;
            sql = "UPDATE `Teacher` SET `Name_` ='"+nme+"', `Father_name` = '"+fname+"', `Education` = '"+edu+"', `Department` = '"+depart+"', `Adhar_no` = '"+Adhar_no+"', `Phone_no` = '"+pnum+"', `E_mail` = '"+mail+"', `DOB` = '"+d+"', `Address` = '"+Add+"' WHERE `Teacher_id` = '"+id+"'";

            PreparedStatement ptstmt=conn.prepareStatement(sql);
            ptstmt.execute();
            
            
            JOptionPane.showMessageDialog(null, "Record has been Updated Sucessfully!");
        }
         catch (HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void backclick1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backclick1MouseClicked
        // TODO add your handling code here:
        TeacherPage obj =new TeacherPage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backclick1MouseClicked

    private void teacheridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacheridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacheridActionPerformed

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
            java.util.logging.Logger.getLogger(EditTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading1;
    private javax.swing.JTextField address;
    private javax.swing.JTextField adharno;
    private javax.swing.JLabel backclick1;
    private javax.swing.JTextField department;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField education;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fathername;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jhguyf1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phoneno;
    private javax.swing.JButton submit;
    private javax.swing.JTextField teacherid;
    // End of variables declaration//GEN-END:variables
}
