package prjrelacaoobjetos.objetos.pessoa;

import prjrelacaoobjetos.objetos.contato.Contato;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private List<Contato> lstContato; // Uma pessoa possui uma lista de contatos

    // Construtor para inicializar a lista
    public Pessoa() {
        this.lstContato = new ArrayList<>();
    }

    // Getters e Setters
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Contato> getLstContato() {
        return lstContato;
    }

    public void setLstContato(List<Contato> lstContato) {
        this.lstContato = lstContato;
    }

    // Método auxiliar para adicionar contato com vínculo reverso
    public void adicionarContato(Contato contato) {
        contato.setPessoa(this);        // Define a pessoa no contato
        this.lstContato.add(contato);   // Adiciona à lista da pessoa
    }
}
