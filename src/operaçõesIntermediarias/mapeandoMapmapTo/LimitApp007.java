package operaçõesIntermediarias.mapeandoMapmapTo;

public class LimitApp007 {

    public static void main(String[] args) {

        //O limit faz um corte nos elementos que voce precisa, Se o limit for maior ele não limita.
       var name =  Student.list().stream()
                .map(n -> n.name())
                .sorted()
                .limit(2)
                .toList();
        System.out.println(name);
    }
}
