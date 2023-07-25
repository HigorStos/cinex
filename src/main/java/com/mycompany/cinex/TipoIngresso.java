package com.mycompany.cinex;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author higor
 */
public class TipoIngresso extends javax.swing.JFrame {
    
    String imgFilme = "";

    /**
     * Creates new form TipoIngresso
     */
    public TipoIngresso () {
        initComponents();
        
        Color bg = new Color(10, 22, 39);
        getContentPane().setBackground(bg);

        logoImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoNoBackground.png")));
        totalLabel.setText("R$" + String.valueOf(ig.ValorTotal()) + "0");
        
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
        
        DatabaseReference movieRef = FirebaseDatabase.getInstance().getReference("currentSale/movie");

        // Realize a leitura dos dados
        movieRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Object movie = dataSnapshot.getValue();
                movieNameLabel.setText(String.valueOf(movie));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("Ocorreu um erro: " + databaseError.getMessage());
            }
        });
        
        DatabaseReference sessionRef = FirebaseDatabase.getInstance().getReference("currentSale/session");

        // Realize a leitura dos dados
        sessionRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Object session = dataSnapshot.getValue();
                sessionLabel.setText(String.valueOf(session));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("Ocorreu um erro: " + databaseError.getMessage());
            }
        });
        
        DatabaseReference imageRef = FirebaseDatabase.getInstance().getReference("currentSale/image");
        
        // Realize a leitura dos dados
        imageRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Object image = dataSnapshot.getValue();
                imgFilme = String.valueOf(image);
                switch (imgFilme){
                    case "0":
                        ImageIcon guardioes = new javax.swing.ImageIcon(getClass().getResource("/guardioes.jpg"));
                        movieImageLabel.setIcon(guardioes);
                        break;
                        
                    case "1":
                        ImageIcon spiderman = new javax.swing.ImageIcon(getClass().getResource("/spiderman.jpg"));
                        movieImageLabel.setIcon(spiderman);
                        break;
                        
                    case "2":
                        ImageIcon transformers = new javax.swing.ImageIcon(getClass().getResource("/transformers.jpg"));
                        movieImageLabel.setIcon(transformers);
                        break;
                        
                    case "3":
                        ImageIcon mario = new javax.swing.ImageIcon(getClass().getResource("/mario.jpg"));
                        movieImageLabel.setIcon(mario);
                        break;
                        
                    case "4":
                        ImageIcon velozes = new javax.swing.ImageIcon(getClass().getResource("/velozes.jpg"));
                        movieImageLabel.setIcon(velozes);
                        break;
                    
                    default:
                    movieImageLabel.setIcon(null);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("Ocorreu um erro: " + databaseError.getMessage());
            }
        });
        
        System.out.println(imgFilme);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movieImageLabel = new javax.swing.JLabel();
        movieNameLabel = new javax.swing.JLabel();
        logoImageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sessionLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inteiraComboBox = new javax.swing.JComboBox<>();
        meiaComboBox = new javax.swing.JComboBox<>();
        pipocaComboBox = new javax.swing.JComboBox<>();
        doneButton = new javax.swing.JButton();
        pagamentoComboBox = new javax.swing.JComboBox<>();
        totalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleção de Ingresso");

        movieImageLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        movieImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movieImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario.jpg"))); // NOI18N

        movieNameLabel.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        movieNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        movieNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movieNameLabel.setText("Super Mario Bros");

        logoImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoNoBackground.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INTEIRA");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MEIA");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PIPOCA");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PAGAMENTO");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VALOR TOTAL");

        sessionLabel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        sessionLabel.setForeground(new java.awt.Color(255, 255, 255));
        sessionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sessionLabel.setText("Sessão 204 | Sala 8");

        jLabel7.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(R$50,00)");

        jLabel8.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(R$25,00)");

        inteiraComboBox.setBackground(new java.awt.Color(255, 255, 255));
        inteiraComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        inteiraComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inteiraComboBoxActionPerformed(evt);
            }
        });

        meiaComboBox.setBackground(new java.awt.Color(255, 255, 255));
        meiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        meiaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meiaComboBoxActionPerformed(evt);
            }
        });

        pipocaComboBox.setBackground(new java.awt.Color(255, 255, 255));
        pipocaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Pipoca Pequena + Refrigerante 400ml | R$30", "Pipoca Média + Refrigerante 400ml | R$40", "Pipoca Grande + 2x Refrigerante 400ml | R$50" }));
        pipocaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pipocaComboBoxActionPerformed(evt);
            }
        });

        doneButton.setBackground(new java.awt.Color(254, 0, 57));
        doneButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        doneButton.setForeground(new java.awt.Color(255, 255, 255));
        doneButton.setText("Confirmar");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        pagamentoComboBox.setBackground(new java.awt.Color(255, 255, 255));
        pagamentoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão de Crédito", "Cartão de Débito", "Pix", "Dinheiro" }));
        pagamentoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamentoComboBoxActionPerformed(evt);
            }
        });

        totalLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalLabel.setText("R$0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sessionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(movieImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pagamentoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pipocaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(meiaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inteiraComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(doneButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(movieNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(movieNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sessionLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(movieImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(inteiraComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(meiaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pipocaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pagamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(totalLabel))
                        .addGap(40, 40, 40)
                        .addComponent(doneButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(120, 120, 120))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Ingresso ig = new Ingresso();
    
    private void inteiraComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inteiraComboBoxActionPerformed
        // TODO add your handling code here:
        
        int selectedIndex = inteiraComboBox.getSelectedIndex();

        switch (selectedIndex) {
            case 0:
                ig.setInteira(0);
                ig.setQtdInteira(0);
                break;
            case 1:
                ig.setInteira(50);
                ig.setQtdInteira(1);
                break;
            case 2:
                ig.setInteira(100);
                ig.setQtdInteira(2);
                break;
            case 3:
                ig.setInteira(150);
                ig.setQtdInteira(3);
                break;
            case 4:
                ig.setInteira(200);
                ig.setQtdInteira(4);
                break;
            case 5:
                ig.setInteira(250);
                ig.setQtdInteira(5);
                break;
            case 6:
                ig.setInteira(300);
                ig.setQtdInteira(6);
                break;
            case 7:
                ig.setInteira(350);
                ig.setQtdInteira(7);
                break;
            case 8:
                ig.setInteira(400);
                ig.setQtdInteira(8);
                break; 
            default:
                break;
        }
        
        System.out.println(ig.getInteira());
        
        totalLabel.setText("R$" + String.valueOf(ig.ValorTotal()) + "0");
        
    }//GEN-LAST:event_inteiraComboBoxActionPerformed

    private void meiaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meiaComboBoxActionPerformed
        // TODO add your handling code here:
        
        int selectedIndex = meiaComboBox.getSelectedIndex();

        switch (selectedIndex) {
            case 0:
                ig.setMeia(0);
                ig.setQtdMeia(0);
                break;
            case 1:
                ig.setMeia(25);
                ig.setQtdMeia(1);
                break;
            case 2:
                ig.setMeia(50);
                ig.setQtdMeia(2);
                break;
            case 3:
                ig.setMeia(75);
                ig.setQtdMeia(3);
                break;
            case 4:
                ig.setMeia(100);
                ig.setQtdMeia(4);
                break;
            case 5:
                ig.setMeia(125);
                ig.setQtdMeia(5);
                break;
            case 6:
                ig.setMeia(150);
                ig.setQtdMeia(6);
                break;
            case 7:
                ig.setMeia(175);
                ig.setQtdMeia(7);
                break;
            case 8:
                ig.setMeia(200);
                ig.setQtdMeia(8);
                break; 
            default:
                break;
        }
        
        System.out.println(ig.getMeia());
        
        totalLabel.setText("R$" + String.valueOf(ig.ValorTotal()) + "0");
        
    }//GEN-LAST:event_meiaComboBoxActionPerformed

    private void pipocaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pipocaComboBoxActionPerformed
        // TODO add your handling code here:
        
        int index = pipocaComboBox.getSelectedIndex();
        
        switch (index){
            case 0:
                ig.setPipoca(0);
                ig.setNomeCombo("Não");
                break;
            case 1:
                ig.setPipoca(40);
                ig.setNomeCombo("Pipoca Pequena + Refrigerante 400ml");
                break;
            case 2:
                ig.setPipoca(60);
                ig.setNomeCombo("Pipoca Média + Refrigerante 400ml");
                break;
            case 3:
                ig.setPipoca(80);
                ig.setNomeCombo("Pipoca Grande + 2x Refrigerante 400ml");
                break;
            default:
                break;
        }
        
        System.out.println(ig.getPipoca());
        
        totalLabel.setText("R$" + String.valueOf(ig.ValorTotal()) + "0");

    }//GEN-LAST:event_pipocaComboBoxActionPerformed

    private void pagamentoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentoComboBoxActionPerformed
        // TODO add your handling code here:
        
        int index = pagamentoComboBox.getSelectedIndex();
        
        switch (index){
            case 0:
                ig.setPagamento("Cartão de Crédito");
                ig.setCartao(5);
                System.out.println("Taxa cartão: R$" + ig.getCartao());
                break;
            case 1:
                ig.setPagamento("Cartão de Débito");
                ig.setCartao(2.50);
                System.out.println("Taxa cartão: R$" + ig.getCartao());
                break;
            case 2:
                ig.setPagamento("Pix");
                ig.setCartao(0);
                System.out.println("Taxa: R$" + ig.getCartao());
                break;
            case 3:
                ig.setPagamento("Dinheiro");
                ig.setCartao(0);
                System.out.println("Taxa: R$" + ig.getCartao());
                break;
            default:
                break;
        }
        
        System.out.println(ig.getPagamento());
        
        totalLabel.setText("R$" + String.valueOf(ig.ValorTotal()) + "0");

    }//GEN-LAST:event_pagamentoComboBoxActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog
        (null,
                "------------------------------------------------------------------------------------------------------" +
                "\n                   Filme:     " + movieNameLabel.getText() +
                "\n                   Sessão:     " + sessionLabel.getText() +
                "\n" +
                "\n                   Ingressos:     " + ig.qtdIngressos() +
                "\n                   Combo:    " + ig.getNomeCombo()+
                "\n                   Valor:     " + "R$" + String.valueOf(ig.ValorTotal()) + "0" +
                "\n------------------------------------------------------------------------------------------------------"
        );
        
        this.dispose();
        SelecionarFilme sfl = new SelecionarFilme();
        sfl.setVisible(true);
    }//GEN-LAST:event_doneButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TipoIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoIngresso().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doneButton;
    private javax.swing.JComboBox<String> inteiraComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel logoImageLabel;
    private javax.swing.JComboBox<String> meiaComboBox;
    private javax.swing.JLabel movieImageLabel;
    private javax.swing.JLabel movieNameLabel;
    private javax.swing.JComboBox<String> pagamentoComboBox;
    private javax.swing.JComboBox<String> pipocaComboBox;
    private javax.swing.JLabel sessionLabel;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
