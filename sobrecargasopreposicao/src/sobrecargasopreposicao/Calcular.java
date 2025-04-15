package sobrecargasopreposicao;


public class Calcular 
{
    public void somar(int a, int b)
    {
        System.out.println("A soma de: " + a + " + " + b + " = "+ (a+b) );
    }
    
    public void somar(int a, int b, int c)
    {
        System.out.println("A soma de: " + a + " + " + b + " + "+ c + " = " + (a + b + c) );
    }
    
     public void somar(double a, double b)
    {
        System.out.println("A soma de: " + a + " + " + b + " = "+ (a+b) );

    }
}
/*
sOBRECARGA DE MÉTODOS
Ocorre quando há vários métodos com o mesmo nome dentro da mesma classe, mas com diferentes assinaturas (ou seja, diferentes tipos ou números de parâmetros)
É usada para oferecer várias formas de executar uma funcionalidade semelhante.
*/