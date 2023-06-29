package OperaçõesTerminais.ConsumindoElementosForEach001.Exercicios.exercicios01;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Exercicio001 {

    public static void main(String[] args) {

        System.out.println(count("Java is my favorite Language"));
        System.out.println(count(null));




    }

    public static Map<Character, Long> count (String str){
        //Abordagem evita valores nulos. Caso str for nulo sera criado um Optional vazio.
        return  Optional.ofNullable(str)//Optional.ofNullable(str): Essa linha cria um Optional com base no valor da string str. Se a string str for nula, um Optional vazio será criado.
                .map(String::toUpperCase)// Essa linha converte a string para letras maiúsculas usando o método toUpperCase(). Isso garante que as letras maiúsculas e minúsculas sejam tratadas como iguais na contagem.
                .stream()//Essa linha converte o Optional em um stream, permitindo a manipulação dos caracteres individualmente.
                .flatMapToInt(String::chars)//Essa linha transforma o stream de caracteres em um stream de inteiros usando o método chars(), que retorna um IntStream. Isso permite a manipulação direta dos valores numéricos dos caracteres.
                .mapToObj(i -> (char) i)//Essa linha converte os inteiros de volta para caracteres usando um casting explícito.
                .filter(c -> !Character.isWhitespace(c))//Essa linha filtra os caracteres, excluindo aqueles que são espaços em branco usando o método
                .collect(Collectors.groupingBy(// Essa linha coleta os caracteres e realiza a contagem de ocorrências de cada um. O método groupingBy() agrupa os caracteres, e o método counting() conta o número de ocorrências de cada caractere.
                                                // O resultado é um mapa em que as chaves são os caracteres e os valores são as contagens.
                        Function.identity(),//ou c -> c
                        Collectors.counting()));

    }


}
