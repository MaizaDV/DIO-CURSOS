package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Com a Stream API, encontra a soma dos números da lista que são divisíveis tanto por 3 quanto por
 * 5 e exibe o resultado no console.
 */
public class Desafio19 {

  public static void main(String[] args) {
    System.out.println("Encontre a soma dos números divisíveis por 3 e 5 =>");

    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 4);

    int total = numList.stream()
        .distinct()
        .filter(n -> (n % 3 == 0) || (n % 5 == 0))
        .reduce(0, Integer::sum);
    System.out.println(total);
  }
}
