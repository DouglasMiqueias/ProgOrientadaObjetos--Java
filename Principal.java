package exercicioclasseobjeto;

/**
 *
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) 
    {
        Conversao temperatura = new Conversao();
        temperatura.setTemperaturaFahrenheit(300.0);
        temperatura.mostrarInformacoes();
    }
    
}
