package operaçõesIntermediarias.mapeandoMapmapTo;

import java.util.Arrays;
import java.util.List;

public class BoxedApp009 {

    public static void main(String[] args) {

        //mapToInt é especializada em trabalhar com numeros inteiros, assim como a mapToDouble....
        //Por isso o java a possibilidade de outros métodos mais específicos
        var numbers = List.of(1, 4, 6, 3, 8, 2);
        var array = numbers.stream()
                .mapToInt(c -> c)
                .toArray();


        System.out.println(numbers);

        //Quando temos uma Stream eu preciso de uma intStream eu chamo o método mapToint, mapToDouble, mapToLOng...

        //Se eu tenho uma mapToint, mapToDouble, mapToLOng... e quero uma Stream, basta chamar o método boxed

        var intBoxed = Arrays.stream(array)
                .boxed()
                .toList();

        System.out.println(intBoxed);



    }
}
