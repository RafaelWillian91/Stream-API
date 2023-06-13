package fundamentosStreams;

import java.util.Arrays;
import java.util.Random;

public class App007 {

    public static void main(String[] args) {

        //Numeros Randomicos
        Random r1 = new Random();

        //dentro de random existe o método ints para retorno do tipo Stream
        int[] inteiros = r1.ints(10,1,10)
                            .sorted()
                            .toArray();//Pq é preciso uma operacao final para descarregar os dados
        System.out.println(Arrays.toString(inteiros));

        double[] doubles = r1.doubles(10,1,10)
                .sorted()
                .toArray();//Pq é preciso uma operacao final para descarregar os dados
        System.out.println(Arrays.toString(doubles));

    }
}
