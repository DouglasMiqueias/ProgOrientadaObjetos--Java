package prjrelacaoobjetos.objetos.contato;

import prjrelacaoobjetos.objetos.pessoa.Pessoa;

public class Contato {
    private int idContato;
    private String tipoContato;
    private String valorContato;
    private Pessoa pessoa; // Associação com Pessoa

    // Getters e Setters
    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public String getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getValorContato() {
        return valorContato;
    }

    public void setValorContato(String valorContato) {
        this.valorContato = valorContato;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
