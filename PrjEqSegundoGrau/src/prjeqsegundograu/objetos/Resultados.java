/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjeqsegundograu.objetos;

/**
 *
 * @author IFTM
 */
public class Resultados 
{
     public void mostrarResultados(DadosSaida ds)
       {
           System.out.println("Delta: "+ ds.getDelta());
           System.out.println("X1': "+ ds.getX1l());
           System.out.println("X2': "+ ds.getX2l());
           System.out.println("Xv: "+ ds.getXv());
           System.out.println("Yv: "+ ds.getYv());
       }
    
}
