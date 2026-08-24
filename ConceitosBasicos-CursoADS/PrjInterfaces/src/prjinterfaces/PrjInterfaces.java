/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjinterfaces;

import prjinterfaces.classes.ContaCorrente;
import prjinterfaces.classes.ContaPoupanca;
import prjinterfaces.classes.GerarExtratos;

/**
 *
 * @author IFTM
 */
public class PrjInterfaces 
{

    public static void main(String[] args) 
    {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1500);
        cc.sacar(300);
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(900);
        cp.sacar(25);
        
        GerarExtratos gerador = new GerarExtratos();
        gerador.geradorExtratosConta(cc);
        gerador.geradorExtratosConta(cp);

    }
    
}
