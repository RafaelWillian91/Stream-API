package operaçõesIntermediarias.mapeandoMapmapTo;

public class DistinctApp005 {

    public static void main(String[] args) {

        //Eliminando elementos duplicados com disctinct
        //Caso os dados são referencias de mémorias devemos implementar o equals e hashCode como visto em aular anterioes
        var grades  = Student.list().stream()
                .flatMap(s -> s.gradles().stream())
                .distinct()
                .toList();

        System.out.println(grades);


    }
}
