/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isa;

import components.*;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.*;
/**
 *
 * @author Admin
 */
public class MultiSpanCellTableExample extends JFrame {

  MultiSpanCellTableExample() {
    super( "Multi-Span Cell Example" );
    
    AttributiveCellTableModel ml = new AttributiveCellTableModel(10,6);
    /*
    AttributiveCellTableModel ml = new AttributiveCellTableModel(10,6) {
      public Object getValueAt(int row, int col) { 
        return "" + row + ","+ col; 
      }
    };
    */
    final CellSpan cellAtt =(CellSpan)ml.getCellAttribute();
    final MultiSpanCellTable table = new MultiSpanCellTable( ml );
    JScrollPane scroll = new JScrollPane( table );

    JButton b_one   = new JButton("Combine");
    b_one.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
  int[] columns = table.getSelectedColumns();
  int[] rows    = table.getSelectedRows();
  cellAtt.combine(rows,columns);
  table.clearSelection();
  table.revalidate();
  table.repaint();
      }
    });
    JButton b_split = new JButton("Split");
    b_split.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
  int column = table.getSelectedColumn();
  int row    = table.getSelectedRow();
  cellAtt.split(row,column);
  table.clearSelection();
  table.revalidate();
  table.repaint();
      }
    });
    JPanel p_buttons = new JPanel();
    p_buttons.setLayout(new GridLayout(2,1));
    p_buttons.add(b_one);
    p_buttons.add(b_split);

    Box box = new Box(BoxLayout.X_AXIS);
    box.add(scroll);
    box.add(new JSeparator(SwingConstants.HORIZONTAL));
    box.add(p_buttons);
    getContentPane().add( box );
    setSize( 400, 200 );
    setVisible(true);
  }

  public static void main(String[] args) {
    MultiSpanCellTableExample frame = new MultiSpanCellTableExample();
    frame.addWindowListener( new WindowAdapter() {
      public void windowClosing( WindowEvent e ) {
        System.exit(0);
      }
    });
  }
}
