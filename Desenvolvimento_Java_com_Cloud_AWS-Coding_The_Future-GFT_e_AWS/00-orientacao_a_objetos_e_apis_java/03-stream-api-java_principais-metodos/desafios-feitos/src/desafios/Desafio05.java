package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */
public class Desafio05 {

  public static void main(String[] args) {
    System.out.println("Calcula a média dos números maiores que 5 =>");

    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int totalMaiorQue5 = numList.stream()
        .mapToInt(n -> n)
        .filter(n -> n > 5)
        .sum();
    long tamanhoArray = numList.stream().filter(n -> n > 5).count();

    long media = totalMaiorQue5 / tamanhoArray;

    System.out.println(
        "soma: " + totalMaiorQue5 + ", tamanho: " + tamanhoArray + ", media: " + media);
  }
}
