/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapoocurso04;

public class AulaPooCurso04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        c1.setPonta(0.5f);
        c1.status();
        
        System.out.println("Tenho uma caneta "+ c1.getModelo()+ " de ponta "+ c1.getPonta());
        
        Caneta c2 = new Caneta();
        c2.status();
        
        Caneta c3 = new Caneta("NIC", "Preta", 0.5f);
        c3.status();
    }
}
