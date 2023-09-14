package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Utilizando a Stream API, verifica se a lista contém pelo menos um número negativo e exibe o
 * resultado no console.
 */
public class Desafio15 {

  public static void main(String[] args) {
    System.out.println("Verifique se a lista contém pelo menos um número negativo =>");

    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -5, 4, 3);

    boolean result = numList.stream().anyMatch(n -> n < 0);
    System.out.println(result);
  }
}
