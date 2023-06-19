package operaçõesIntermediarias.mapeandoMapmapTo;

import java.util.Comparator;

public class SortedApp006 {

    public static void main(String[] args) {

        //Existem duas vertentes do sorted, que ordena os elementos.
        //A primeira é um sorted sem parametros, que ordena na ordem natural
        //A segunda ordena através de um Comparator que ensina como a comparacao deve ser feita
        //Comparator é uma functional inteface que recebe dos obejtos e retorna a ordenação como o programdor prefira
        //O fato é que ao receber um Comparator o programador está livre como fazer assim como desejar
        var names = Student.list().stream()
                .map(n -> n.name())
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(names);

    }
}
