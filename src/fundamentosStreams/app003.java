package fundamentosStreams;

import java.util.List;

public class app003 {


    public static void main(String[] args) {

        var people = List.of(
                new Person("Rafael", 32),
                new Person("Manel", 20),
                new Person("Josiane", 32),
                new Person("Carlos", 44),
                new Person("Rodrigo", 31)

        );

        //Como acessar aoenas os nomes
        people.stream()//Retorna uma Stream, então mais uma stream pode ser encadeada
                .map(p -> p.name)//Obtida a lista de nomes atraves da lambda Functional usando um map de Stream
                .map(p -> p.toUpperCase())
                .sorted() // Tambem é uma operacao intermediária que retorna uma Stream ordenada
                .forEach(p -> System.out.println(p));//Operacao terminal usando forEach e imprimindo na tela atraves de Consumer
    }




    record Person(String name, int age){}
}
