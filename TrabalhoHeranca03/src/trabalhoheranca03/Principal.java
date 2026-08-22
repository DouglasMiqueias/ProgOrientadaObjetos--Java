/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhoheranca03;

/**
 *
 * @author mique
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Funcionario maria = new Funcionario();
        maria.setNome("Maria");
        maria.setSalario(2250.00);
        
        Funcionario gabriel = new Funcionario();
        gabriel.setNome("Gabriel");
        gabriel.setSalario(1518.00);
        
        Funcionario amando = new Funcionario();
        amando.setNome("Amando");
        amando.setSalario(1518.00);
       
        maria.calcularBonus("Novembro");
        System.out.println("**************************************************");
        gabriel.calcularBonus("Dezembro");
        System.out.println("**************************************************");
        amando.calcularBonus("dezembro");
        System.out.println("**************************************************");
        
        Gerente henrique = new Gerente();
        henrique.setNome("Henrique");
        henrique.setSalario(5000.00);
        henrique.setGratificacao(500);
        
        henrique.calcularBonus("dezembro");
        
        System.out.println("**************************************************");
        
        Programador douglas = new Programador();
        douglas.setNome("Douglas");
        douglas.setSalario(4200.00);
        douglas.setValorPontoFuncao(5);

        douglas.calcularBonus("dezembro");
        System.out.println("**************************************************");        
        douglas.calcularValorSoftware(1300);
        

        
        
        
        


        
    }
    
}
