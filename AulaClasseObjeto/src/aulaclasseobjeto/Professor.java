package aulaclasseobjeto;

public class Professor
{
    private String nome;
    private String departamento;

    void mostrarInformacoes() 
    {
        System.out.println("Nome do professor(a): " + nome + "\nDepartamento: " + departamento);
    }

    // Métodos setters
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setDepartamento(String departamento)
    {
        this.departamento = departamento;
    }

    // Métodos getters
    public String getNome() 
    {
        return this.nome;
    }

    public String getDepartamento() 
    {
        return this.departamento;
    }
}
