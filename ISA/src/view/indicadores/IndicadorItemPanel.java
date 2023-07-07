/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.indicadores;

import java.awt.Color;
import javax.swing.JTextField;

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
    }
    String indicadorNome;
    public IndicadorItemPanel(int tab, int row, String indicadorNome) {
        this.indicadorNome = indicadorNome;
        this.tab = tab;
        this.row = row;
        initComponents();
        double value = IndicadoresFrame.lote.getScore(tab, row);
        txtValorItem.setText(String.valueOf(value));
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
        txtValorItem = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        lblNomeItem.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblNomeItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNomeItem.setText(indicadorNome);
        lblNomeItem.setIconTextGap(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 3.0;
        add(lblNomeItem, gridBagConstraints);

        txtValorItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorItem.setText("0,00");
        txtValorItem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorItemFocusLost(evt);
            }
        });
        txtValorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorItemActionPerformed(evt);
            }
        });
        txtValorItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorItemKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 2.0;
        add(txtValorItem, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorItemActionPerformed
        checkValue();
    }//GEN-LAST:event_txtValorItemActionPerformed

    private void txtValorItemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorItemFocusLost
        checkValue();
    }//GEN-LAST:event_txtValorItemFocusLost

    private void txtValorItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorItemKeyReleased
        updateTxtColor();
    }//GEN-LAST:event_txtValorItemKeyReleased

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
    private javax.swing.JTextField txtValorItem;
    // End of variables declaration//GEN-END:variables
}
