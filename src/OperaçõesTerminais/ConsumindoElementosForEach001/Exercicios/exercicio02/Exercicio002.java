package OperaçõesTerminais.ConsumindoElementosForEach001.Exercicios.exercicio02;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static OperaçõesTerminais.ConsumindoElementosForEach001.Exercicios.exercicio02.OrderSystem.allOrders;

public class Exercicio002 {

    public static void main(String[] args) {

       // queryA();
        queryB();
       // queryC();
        //queryD();
        queryE();

    }

    private static void queryA(){
        System.out.println("Pedidos por cliente:");
               OrderSystem.allOrders().stream()
                .collect(Collectors.groupingBy(c -> c.customer().name(), Collectors.counting()))
                       .forEach((k,v) -> System.out.println("Chave=> " + k + ". Valor => " + v));
    }

    private static void queryB(){
        System.out.println("Custo por pedido:");
        allOrders().stream()//summingDouble agrupa somando
                .peek(System.out::println)
                .collect(Collectors.groupingBy(o -> o.id(), Collectors.summingDouble(o -> o.price())))
                .forEach( (k, v) -> System.out.println( k + " -> " + v));
    }

    private static void queryC(){
        System.out.println("Nomes dos cliente que compraram brinquedos:");
        allOrders().stream()          //Verifica se algum elemento da stream atenden determina condicao
                .filter(s -> s.products().stream().anyMatch(p -> p.category().name().equals(OrderSystem.Category.TOY.name())))
                .map(c -> c.customer().name())
                .forEach(System.out::println);

    }
    private static void queryD(){
        System.out.println("IDs de pedidos acima de 500 ordenados por data");
        allOrders().stream()
                .filter(s -> s.price() > 20)
                .sorted(Comparator.comparing(c -> c.orderDate()))
                .map(i -> i.id() + " => " + i.price() + " Data: " + i.orderDate())
                .forEach(p -> System.out.println(p));
    }

    private static void queryE(){
        System.out.println("Preco Total pago por clientes em todos os pedidos");
        OrderSystem.allOrders().stream()
                .collect(Collectors.groupingBy(c -> c.customer().name() , Collectors.summingDouble(o -> o.price())))
                .forEach((k,v)  -> System.out.println(k + " -> " + v));
    }
}

class teste{
    private String name;
    protected int a;
    public String email;

    public teste(String name, int a, String email){
        this.a = a;
        this.name = name;
        this.email = email;
    }
}