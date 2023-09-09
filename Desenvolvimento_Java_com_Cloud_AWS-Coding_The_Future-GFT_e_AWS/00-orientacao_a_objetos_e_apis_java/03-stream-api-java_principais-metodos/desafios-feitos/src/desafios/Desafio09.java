package desafios;

import java.util.Arrays;
import java.util.List;

/**
 * Com a Stream API, verifica se todos os números da lista são distintos (não se repetem) e exibe o
 * resultado no console.
 */
public class Desafio09 {

  public static void main(String[] args) {
    System.out.println("Verificar se todos os números da lista são distintos (não se repetem) =>");
    List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    long tamanhoList = numList.size();
    long tamanhoListSemRepeticao = numList.stream().distinct().count();

    // ao fazer a distinção, se houver itens repetidos na coleção, o item é retirado da coleção e
    // consequentemente a coleção diminui
    // Se o tamanho da coleção sem distinção for do mesmo tamanho da coleção apos a distinção, não
    // existem itens repetidos,
    // se o tamanho das duas coleções forem diferentes, então existem itens repetidos, pois ela
    // diminuiu
    System.out.println(tamanhoList == tamanhoListSemRepeticao);

  }
}
