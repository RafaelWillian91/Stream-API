package OperaçõesTerminais.ConsumindoElementosForEach001;

import java.util.function.Consumer;

public class ConsumindoElementosForEach001 {

    public static void main(String[] args) {

        //O forEach é um dos poucos elementos que podem ser usandos sem o método .stream(). É um atalho.
        Item.list()
                .forEach(i -> System.out.println(i));


    }
}
