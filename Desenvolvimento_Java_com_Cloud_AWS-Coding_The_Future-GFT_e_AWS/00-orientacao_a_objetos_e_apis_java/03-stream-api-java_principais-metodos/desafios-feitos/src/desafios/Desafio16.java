package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Utiliza a Stream API para agrupar os números em duas listas separadas, uma contendo os números
 * pares e outra contendo os números ímpares da lista original, e exibe os resultados no console.
 */
public class Desafio16 {

  public static void main(String[] args) {
    System.out.println("Agrupe os números em pares e ímpares =>");

    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 4);

    List<Integer> parList = numList.stream().filter(n -> n % 2 == 0).toList();
    List<Integer> imparList = numList.stream().filter(n -> n % 2 != 0).toList();

    System.out.println("par -> " + parList);
    System.out.println("ímpar -> " + imparList);
  }
}
