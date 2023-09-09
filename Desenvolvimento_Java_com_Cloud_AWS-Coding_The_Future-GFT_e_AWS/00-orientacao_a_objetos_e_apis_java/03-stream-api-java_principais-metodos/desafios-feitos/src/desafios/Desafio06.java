package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Utiliza a Stream API para verificar se a lista contém algum número maior que 10 e exibe o
 * resultado no console.
 */
public class Desafio06 {

  public static void main(String[] args) {
    System.out.println("Verifica se a lista contém algum número maior que 10 =>");
    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    boolean isTenOnList = numList.stream().anyMatch(n -> n > 10);
    System.out.println(isTenOnList);
  }
}
