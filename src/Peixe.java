public class Peixe extends SerVivo {

    private String corEscamas;

    public Peixe(String especie, String corEscamas) {
        super(especie);
        this.corEscamas = corEscamas;
    }

    @Override
    public void nascer() {
        System.out.println("Nasce um peixe...");
    }
}
