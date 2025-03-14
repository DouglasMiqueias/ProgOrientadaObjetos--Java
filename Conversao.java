package exercicioclasseobjeto;
/*
Escreva um programa que converta uma temperatura de Fahrenheit para Celsius.
O usuário deve informar a temperatura em Fahrenheit e o programa deve calcular e 
exibir a temperatura correspondente em Celsius utilizando a fórmula: C = (F - 32) * 5/9.
*/
public class Conversao 
{
    private double temperaturaFahrenheit;
    private double temperaturaCelsius;
    
    public void setTemperaturaFahrenheit(double temperaturaFahrenheit) {
        if (temperaturaFahrenheit > 0) 
        {
            this.temperaturaFahrenheit = temperaturaFahrenheit;
            this.temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;
        } else {
            System.out.println("A temperatura deve ser maior que zero.");
        }
    }
    
    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }
    
    public void mostrarInformacoes() {
        System.out.printf("Temperatura em Celsius: %.2f\n", temperaturaCelsius);
    }
    
    
    
            
    /*essa classe recebe um número inteiro;
        implemente getters e setters;
        implemente o método que calcule o pedido no enunciado;
        valide no setter do atributo se ele é maior que zero
    */
}
