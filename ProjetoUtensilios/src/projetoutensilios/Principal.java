package projetoutensilios;

/**
 *
 * @author IFTM
 */
public class Principal {

    public static void main(String[] args) 
    {
        Panela frigideira = new Panela("Frigideira", "Aluminio","30x30");
        Panela paneladepressao = new Panela("Panela de Pressao", "Inox", "50x40", "Inox", 45);
        
        Eletrodomestico microondas = new Eletrodomestico("Microondas", "Aluminio", "50x65");
        Eletrodomestico liquidificador = new Eletrodomestico("Liquidificador", "Plastico", "60x20", 45, false);
    }   
    
}
