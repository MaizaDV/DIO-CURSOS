package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Com a ajuda da Stream API, filtra os números primos da lista e exibe o resultado no console
 */
public class Desafio17 {

  public static void main(String[] args) {
    System.out.println("Filtrar os números primos da lista =>");

    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 4);

    List<Integer> primosList = numList.stream()
        .filter(n -> !(n % 2 == 0) && !(n % 3 == 0) && !(n % 5 == 0))
        .toList();
    System.out.println(primosList);
  }
}
