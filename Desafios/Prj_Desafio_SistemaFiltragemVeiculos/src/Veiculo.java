public class Veiculo
{
    String modelo;
    double preco;

    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }
    public void exibirDados(){
        System.out.println("Veiculo: "+ modelo);
        System.out.println("Preço: R$ "+ preco);
        System.out.println("--------------------------");
    }
    public double getPreco() {
        return preco;
    }

    public String getModelo() {
        return modelo;
    }
}
