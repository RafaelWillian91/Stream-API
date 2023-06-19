package operaçõesIntermediarias.mapeandoMapmapTo;

public class PeekApp008 {

    public static void main(String[] args) {

        //O Peek é uma operacao intermediária que permite fazer uma análise dos elementos da Stream
        //É bem útil em operacoes de debug, onde queremos saber o que está acontecendo na Strem

        var avg = Student.list().stream()
                .peek(c -> System.out.println("Inicial => " + c))
                        .flatMap(s -> s.gradles().stream())
                .peek(c -> System.out.println("Após o flatMap => " + c))
                        //Para pegar a média dela, foi usado o .mapToDouble que transforma a stream em um tipo primitivo
                        // para o retorna de uma Stream de Double, para o java entender que vou
                        //fazer operacoes matemáticas na Stream
                        .mapToDouble(d -> d)
                .peek(c -> System.out.println("Após o mapToDouble => " + c))
                                .average()//retorna a média
                                        .orElse(0);

        System.out.println(avg);

    }
}
