public abstract class SerVivo {
    protected String especie;

    public SerVivo(String especie){
        this.especie = especie;
    }
    public void respirar(){};
    public void nascer(){};
    public void crescer(){}
    public void morrer(){
        System.out.println("Morreu!");
    };

}
