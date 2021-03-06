package br.ufs.decomp.genius;

import javax.swing.JOptionPane;
import javazoom.jl.player.Player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Classe para Escolha de Dificuldade do jogo Genius.
 *
 * @author Yago Oliveira e Edson Marques
 */
public class EscolhaDificuldade extends javax.swing.JFrame {

    public int escolha;

    /**
     * Inicialização dos componentes da classe.
     */
    public EscolhaDificuldade() {
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

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/nivel_4.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/nivel_1.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/nivel_2.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Nível 4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/nivel_3.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Nível 2");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Nível 1");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Nível 3");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("Selecione o nível do jogo!");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 612));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/Genius_logo.png"))); // NOI18N
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/menu_background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Construtor do botão que passa o clique do mouse como parâmetro. Ao clicar
     * o método gera uma thread que inicia o jogo em outra JFrame.
     *
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Thread(() -> {
            Genius genius = new Genius(1);
            genius.setVisible(true);
            try {
                Player p = new Player(Genius.class.getResourceAsStream("/br/ufs/decomp/genius/sons/intro.mp3"));

                //executa o som
                p.play();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO");
            }
            genius.jogo();
        }).start();

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Construtor do botão que passa o clique do mouse como parâmetro. Ao clicar
     * o método gera uma thread que inicia o jogo em outra JFrame.
     *
     * @param evt
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Thread(() -> {
            Genius genius = new Genius(2);
            genius.setVisible(true);
            try {
                Player p = new Player(Genius.class.getResourceAsStream("/br/ufs/decomp/genius/sons/intro.mp3"));

                //executa o som
                p.play();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO");
            }
            genius.jogo();
        }).start();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Construtor do botão que passa o clique do mouse como parâmetro. Ao clicar
     * o método gera uma thread que inicia o jogo em outra JFrame.
     *
     * @param evt
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Thread(() -> {
            Genius genius = new Genius(3);
            genius.setVisible(true);
            try {
                Player p = new Player(Genius.class.getResourceAsStream("/br/ufs/decomp/genius/sons/intro.mp3"));

                //executa o som
                p.play();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO");
            }
            genius.jogo();
        }).start();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Construtor do botão que passa o clique do mouse como parâmetro. Ao clicar
     * o método gera uma thread que inicia o jogo em outra JFrame.
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Thread(() -> {
            Genius genius = new Genius(4);
            genius.setVisible(true);
            try {
                Player p = new Player(Genius.class.getResourceAsStream("/br/ufs/decomp/genius/sons/intro.mp3"));

                //executa o som
                p.play();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO");
            }
            genius.jogo();
        }).start();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Main da Classe EscolhaDificuldade
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        int escolha;
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EscolhaDificuldade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolhaDificuldade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolhaDificuldade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolhaDificuldade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaDificuldade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
