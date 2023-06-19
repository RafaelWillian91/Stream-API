package operaçõesIntermediarias.mapeandoMapmapTo;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class AppMap {

    public static void main(String[] args) {

        //O map é considerado uma funcao intermediária, pq ele pega uma coisa e transforma em outra.
        //Existe um mapToint, mapTodouble...que retornam Stream de tipos primitivos
        int[] result =  Student.list().stream()
                .map(s -> s.yearOfBirth())
                .mapToInt(y -> y.getValue())
                        .toArray();


        System.out.println(Arrays.toString(result));





















    }
}
