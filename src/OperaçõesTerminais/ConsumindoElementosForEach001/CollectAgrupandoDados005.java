package OperaçõesTerminais.ConsumindoElementosForEach001;

import java.util.Comparator;
import java.util.stream.Collectors;

public class CollectAgrupandoDados005 {

    public static void main(String[] args) {

        //Existe uma segunda vertente do .collect(Collectors.groupingBy,  ) que recebe um outro Collectors para
        //passarmos o que sera mapeado com value, no exemplo ele está contando quantos elementos comecam com as letras de .charAt(0)
  Item.list().stream()
                .collect(Collectors.groupingBy(item -> item.name().charAt(0), Collectors.counting()))
          .forEach((k, v) -> System.out.println(k + " => " + v));

        System.out.println("----------------------------------------------------");


        //Somando de acordo com as inciais encontradas. Ele agrupa tudo de acordo com as inicias e soma
        Item.list().stream()
                .collect(Collectors.groupingBy(item -> item.name().charAt(0), Collectors.summingDouble(item1 -> item1.price())))
                .forEach((k, v) -> System.out.println(k + " => " + v));

        //maxBy ao reunir os grupos de acordo com um critério ele retorna o maior valor encontrado do criterio
        System.out.println("-------------.maxBy_________________");
        Item.list().stream()
                .collect(Collectors.groupingBy(item -> item.name().charAt(0), Collectors.maxBy(Comparator.comparing(Item::price))))
                .forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
