/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.isa.view;

import com.mycompany.isa.ISA;
import com.mycompany.isa.model.Indicador;
import java.awt.CardLayout;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author naoki
 */
public class CrudIndicadores extends javax.swing.JFrame {
//    List<IndicadoresModelo> ISA.indicadoresList = new ArrayList<>();
    NovoModelo novoModeloPanel;
    CardLayout cl;
    int indice = 0;
    
    public CrudIndicadores() {
        initAll();
    }
    
    public CrudIndicadores(List<Indicador> indicadores) {
        ISA.indicadoresList = indicadores;
        initAll();
        
    }
    
    private void initAll() {
        initComponents();
        cl = (CardLayout) cardPanel.getLayout();
        preencherLista();
        preencherTabela(0);
        tabModelo.changeSelection(0, 1, false, false);
        jListModelos.setSelectedIndex(0);
        
        novoModeloPanel = new NovoModelo();
        cardPanel.add(novoModeloPanel, "new");
        novoModeloPanel.getBtnVoltar().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preencherLista();
                cl.show(cardPanel, "home");
            }
        });
    }
    
    void preencherLista() {
        DefaultListModel resultList = new DefaultListModel();
        for (Indicador i : ISA.indicadoresList) {
            resultList.addElement(i.getNome());
        }
        jListModelos.setModel(resultList);
    }
    void preencherTabela(int indice) {
        DefaultTableModel tableModel = new DefaultTableModel();
        if (ISA.indicadoresList.size()<1) {
            lblNomeModelo.setText("");
            tabModelo.setModel(tableModel);
        };
        
        lblNomeModelo.setText(ISA.indicadoresList.get(indice).getNome());
        tableModel.setNumRows(0);
        for (Map.Entry grupo: ISA.indicadoresList.get(indice).getItemMap().entrySet()) {
            tableModel.addColumn(grupo.getKey(), ((List<String>) grupo.getValue()).toArray());
        }
        tabModelo.setModel(tableModel);
    }
    
    /**
     * Creates new form CadastrarModelo
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListModelos = new javax.swing.JList<>();
        lblNomeModelo = new javax.swing.JLabel();
        scrollTabela1 = new javax.swing.JScrollPane();
        tabModelo = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Modelos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        cardPanel.setLayout(new java.awt.CardLayout());

        jListModelos.setBorder(null);
        jListModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListModelosMouseClicked(evt);
            }
        });
        jListModelos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListModelosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jListModelos);

        lblNomeModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeModelo.setText("Nome da Categoria");
        lblNomeModelo.setToolTipText("");

        scrollTabela1.setBackground(new java.awt.Color(255, 255, 204));
        scrollTabela1.setForeground(new java.awt.Color(0, 204, 204));
        scrollTabela1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabModelo.setEnabled(false);
        tabModelo.setRowSelectionAllowed(false);
        tabModelo.setShowGrid(true);
        tabModelo.setShowHorizontalLines(false);
        scrollTabela1.setViewportView(tabModelo);

        btnEditar.setText("Editar");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Categorias");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(homePanelLayout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(123, 123, 123)))
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNomeModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabela1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeModelo)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcluir)
                            .addComponent(btnEditar)
                            .addComponent(btnNovo)))
                    .addComponent(scrollTabela1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        cardPanel.add(homePanel, "home");
        homePanel.getAccessibleContext().setAccessibleName("homePanel");

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
  
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO export JSON
        getWindows()[0].setVisible(true);
//        JOptionPane.showMessageDialog(getWindows()[0], "Dados salvos");
    }//GEN-LAST:event_formWindowClosed

    private void jListModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListModelosMouseClicked
        indice = jListModelos.getSelectedIndex();
        preencherTabela(indice);
    }//GEN-LAST:event_jListModelosMouseClicked

    private void jListModelosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListModelosKeyPressed
        indice = jListModelos.getSelectedIndex();
        preencherTabela(indice);
    }//GEN-LAST:event_jListModelosKeyPressed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        cl.show(cardPanel, "new");
        novoModeloPanel.salvo = false;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (0!=JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir?", "Confirmar exclusão", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION)) {
            return;
        }
        ISA.indicadoresList.remove(jListModelos.getSelectedIndex());
        preencherLista();
        preencherTabela(-1);
    }//GEN-LAST:event_btnExcluirActionPerformed
    
    
   
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
            java.util.logging.Logger.getLogger(CrudIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudIndicadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListModelos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNomeModelo;
    private javax.swing.JScrollPane scrollTabela1;
    private javax.swing.JTable tabModelo;
    // End of variables declaration//GEN-END:variables
}
