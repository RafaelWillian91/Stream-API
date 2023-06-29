package OperaçõesTerminais.ConsumindoElementosForEach001;

import java.util.stream.Collectors;

public class Collect0006 {


    public static void main(String[] args) {

        //partitioningBy ele recebe um predicate e agrupa quem atende a determinada condicao passada 
        Item.list().stream()
                .collect(Collectors.partitioningBy(i -> i.price() >= 6))
                        .forEach((k,v ) -> System.out.println(k + " -> " + v));




    }
}
