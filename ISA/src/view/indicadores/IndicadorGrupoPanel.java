/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.indicadores;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class IndicadorGrupoPanel extends javax.swing.JPanel {

    String grupoNome = "Sem Nome";
    int rows = 0;
    Double[] itensValor;
    /**
     * Creates new form IndicadorGrupoPanel
     */
    public IndicadorGrupoPanel() {
        initComponents();
    }
    
    public IndicadorGrupoPanel(String nome, String[] items) {
        grupoNome = nome;
        rows = items.length;
        itensValor = new Double[rows];
        Arrays.fill(itensValor, 0.);
        initComponents();
        for (int i=0; i<items.length; i++) {
            IndicadorItemPanel item = new IndicadorItemPanel(items[i]);
            item.getTxtValorItem().setName(String.valueOf(i));
            item.getTxtValorItem().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextField txt = (JTextField) evt.getComponent();
                updateTxtColor(txt);
                try {
                    int txtIndex = Integer.parseInt(txt.getName());
                    itensValor[txtIndex] = Double.valueOf(txt.getText());
                } catch (NumberFormatException e) {
                }
                calcularMedia();
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTextField txt = (JTextField) evt.getComponent();
                updateTxtColor(txt);
                try {
                    int txtIndex = Integer.parseInt(txt.getName());
                    itensValor[txtIndex] = Double.valueOf(txt.getText());
                } catch (NumberFormatException e) {
                }
                calcularMedia();
            }
        });
            itemsPanel.add(item);
            item.setVisible(true);
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblGrupoNome = new javax.swing.JLabel();
        itemsPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblNumGrupo = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblGrupoNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrupoNome.setText(grupoNome      );
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 9);
        jPanel1.add(lblGrupoNome, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(jPanel1, gridBagConstraints);

        itemsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemsPanel.setLayout(new java.awt.GridLayout(rows, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        add(itemsPanel, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.GridBagLayout());

        lblNumGrupo.setText("0.00");
        jPanel5.add(lblNumGrupo, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        add(jPanel5, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void calcularMedia() {
        Double media = Arrays.stream(itensValor).mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
        lblNumGrupo.setText(String.format("%.2f", media));
    }
    
    private void updateTxtColor(JTextField txt) {
        Double[] qualidade = {7., 3.5, 0.};
        Color[] qCor = {Color.GREEN, Color.YELLOW, Color.RED};
        Double valor;
        try {
            valor = Double.valueOf(txt.getText().replace(",", "."));
        } catch (NumberFormatException e) {
            txt.setBackground(Color.WHITE);
            txt.setForeground(Color.RED);
            return;
        }
        if (valor < 0 || valor > 10) {
            txt.setBackground(Color.WHITE);
            txt.setForeground(Color.RED);
            return;
        }
        for (int i=0; i<qualidade.length; i++) {
            if (valor >= qualidade[i]) {
                txt.setBackground(qCor[i].brighter());
                txt.setForeground(qCor[i].darker());
                break;
            }
        }
    }
    
    public JLabel getLblNumGrupo() {
        return lblNumGrupo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel itemsPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblGrupoNome;
    private javax.swing.JLabel lblNumGrupo;
    // End of variables declaration//GEN-END:variables
}
