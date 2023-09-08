package desafios;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a
 * exiba no console.
 */
public class Desafio01 {

  public static void main(String[] args) {
    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    System.out.println("Mostra a lista na ordem numérica, se repetições de números =>");
    numList.stream().sorted().distinct().forEach(n -> System.out.print(n + ". "));
    //.sorted().forEach(System.out::println);
  }

}
