package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Com a Stream API, encontra o maior número primo da lista e exibe o resultado no console.
 */
public class Desafio14 {

  public static void main(String[] args) {

    System.out.println("Encontre o maior número primo da lista =>");

    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // https://educacao.uol.com.br/disciplinas/matematica/numeros-primos-veja-algoritmo-para-encontra-los.htm
    Integer result = numList.stream()
        .filter(n -> !(n % 2 == 0) && !(n % 3 == 0) && !(n % 5 == 0))
        .max(Comparator.naturalOrder())
        .orElseThrow(() -> new NoSuchElementException(
            "Não foi possível encontrar o maior número primo da lista."));
    System.out.println(result);
  }
}
