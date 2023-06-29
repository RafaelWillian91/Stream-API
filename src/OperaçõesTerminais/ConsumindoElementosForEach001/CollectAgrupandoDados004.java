package OperaçõesTerminais.ConsumindoElementosForEach001;

import java.util.stream.Collectors;

public class CollectAgrupandoDados004 {

    public static void main(String[] args) {

        //Agrupando dados por algum criterio que vc especifica
        //no exemplo abaixo vamos agrupar dados de acordo com o primeiro nome dos elementos
        //atraves do Collectors.groupingBy podemos retornar uma chave e um valor de algo que comeca com determinado parametro passado
        Item.list().stream()
                .collect(Collectors.groupingBy(item -> item.name().charAt(0)))
                .forEach((k, v) -> System.out.println(k + " +> " + v));

        //Saida: A +> [Item[name=Acucar, price=4.58]]
        //       B +> [Item[name=Banana, price=10.54]]
        //       C +> [Item[name=Cebola, price=3.56], Item[name=Cebola, price=3.56], Item[name=Cafe, price=10.5]]
        //       L +> [Item[name=Leite, price=5.6]]
    }
}
