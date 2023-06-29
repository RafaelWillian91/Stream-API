package OperaçõesTerminais.ConsumindoElementosForEach001.Exercicios.exercicio02;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;

public class OrderSystem {

    public record Customer(String name) {
    }

    public record Product(String name, Category category, double price) {
    }

    //Para criar a o Objeto Order, é necessário duas outras classes.
    public record Order(Long id, Customer customer, List<Product> products, LocalDate orderDate) {

        public double price(){
           return products.stream()
                    .mapToDouble(Product::price)
                    .sum();
        }

    }
        public enum Category {
            TOY, ELETRONIC, STATIONARY;
        }

        public static List<Order> allOrders() {

            var costumer1 = new Customer("Pedro");
            var costumer2 = new Customer("Maria");
            var costumer3 = new Customer("Thiago");

            var product1 = new Product("Cell Phone", Category.ELETRONIC, 950.0);
            var product2 = new Product("Television", Category.ELETRONIC, 875.0);
            var product3 = new Product("Teddy Bear", Category.TOY, 45.0);
            var product4 = new Product("Castle", Category.TOY, 56.0);
            var product5 = new Product("a4 Paper", Category.STATIONARY, 22.5);


            var brazilianFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


            var order1 = new Order(1515L, costumer1, List.of(product1), LocalDate.parse("25/04/2022", brazilianFormatter));
            var order2 = new Order(1415L, costumer2, List.of(product2), LocalDate.of(2001, 04, 12));
            var order3 = new Order(2525L, costumer3, List.of(product3), LocalDate.of(2004, 03, 11));
            var order4 = new Order(4569L, costumer1, List.of(product4), LocalDate.of(2006, 07, 05));
            var order5 = new Order(4747L, costumer3, List.of(product5), LocalDate.of(2010, 9, 29));

            return List.of(order1, order2, order3, order4, order5);

        }


    }
