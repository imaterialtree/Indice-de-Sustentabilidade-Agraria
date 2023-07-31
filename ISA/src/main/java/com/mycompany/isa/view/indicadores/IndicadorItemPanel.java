 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.isa.view.indicadores;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author naoki
 */
public class IndicadorItemPanel extends javax.swing.JPanel {
    Double[] qualidade = {7., 3.5, 0.};
    Color[] qCor = {Color.GREEN, Color.YELLOW, Color.RED};
    Color[] backCor = {new Color(150, 255, 150), new Color(255, 255, 150), new Color(255, 150, 150)};
    
    int tab, row;
    /**
     * Creates new form IndicadoresPanel
     */
    public IndicadorItemPanel() {
        indicadorNome = "Sem nome";
        initComponents();
        System.out.println("hello");
    }
    String indicadorNome;
    public IndicadorItemPanel(int tab, int row, String indicadorNome) {
        this.indicadorNome = indicadorNome;
        this.tab = tab;
        this.row = row;
        initComponents();
        initAll();
    }
    
    private void initAll() {
        double value = IndicadoresFrame.lote.getScore(tab, row);
        txtValorItem.setText(String.valueOf(value));
        checkValue();  
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

        lblNomeItem = new javax.swing.JLabel();
        txtValorItem = new javax.swing.JFormattedTextField();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        lblNomeItem.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblNomeItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNomeItem.setText("<html><p style=\"width:250px\">"+indicadorNome+"</p></html>");
        lblNomeItem.setIconTextGap(1);

        txtValorItem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.0"))));
        txtValorItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorItem.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblNomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(txtValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblNomeItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkValue() {
        Double valor = 0.0;
        try {
            valor = Double.valueOf(txtValorItem.getText().replace(",", "."));
            if (valor > 10 || valor < 0) {
                valor = 0d;
            }
        } catch (NumberFormatException e) {
        }
        IndicadoresFrame.lote.setScore(tab, row, valor);
        txtValorItem.setText(String.format("%.2f", valor));
        updateTxtColor();
        IndicadoresFrame.lote.setScore(tab, row, valor);
    }
    public void updateTxtColor() {
        Double valor;
        try {
            valor = Double.valueOf(txtValorItem.getText().replace(",", "."));
        } catch (NumberFormatException e) {
            txtValorItem.setBackground(Color.WHITE);
            txtValorItem.setForeground(Color.RED);
            return;
        }
        if (valor < 0 || valor > 10) {
            txtValorItem.setBackground(Color.WHITE);
            txtValorItem.setForeground(Color.RED);
            return;
        }
        for (int i=0; i<qualidade.length; i++) {
            if (valor >= qualidade[i]) {
                txtValorItem.setBackground(backCor[i]);
                txtValorItem.setForeground(qCor[i].darker());
                break;
            }
        }
    }
    
    public JTextField getTxtValorItem() {
        return txtValorItem;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblNomeItem;
    private javax.swing.JFormattedTextField txtValorItem;
    // End of variables declaration//GEN-END:variables
}
