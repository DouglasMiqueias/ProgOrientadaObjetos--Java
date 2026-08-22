/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjinterfaces.classes;

/**
 *
 * @author IFTM
 */
public class ContaCorrente implements Conta
{
    private double saldo;
    private final double taxaOperacao = 0.45;

    @Override
    public void depositar(double valor) {
        this.saldo += valor - taxaOperacao;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor + taxaOperacao;
    }

    @Override
    public double getSaldo() { 
        return this.saldo;
    }
    
}
