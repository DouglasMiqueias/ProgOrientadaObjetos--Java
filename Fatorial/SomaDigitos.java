package exercicioclasseobjeto;

public class SomaDigitos {

    public int somaDosDigitos(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10; // Pega o último dígito
            numero /= 10; // Remove o último dígito
        }
        return soma;
    }
    }
