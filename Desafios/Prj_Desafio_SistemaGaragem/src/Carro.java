public class Carro extends Veiculo
{
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar(){
        System.out.println("Acelerando o carro "+ modelo +  "...");
        velocidadeAtual += 20;
    }

    @Override
    public void realizarRevisao(){
        System.out.println("Trocando o óleo e checando pneus do carro " + modelo + "...");
    }

}
