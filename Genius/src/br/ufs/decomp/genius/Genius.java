/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.decomp.genius;

import br.ufs.decomp.genius.regra.Controlador;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Afonso
 */
public class Genius extends javax.swing.JFrame {

    private List<Integer> sequenciaGenius;
    private int posicao;
    boolean errou;
    boolean fim;
    private Controlador controlador;

    /**
     * Creates new form Genius
     */
    public Genius() {
        initComponents();
        controlador = new Controlador(36);
        sequenciaGenius = new ArrayList<>();
        posicao = 0;
        errou = false;
        fim = false;
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
        btnAmarelo = new javax.swing.JButton();
        btnAzul = new javax.swing.JButton();
        btnVerde = new javax.swing.JButton();
        btnVermelho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAmarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/amarelo_off.png"))); // NOI18N
        btnAmarelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAmarelo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAmarelo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnAmarelo.setMaximumSize(new java.awt.Dimension(303, 287));
        btnAmarelo.setMinimumSize(new java.awt.Dimension(303, 287));
        btnAmarelo.setPreferredSize(new java.awt.Dimension(303, 287));
        btnAmarelo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/amarelo_on.png"))); // NOI18N
        btnAmarelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAmareloMouseClicked(evt);
            }
        });
        jPanel1.add(btnAmarelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 290, -1));

        btnAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/azul_off.png"))); // NOI18N
        btnAzul.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAzul.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAzul.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnAzul.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/azul_on.png"))); // NOI18N
        btnAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAzulMouseClicked(evt);
            }
        });
        jPanel1.add(btnAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 297, -1, -1));

        btnVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/verde_off.png"))); // NOI18N
        btnVerde.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVerde.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVerde.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnVerde.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/verde_on.png"))); // NOI18N
        btnVerde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerdeMouseClicked(evt);
            }
        });
        jPanel1.add(btnVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btnVermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/vermelho_off.png"))); // NOI18N
        btnVermelho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVermelho.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVermelho.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnVermelho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/vermelho_on.png"))); // NOI18N
        btnVermelho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVermelhoMouseClicked(evt);
            }
        });
        jPanel1.add(btnVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 297, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAmareloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAmareloMouseClicked
        if (sequenciaGenius.get(posicao) != 2) {
            JOptionPane.showMessageDialog(null, "Errou!");
            errou = true;
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jogo();
            }
        });
    }//GEN-LAST:event_btnAmareloMouseClicked

    private void btnAzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAzulMouseClicked
        if (sequenciaGenius.get(posicao) != 4) {
            JOptionPane.showMessageDialog(null, "Errou!");
            errou = true;
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jogo();
            }
        });
    }//GEN-LAST:event_btnAzulMouseClicked

    private void btnVerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerdeMouseClicked
        if (sequenciaGenius.get(posicao) != 1) {
            JOptionPane.showMessageDialog(null, "Errou!");
            errou = true;
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jogo();
            }
        });
    }//GEN-LAST:event_btnVerdeMouseClicked

    private void btnVermelhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVermelhoMouseClicked
        if (sequenciaGenius.get(posicao) != 3) {
            JOptionPane.showMessageDialog(null, "Errou!");
            errou = true;
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jogo();
            }
        });
    }//GEN-LAST:event_btnVermelhoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Genius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Genius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Genius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Genius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Genius().setVisible(true);
//                new Thread() {
//                    @Override
//                    public void run() {
//                        try {
//
//                            FileInputStream in;
//                            //Inicializa o FileInputStream com o endereço do arquivo para tocar
//                            in = new FileInputStream("C:\\Users\\Afonso\\Music\\Sounds\\intro.mp3");
//
//                            //Cria uma instancia da classe player passando para ele o InpuStream do arquivo
//                            Player p = new Player(in);
//
//                            //executa o som
//                            p.play();
//
//                        } catch (FileNotFoundException ex) {
//                            Logger.getLogger(Genius.class.getName()).log(Level.SEVERE, null, ex);
//                        } catch (JavaLayerException ex) {
//                            Logger.getLogger(Genius.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                }.start();
//            }
//        });
        Genius genius = new Genius();
        genius.setVisible(true);
        genius.jogo();
    }

    private void jogo() {
        try {
            if (!errou && !fim) {
                Thread.sleep(1000);

                sequenciaGenius.add(controlador.getProximaSequencia());

                for (Integer item : sequenciaGenius) {
                    switch (item) {
                        case 1:
                            btnVerde.setIcon(new ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/verde_on.png")));
                            Thread.sleep(2000);
                            btnVerde.setIcon(new ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/verde_off.png")));
                            break;
                        case 2:
                            btnAmarelo.setIcon(new ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/amarelo_on.png")));
                            Thread.sleep(2000);
                            btnAmarelo.setIcon(new ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/amarelo_off.png")));
                            break;
                        case 3:
                            btnVermelho.setIcon(new ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/vermelho_on.png")));
                            Thread.sleep(2000);
                            btnVermelho.setIcon(new ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/vermelho_off.png")));
                            break;
                        case 4:
                            btnAzul.setIcon(new ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/azul_on.png")));
                            Thread.sleep(2000);
                            btnAzul.setIcon(new ImageIcon(getClass().getResource("/br/ufs/decomp/genius/images/azul_off.png")));
                            break;
                    }
                }
            } else {
                posicao = 0;
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Genius.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmarelo;
    private javax.swing.JButton btnAzul;
    private javax.swing.JButton btnVerde;
    private javax.swing.JButton btnVermelho;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
