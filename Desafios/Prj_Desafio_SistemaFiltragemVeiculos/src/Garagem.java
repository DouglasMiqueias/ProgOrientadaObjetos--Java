import java.util.ArrayList;

public class Garagem {
    ArrayList<Veiculo> estoque = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v){
        if (v != null){
            estoque.add(v);
        }
    }

    public ArrayList<Veiculo> buscarPorOrcamento(double valorMaximo){

        ArrayList<Veiculo> resultadoBusca = new ArrayList<>();

        estoque.forEach(veiculo -> {
            if(veiculo.getPreco() <= valorMaximo){
                resultadoBusca.add(veiculo);
                veiculo.exibirDados();
            }
        });

        if (resultadoBusca.isEmpty()){
            throw new OrcamentoInsuficienteException("Nenhum veículo encontrado no valor de até R$ " + valorMaximo);
        }
        return resultadoBusca;
    }
}
