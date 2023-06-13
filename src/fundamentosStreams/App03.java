package fundamentosStreams;

import java.util.Comparator;
import java.util.List;

public class App03 {

    public static void main(String[] args) {

        var people = List.of(
                new app003.Person("Rafael", 32),
                new app003.Person("Manel", 20),
                new app003.Person("Josiane", 32),
                new app003.Person("Andreia", 17),
                new app003.Person("Carlos", 44),
                new app003.Person("Rodrigo", 31)

        );

        people.stream()
                .map(person -> person.age())
                .filter(p -> p >= 18)//Filter para filtrar quem é maior de 18 anos com lambda do tipo Predicated para condicao logica
                .sorted(Comparator.reverseOrder())
                .forEach(p -> System.out.println(p));

    }

    record Person(String name, int age){}
}
