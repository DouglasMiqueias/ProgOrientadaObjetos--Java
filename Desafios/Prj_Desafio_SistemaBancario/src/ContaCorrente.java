public class ContaCorrente extends ContaBancaria implements Tributavel
{
    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        double valorTotal = valor + 2;
        if(valorTotal > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente na Conta Corrente!");
        }
        System.out.println("Saque no valor de " + valor + " realizado com sucesso!");
        saldo -= valorTotal;
    }

    @Override
    public double calcularImposto(){
        return saldo * 0.01;
    }
}
