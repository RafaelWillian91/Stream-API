package fundamentosStreams;

import java.util.List;

public class App004 {

    public static void main(String[] args) {

        var people = List.of(
                new Person("Rafael", 32),
                new Person("Manel", 20),
                new Person("Josiane", 32),
                new Person("Andreia", 17),
                new Person("Carlos", 44),
                new Person("Rodrigo", 31)

        );

        //Para obter o numero maximo, minimo ou a media.
        int result = people.stream()
                .mapToInt(p -> p.age())//Retorno do Tipo intStream para trabalhar diretamente com primitivos
                .max()//Sendo uma intStream é possivel abrir Opcao para uma Operacao final que retorna um Optional. Com Map nao é possivel.
                .orElse(0);

        System.out.println(result);

        //Minimo
        int resultMin = people.stream()
                .mapToInt(p -> p.age())//Retorno do Tipo intStream para trabalhar com primitivos
                .min()//Operacao final que retorna um Optional
                .orElse(0);

        System.out.println(resultMin);

        //Media
        double resultAvg = people.stream()
                .mapToInt(p -> p.age())//Retorno do Tipo intStream para trabalhar com primitivos
                .average()//Operacao final que retorna um Optional
                .orElse(0);

        System.out.println(resultAvg);

    }

    record Person(String name, int age){}
}
