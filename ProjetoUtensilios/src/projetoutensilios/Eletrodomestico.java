/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoutensilios;

/**
 *
 * @author IFTM
 */
public class Eletrodomestico extends Utensilio
{
    private int watts;
    private boolean temTimer;
    private String Timer;

    public int getWatts() {
        return watts;
    }
    
     public String getTimer() {
        return Timer;
    }

    public boolean isTimer() {
        return temTimer;
    }
    public Eletrodomestico(String nome, String material, String tamanho)
    {
        System.out.println("Nome: "+ nome+"\nMaterial: "+ material + "\nTamanho: "+ tamanho + "\n\n");
    }
    
    public Eletrodomestico(String nome, String material, String tamanho, int watts, boolean temTimer)
    {
        if(temTimer == true)
        {
             Timer = "Tem timer";
        }else 
        {
           Timer = "Nao tem timer";
        }
        System.out.println("Nome: "+ nome+"\nMaterial: "+ material + "\nTamanho: "+ tamanho + "\nPotencia: "
                + watts + " watts" + "\nTem timer: " + Timer + "\n\n");
    }

   
}
