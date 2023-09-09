package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Utilizando a Stream API, encontra a soma dos quadrados de todos os números da lista e exibe o
 * resultado no console.
 */
public class Desafio11 {

  public static void main(String[] args) {
    System.out.println("Encontre a soma dos quadrados de todos os números da lista =>");

    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int totalAoQuadrado = numList.stream()
        .reduce(0, (subtotal, element) -> subtotal + (element * element));
    System.out.println(totalAoQuadrado);
  }
}
