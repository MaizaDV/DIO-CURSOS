package desafios;


import java.util.Arrays;
import java.util.List;

/**
 * Utilizando a Stream API, realiza a soma dos números pares da lista e exibe o resultado no
 * console.
 */
public class Desafio02 {

  public static void main(String[] args) {
    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 4);

    System.out.println("Imprime a soma dos números pares da lista =>");

    int totalPar = numList.stream()
        .filter(n -> n % 2 == 0)
        .mapToInt(n -> n)
        .sum();
    System.out.println(totalPar);
  }
}
