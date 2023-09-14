package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Com a ajuda da Stream API, verifica se todos os números da lista são positivos e exibe o
 * resultado no console.
 */
public class Desafio03 {

  public static void main(String[] args) {

    System.out.println("Verifica se todos os números da lista são positivos => ");

    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    boolean isAllPositive = numList.stream().allMatch(n -> n > 0);
    System.out.println("numList => " + isAllPositive);

    List<Integer> numList2 = Arrays.asList(1, 2, 3, 4, -5, 6, 7, -8, 9, 10, 5, 4, 3);

    boolean isAllPositive2 = numList2.stream().allMatch(n -> n > 0);
    System.out.println("numList2 => " + isAllPositive2);

  }
}
