/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.isa.view;

import com.mycompany.isa.ISA;
import com.mycompany.isa.model.Indicador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.table.*;

/**
 *
 * @author naoki
 */
public class NovoModelo extends javax.swing.JPanel {
    private Indicador novoIndicador = new Indicador();
    boolean salvo = false;
    /**
     * Creates new form NovoModelo
     */
    public NovoModelo() {
        initAll();
    }
    
    public NovoModelo(Indicador modelo) {
        initAll();
        novoIndicador = modelo;
        lblNome.setText(modelo.getNome());
        atualizarTabela();
    }
    

    private void initAll() {
        initComponents();
        atualizarTabela();
//        mostrarDadosTela();
        
        header = tabIndicadores.getTableHeader();
        header.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent event) {
                if (event.getClickCount() > 1)
                    editColumnAt(event.getPoint());
            }
        });
        txtEditHeader.setBorder(null);
        
        renameColumnPopup = new JPopupMenu();
        renameColumnPopup.setBorder(new MatteBorder(0, 1, 1, 1, Color.DARK_GRAY));
        renameColumnPopup.add(txtEditHeader);
        
        renameCellPopup = new JPopupMenu();
        renameCellPopup.setBorder(new MatteBorder(0, 1, 1, 1, Color.DARK_GRAY));
        renameCellPopup.add(txtEditCell);
    }

//    private void mostrarDadosTela() {
//        int grupoSelecionado = tabIndicadores.getSelectedColumn();
//        int itemSelecionado = tabIndicadores.getSelectedRow();
//        txtNome.setText(novoIndicador.getNome());
//        if (grupoSelecionado == -1) {
//            txtGrupo.setText("");
//            cboxGrupo.setSelectedIndex(0);
//        } 
//        else {
//            txtGrupo.setText(novoIndicador.getGrupos().get(grupoSelecionado));
//            cboxGrupo.setSelectedIndex(0);
//        }
//    }
    
    private void atualizarTabela() {
        DefaultTableModel tableModel = (DefaultTableModel) tabIndicadores.getModel();
        tableModel.setColumnCount(0);
        String[][] valores = novoIndicador.getAllItemsArr();
        Object[] grupo = novoIndicador.getGrupos().toArray();
        for (int i = 0; i < grupo.length; i++) {
            tableModel.addColumn(grupo[i], valores[i]);
        }
        
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
	cellRender.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i=0; i<tabIndicadores.getColumnCount(); i++)
            tabIndicadores.getColumnModel().getColumn(i).setCellRenderer(cellRender);
    }
    
    public void atualizarCbox() {
        cboxGrupo.removeAllItems();
        for (String grupo : novoIndicador.getGrupos())
            cboxGrupo.addItem(grupo);
    }
    
    public void atualizarListaPelaTabela() {
        String[] columnArr = new String[tabIndicadores.getColumnCount()];
        for (int i = 0; i < tabIndicadores.getColumnCount(); i++) {
            columnArr[i] = tabIndicadores.getColumnName(i);
        }
        String[][] itemArr = new String[columnArr.length][];
        for (int i = 0; i < itemArr.length; i++) {
            for (int j = 0; j < tabIndicadores.getRowCount(); j++) {
                itemArr[i][j] = tabIndicadores.getValueAt(j, i).toString();
            }
        }
        novoIndicador = new Indicador(lblNome.getName(), columnArr, itemArr);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEditHeader = new javax.swing.JTextField();
        txtEditCell = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnAddGrupo = new javax.swing.JButton();
        txtGrupo = new javax.swing.JTextField();
        lblNovoGrupo = new javax.swing.JLabel();
        lblNovoIndicador = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        cboxGrupo = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        scrollTabela = new javax.swing.JScrollPane();
        tabIndicadores = new com.mycompany.isa.components.NotEditableJTable();
        lblNome = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnResetar = new javax.swing.JButton();

        txtEditHeader.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEditHeader.setText("jTextField1");
        txtEditHeader.setBorder(null);
        txtEditHeader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditHeaderActionPerformed(evt);
            }
        });

        txtEditCell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEditCell.setText("jTextField1");
        txtEditCell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditCellActionPerformed(evt);
            }
        });

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome da Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnAddGrupo.setText("Adicionar grupo à categoria");
        btnAddGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGrupoActionPerformed(evt);
            }
        });

        txtGrupo.setToolTipText("Escreva o nome do grupo");
        txtGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoActionPerformed(evt);
            }
        });

        lblNovoGrupo.setText("Novo Grupo");

        lblNovoIndicador.setText("Novo Indicador");

        txtItem.setToolTipText("Escreva o nome do indicador");
        txtItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemActionPerformed(evt);
            }
        });

        btnAddItem.setText("Adicionar indicador ao grupo");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        cboxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar grupo>" }));
        cboxGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxGrupoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        scrollTabela.setBackground(new java.awt.Color(255, 255, 204));
        scrollTabela.setForeground(new java.awt.Color(0, 204, 204));
        scrollTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabIndicadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabIndicadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabIndicadoresMouseClicked(evt);
            }
        });
        scrollTabela.setViewportView(tabIndicadores);

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome da Categoria");
        lblNome.setToolTipText("");

        btnVoltar.setText("Voltar");

        btnResetar.setText("Resetar");
        btnResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtItem)
                    .addComponent(cboxGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGrupo)
                    .addComponent(lblNovoGrupo)
                    .addComponent(lblNovoIndicador)
                    .addComponent(txtNome)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(btnVoltar)
                    .addComponent(btnResetar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNovoGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddGrupo)
                        .addGap(18, 18, 18)
                        .addComponent(lblNovoIndicador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnResetar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        getAccessibleContext().setAccessibleName("novoPanel");
    }// </editor-fold>//GEN-END:initComponents

    
    public boolean isSalvo() {
        return salvo;
    }
    
    public javax.swing.JButton getBtnVoltar() {
        return btnVoltar;
    }
    private void editColumnAt(Point p) {
        int columnIndex = header.columnAtPoint(p);

        if (columnIndex != -1){
            column = header.getColumnModel().getColumn(columnIndex);
            Rectangle columnRectangle = header.getHeaderRect(columnIndex);

            txtEditHeader.setText(column.getHeaderValue().toString());
            renameColumnPopup.setPreferredSize(
                new Dimension(columnRectangle.width, columnRectangle.height - 1));
            renameColumnPopup.show(header, columnRectangle.x, 0);

            txtEditHeader.requestFocusInWindow();
            txtEditHeader.selectAll();
        }
     }
    
    private void editCellAt(Point p) {
        cellColumn = tabIndicadores.columnAtPoint(p);
        cellRow = tabIndicadores.rowAtPoint(p);
        if (cellColumn != -1 && cellRow != -1){
            Rectangle cellRectangle = tabIndicadores.getCellRect(cellRow, cellColumn, true);
            txtEditCell.setText(tabIndicadores.getValueAt(cellRow, cellColumn).toString());
            renameCellPopup.setPreferredSize(
                new Dimension(cellRectangle.width, cellRectangle.height+2));
            renameCellPopup.show(tabIndicadores, cellRectangle.x, cellRectangle.height*cellRow-1);
//            Point location = renameCellPopup.getLocation();
//            renameCellPopup.setLocation(location.x, location.y*cellRow);

            txtEditCell.requestFocusInWindow();
            txtEditCell.selectAll();
        }
     }

    private void renameColumn() {
        String oldKey = column.getHeaderValue().toString();
        String newKey = txtEditHeader.getText();
        if (oldKey.equals(newKey)) return;
        novoIndicador.replaceGrupo(oldKey, newKey);
        renameColumnPopup.setVisible(false);
        atualizarTabela();
        atualizarCbox();
    }
    
    private void renameCell() {
        String oldValue = tabIndicadores.getValueAt(cellRow, cellColumn).toString();
        String newValue = txtEditCell.getText();
        String grupo = tabIndicadores.getColumnName(cellColumn);
        novoIndicador.removeItem(grupo, oldValue);
        novoIndicador.addItem(grupo, newValue);
        renameCellPopup.setVisible(false);
        atualizarTabela();
    }
    
    private void resetar() {
        novoIndicador = new Indicador();
        txtGrupo.setText("");
        txtItem.setText("");
        txtNome.setText("");
        lblNome.setText("Nome do modelo");
        cboxGrupo.removeAllItems();
        cboxGrupo.addItem("<Selecionar Grupo>");
        atualizarTabela();
    }
    private void btnAddGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGrupoActionPerformed
        if (txtGrupo.getText().isBlank()) {
            return;
        }
        String grupo = txtGrupo.getText();
        if (! novoIndicador.getItemMap().containsKey(grupo)){
            txtGrupo.setText("");
            novoIndicador.addGrupo(grupo);
            cboxGrupo.addItem(grupo);
            
        }
        atualizarTabela();
    }//GEN-LAST:event_btnAddGrupoActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        String grupo = (String) cboxGrupo.getSelectedItem();
        String item = txtItem.getText();
        if (novoIndicador.getItemMap().containsKey(grupo)) {
            if (! novoIndicador.getItens(grupo).contains(item)) {
                novoIndicador.addItem(grupo, item);
            }
        }
        txtItem.setText("");
        atualizarTabela();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void txtEditHeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditHeaderActionPerformed
        renameColumn();
    }//GEN-LAST:event_txtEditHeaderActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        lblNome.setText(txtNome.getText());
        novoIndicador.setNome(txtNome.getText());
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        txtNomeActionPerformed(null);
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoActionPerformed
        btnAddGrupoActionPerformed(evt);
    }//GEN-LAST:event_txtGrupoActionPerformed

    private void txtItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemActionPerformed
        btnAddItemActionPerformed(evt);
    }//GEN-LAST:event_txtItemActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (JOptionPane.showConfirmDialog(this, 
                "Tem certeza que deseja salvar?", 
                "Salvar?", 
                JOptionPane.YES_NO_OPTION)
                !=0) 
            return;
        if (novoIndicador.getNome().isBlank() ||
            novoIndicador.getGrupos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Falha ao salvar. Existem campos em branco", 
                    "Erro. Campo em branco", JOptionPane.ERROR_MESSAGE);
        } else {
            ISA.indicadoresList.add(novoIndicador);
            resetar();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetarActionPerformed
        if (JOptionPane.showConfirmDialog(this, 
                "Tem certeza que deseja resetar?", 
                "Resetar?", 
                JOptionPane.YES_NO_OPTION)
                !=0) 
            return;
        resetar();
    }//GEN-LAST:event_btnResetarActionPerformed

    private void txtEditCellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditCellActionPerformed
        renameCell();
    }//GEN-LAST:event_txtEditCellActionPerformed

    private void tabIndicadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabIndicadoresMouseClicked
        if (evt.getClickCount()>1) {
            editCellAt(evt.getPoint());
        }
    }//GEN-LAST:event_tabIndicadoresMouseClicked

    private void cboxGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxGrupoActionPerformed
    private int cellColumn, cellRow;
    private javax.swing.JPopupMenu renameCellPopup;
    private javax.swing.JPopupMenu renameColumnPopup;
    private javax.swing.table.TableColumn column;
    private javax.swing.table.JTableHeader header;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddGrupo;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnResetar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cboxGrupo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNovoGrupo;
    private javax.swing.JLabel lblNovoIndicador;
    private javax.swing.JScrollPane scrollTabela;
    private com.mycompany.isa.components.NotEditableJTable tabIndicadores;
    private javax.swing.JTextField txtEditCell;
    private javax.swing.JTextField txtEditHeader;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
