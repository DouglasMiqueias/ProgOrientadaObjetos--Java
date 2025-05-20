/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjeqsegundograu;

import prjeqsegundograu.objetos.DadosEntrada;
import prjeqsegundograu.objetos.DadosSaida;
import prjeqsegundograu.regranegocio.EfetuarCalculos;

/**
 *
 * @author IFTM
 */
public class PrjEqSegundoGrau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DadosEntrada de = new DadosEntrada();
        de.setA(1);
        de.setB(5);
        de.setC(6);
        EfetuarCalculos ec = new EfetuarCalculos();
        DadosSaida ds = ec.calcularDelta(de);
        System.out.println(ds.getDelta());
    }
    
}
