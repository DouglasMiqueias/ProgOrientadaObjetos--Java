/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoocurso04;

public class Caneta
{
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;;
    
    public Caneta(){
        this.tampar();
        this.cor = "azul";
    }
    
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
    this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("\n\nSobre a caneta");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ponta " + ponta);
        System.out.println("Cor "+ cor);
        System.out.println("Tampada: "+ tampada);
   }
    
    
}
