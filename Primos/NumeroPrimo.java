package exercicioclasseobjeto;

public class NumeroPrimo {
    private int numero;

    // Getter
    public int getNumero() {
        return numero;
    }

    // Setter
    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            throw new IllegalArgumentException("O número deve ser maior que zero.");
        }
    }

    public boolean isPrimo() {
        if (numero < 2) {
            return false; // Números menores que 2 não são primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; // É primo
    }
}

/* PRINCIPAL
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
*/
