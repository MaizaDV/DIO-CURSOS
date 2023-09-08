package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Utiliza a Stream API para remover os valores ímpares da lista e imprime a lista resultante no
 * console.
 */
public class Desafio04 {

  public static void main(String[] args) {
    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    System.out.println("Remove todos os valores ímpares =>");

    numList.stream()
        .mapToInt(n -> n)
        .filter(n -> n % 2 != 0)
        .distinct()
        .forEach(n -> System.out.print(n + ". "));
  }
}
