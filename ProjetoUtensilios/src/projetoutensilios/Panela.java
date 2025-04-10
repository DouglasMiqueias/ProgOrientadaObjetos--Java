/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoutensilios;

/**
 *
 * @author IFTM
 */
public class Panela extends Utensilio 
{
    private String tipoTampa;
    private double capacidadeLitros;

    public String getTipoTampa() {
        return tipoTampa;
    }

    public double getCapacidadeLitros() {
        return capacidadeLitros;
    }
  
    public Panela(String nome, String material, String tamanho)
    {
        System.out.println("Nome: "+ nome+"\nMaterial: "+ material + "\nTamanho: "+ tamanho + "\n\n");
    }
    public Panela(String nome, String material, String tamanho, String tipoTampa, double capacidadeLitros)
    {
                System.out.println("Nome: "+ nome+"\nMaterial: "+ material + "\nTamanho: "+ tamanho+ "\nTipo de tampa: "+ tipoTampa +
                        "\nCapacidade Litros: " + capacidadeLitros + "\n\n");

    }
}
