/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecargasopreposicao;

/**
 *
 * @author IFTM
 */
public class Empregado 
{
    private String nome;
    private String setor;
    private double salario;

    public Empregado(String nome, String setor, double salario) {
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }
     public String mostrarInformacoes()
    {
        String mostrar = "Nome: " + this.nome + 
                "\nSetor: " + setor +
                "\nSalario: " + salario + "\n\n";
        return mostrar;
    }
     @Override
     public String toString()
     {
         return "Empregado: [Nome: " + this.nome + ", Setor: "+this.setor+", Salario: "+ this.salario + "]";
     }
    
}
