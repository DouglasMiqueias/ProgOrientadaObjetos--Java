/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecargasopreposicao;

/**
 *
 * @author IFTM
 */
public class Principal {
    
    public static void main(String[] args)
    {
        Calcular soma1 = new Calcular();
        soma1.somar(5, 10);
        
        Calcular soma2 = new Calcular();
        soma2.somar(5, 140, 12);
        
        Calcular soma3 = new Calcular();
        soma3.somar(5.2, 10.8);
        
        Empregado joao = new Empregado("João", "TI",800.00 );
        System.out.println("********Empregado********\n"+ joao.mostrarInformacoes());
        
        Terceirizado maria = new Terceirizado("Maria", "Turismo", 900.00, "Patos Tur", 120.00);
        System.out.println("********Terceirizado********\n"+ maria.mostrarInformacoes());
        
        System.out.println(maria.toString());

    }
    
}
