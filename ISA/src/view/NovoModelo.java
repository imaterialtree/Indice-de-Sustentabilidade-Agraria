/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Map;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.table.*;
import model.IndicadoresModelo;

/**
 *
 * @author naoki
 */
public class NovoModelo extends javax.swing.JPanel {
    IndicadoresModelo novoIndicador = new IndicadoresModelo();
    /**
     * Creates new form NovoModelo
     */
    public NovoModelo() {
        initAll();
    }
    
    public NovoModelo(IndicadoresModelo modelo) {
        initAll();
        novoIndicador = modelo;
        lblNome.setText(modelo.getNome());
        preencherTabela();
    }
    

    private void initAll() {
        initComponents();
        preencherTabela();
        mostrarDadosTela();
        
        header = tabIndicadores.getTableHeader();
        header.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent event) {
                if (event.getClickCount() > 1)
                    editColumnAt(event.getPoint());
            }
        });
        txtEditHeader.setBorder(null);
        
        renamePopup = new JPopupMenu();
        renamePopup.setBorder(new MatteBorder(0, 1, 1, 1, Color.DARK_GRAY));
        renamePopup.add(txtEditHeader);
    }

    private void mostrarDadosTela() {
        int grupoSelecionado = tabIndicadores.getSelectedColumn();
        int itemSelecionado = tabIndicadores.getSelectedRow();
        txtNome.setText(novoIndicador.getNome());
        if (grupoSelecionado == -1) {
            txtGrupo.setText("");
            cboxGrupo.setSelectedIndex(0);
        } 
        else {
            txtGrupo.setText(novoIndicador.getGrupos().get(grupoSelecionado));
            cboxGrupo.setSelectedIndex(0);
        }
    }
    private void preencherTabela() {
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
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEditHeader = new javax.swing.JTextField();
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
        tabIndicadores = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();

        txtEditHeader.setText("jTextField1");
        txtEditHeader.setBorder(null);
        txtEditHeader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditHeaderActionPerformed(evt);
            }
        });

        txtNome.setBackground(new java.awt.Color(204, 255, 255));
        txtNome.setForeground(new java.awt.Color(0, 153, 153));
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do modelo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnAddGrupo.setBackground(new java.awt.Color(204, 255, 255));
        btnAddGrupo.setForeground(new java.awt.Color(0, 153, 153));
        btnAddGrupo.setText("Adicionar Grupo ao modelo");
        btnAddGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGrupoActionPerformed(evt);
            }
        });

        txtGrupo.setBackground(new java.awt.Color(204, 255, 255));
        txtGrupo.setForeground(new java.awt.Color(0, 153, 153));
        txtGrupo.setToolTipText("Escreva o nome do grupo");

        lblNovoGrupo.setForeground(new java.awt.Color(0, 153, 153));
        lblNovoGrupo.setText("Novo grupo");

        lblNovoIndicador.setForeground(new java.awt.Color(0, 153, 153));
        lblNovoIndicador.setText("Novo indicador");

        txtItem.setBackground(new java.awt.Color(204, 255, 255));
        txtItem.setForeground(new java.awt.Color(0, 153, 153));
        txtItem.setToolTipText("Escreva o nome do indicador");

        btnAddItem.setBackground(new java.awt.Color(204, 255, 255));
        btnAddItem.setForeground(new java.awt.Color(0, 153, 153));
        btnAddItem.setText("Adicionar indicador ao grupo");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        cboxGrupo.setBackground(new java.awt.Color(204, 255, 255));
        cboxGrupo.setForeground(new java.awt.Color(0, 153, 153));
        cboxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar Grupo>" }));

        btnSalvar.setBackground(new java.awt.Color(204, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 153, 153));
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
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabIndicadores.setToolTipText("Clique duas vezes para editar");
        tabIndicadores.setShowGrid(false);
        tabIndicadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabIndicadoresMouseClicked(evt);
            }
        });
        scrollTabela.setViewportView(tabIndicadores);

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome do modelo");
        lblNome.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtItem, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboxGrupo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddGrupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNovoGrupo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNovoIndicador, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editColumnAt(Point p) {
        int columnIndex = header.columnAtPoint(p);

        if (columnIndex != -1){
            column = header.getColumnModel().getColumn(columnIndex);
            Rectangle columnRectangle = header.getHeaderRect(columnIndex);

            txtEditHeader.setText(column.getHeaderValue().toString());
            renamePopup.setPreferredSize(
                new Dimension(columnRectangle.width, columnRectangle.height - 1));
            renamePopup.show(header, columnRectangle.x, 0);

            txtEditHeader.requestFocusInWindow();
            txtEditHeader.selectAll();
        }
     }

    private void renameColumn() {
        column.setHeaderValue(txtEditHeader.getText());
        renamePopup.setVisible(false);
        header.repaint();
    }
  
    private void btnAddGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGrupoActionPerformed
        if (txtGrupo.getText().isBlank()) {
            return;
        }
        String grupo = txtGrupo.getText();
        txtGrupo.setText("");
        if (! novoIndicador.getIndicadores().containsKey(grupo)){
            novoIndicador.addGrupo(grupo);
            cboxGrupo.addItem(grupo);
        }
        preencherTabela();
    }//GEN-LAST:event_btnAddGrupoActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        String grupo = (String) cboxGrupo.getSelectedItem();
        String item = txtItem.getText();
        if (novoIndicador.getIndicadores().containsKey(grupo)) {
            if (! novoIndicador.getItens(grupo).contains(item)) {
                novoIndicador.addItem(grupo, item);
            }
        }
        preencherTabela();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void tabIndicadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabIndicadoresMouseClicked
        if (evt.getClickCount() > 1) {
            int rowIndex = tabIndicadores.rowAtPoint(evt.getPoint());
            if (rowIndex < 0) {
                
            } 
            else {
                
            }
        }
    }//GEN-LAST:event_tabIndicadoresMouseClicked

    private void txtEditHeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditHeaderActionPerformed
        column.setHeaderValue(txtEditHeader.getText());
        renamePopup.setVisible(false);
        header.repaint();
    }//GEN-LAST:event_txtEditHeaderActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        lblNome.setText(txtNome.getText());
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        CrudModelo pai = (CrudModelo) this.getParent();
        pai.modeloList.add(novoIndicador);
        pai.preencherLista();
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    private javax.swing.JPopupMenu renamePopup;
    private javax.swing.table.TableColumn column;
    private javax.swing.table.JTableHeader header;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddGrupo;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cboxGrupo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNovoGrupo;
    private javax.swing.JLabel lblNovoIndicador;
    private javax.swing.JScrollPane scrollTabela;
    private javax.swing.JTable tabIndicadores;
    private javax.swing.JTextField txtEditHeader;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
