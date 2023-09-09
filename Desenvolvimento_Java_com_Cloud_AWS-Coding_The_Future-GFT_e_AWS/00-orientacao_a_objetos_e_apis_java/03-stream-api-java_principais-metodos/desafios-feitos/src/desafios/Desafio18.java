package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Utilizando a Stream API, verifica se todos os números da lista são iguais e exibe o resultado no
 * console.
 */
public class Desafio18 {

  public static void main(String[] args) {
    System.out.println("Verifique se todos os números da lista são iguais =>");

    List<Integer> numList = Arrays.asList(2, 2, 2, 2);

    long tamanhoListSemRepeticao = numList.stream().distinct().count();

    // ao fazer a distinção, se houver itens repetidos na coleção, o item é retirado da coleção e
    // consequentemente a coleção diminui
    // logo se existir apenas um valor na lista após a distinção, todos os números eram iguais
    System.out.println(tamanhoListSemRepeticao == 1);
  }
}
