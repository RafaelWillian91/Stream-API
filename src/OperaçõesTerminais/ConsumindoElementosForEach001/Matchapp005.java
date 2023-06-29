package OperaçõesTerminais.ConsumindoElementosForEach001;

public class Matchapp005 {


    public static void main(String[] args) {

        //Diferente do .filter as operaçoes de match são finais. filter retorna outra stream, enquanto match reborna um booleano

        //allMatch -> todos elementos comecam com C?
        boolean test = Item.list().stream()
                .map(n -> n.name())
                .allMatch(n -> n.startsWith("C"));

        //Pelo menos um comeca com C
        boolean test2 = Item.list().stream()
                .map(n -> n.name())
                .anyMatch(n -> n.startsWith("C"));

        //Nenhum elemento comeca com C?
        boolean test3 = Item.list().stream()
                .map(n -> n.name())
                .noneMatch(n -> n.startsWith("C"));

        System.out.println(test);

        System.out.println(test2);

        System.out.println(test3);
    }
}
