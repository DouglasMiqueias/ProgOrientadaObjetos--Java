/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjequacaosegundograu;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        
        Bhaskara equacao = new Bhaskara(i, j, k);
        
        double delta = equacao.calcularDelta();
        System.out.println("Delta: " + delta);
        
        equacao.calcularRaizes();
        
        equacao.calcularVertice();
    }
    
}
