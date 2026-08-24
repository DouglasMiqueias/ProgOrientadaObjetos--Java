public class ContaPoupanca extends ContaBancaria
{
    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    public void sacar(double valor){
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente na Conta Poupança! \n Saldo R$ " + saldo);
        }
        System.out.println("Saque no valor de " + valor + " realizado com sucesso!");
        saldo -= valor;
    }
}
