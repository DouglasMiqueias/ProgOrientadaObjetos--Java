/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoheranca03;

/**
 *
 * @author mique
 */
public class Programador extends Funcionario
{
    private double valorPontoFuncao;

    public double getValorPontoFuncao() {
        return valorPontoFuncao;
    }

    public void setValorPontoFuncao(double valorPontoFuncao) {
        this.valorPontoFuncao = valorPontoFuncao;
    }

    public void calcularValorSoftware(int linhasCodigo)
    {
        double orcamentoSoftware = valorPontoFuncao * linhasCodigo;
        
        System.out.println("O valor do Software que possui " + linhasCodigo + " linhas de codigo e de: R$ "+ orcamentoSoftware);
    }
    
        
    
}
