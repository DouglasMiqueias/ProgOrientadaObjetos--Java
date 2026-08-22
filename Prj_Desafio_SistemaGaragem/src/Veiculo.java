public abstract class Veiculo implements Mecanico
{
    protected String modelo;
    protected int velocidadeAtual;

    public Veiculo(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    public abstract void acelerar();

    public void exibirDados(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidadeAtual + "km/h");
    }
}
