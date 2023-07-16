/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.isa.view;

import com.mycompany.isa.ISA;
import com.mycompany.isa.model.Lote;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author naoki
 */
public class CrudLote extends javax.swing.JFrame {

//    List<Lote> loteList = new ArrayList<>();
    int indice = 0;
    
    public CrudLote() {
        initComponents();
        atualizarBotoes();
        if (! ISA.loteList.isEmpty()) {
            preencherTabela();
            tabLote.changeSelection(indice, 1, false, false);
        }
    }
    
    private void atualizarBotoes() {      
        btnRemover.setEnabled(indice!=-1);
        btnEditar.setEnabled(indice!=-1);
    }
    
    private void preencherTabela() {
        
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
	cellRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabLote.getColumnModel().getColumn(0).setPreferredWidth(100);  //Preferencia de largura medidad em pixels
        tabLote.getColumnModel().getColumn(1).setPreferredWidth(100);  
        tabLote.getColumnModel().getColumn(2).setPreferredWidth(100);  
        tabLote.getColumnModel().getColumn(3).setPreferredWidth(100);
        for (int i=0; i<tabLote.getColumnCount(); i++)
            tabLote.getColumnModel().getColumn(i).setCellRenderer(cellRender);
        
        DefaultTableModel modelo = (DefaultTableModel) tabLote.getModel();
        modelo.setNumRows(0);
        for (Lote lote: ISA.loteList) {
            modelo.addRow(new Object[]{
                lote.getNome(), 
                lote.getNumParcela(), 
                lote.getContato(), 
                lote.getCoordenada()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogEditar = new javax.swing.JDialog();
        txtNome_editar = new javax.swing.JTextField();
        txtNumParcela_editar = new javax.swing.JTextField();
        txtContato_editar = new javax.swing.JFormattedTextField();
        btnSalvar_editar = new javax.swing.JButton();
        btnCancelar_editar = new javax.swing.JButton();
        txtCoordenada_editar = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        lblCadTitulo = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        lblErro = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        scrollTabela = new javax.swing.JScrollPane();
        tabLote = new javax.swing.JTable();
        txtNumParcela = new javax.swing.JTextField();
        txtContato = new javax.swing.JFormattedTextField();
        btnLimpar = new javax.swing.JButton();
        txtCoordenada = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        dialogEditar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogEditar.setTitle("Editar");

        txtNome_editar.setBackground(new java.awt.Color(204, 255, 255));
        txtNome_editar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 153))); // NOI18N

        txtNumParcela_editar.setBackground(new java.awt.Color(204, 255, 255));
        txtNumParcela_editar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nº DA PARCELA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 153))); // NOI18N

        txtContato_editar.setBackground(new java.awt.Color(204, 255, 255));
        txtContato_editar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTATO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        try {
            txtContato_editar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnSalvar_editar.setBackground(new java.awt.Color(204, 255, 255));
        btnSalvar_editar.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        btnSalvar_editar.setForeground(new java.awt.Color(0, 153, 153));
        btnSalvar_editar.setText("Salvar");
        btnSalvar_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar_editarActionPerformed(evt);
            }
        });

        btnCancelar_editar.setBackground(new java.awt.Color(204, 255, 255));
        btnCancelar_editar.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        btnCancelar_editar.setForeground(new java.awt.Color(0, 153, 153));
        btnCancelar_editar.setText("Cancelar");
        btnCancelar_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_editarActionPerformed(evt);
            }
        });

        txtCoordenada_editar.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenada"));

        javax.swing.GroupLayout dialogEditarLayout = new javax.swing.GroupLayout(dialogEditar.getContentPane());
        dialogEditar.getContentPane().setLayout(dialogEditarLayout);
        dialogEditarLayout.setHorizontalGroup(
            dialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogEditarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(dialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCoordenada_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtContato_editar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(dialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome_editar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNumParcela_editar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dialogEditarLayout.createSequentialGroup()
                                .addComponent(btnSalvar_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(btnCancelar_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        dialogEditarLayout.setVerticalGroup(
            dialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogEditarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtNome_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNumParcela_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtContato_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCoordenada_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(dialogEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar_editar)
                    .addComponent(btnCancelar_editar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Lotes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        lblCadTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblCadTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadTitulo.setText("Gerenciar Lotes");

        btnSalvar.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lblErro.setForeground(new java.awt.Color(255, 0, 51));

        btnRemover.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        scrollTabela.setBackground(new java.awt.Color(255, 255, 204));
        scrollTabela.setForeground(new java.awt.Color(0, 204, 204));
        scrollTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabLote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Responsável", "Nº da parcela", "Contato", "Coordenada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabLote.setFocusable(false);
        tabLote.setShowGrid(false);
        tabLote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLoteMouseClicked(evt);
            }
        });
        tabLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabLoteKeyReleased(evt);
            }
        });
        scrollTabela.setViewportView(tabLote);

        txtNumParcela.setBorder(javax.swing.BorderFactory.createTitledBorder("nº da Parcela"));

        txtContato.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));
        try {
            txtContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txtCoordenada.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenada"));

        jButton1.setText("Home");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(262, 262, 262)
                        .addComponent(lblCadTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                            .addComponent(txtNumParcela, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtContato, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCoordenada))
                        .addGap(18, 18, 18)
                        .addComponent(scrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addComponent(lblErro, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(615, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblCadTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCoordenada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemover)
                            .addComponent(btnSalvar)
                            .addComponent(btnEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar))
                    .addComponent(scrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(lblErro)
                    .addContainerGap(351, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // check null fields
        if (txtNome.getText().isBlank() ||
            txtNumParcela.getText().isBlank() ||
            txtContato.getText().isBlank() ||
            txtCoordenada.getText().isBlank()
        ) {
            JOptionPane.showMessageDialog(
                this, "Preencha todos os campos", 
                "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
          
        Lote lote = new Lote();
        
        lote.setNome(txtNome.getText());
        lote.setNumParcela(txtNumParcela.getText());
        lote.setContato(txtContato.getText());
        lote.setCoordenada(txtCoordenada.getText());
        ISA.loteList.add(lote);

        indice = ISA.loteList.size()-1;
        preencherTabela();
        tabLote.changeSelection(indice, 1, false, false);
        atualizarBotoes();
        btnLimparActionPerformed(evt);
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    int editing_row;
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editing_row = tabLote.getSelectedRow();
        Lote lote = ISA.loteList.get(editing_row);
        
        txtNome_editar.setText(lote.getNome());
        txtNumParcela_editar.setText(lote.getNumParcela());
        txtContato_editar.setText(lote.getContato());
        txtCoordenada_editar.setText(lote.getCoordenada());
        
        dialogEditar.setSize(390, 370);
        dialogEditar.setLocationRelativeTo(null);
        dialogEditar.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed

        if (0!=JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir?", "Confirmar exclusão", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION)) {
            return;
        }
        ISA.loteList.remove(indice);
        indice += (indice>0 || ISA.loteList.isEmpty()) ? -1 : 0;
        preencherTabela();
        tabLote.changeSelection(indice, 1, false, false);
        atualizarBotoes();

    }//GEN-LAST:event_btnRemoverActionPerformed

    private void tabLoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLoteMouseClicked
        indice = tabLote.getSelectedRow();
        atualizarBotoes();
    }//GEN-LAST:event_tabLoteMouseClicked

    private void tabLoteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabLoteKeyReleased
        indice = tabLote.getSelectedRow();
        atualizarBotoes();
    }//GEN-LAST:event_tabLoteKeyReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO export to JSON
        getWindows()[0].setVisible(true);
        JOptionPane.showMessageDialog(getWindows()[0], "Dados salvos");
    }//GEN-LAST:event_formWindowClosed

    private void btnSalvar_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar_editarActionPerformed
        // check null fields
        if (txtNome_editar.getText().isBlank() ||
            txtNumParcela_editar.getText().isBlank() ||
            txtContato_editar.getText().isBlank() ||
            txtCoordenada_editar.getText().isBlank()
        ) {
            JOptionPane.showMessageDialog(
                this, "Preencha todos os campos", 
                "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Lote lote = new Lote();
        lote.setNome(txtNome_editar.getText());
        lote.setNumParcela(txtNumParcela_editar.getText());
        lote.setContato(txtContato_editar.getText());
        lote.setCoordenada(txtCoordenada_editar.getText());
        
        ISA.loteList.remove(editing_row);
        ISA.loteList.add(editing_row, lote);
        preencherTabela();
        dialogEditar.dispose();
    }//GEN-LAST:event_btnSalvar_editarActionPerformed

    private void btnCancelar_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_editarActionPerformed
        dialogEditar.dispose();
    }//GEN-LAST:event_btnCancelar_editarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtNumParcela.setText("");
        txtContato.setText("");
        txtCoordenada.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(CrudLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudLote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_editar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar_editar;
    private javax.swing.JDialog dialogEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadTitulo;
    private javax.swing.JLabel lblErro;
    private javax.swing.JScrollPane scrollTabela;
    private javax.swing.JTable tabLote;
    private javax.swing.JFormattedTextField txtContato;
    private javax.swing.JFormattedTextField txtContato_editar;
    private javax.swing.JFormattedTextField txtCoordenada;
    private javax.swing.JFormattedTextField txtCoordenada_editar;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome_editar;
    private javax.swing.JTextField txtNumParcela;
    private javax.swing.JTextField txtNumParcela_editar;
    // End of variables declaration//GEN-END:variables
}
