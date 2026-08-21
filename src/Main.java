//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Carro carro1 = new Carro("Fusca", 1988);
    carro1.mostrarInformacoes(carro1);

    Moto factor1 = new Factor();

    factor1.acelerar();

    Humano humano1  = new Humano("Douglas", 22, "Francês");
    Peixe peixe1 = new Peixe("Carpa", "vermelha");

    humano1.mostrarInformacoes();
    humano1.nascer();

    peixe1.nascer();
    peixe1.morrer();
}

class Carro{

    String modelo;
    int ano;

    public Carro(String modelo, int ano){
        System.out.println("Carro Criado!");
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrarInformacoes(Carro carro){
        System.out.println("============== INFORMAÇÕES CARRO ==============");
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
    }
}
