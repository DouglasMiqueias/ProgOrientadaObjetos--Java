/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjclassesabstratas;

import prjclassesabstratas.Classes.Conta;
import prjclassesabstratas.Classes.ContaPoupanca;

/**
 *
 * @author IFTM
 */
public class PrjClassesAbstratas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Conta cp = new ContaPoupanca();
        cp.setSaldo(1000);
        cp.imprimirTexto();
        // TODO code application logic here
    }
    
}
