/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.isa.view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author naoki
 */
public class AjudaFrame extends javax.swing.JFrame {

    String htmlAjudaLote;
    String htmlAjudaCategoria;
    String htmlAjudaIndice;
    /**
     * Creates new form AjudaFrame
     */
    public AjudaFrame() {
        try {
            this.htmlAjudaLote = Files.readString(Path.of("src/main/resources/html/ajuda_gerenciar-lotes.html"));
            this.htmlAjudaCategoria = Files.readString(Path.of("src/main/resources/html/ajuda_gerenciar-categorias.html"));
            this.htmlAjudaIndice = Files.readString(Path.of("src/main/resources/html/ajuda_indice-de-sustentabilidade.html"));
        } catch (IOException ex) {
            Logger.getLogger(AjudaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        lblLotes.setText(htmlAjudaLote);
        lblCategoria.setText(htmlAjudaCategoria);
        lblIndice.setText(htmlAjudaIndice);
    }
    
    public void refresh() {
        remove(jTabbedPane1);
        initComponents();
        lblLotes.setText(htmlAjudaLote);
        lblCategoria.setText(htmlAjudaCategoria);
        lblIndice.setText(htmlAjudaIndice);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        scrollIndice = new javax.swing.JScrollPane();
        scrollablePanel1 = new com.mycompany.isa.components.ScrollablePanel();
        lblIndice = new javax.swing.JLabel();
        scrollCategoria = new javax.swing.JScrollPane();
        scrollablePanel3 = new com.mycompany.isa.components.ScrollablePanel();
        lblCategoria = new javax.swing.JLabel();
        scrollLotes = new javax.swing.JScrollPane();
        scrollablePanel2 = new com.mycompany.isa.components.ScrollablePanel();
        lblLotes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ISA-RURAL - Guia do Usuário");
        setName("ajuda"); // NOI18N
        setType(java.awt.Window.Type.POPUP);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(520, 400));

        scrollIndice.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollIndice.setPreferredSize(new java.awt.Dimension(520, 18));

        scrollablePanel1.setScrollableWidth(com.mycompany.isa.components.ScrollablePanel.ScrollableSizeHint.FIT);

        lblIndice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndice.setText("label");
        lblIndice.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout scrollablePanel1Layout = new javax.swing.GroupLayout(scrollablePanel1);
        scrollablePanel1.setLayout(scrollablePanel1Layout);
        scrollablePanel1Layout.setHorizontalGroup(
            scrollablePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIndice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        scrollablePanel1Layout.setVerticalGroup(
            scrollablePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIndice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        scrollIndice.setViewportView(scrollablePanel1);

        jTabbedPane1.addTab("Índice de Sustentabilidade", scrollIndice);

        scrollCategoria.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        scrollablePanel3.setScrollableWidth(com.mycompany.isa.components.ScrollablePanel.ScrollableSizeHint.FIT);

        lblCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoria.setText("jLabel1");
        lblCategoria.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout scrollablePanel3Layout = new javax.swing.GroupLayout(scrollablePanel3);
        scrollablePanel3.setLayout(scrollablePanel3Layout);
        scrollablePanel3Layout.setHorizontalGroup(
            scrollablePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );
        scrollablePanel3Layout.setVerticalGroup(
            scrollablePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollablePanel3Layout.createSequentialGroup()
                .addComponent(lblCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 49, Short.MAX_VALUE))
        );

        scrollCategoria.setViewportView(scrollablePanel3);

        jTabbedPane1.addTab("Gerenciar Categorias", scrollCategoria);

        scrollLotes.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollLotes.setPreferredSize(new java.awt.Dimension(520, 18));

        scrollablePanel2.setScrollableWidth(com.mycompany.isa.components.ScrollablePanel.ScrollableSizeHint.FIT);

        lblLotes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLotes.setText(htmlAjudaLote);
        lblLotes.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout scrollablePanel2Layout = new javax.swing.GroupLayout(scrollablePanel2);
        scrollablePanel2.setLayout(scrollablePanel2Layout);
        scrollablePanel2Layout.setHorizontalGroup(
            scrollablePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        scrollablePanel2Layout.setVerticalGroup(
            scrollablePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollablePanel2Layout.createSequentialGroup()
                .addComponent(lblLotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        scrollLotes.setViewportView(scrollablePanel2);

        jTabbedPane1.addTab("Gerenciar Lotes", scrollLotes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AjudaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjudaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjudaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjudaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjudaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblIndice;
    private javax.swing.JLabel lblLotes;
    private javax.swing.JScrollPane scrollCategoria;
    private javax.swing.JScrollPane scrollIndice;
    private javax.swing.JScrollPane scrollLotes;
    private com.mycompany.isa.components.ScrollablePanel scrollablePanel1;
    private com.mycompany.isa.components.ScrollablePanel scrollablePanel2;
    private com.mycompany.isa.components.ScrollablePanel scrollablePanel3;
    // End of variables declaration//GEN-END:variables
}
