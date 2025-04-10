/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaclasseobjeto;

/**
 *
 * @author IFTM
 */
public class Principal {

    public static void main(String[] args)
    {
        Professor jean = new Professor("Jean", "Informatica");
        Professor ligia = new Professor("Ligia");
        Professor paulo = new Professor();
        paulo.setNome("Paulo");
        paulo.setDepartamento("Logistica");
        
    }
    
}
