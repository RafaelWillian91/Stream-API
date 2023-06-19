package operaçõesIntermediarias.mapeandoMapmapTo;

import java.util.Comparator;
import java.util.List;

public class Exercicio002 {

    public static void main(String[] args) {

        List<Names> names = List.of(
                new Names("Rafael", List.of(3.3, 4.5, 8.0, 5.5, 9.0, 7.5)),
                new Names("Gabriel", List.of(4.3, 6.5, 3.0, 7.5, 6.0, 7.5)),
                new Names("Laravel", List.of(2.5, 4.5, 4.0, 4.5, 9.0, 9.5)),
                new Names("Joice", List.of(5.5, 5.5, 9.0, 3.5, 9.0, 6.5)),
                new Names("Jessica", List.of(9.5, 5.5, 9.0, 4.5, 10.0, 6.5)),
                new Names("Ricardo", List.of(7.5, 6.5, 2.0, 3.5, 10.0, 8.5))
        );

        names.stream()
                .map(names1 -> {
                    double avg = names1.gradles().stream().mapToDouble(n -> n).average().orElse(0);
                    System.out.println(names1.name() + " AVERAGE -> " + avg);
                    boolean pass = avg > 7.0;
                    return names1.name() + " - " + (pass ? "*Pass*" : "Fail");
                }).forEach(a -> System.out.println(a));

    }


}


record Names(
        String name,
        List<Double> gradles
) {


}