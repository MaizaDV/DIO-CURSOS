package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Utiliza a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exibe o resultado
 * no console.
 */
public class Desafio10 {

  public static void main(String[] args) {
    System.out.println("Agrupa os valores ímpares múltiplos de 3 ou de 5 =>");

    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
//.filter(n -> n % 3 == 0 && n % 2 == 1 || n % 5 == 0 && n % 2 == 1)
    numList.stream()
        .distinct()
        .filter(n -> n % 3 == 0 || n % 5 == 0)
        .filter(n -> n % 2 == 1)
        .forEach(n -> System.out.print(n + ". "));
  }
}
