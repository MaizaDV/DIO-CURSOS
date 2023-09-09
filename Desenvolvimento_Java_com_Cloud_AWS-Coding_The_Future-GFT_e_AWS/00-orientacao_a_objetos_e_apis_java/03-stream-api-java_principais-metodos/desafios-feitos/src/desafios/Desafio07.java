package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Com a ajuda da Stream API, encontra o segundo número maior da lista e exibe o resultado no
 * console.
 */
public class Desafio07 {

  public static void main(String[] args) {
    System.out.println("Encontra o segundo número maior da lista =>");
    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // ordena em ordem decrescente
    List<Integer> sorted = numList.stream().sorted((a, b) -> b - a).toList();

    // exibe o segundo item da lista, sendo o segundo maior
    System.out.println(sorted.get(1));
  }
}
