public class Humano extends SerVivo {
    private String idioma;
    private int idade;

    public Humano(String especie, int idade, String idioma) {
        super(especie);
        this.idade = idade;
        this.idioma = idioma;
    }

    @Override
    public void nascer()
    {
        System.out.println("Nasce um bebê humano...");
    }

    public void mostrarInformacoes()
    {
        System.out.println("=================== HUMANO ===================");
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("idioma: "+ idioma);
    }
}
