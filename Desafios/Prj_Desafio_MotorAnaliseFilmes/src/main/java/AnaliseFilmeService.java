import java.util.*;
import java.util.stream.Collectors;

public class AnaliseFilmeService {
    List<Filme> filmes = new ArrayList<>();

    public void adicionarFilme(Filme f){
        if(f != null){
            filmes.add(f);
        } else {
        }
    }

    public List<Filme> getTodosFilmes(){
        return filmes;
    }

    public List<Filme> filtrarPorCategoria(CategoriaFilme categoria){
       return filmes.stream()
                .filter(f-> f.getCategoria() == categoria)
                .toList();
    }

    public List<String> ordenarTitulosPorAnoMinimo(int anoMinimo){
        return filmes.stream()
                .filter(f -> f.getAnoLancamento() >= anoMinimo )
                .map(Filme::getTitulo)
                .sorted()
                .toList();
    }

    public Optional<Filme> buscarFilmeMaisCaro(){
        return filmes.stream()
                .max(Comparator.comparingDouble(Filme::getOrcamento));
    }

    public Optional<Filme> buscarFilmeMaisBarato(){
        return filmes.stream()
                .min(Comparator.comparingDouble(Filme::getOrcamento));
    }

    public Map<CategoriaFilme, List<Filme>> agruparPorCategoria(){
        return filmes.stream()
                .collect(Collectors.groupingBy(Filme::getCategoria));
    }

    public double calcularOrcamentoTotal(){
        return filmes.stream()
                .mapToDouble(Filme::getOrcamento)
                .sum();
    }

    public double calcularMediaDasAvaliacoes(CategoriaFilme categoria){
        return filmes.stream()
                .filter(f-> f.getCategoria() == categoria)
                .mapToDouble(Filme::getAvaliacao)
                .average()
                .orElse(0.0);

    }
}
