package exercicioclasseobjeto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumeroPrimo numeroPrimo = new NumeroPrimo();

        System.out.println("Digite um numero inteiro positivo: ");
        try {
            int numero = scanner.nextInt();
            numeroPrimo.setNumero(numero);

            if (numeroPrimo.isPrimo()) {
                System.out.println("O numero " + numero + " eh primo.");
            } else {
                System.out.println("O numero " + numero + " nso eh primo.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
