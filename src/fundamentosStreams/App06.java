package fundamentosStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class App06 {

    public static void main(String[] args) {

        //Outra forma de trabalhar com Stream é usando o metodo Static da classe Generate
        //generate gera uma lista infinita de numeros, então temos que limitar
        List<Integer> lisNUmbers = Stream.generate(() -> 5).limit(6).toList();
        System.out.println(lisNUmbers);

        //Existe tambem a geracao para cada tipo primitivo
        double[] doubles = DoubleStream.generate(() -> 4.5).limit(3).toArray();//Não exist o toList, pq uma lista é de Integer e nao de tipos primitivos
        System.out.println(Arrays.toString(doubles));
    }
}
