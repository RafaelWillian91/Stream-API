package OperaçõesTerminais.ConsumindoElementosForEach001;

public class Reduceapp006 {

    public static void main(String[] args) {

        double soma = Item.list().stream()
                .mapToDouble(n -> n.price())
                .sum();

        System.out.println(soma);

        //Em uma operacao de reduce passamos o valor inicial e depois uma funcao que no caso é de soma
        double soma2 = Item.list().stream()
                .mapToDouble(n -> n.price())
                .reduce(2.0, Double::sum);//Foi passado dos elementos em apenas um (accum, v) -> DoubleBinaryOperator double .applyAsDouble(double left, double right);
                //Nessa operacao de reduce esta sendo passado o identity como acumulador e esse método recebe uma expressao lambda (accum, v).
                //é possivel usar o method Reference pq o o Double::sum é um metodo que atende aos quesitos da expressao lambda para DoubleBinaryOperator

        System.out.println(soma2);
    }
}
