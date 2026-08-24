/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoheranca03;

/**
 *
 * @author mique
 */
public class Funcionario 
{
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
   // Método que calcula o bônus (10% a mais no mês de dezembro) e imprime o salário atualizado
    public void calcularBonus(String mesPagamento) {
        double salarioCalculado = salario;
        if(mesPagamento.equalsIgnoreCase("dezembro")) 
        {
            salarioCalculado += salario * 0.10; 
        }
        System.out.println("Funcionario " + nome + ".\nSalario para o mes " + mesPagamento 
                + " : R$" + salarioCalculado + "\n");
        }

    
    
}
