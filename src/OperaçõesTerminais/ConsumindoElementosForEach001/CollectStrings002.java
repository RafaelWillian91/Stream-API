package OperaçõesTerminais.ConsumindoElementosForEach001;

import java.util.stream.Collectors;

public class CollectStrings002 {

    public static void main(String[] args) {

        //método joining de modo geral concatena todos os elementos. Ele tem outras vertentes que podem colocar delimitadores
        var itens = Item.list().stream()
                .map(Item::name)
                .collect(Collectors.joining());

        System.out.println(itens);

        //Ele tem outras vertentes que podem colocar delimitadores
        var itens2 = Item.list().stream()
                .map(Item::name)
                .collect(Collectors.joining(" | "));

        System.out.println(itens2);

        //Inclusive com delimitadores no inicio e no fim
        var itens3 = Item.list().stream()
                .map(Item::name)
                .collect(Collectors.joining(" | ", "->", "<-"));

        System.out.println(itens3);
    }
}
