package operaçõesIntermediarias.mapeandoMapmapTo;

import java.util.List;

public class Filter003 {

    public static void main(String[] args) {

        Student.list().stream()
                .filter(y -> y.yearOfBirth().getValue() > 2005)
                .forEach(name -> System.out.println(name.name()));

       var list =  Student.list().stream()
               .flatMap(grades -> grades.gradles().stream())
               .filter(newGrades -> newGrades > 5.0)
                .toList();

        System.out.println(list);

        System.out.println("---------------------");


        var listN  = Student.list().stream()
                .flatMap(n -> n.gradles().stream())
                .filter(n -> n > 4)
                 //Temos uma Stream de uma Stream, mas o flatMap prepara os dados para encadear uma operacao de saida
                         .toList();

        System.out.println(listN);
    }
}
