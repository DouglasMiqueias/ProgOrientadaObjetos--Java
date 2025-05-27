/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjrelacaoobjetos.objetos;

import java.util.List;

/**
 *
 * @author IFTM
 */
public class Pessoa 
{
    private int idPessoa;
    private String nome;
    private String dataNascimento;
    private String cpf;
    List<Contato> lstContato; // Uma pessoa possui uma lista de contatos

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
    
    
    
}
