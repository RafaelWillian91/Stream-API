package OperaçõesTerminais.ConsumindoElementosForEach001;

import java.util.List;

public record Item(String name, double price) {

        public static List<Item> list(){

            return List.of(
                    new Item("Cebola", 3.56),
                    new Item("Cebola", 3.56),
                    new Item("Cafe", 10.50),
                    new Item("Acucar", 4.58),
                    new Item("Leite", 5.60),
                    new Item("Banana", 10.54)
            );
        }

}
