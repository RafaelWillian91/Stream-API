package operaçõesIntermediarias.mapeandoMapmapTo;

import java.time.Year;
import java.util.List;

public record Student (
        String name,
        Year yearOfBirth,
        List<Double> gradles
){

    public static List<Student> list(){
        return List.of(
                new Student("Jose", Year.of(2009), List.of(8.5,10.9,9.0)),
                new Student("Pedro", Year.of(2006), List.of(7.5,9.9,2.0)),
                new Student("Maria", Year.of(2007), List.of(6.5,10.9,1.0)),
                new Student("Sara", Year.of(2000), List.of(8.5,8.9,5.0)),
                new Student("Amanda", Year.of(2004), List.of(3.5,3.9,5.0))
        );
    }


}
