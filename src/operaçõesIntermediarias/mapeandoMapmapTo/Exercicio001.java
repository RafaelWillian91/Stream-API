package operaçõesIntermediarias.mapeandoMapmapTo;

import java.util.Comparator;
import java.util.List;

public class Exercicio001 {


    public static void main(String[] args) {

        List listFinal = Student2.listStudents().stream()
                .map(s -> new Ranking(
                        s.name(), s.gradles().stream().mapToDouble(n -> n).average().orElse(0)
                ))
                .sorted(Comparator.comparing((Ranking r) -> r.average()).reversed())
                .limit(3)
                        .toList();

        listFinal.stream()
                .forEach(n -> System.out.println(n));
    }
}

record Student2 (String name, List<Double> gradles){

    public static List<Student2> listStudents (){
        return List.of(
                new Student2("Rafael", List.of(3.3, 4.5, 8.0,5.5, 9.0, 7.5)),
                new Student2("Gabriel", List.of(4.3, 6.5, 3.0,7.5, 6.0, 7.5)),
                new Student2("Laravel", List.of(2.5, 4.5, 4.0,4.5, 9.0, 9.5)),
                new Student2("Joice", List.of(5.5, 5.5, 9.0,3.5, 9.0, 6.5)),
                new Student2("Jessica", List.of(9.5, 5.5, 9.0,4.5, 10.0, 6.5)),
                new Student2("Ricardo", List.of(7.5, 6.5, 2.0,3.5, 10.0, 8.5))
        );
    }

}

record Ranking(String name, double average){


}