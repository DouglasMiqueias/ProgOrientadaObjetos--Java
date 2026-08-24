public abstract class Veiculo {
    String marca;
    int velocidade;

    public Veiculo(String marca) {
        this.marca = marca;
        this.velocidade = 0;
    }

    public abstract void acelerar();
}
