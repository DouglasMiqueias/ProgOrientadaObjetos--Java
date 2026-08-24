/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaclasseobjeto;

/**
 *
 * @author IFTM
 */
public class Professor        
{
    private String nome;
    private String departamento;
    
    public Professor(String nome)
    {
        this.nome = nome;
        if(nome.equals(" "))
        {
            this.nome = "sem nome";
        }
        this.departamento = "Gestao Admnistrativa";

    }
    public Professor(String nome, String departamento)
    {
        this.nome = nome;
        
        if(nome.equals(" "))
        {
            this.nome = "sem nome";
        }
        this.departamento = departamento;
        System.out.println("Entrou no construtor sobrecarregado: "+ nome + " " + departamento);
    }
    //Quando implementar um construtor sobrecarregado, tem que implementar um construtor vazio
    public Professor()
    {
        System.out.println("Entrou no construtor vazio");
    }
    public void mostrarinformacoes()
    {
        System.out.println("Nome do professor(a): " + nome + "\nDepartamento: " + departamento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
