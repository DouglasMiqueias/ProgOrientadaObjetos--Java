public class Factor implements Moto {

    @Override
    public void acelerar() {
        System.out.println("Acelerando a 50km/h");
    }

    @Override
    public void freiar() {
        System.out.println("Freiando...");
    }

    @Override
    public void parar() {
        System.out.println("Moto parada...");
    }
}
