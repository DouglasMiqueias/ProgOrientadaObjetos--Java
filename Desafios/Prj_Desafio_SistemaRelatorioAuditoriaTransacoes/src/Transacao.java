public class Transacao {
    private static int contadorId = 0;
    int id;
    String titular;
    double valor;
    StatusTransacao status;

    public Transacao(String titular, double valor, StatusTransacao status) {
        contadorId++;
        this.id = contadorId;
        this.titular = titular;
        this.valor = valor;
        this.status = status;
    }

    @Override
    public String toString(){
        return "=== Transação === \n id: " + id + "\nTitular: "+titular+"\nValor: "+valor+"\nStatus: "+status;
    }

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public double getValor() {
        return valor;
    }

    public StatusTransacao getStatus() {
        return status;
    }
}
