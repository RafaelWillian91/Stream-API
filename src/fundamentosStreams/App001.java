package fundamentosStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App001 {

    public static void main(String[] args) {

        //Inicializando Streams
        Stream<String> s1 = Stream.of("A", "B", "C");

        List<String> list = List.of("A", "B", "C");
        Stream<String> s2 = list.stream();

        String[] arrays = {"A", "B", "C"};
        Stream<String> s3 = Arrays.stream(arrays);


        //Operacoes intermediaria retorna uma nova Stream
        //forEach é uma operacao Terminal.
        s1.forEach(System.out::println);
        s2.forEach(System.out::println);
        s3.forEach(System.out::println);

    }
}
