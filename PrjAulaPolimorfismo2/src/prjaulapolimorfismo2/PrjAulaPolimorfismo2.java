/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjaulapolimorfismo2;

/**
 *
 * @author IFTM
 */
public class PrjAulaPolimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Animal a1 = new Animal();
        a1.som();
        Animal a2 = new Cachorro();
        a2.som();
        Animal a3 = new Gato();
        a3.som();
        
    }
    
}
