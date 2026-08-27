public class Filme {
    static int contadorId;
    int id;
    String titulo;
    CategoriaFilme categoria;
    int anoLancamento;
    double avaliacao;
    double orcamento;

    public Filme() {
        contadorId++;
        this.id = contadorId;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s (%d) - Nota: %.1f - Orçamento: R$ %,.2f",
                categoria, titulo, anoLancamento, avaliacao, orcamento);
    }


    public String getTitulo() {
        return titulo;
    }

    public CategoriaFilme getCategoria() {
        return categoria;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }


    public double getAvaliacao() {
        return avaliacao;
    }

    public double getOrcamento() {
        return orcamento;
    }
}
