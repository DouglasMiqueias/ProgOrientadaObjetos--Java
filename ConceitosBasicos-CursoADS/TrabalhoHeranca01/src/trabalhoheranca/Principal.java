package trabalhoheranca;

public class Principal {
    public static void main(String[] args) 
    {
        Usuario douglas = new Usuario();
        douglas.setCodigo(135);
        douglas.setDataCadastro("14/09/2004");
        douglas.setNome("Douglas");
        douglas.setLogin("Douglas135");
        douglas.setSenha("root0000");
        
        Usuario jose = new Usuario();
        jose.setCodigo(289);
        jose.setDataCadastro("17/07/2010");
        jose.setNome("Jose");
        jose.setLogin("Jose289");
        jose.setSenha("root289");
        
        Cliente gabriel = new Cliente();
        gabriel.setCodigo(789);
        gabriel.setDataCadastro("01/01/2007");
        gabriel.setNome("Gabriel");
        gabriel.setEmail("gabriel01@gmail.com");
        gabriel.setEndereco("Rua 1, 455 - Jardim California");
        gabriel.setTelefone("9999-9999");
        
        Cliente maria = new Cliente();
        maria.setCodigo(321);
        maria.setDataCadastro("09/11/2011");
        maria.setNome("Maria");
        maria.setEmail("maria02@gmail.com");
        maria.setEndereco("Rua 45, 984 - Belvedere");
        maria.setTelefone("9999-9999");
        
        System.out.println("**************************************************************");
        System.out.println("Lista Usuarios \nNome: " + douglas.getNome() + "\nData Cadastro: " + douglas.getDataCadastro() + "\nLogin: " + douglas.getLogin() + "\nSenha: " + douglas.getSenha() +  "\nCodigo: " 
        + douglas.getCodigo() + "\n \n");
        
        System.out.println("Nome: " + jose.getNome() + "\nData Cadastro: " + jose.getDataCadastro() + "\nLogin: " + jose.getLogin() + "\nSenha: " + jose.getSenha() +  "\nCodigo: " 
        + jose.getCodigo() + "\n \n");
        
        System.out.println("**************************************************************");
        System.out.println("Lista Clientes: ");
        
        System.out.println("Nome: " + gabriel.getNome() + "\nData Cadastro: " + gabriel.getDataCadastro() + "\nEmail: " + gabriel.getEmail()+ "\nEndereco: " + gabriel.getEndereco()+  "\nCodigo: " 
        + gabriel.getCodigo() + "\nTelefone: "+ gabriel.getTelefone() + "\n \n");
        
         System.out.println("Nome: " + maria.getNome() + "\nData Cadastro: " + maria.getDataCadastro() + "\nEmail: " + maria.getEmail()+ "\nEndereco: " + maria.getEndereco()+  "\nCodigo: " 
        + maria.getCodigo() + "\nTelefone: "+ maria.getTelefone() + "\n \n");
         
        System.out.println("**************************************************************");

    }
    
}
