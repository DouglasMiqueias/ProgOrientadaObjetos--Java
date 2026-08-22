public class Moto extends Veiculo
{
    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar(){
        System.out.println("Acelerando a moto "+ modelo + "...");
        velocidadeAtual += 40;
    }

    @Override
    public void realizarRevisao(){
        System.out.println("Ajustando a corrente da moto " + modelo + "...");
    }
}
