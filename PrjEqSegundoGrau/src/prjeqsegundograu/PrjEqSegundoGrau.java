/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjeqsegundograu;
import java.util.Scanner;
import prjeqsegundograu.objetos.DadosEntrada;
import prjeqsegundograu.objetos.DadosSaida;
import prjeqsegundograu.objetos.Resultados;
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
    DadosSaida ds = new DadosSaida();
    EfetuarCalculos ec = new EfetuarCalculos();
    Resultados resultados = new Resultados();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o valor de A: ");
    de.setA(scanner.nextDouble());
    System.out.println("Digite o valor de B: ");
    de.setB(scanner.nextDouble());
    System.out.println("Digite o valor de C: ");
    de.setC(scanner.nextDouble());
    scanner.close();

    ec.calcularDelta(de, ds);
    ec.calcularX1l(de, ds);
    ec.calcularX2l(de, ds);
    ec.calcularXv(de, ds);
    ec.calcularYv(de, ds);

    resultados.mostrarResultados(ds);
        
       
        

    }
    
}
