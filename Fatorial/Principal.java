package exercicioclasseobjeto;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nUmero inteiro maior ou igual a 10: ");
        int numero = scanner.nextInt();

        if (numero >= 10) {
            SomaDigitos somaDigitos = new SomaDigitos();
            int soma = somaDigitos.somaDosDigitos(numero);
            System.out.println("A soma dos digitos do número eh: " + soma);
        } else {
            System.out.println("O numero deve ser maior ou igual a 10.");
        }

        scanner.close();
    }
}
