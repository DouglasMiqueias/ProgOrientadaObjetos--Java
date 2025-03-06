package aulaclasseobjeto;
/*ctrl + R = selecionar um texto e mudar todos os iguais*/
public class Principal
{
    public static void main(String[] args) 
    {
        Professor jean = new Professor();
        jean.setNome("Jean Lucas Souza");
        jean.setDepartamento("Informática II");
       /* jean.nome = "Jean Lucas";
        jean.departamento = "Informatica II";*/
        
        Professor josele = new Professor();
        josele.setNome("Josele Franca");
        josele.setDepartamento("Administração");
        
        /*josele.nome = "Josele França";
        josele.departamento = "Administracao";*/
        
        System.out.println("Professores da instituicao: \n" + jean.getNome() + "\n" + josele.getNome());
    }
    
}
