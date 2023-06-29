package OperaçõesTerminais.ConsumindoElementosForEach001;

public class ProcessandostreamCountMinMaxAverage002 {

    public static void main(String[] args) {

        long l = Item.list().stream()
                .count();

        System.out.println(l);

        double max = Item.list().stream()
                .mapToDouble(n -> n.price())
                .max()
                .orElseThrow();

        System.out.println(max);

        double min = Item.list().stream()
                .mapToDouble(n -> n.price())
                .min()
                .orElseThrow();

        System.out.println(min);

        double avg = Item.list().stream()
                .mapToDouble(n -> n.price())
                .average()
                .orElseThrow();

        System.out.println(avg);

    }
}
