public class Carro extends Veiculo
{
    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void acelerar(){
        velocidade += 20;
        System.out.println("Carro acelerando a: " + velocidade + " km/h ");
    }
}