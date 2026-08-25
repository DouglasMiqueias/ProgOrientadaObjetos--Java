import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;

public class AuditoriaService {
    List<Transacao> transacoes = new ArrayList<>();

    public void adicionarTransacao(Transacao t){
        transacoes.add(t);
    }

    // filtrar usando stream
    public List<Transacao> filtrarPorStatus(StatusTransacao status){
        return transacoes.stream()
                .filter(t -> t.getStatus() == status)
                .toList();
    }

    // somar valores usando stream
    public double calcularTotalAprovado(){
        return transacoes.stream()
                .filter(t -> t.getStatus() == StatusTransacao.APROVADA)
                .mapToDouble(Transacao::getValor)
                .sum();
    }

    // encontrar maior valor com Optional
    public Optional<Transacao> maiorTransacaoAprovada(){
        return transacoes.stream()
                .filter(t -> t.getStatus() == StatusTransacao.APROVADA)
                .max(Comparator.comparingDouble(Transacao::getValor));
    }
}
