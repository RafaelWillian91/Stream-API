package OperaçõesTerminais.ConsumindoElementosForEach001;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectColetandoElementosListasConjuntos {

    public static void main(String[] args) {

        //O collect execulta a operacao de coletar os elemetos da stream e fazer algo com eles
        //Normalmente ao usar o collect usamos o collector para essa operacao

        List list = Item.list().stream()
                .collect(Collectors.toList());

        System.out.println(list);

        List list2 = Item.list().stream()
                .collect(Collectors.toUnmodifiableList());//Lista imutavel

        System.out.println(list2);

        //collect para retorno de Set
        Set listSet = Item.list().stream()
                .collect(Collectors.toSet());

        System.out.println(listSet);

        //Set imutavel e ao fazer essa operacao os elementos duplicados são perdidos devido a particularidade do Set
        Set listSetUn = Item.list().stream()
                .collect(Collectors.toUnmodifiableSet());

        System.out.println(listSetUn);


        ///toList é tao famoso que existe o método toList direto
        List list4 = Item.list().stream().toList();

        System.out.println(list4);
    }
}
