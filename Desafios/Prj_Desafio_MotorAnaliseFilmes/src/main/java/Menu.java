import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    int opcao = -1;

    while(opcao != 0){
        System.out.println("\n=== MOTOR DE ANÁLISE DE FILMES ===");
        System.out.println("1- Cadastrar novo filme");
        System.out.println("2- Listar todos os filmes");
        System.out.println("3 - Filtrar por Categoria e Nota Mínima");
        System.out.println("4 - Buscar Títulos Ordenados a Partir de um Ano");
        System.out.println("5 - Ver Média de Notas por Categoria");
        System.out.println("6 - Exibir Filme com Maior Orçamento");
        System.out.println("7 - Verificar Se Existe Filme Antigo de Alta Avaliação");
        System.out.println("8 - Agrupar Filmes por Categoria (Map)");
        System.out.println("9 - Calcular Orçamento Total Investido");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");

        try{
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao){
                case 1 -> {
                }
            }
        }
    }
}
