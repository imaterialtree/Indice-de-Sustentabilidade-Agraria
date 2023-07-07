/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isa;

import csv.DataTransfer;
import java.util.ArrayList;
import java.util.List;
import model.ModeloIndicadores;
import model.Lote;
import view.MainFrame;
import view.indicadores.IndicadoresFrame;

/**
 *
 * @author Admin
 */
public class ISA {
    public static List<Lote> loteList = new ArrayList<>();
    public static List<ModeloIndicadores> indicadoresList = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String[] grupos = {"Paisagem", "Qualidade Ambiental"};
        String[][] items = {
            {
                "Conservação de habitats", 
                "reserva legal",
                "áreas de PP"
            },
            {
                "Atmosfera", "Água", "Solo"
            },
        };
        
        
        loteList = DataTransfer.importAllLotes();
         
        ModeloIndicadores ambientalTabela = new ModeloIndicadores("Indicadores Ambientais", grupos, items);
        indicadoresList.add(ambientalTabela);
        
        MainFrame telaPrincipal = new MainFrame();
        telaPrincipal.setVisible(true);
        
//        IndicadoresFrame tela = new IndicadoresFrame(ambientalTabela);
//        tela.setVisible(true);
    }
    
}
