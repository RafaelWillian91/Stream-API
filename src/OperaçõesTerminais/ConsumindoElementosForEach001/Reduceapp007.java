package OperaçõesTerminais.ConsumindoElementosForEach001;

public class Reduceapp007 {

    public static void main(String[] args) {

        //Reduce transforma tudo que está na stream em uma coisa só. Um único elemento resultante
        String names =  Item.list().stream()
                .map(Item::name)//Gerada umas stream de nomes dos items
                .reduce(" ", (acum,name2) -> acum +", "+ name2);//Comeco em uma string vazia que é o acumulador, que representa acum
                                      //String::concat;
        System.out.println(names);
    }

}
