public class Moto  extends Veiculo{

    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar(){
        velocidade += 40;
        System.out.println("Moto acelerando a: " + velocidade + " km/h ");
    }
}
