//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Garagem garagem = new Garagem();

    garagem.adicionarVeiculo(new Veiculo("Honda City", 15000));
    garagem.adicionarVeiculo(new Veiculo("Honda Civic", 33000));
    garagem.adicionarVeiculo(new Veiculo("Toyota Corolla", 45000));
    garagem.adicionarVeiculo(new Veiculo("Toyota Hillux", 165000));

    try{
        System.out.println("== TESTE 1: BUSCA COM ORÇAMENTO DE R$ 50.000 ==");
        ArrayList<Veiculo> opcoes = garagem.buscarPorOrcamento(50000);
    }catch (OrcamentoInsuficienteException e){
        System.out.println("Erro: " + e.getMessage());
    }

    try{
        System.out.println("== TESTE 1: BUSCA COM ORÇAMENTO DE R$ 10.000 ==");
        ArrayList<Veiculo> opcoes = garagem.buscarPorOrcamento(10000);
    }catch (OrcamentoInsuficienteException e){
        System.out.println("Erro: " + e.getMessage());
    }
}
