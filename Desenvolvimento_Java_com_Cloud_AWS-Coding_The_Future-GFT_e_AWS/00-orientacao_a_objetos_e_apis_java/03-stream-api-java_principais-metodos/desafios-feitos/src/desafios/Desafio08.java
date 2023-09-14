package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Utilizando a Stream API, realiza a soma dos dígitos de todos os números da lista e exibe o
 * resultado no console.
 */
public class Desafio08 {

  public static void main(String[] args) {
    System.out.println("Somar os dígitos de todos os números da lista =>");

    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int total = numList.stream().mapToInt(n -> n).sum();
    //numList.stream().reduce(0, Integer::sum);
    //numList.stream().reduce(0, (a, b) -> a + b);
    System.out.println(total);
  }

}
