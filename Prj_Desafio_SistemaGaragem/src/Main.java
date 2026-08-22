//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayList<Veiculo> garagem = new ArrayList();

    Veiculo carro1 = new Carro("Fiat Toro");
    Veiculo moto1 = new Moto("Kawasaki Ninja");
    Veiculo carro2 = null;

    garagem.add(carro1);
    garagem.add(moto1);
    garagem.add(carro2);

    System.out.println("Veículos cadastrados na garagem: ");

    garagem.forEach(veiculo -> {
        try{
            veiculo.acelerar();
            veiculo.exibirDados();
            veiculo.realizarRevisao();
            System.out.println("---------------------------------------------");
        } catch (NullPointerException exception){
            System.out.println("Veículo inválido ou não encontrado na garagem!");
        }
    });
}
