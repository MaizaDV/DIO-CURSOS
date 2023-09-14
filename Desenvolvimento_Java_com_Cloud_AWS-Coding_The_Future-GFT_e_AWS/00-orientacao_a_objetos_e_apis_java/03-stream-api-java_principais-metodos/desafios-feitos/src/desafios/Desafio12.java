package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Com a ajuda da Stream API, encontra o produto de todos os números da lista e exibe o resultado no
 * console.
 */
public class Desafio12 {

  public static void main(String[] args) {
    System.out.println("Encontre o produto de todos os números da lista =>");

    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int resultado = numList.stream()
        .reduce(1, (acumulador, elemento) -> acumulador * elemento);
    System.out.println(resultado);
  }
}
