package operaçõesIntermediarias.mapeandoMapmapTo;

public class FlatMap002 {

    public static void main(String[] args) {

        //O flatMap tambem recebe um Function e retorna uma Stream onde é possivel transformar uma lista de uma lista
        //Quando passamos um list para um outro list, temos o mesmo indices de list, com o flat a lista fica em uma só
        var list = Student.list().stream()
                .map(n -> n.gradles())
                .flatMap( l -> l.stream() )
                .toList();

        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println("--------------------------------------------");

        //Processo normal de lista para lista
        var list2 = Student.list().stream()
                .map(n -> n.gradles())
                .toList();

        System.out.println(list2);
        System.out.println(list2.get(2));
    }
}
