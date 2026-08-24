/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjinterfaces.classes;

/**
 *
 * @author IFTM
 */
public class ContaPoupanca implements Conta
{
    private double saldo;
    
    @Override
    public void depositar(double valor) {
        this.saldo +=valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
    
}
