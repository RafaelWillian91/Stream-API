package fundamentosStreams;

import java.util.List;
import java.util.stream.Collectors;

public class App005 {

    public static void main(String[] args) {

        var people = List.of(
                new Person("Rafael", 32),
                new Person("Manel", 20),
                new Person("Josiane", 32),
                new Person("Andreia", 17),
                new Person("Carlos", 44),
                new Person("Rodrigo", 31)

        );

        //Uma nova lista com os nomes das pessoas
        List peoples2 = people.stream()
                .map(Person::name)
                .filter(name -> !name.startsWith("R"))//tirar quem comeca com R
                .map(name -> name.toUpperCase())
                //.toList();
                .collect(Collectors.toList());//Ele é tao usado que ja existe o método .toList()

        System.out.println(peoples2);
    }
    record Person(String name, int age){}
}

