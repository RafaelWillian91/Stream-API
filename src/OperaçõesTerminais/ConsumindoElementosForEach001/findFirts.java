package OperaçõesTerminais.ConsumindoElementosForEach001;

public class findFirts {

    public static void main(String[] args) {

        //findfirst() permite que tiremos o elemento de dentro da stream e encerre ela.
       Item first = Item.list().stream()
                .filter(i -> i.price() > 5.0)
               .findFirst()
                                .orElse(null);


        System.out.println(first);

    }
}
