/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.isa.view;

import com.mycompany.isa.ISA;
import java.awt.CardLayout;
import java.awt.Component;

/**
 *
 * @author Admin
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        menuVoltar = new javax.swing.JMenu();
        cardPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        btnGerenciarLotes = new javax.swing.JButton();
        btnVisualizarLotes = new javax.swing.JButton();
        btnGerenciarIndicadores = new javax.swing.JButton();
        lblMainTitle = new javax.swing.JLabel();
        sobrePanel = new javax.swing.JPanel();
        lblSobreTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        ajudaPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuCalcularIndice = new javax.swing.JMenu();
        menuGerenciarLotes = new javax.swing.JMenu();
        menuGerenciarIndicadores = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenu();

        menuVoltar.setText("Voltar");
        menuVoltar.setName("Voltar"); // NOI18N
        menuVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVoltarMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Índice de Sustentabilidade Agrária");

        cardPanel.setLayout(new java.awt.CardLayout());

        btnGerenciarLotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGerenciarLotes.setText("Gerenciar lotes");
        btnGerenciarLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarLotesActionPerformed(evt);
            }
        });

        btnVisualizarLotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVisualizarLotes.setText("Calcular Índice");
        btnVisualizarLotes.setToolTipText("");
        btnVisualizarLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarLotesActionPerformed(evt);
            }
        });

        btnGerenciarIndicadores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGerenciarIndicadores.setText("Gerenciar indicadores");
        btnGerenciarIndicadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarIndicadoresActionPerformed(evt);
            }
        });

        lblMainTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainTitle.setText("ÍNDICE DE SUSTENTABILIDADE AGRÁRIA");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnGerenciarLotes, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(btnGerenciarIndicadores, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(btnVisualizarLotes, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                        .addGap(225, 225, 225)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblMainTitle)
                .addGap(18, 18, 18)
                .addComponent(btnVisualizarLotes, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGerenciarIndicadores, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGerenciarLotes, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );

        cardPanel.add(mainPanel, "main");

        lblSobreTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSobreTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSobreTitle.setText("Descrição do projeto");

        jTextPane1.setText("Aqui é onde estará a descrição sobre o Índice de Sustentabilidade Agrária\n");
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout sobrePanelLayout = new javax.swing.GroupLayout(sobrePanel);
        sobrePanel.setLayout(sobrePanelLayout);
        sobrePanelLayout.setHorizontalGroup(
            sobrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sobrePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(sobrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSobreTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addGroup(sobrePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sobrePanelLayout.setVerticalGroup(
            sobrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sobrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSobreTitle)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );

        cardPanel.add(sobrePanel, "sobre");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ajuda");

        jTextPane2.setText("Aqui é onde estará um guia sobre o aplicativo");
        jScrollPane2.setViewportView(jTextPane2);

        javax.swing.GroupLayout ajudaPanelLayout = new javax.swing.GroupLayout(ajudaPanel);
        ajudaPanel.setLayout(ajudaPanelLayout);
        ajudaPanelLayout.setHorizontalGroup(
            ajudaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajudaPanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1)
                .addContainerGap(402, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajudaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        ajudaPanelLayout.setVerticalGroup(
            ajudaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajudaPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );

        cardPanel.add(ajudaPanel, "ajuda");

        menuInicio.setText("Início");
        menuInicio.setToolTipText("");
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
            }
        });
        jMenuBar2.add(menuInicio);

        menuCalcularIndice.setText("Calcular índice");
        menuCalcularIndice.setToolTipText("");
        menuCalcularIndice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuCalcularIndiceMousePressed(evt);
            }
        });
        menuCalcularIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalcularIndiceActionPerformed(evt);
            }
        });
        jMenuBar2.add(menuCalcularIndice);

        menuGerenciarLotes.setText("Gerenciar lotes");
        menuGerenciarLotes.setToolTipText("");
        menuGerenciarLotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuGerenciarLotesMousePressed(evt);
            }
        });
        menuGerenciarLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciarLotesActionPerformed(evt);
            }
        });
        jMenuBar2.add(menuGerenciarLotes);

        menuGerenciarIndicadores.setText("Gerenciar indicadores");
        menuGerenciarIndicadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuGerenciarIndicadoresMousePressed(evt);
            }
        });
        menuGerenciarIndicadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciarIndicadoresActionPerformed(evt);
            }
        });
        jMenuBar2.add(menuGerenciarIndicadores);

        menuSobre.setText("Sobre");
        menuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSobreMouseClicked(evt);
            }
        });
        jMenuBar2.add(menuSobre);

        menuAjuda.setText("Ajuda");
        menuAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAjudaMouseClicked(evt);
            }
        });
        jMenuBar2.add(menuAjuda);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerenciarLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarLotesActionPerformed
        this.setVisible(false);
        new CrudLote().setVisible(true);
    }//GEN-LAST:event_btnGerenciarLotesActionPerformed

    private void btnGerenciarIndicadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarIndicadoresActionPerformed
        this.setVisible(false);
        new CrudIndicadores(ISA.categoriaList).setVisible(true);
    }//GEN-LAST:event_btnGerenciarIndicadoresActionPerformed

    private void btnVisualizarLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarLotesActionPerformed
        this.setVisible(false);
        new VisualizarLotes().setVisible(true);
    }//GEN-LAST:event_btnVisualizarLotesActionPerformed

    private void menuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSobreMouseClicked
        CardLayout cl = (CardLayout) cardPanel.getLayout();
        cl.show(cardPanel, "sobre");
        if (jMenuBar2.getComponents().length < 3) {
            jMenuBar2.add(menuVoltar);
            jMenuBar2.repaint();
        }
    }//GEN-LAST:event_menuSobreMouseClicked

    private void menuAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAjudaMouseClicked
        CardLayout cl = (CardLayout) cardPanel.getLayout();
        cl.show(cardPanel, "ajuda");
        if (jMenuBar2.getComponents().length < 3) {
            jMenuBar2.add(menuVoltar);
            jMenuBar2.repaint();
        }
    }//GEN-LAST:event_menuAjudaMouseClicked

    private void menuVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVoltarMouseClicked
        CardLayout cl = (CardLayout) cardPanel.getLayout();
        cl.show(cardPanel, "main");
        jMenuBar2.remove(menuVoltar);
        jMenuBar2.repaint();
    }//GEN-LAST:event_menuVoltarMouseClicked

    private void menuCalcularIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalcularIndiceActionPerformed
        this.setVisible(false);
        new VisualizarLotes().setVisible(true);
    }//GEN-LAST:event_menuCalcularIndiceActionPerformed

    private void menuGerenciarLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciarLotesActionPerformed
        this.setVisible(false);
        new CrudLote().setVisible(true);
    }//GEN-LAST:event_menuGerenciarLotesActionPerformed

    private void menuGerenciarIndicadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciarIndicadoresActionPerformed
        this.setVisible(false);
        new CrudIndicadores(ISA.categoriaList).setVisible(true);
    }//GEN-LAST:event_menuGerenciarIndicadoresActionPerformed

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuInicioActionPerformed

    private void menuGerenciarLotesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGerenciarLotesMousePressed
        this.setVisible(false);
        new CrudLote().setVisible(true);
    }//GEN-LAST:event_menuGerenciarLotesMousePressed

    private void menuGerenciarIndicadoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGerenciarIndicadoresMousePressed
        this.setVisible(false);
        new CrudIndicadores(ISA.categoriaList).setVisible(true);
    }//GEN-LAST:event_menuGerenciarIndicadoresMousePressed

    private void menuCalcularIndiceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCalcularIndiceMousePressed
        this.setVisible(false);
        new VisualizarLotes().setVisible(true);
    }//GEN-LAST:event_menuCalcularIndiceMousePressed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ajudaPanel;
    private javax.swing.JButton btnGerenciarIndicadores;
    private javax.swing.JButton btnGerenciarLotes;
    private javax.swing.JButton btnVisualizarLotes;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel lblMainTitle;
    private javax.swing.JLabel lblSobreTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCalcularIndice;
    private javax.swing.JMenu menuGerenciarIndicadores;
    private javax.swing.JMenu menuGerenciarLotes;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenu menuVoltar;
    private javax.swing.JPanel sobrePanel;
    // End of variables declaration//GEN-END:variables
}
