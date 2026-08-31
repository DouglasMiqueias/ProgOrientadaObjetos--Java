package org.example;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEntidades <T>{
    private final List<T> itens = new ArrayList<>();

    public void adicionar(T item){
        itens.add(item);
    }

    public List<T> getTodos(){
        return itens;
    }
}
