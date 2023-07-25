package com.mycompany.cinex;

import javax.swing.*;
import java.awt.*;

import java.io.FileInputStream;
import java.io.InputStream;

import com.google.firebase.database.*;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.cloud.firestore.Firestore;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        
        Color bg = new Color(10, 22, 39);
        getContentPane().setBackground(bg);
        userTextField.setText("Usuário");
        userTextField.setFont(new java.awt.Font("Segoe UI", 0, 14));
        userTextField.setForeground(new Color(153, 153, 153));
        passwordPasswordField.setText("Senha");
        passwordPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14));
        passwordPasswordField.setForeground(new Color(153, 153, 153));
        passwordPasswordField.setEchoChar((char)0);

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoNoBackground.png")));
        
        setLocationRelativeTo(null);
        
        try {

            InputStream serviceAccount = new FileInputStream("src/main/config/cinex-57d8e-firebase-adminsdk-r2kqj-05dcc027e9.json");
            GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
            FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(credentials)
                .setDatabaseUrl("https://cinex-57d8e-default-rtdb.firebaseio.com/") // Adicione o URL aqui
                .build();
            if (FirebaseApp.getApps().isEmpty()) {
                FirebaseApp.initializeApp(options);
            }

            Firestore db = FirestoreClient.getFirestore();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userTextField = new javax.swing.JTextField();
        passwordPasswordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CineX | Login");
        setBackground(new java.awt.Color(10, 22, 39));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        userTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        userTextField.setText("Usuário");
        userTextField.setToolTipText("");
        userTextField.setName(""); // NOI18N
        userTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userTextFieldFocusLost(evt);
            }
        });
        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });

        passwordPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordPasswordFieldFocusLost(evt);
            }
        });
        passwordPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordPasswordFieldActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(254, 0, 57));
        loginButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Entrar");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoNoBackground.png"))); // NOI18N

        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Não tem uma conta?");

        registerButton.setBackground(new java.awt.Color(10, 22, 39));
        registerButton.setForeground(new java.awt.Color(254, 0, 57));
        registerButton.setText("Cadastre-se");
        registerButton.setToolTipText("");
        registerButton.setBorder(null);
        registerButton.setBorderPainted(false);
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(imageLabel)))
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(passwordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerButton))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        setBounds(0, 0, 561, 458);
    }// </editor-fold>//GEN-END:initComponents

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void passwordPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordPasswordFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_passwordPasswordFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String user = userTextField.getText();
        String password = new String (passwordPasswordField.getPassword());

        DatabaseReference database = FirebaseDatabase.getInstance().getReference();
        DatabaseReference usersRef = database.child("users");

        usersRef.addListenerForSingleValueEvent(new ValueEventListener() {
            
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                boolean isValidUser = false;

                for (DataSnapshot userSnapshot : dataSnapshot.getChildren()) {
                    String username = userSnapshot.child("user").getValue(String.class);
                    String userPassword = userSnapshot.child("password").getValue(String.class);

                    if (user.equals(username) && password.equals(userPassword)) {
                        isValidUser = true;
                        break;
                    }
                }

                if (isValidUser) {
                    JOptionPane.showMessageDialog(null, "Bem-vindo(a), " + user + '!');
                    SelecionarFilme sf = new SelecionarFilme();
                    
                    sf.setVisible(true);
                    dispose();
                } 
                    
                else {
                    JOptionPane.showMessageDialog(null, "Dados inválidos!");
                    }
            }


            @Override
            public void onCancelled(DatabaseError databaseError) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados!");
            }
        });
    }//GEN-LAST:event_loginButtonActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        
        Cadastro c = new Cadastro();
        c.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_registerButtonActionPerformed

    private void userTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTextFieldFocusGained
        // TODO add your handling code here:
        
        if(userTextField.getText().equals("Usuário")){
            userTextField.setText("");
            userTextField.setFont(new java.awt.Font("Segoe UI", 0, 16));
            userTextField.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_userTextFieldFocusGained

    private void userTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTextFieldFocusLost
        // TODO add your handling code here:
        
        if(userTextField.getText().equals("")){
            userTextField.setText("Usuário");
            userTextField.setFont(new java.awt.Font("Segoe UI", 0, 14));
            userTextField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_userTextFieldFocusLost

    private void passwordPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordPasswordFieldFocusGained
        // TODO add your handling code here:
        
        if(passwordPasswordField.getText().equals("Senha")){
            passwordPasswordField.setText("");
            passwordPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 16));
            passwordPasswordField.setForeground(new Color(0, 0, 0));
            passwordPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_passwordPasswordFieldFocusGained

    private void passwordPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordPasswordFieldFocusLost
        // TODO add your handling code here:
        
        if(passwordPasswordField.getText().equals("")){
            passwordPasswordField.setText("Senha");
            passwordPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14));
            passwordPasswordField.setForeground(new Color(153, 153, 153));
            passwordPasswordField.setEchoChar((char)0);
        }
    }//GEN-LAST:event_passwordPasswordFieldFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Login().setVisible(true);
                }
            });
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordPasswordField;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
