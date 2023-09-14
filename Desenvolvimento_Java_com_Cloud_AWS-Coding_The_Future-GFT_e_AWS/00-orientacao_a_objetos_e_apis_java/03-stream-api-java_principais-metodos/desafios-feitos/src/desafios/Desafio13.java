package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Utiliza a Stream API para filtra os números que estão dentro de um intervalo específico (por
 * exemplo, entre 5 e 10) e exibe o resultado no console.
 */
public class Desafio13 {

  public static void main(String[] args) {
    System.out.println(
        "Filtrar os números que estão dentro de um intervalo (por exemplo, entre 5 e 10) =>"
    );

    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> numListInterval = numList.stream().limit(10).skip(4).toList();

    System.out.println(numListInterval);
  }
}
