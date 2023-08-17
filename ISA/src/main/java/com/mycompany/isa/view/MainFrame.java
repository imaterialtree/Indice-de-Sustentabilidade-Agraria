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
        java.awt.GridBagConstraints gridBagConstraints;

        dialogSobre = new javax.swing.JDialog();
        sobrePanel = new javax.swing.JPanel();
        lblSobreTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cardPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        btnGerenciarLotes = new javax.swing.JButton();
        btnVisualizarLotes = new javax.swing.JButton();
        btnGerenciarIndicadores = new javax.swing.JButton();
        lblMainTitle = new javax.swing.JLabel();
        ajudaPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        standartMenuBar1 = new com.mycompany.isa.components.StandartMenuBar();
        menuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        lblSobreTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSobreTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSobreTitle.setText("Descrição do projeto");

        jTextPane1.setText("Aqui é onde estará a descrição sobre o Índice de Sustentabilidade Agrária\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Proin aliquam nunc sit amet turpis efficitur, id elementum quam lacinia. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Morbi placerat nibh sit amet arcu lobortis, pulvinar vehicula lacus tincidunt. Sed eget gravida lacus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Etiam posuere, velit sit amet consequat hendrerit, turpis sapien tristique nibh, placerat vulputate est lorem in ante. Phasellus tempor blandit dui, ac dictum arcu placerat ut. Quisque ultricies mollis vehicula. Nulla a ipsum vitae nulla fermentum tempus.\n");
        jTextPane1.setOpaque(false);
        jScrollPane1.setViewportView(jTextPane1);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        javax.swing.GroupLayout sobrePanelLayout = new javax.swing.GroupLayout(sobrePanel);
        sobrePanel.setLayout(sobrePanelLayout);
        sobrePanelLayout.setHorizontalGroup(
            sobrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSobreTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(sobrePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(sobrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sobrePanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(43, 43, 43)
                        .addComponent(jButton2)
                        .addGap(37, 37, 37)
                        .addComponent(jButton3)))
                .addGap(25, 25, 25))
        );
        sobrePanelLayout.setVerticalGroup(
            sobrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sobrePanelLayout.createSequentialGroup()
                .addComponent(lblSobreTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sobrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout dialogSobreLayout = new javax.swing.GroupLayout(dialogSobre.getContentPane());
        dialogSobre.getContentPane().setLayout(dialogSobreLayout);
        dialogSobreLayout.setHorizontalGroup(
            dialogSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
            .addGroup(dialogSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogSobreLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sobrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        dialogSobreLayout.setVerticalGroup(
            dialogSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
            .addGroup(dialogSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogSobreLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sobrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ISA-RURAL");
        setResizable(false);

        cardPanel.setLayout(new java.awt.CardLayout());

        btnGerenciarLotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGerenciarLotes.setText("Gerenciar lotes");
        btnGerenciarLotes.setMaximumSize(new java.awt.Dimension(118, 27));
        btnGerenciarLotes.setMinimumSize(new java.awt.Dimension(118, 27));
        btnGerenciarLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarLotesActionPerformed(evt);
            }
        });

        btnVisualizarLotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVisualizarLotes.setText("Índice de sustentabilidade");
        btnVisualizarLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarLotesActionPerformed(evt);
            }
        });

        btnGerenciarIndicadores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGerenciarIndicadores.setText("Gerenciar indicadores");
        btnGerenciarIndicadores.setMaximumSize(new java.awt.Dimension(118, 27));
        btnGerenciarIndicadores.setMinimumSize(new java.awt.Dimension(118, 27));
        btnGerenciarIndicadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarIndicadoresActionPerformed(evt);
            }
        });

        lblMainTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainTitle.setText("ÍNDICE DE SUSTENTABILIDADE DE ASSENTAMENTO");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMainTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnGerenciarIndicadores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGerenciarLotes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisualizarLotes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(180, 180, 180))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblMainTitle)
                .addGap(27, 27, 27)
                .addComponent(btnVisualizarLotes, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(btnGerenciarLotes, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGerenciarIndicadores, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        cardPanel.add(mainPanel, "main");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajuda");

        jTextPane2.setText("Aqui é onde estará um guia sobre o aplicativo");
        jScrollPane2.setViewportView(jTextPane2);

        javax.swing.GroupLayout ajudaPanelLayout = new javax.swing.GroupLayout(ajudaPanel);
        ajudaPanel.setLayout(ajudaPanelLayout);
        ajudaPanelLayout.setHorizontalGroup(
            ajudaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajudaPanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(ajudaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajudaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajudaPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        ajudaPanelLayout.setVerticalGroup(
            ajudaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajudaPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        cardPanel.add(ajudaPanel, "ajuda");

        menuAjuda.setText("Ajuda");

        jMenuItem1.setText("Ajuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAjuda.add(jMenuItem1);

        jMenuItem2.setText("Sobre");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuAjuda.add(jMenuItem2);

        standartMenuBar1.add(menuAjuda);

        setJMenuBar(standartMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dialogSobre.setVisible(true);
        dialogSobre.setLocationRelativeTo(menuAjuda);
        dialogSobre.setSize(380, 400);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CardLayout cl = (CardLayout) cardPanel.getLayout();
        cl.show(cardPanel, "ajuda");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JDialog dialogSobre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel lblMainTitle;
    private javax.swing.JLabel lblSobreTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JPanel sobrePanel;
    private com.mycompany.isa.components.StandartMenuBar standartMenuBar1;
    // End of variables declaration//GEN-END:variables
}
