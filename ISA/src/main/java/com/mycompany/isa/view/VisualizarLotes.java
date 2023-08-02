/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.isa.view;

import com.mycompany.isa.ISA;
import com.mycompany.isa.model.Lote;
import com.mycompany.isa.view.indicadores.IndicadoresFrame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;

/**
 *
 * @author naoki
 */
public class VisualizarLotes extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarLotes
     */
    public VisualizarLotes() {
        initComponents();
        scrollAssentamento.getVerticalScrollBar().setUnitIncrement(10);
        preencherLista();
        if (ISA.loteList.isEmpty()) {
            btnPropriedades.setEnabled(false);
            btnVisualizar.setEnabled(false);
        } else 
            jListModelos.setSelectedIndex(0);
    }
    
    private void preencherLista() {
        DefaultListModel resultList = new DefaultListModel();
        for (Lote lote : ISA.loteList) {
            String loteString = String.format("<html>"
                    + "<b>Assentamento:</b> %s <br>"
                    + "<b>Responsável:</b> \t%s <br>"
                    + "<b>Parcela:</b>     \t%s</html>",
                    lote.getAssentamento(), lote.getResponsavel(), lote.getNumParcela());
            resultList.addElement(loteString);
        }
        jListModelos.setModel(resultList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogPropriedades = new javax.swing.JDialog();
        panelPropriedades = new javax.swing.JPanel();
        txtContato = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtNumParcela = new javax.swing.JTextField();
        panelCoordenada = new javax.swing.JPanel();
        lblCoordenadaX = new javax.swing.JLabel();
        lblCoordenadaY = new javax.swing.JLabel();
        txtCoordenadaX = new javax.swing.JFormattedTextField();
        txtCoordenadaY = new javax.swing.JFormattedTextField();
        txtAssentamento = new javax.swing.JTextField();
        txtIndiceDeSustentabilidade = new javax.swing.JTextField();
        dialogAssentamentos = new javax.swing.JDialog();
        scrollAssentamento = new javax.swing.JScrollPane();
        panelAssentamentos = new javax.swing.JPanel();
        lblAssentamentosTable = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListModelos = new javax.swing.JList<>();
        btnVisualizar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnPropriedades = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        dialogPropriedades.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogPropriedades.setTitle("Propriedades do lote");
        dialogPropriedades.setResizable(false);

        txtContato.setEditable(false);
        txtContato.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));
        try {
            txtContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtNome.setEditable(false);
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Responsável"));

        txtNumParcela.setEditable(false);
        txtNumParcela.setBorder(javax.swing.BorderFactory.createTitledBorder("N° da parcela"));

        panelCoordenada.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenadas"));

        lblCoordenadaX.setText("Latitude");

        lblCoordenadaY.setText("Longitude");

        txtCoordenadaX.setEditable(false);
        txtCoordenadaX.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txtCoordenadaY.setEditable(false);
        txtCoordenadaY.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout panelCoordenadaLayout = new javax.swing.GroupLayout(panelCoordenada);
        panelCoordenada.setLayout(panelCoordenadaLayout);
        panelCoordenadaLayout.setHorizontalGroup(
            panelCoordenadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCoordenadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCoordenadaX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCoordenadaX, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCoordenadaY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCoordenadaLayout.setVerticalGroup(
            panelCoordenadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCoordenadaLayout.createSequentialGroup()
                .addGroup(panelCoordenadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoordenadaX)
                    .addComponent(lblCoordenadaY)
                    .addComponent(txtCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtAssentamento.setEditable(false);
        txtAssentamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Assentamento"));

        txtIndiceDeSustentabilidade.setEditable(false);
        txtIndiceDeSustentabilidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Índice de Sustentabilidade"));

        javax.swing.GroupLayout panelPropriedadesLayout = new javax.swing.GroupLayout(panelPropriedades);
        panelPropriedades.setLayout(panelPropriedadesLayout);
        panelPropriedadesLayout.setHorizontalGroup(
            panelPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPropriedadesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumParcela, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtContato)
                    .addComponent(panelCoordenada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAssentamento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIndiceDeSustentabilidade))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelPropriedadesLayout.setVerticalGroup(
            panelPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPropriedadesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAssentamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNumParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelCoordenada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIndiceDeSustentabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dialogPropriedadesLayout = new javax.swing.GroupLayout(dialogPropriedades.getContentPane());
        dialogPropriedades.getContentPane().setLayout(dialogPropriedadesLayout);
        dialogPropriedadesLayout.setHorizontalGroup(
            dialogPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPropriedades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogPropriedadesLayout.setVerticalGroup(
            dialogPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPropriedades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelAssentamentos.setLayout(new java.awt.GridBagLayout());

        lblAssentamentosTable.setText("tabela de assentamentos");
        panelAssentamentos.add(lblAssentamentosTable, new java.awt.GridBagConstraints());

        scrollAssentamento.setViewportView(panelAssentamentos);

        javax.swing.GroupLayout dialogAssentamentosLayout = new javax.swing.GroupLayout(dialogAssentamentos.getContentPane());
        dialogAssentamentos.getContentPane().setLayout(dialogAssentamentosLayout);
        dialogAssentamentosLayout.setHorizontalGroup(
            dialogAssentamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollAssentamento, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        dialogAssentamentosLayout.setVerticalGroup(
            dialogAssentamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollAssentamento, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Índice de Sustentabilidade Agrária");
        setResizable(false);

        jListModelos.setBorder(null);
        jListModelos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jListModelos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListModelosMouseClicked(evt);
            }
        });
        jListModelos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jListModelosKeyTyped(evt);
            }
        });
        jListModelos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListModelosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListModelos);

        btnVisualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVisualizar.setText("Calcular índice de sustentabilidade");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Escolha um Lote");

        btnPropriedades.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPropriedades.setText("Ver propriedades do lote");
        btnPropriedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPropriedadesActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jToggleButton1.setText("Índice dos assentamentos");
        jToggleButton1.setMaximumSize(new java.awt.Dimension(111, 27));
        jToggleButton1.setMinimumSize(new java.awt.Dimension(111, 27));
        jToggleButton1.setPreferredSize(new java.awt.Dimension(111, 27));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPropriedades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPropriedades, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        int selected = jListModelos.getSelectedIndex();
        if (selected==-1) return;
        
        new IndicadoresFrame(ISA.loteList.get(selected)).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnPropriedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPropriedadesActionPerformed
        int selected = jListModelos.getSelectedIndex();
        if (selected==-1) return;
        Lote lote = ISA.loteList.get(selected);
        
        txtAssentamento.setText(lote.getAssentamento());
        txtNome.setText(lote.getResponsavel());
        txtNumParcela.setText(lote.getNumParcela());
        txtContato.setText(lote.getContato());
        txtCoordenadaX.setText(String.valueOf(lote.getCoordenada()[0]));
        txtCoordenadaY.setText(String.valueOf(lote.getCoordenada()[1])); 
        txtIndiceDeSustentabilidade.setText(String.format("%.3f",lote.calcularIndiceGeral()));
        dialogPropriedades.setSize(390, 370);
        dialogPropriedades.setLocationRelativeTo(null);
        dialogPropriedades.setVisible(true);
    }//GEN-LAST:event_btnPropriedadesActionPerformed

    private void jListModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListModelosMouseClicked
        if (evt.getClickCount()>1) {
            int selected = jListModelos.getSelectedIndex();
            if (selected==-1) return;

            new IndicadoresFrame(ISA.loteList.get(selected)).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jListModelosMouseClicked

    private void jListModelosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListModelosKeyTyped
        
    }//GEN-LAST:event_jListModelosKeyTyped

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jListModelosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListModelosValueChanged
        btnPropriedades.setEnabled(jListModelos.getSelectedIndex() != -1);
        btnVisualizar.setEnabled(jListModelos.getSelectedIndex() != -1);
    }//GEN-LAST:event_jListModelosValueChanged

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String htmlTable = """
                           <html>
                                <style>
                                table {
                                    width: 250px;
                                    font-family: segoe, sans-serif;
                                    font-size:10px;
                                    border-collapse: collapse;
                                    border-spacing: 0px;
                                }
                                td, th {
                                        border: 1px solid black;
                                        padding: 6px;
                                    }
                                </style>
                           <table>
                           <tr> <th>Assentamento</th> <th>Índice</th></tr>
                           %s
                           </table>
                           </html>
                           """;
        String htmlItem = "<tr> <td>%s</td> <td>%.3f</td></tr>";
        Map<String, List<Lote>> assentamentos = new HashMap<>();
        for (Lote lote : ISA.loteList) {
            if (!assentamentos.keySet().contains(lote.getAssentamento())) {
                assentamentos.put(lote.getAssentamento(), new ArrayList<>());
            }
            assentamentos.get(lote.getAssentamento()).add(lote);
        }
        StringBuilder htmlItens = new StringBuilder();
        for (String key : assentamentos.keySet()) {
            if (assentamentos.get(key).isEmpty()) continue;
            double indice = 0;
            for (Lote l : assentamentos.get(key)) {
                indice += l.calcularIndiceGeral();
            }
            indice /= assentamentos.get(key).size();
            htmlItens.append(String.format(htmlItem, key, indice));
        }
        lblAssentamentosTable.setText(String.format(htmlTable, htmlItens.toString()));
        
        dialogAssentamentos.setSize(390, 370);
        dialogAssentamentos.setLocationRelativeTo(null);
        dialogAssentamentos.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizarLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarLotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarLotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPropriedades;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JDialog dialogAssentamentos;
    private javax.swing.JDialog dialogPropriedades;
    private javax.swing.JList<String> jListModelos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblAssentamentosTable;
    private javax.swing.JLabel lblCoordenadaX;
    private javax.swing.JLabel lblCoordenadaY;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelAssentamentos;
    private javax.swing.JPanel panelCoordenada;
    private javax.swing.JPanel panelPropriedades;
    private javax.swing.JScrollPane scrollAssentamento;
    private javax.swing.JTextField txtAssentamento;
    private javax.swing.JFormattedTextField txtContato;
    private javax.swing.JFormattedTextField txtCoordenadaX;
    private javax.swing.JFormattedTextField txtCoordenadaY;
    private javax.swing.JTextField txtIndiceDeSustentabilidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumParcela;
    // End of variables declaration//GEN-END:variables
}
