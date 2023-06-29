package OperaçõesTerminais.ConsumindoElementosForEach001;

import java.util.Map;
import java.util.stream.Collectors;

public class CollectMap {

    public static void main(String[] args) {

        //Elementos de uma stream podem ser transformados em maps
        //Cada item é um par de chave e valor fornecido para o método .toMap ensinando o java quem sera a chave e o valor do Map
       var maps = Item.list().stream()
               .distinct()
                .collect(Collectors.toMap(Item::name,Item::price));

        System.out.println(maps);
    }
}
