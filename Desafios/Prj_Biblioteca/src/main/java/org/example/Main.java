package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        GerenciadorEntidades<Livro> acervo = new GerenciadorEntidades<>();
        acervo.adicionar(new Livro("978-1", "Java para Iniciantes", "Fernanda Kipper", "Tecnologia", 89.90));
        acervo.adicionar(new Livro("978-2", "Estruturas de Dados em Java", "Fernanda Kipper", "Tecnologia", 110.00));
        acervo.adicionar(new Livro("978-3", "Clean Code", "Robert C. Martin", "Tecnologia", 130.00));
        acervo.adicionar(new Livro("978-4", "O Hobbit", "J.R.R. Tolkien", "Fantasia", 50.00));

        // 1. Fila de atendimento (Queue com LinkedList)
        Queue<String> fila = new LinkedList<>();
        fila.add("Douglas");
        fila.add("Eduardo");
        fila.add("Fernando");

        System.out.println("Atendendo cliente: " + fila.poll());

        // 2. Filtragem e Mapeamento com Stream API
        List<String> tecnologia = acervo.getTodos().stream()
                .filter(l -> l.categoria().equals("Tecnologia"))
                .map(l -> l.titulo().toUpperCase())
                .toList();

        System.out.println("\nLivros de tecnologia: " + tecnologia);

        // 3. Redução / Soma de valores com Stream API
        double totalAcervo = acervo.getTodos().stream()
                .mapToDouble(Livro::preco)
                .sum();

        System.out.printf("Valor total dos livros no acervo: R$ %.2f%n", totalAcervo);

        // 4. Agrupamento em Map<String, Set<String>>
        Map<String, Set<String>> mapLivros = acervo.getTodos().stream()
                .collect(Collectors.groupingBy(
                        Livro::autor,
                        Collectors.mapping(Livro::titulo, Collectors.toSet())
                ));

        System.out.println("\nLivros por autor:");
        // Correção dos parênteses na Lambda abaixo:
        mapLivros.forEach((autor, titulos) ->
                System.out.println("- " + autor + ": " + titulos)
        );

        System.out.println(acervo.getTodos());
    }
}