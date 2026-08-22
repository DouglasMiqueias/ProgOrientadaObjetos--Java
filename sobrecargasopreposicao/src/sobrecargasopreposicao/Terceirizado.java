/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecargasopreposicao;

/**
 *
 * @author IFTM
 */
public class Terceirizado extends Empregado
{
    private String empresaResponsavel;
    private double valorHoraExtra;

    public Terceirizado(String nome, String setor, double salario, String empresaResponsavel, double valorHoraExtra)
    {
        super(nome, setor, salario);
        this.empresaResponsavel = empresaResponsavel;
        this.valorHoraExtra = valorHoraExtra;
    }

    public String getEmpresaResponsavel() {
        return empresaResponsavel;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }
    
    @Override // Sobrepondo o método da classe Empregado
     public String mostrarInformacoes()
    {
        String aux = super.mostrarInformacoes();
        aux += "\nEmpresa: "+ empresaResponsavel + 
                "\nHora extra: R$ " + valorHoraExtra;
        return aux;
    }
      public String toString()
     {
         return super.toString() + "Terceirizado: [Empresa: "+this.empresaResponsavel + ", Hora extra: " +  this.valorHoraExtra +  "]";
     }
    
}
