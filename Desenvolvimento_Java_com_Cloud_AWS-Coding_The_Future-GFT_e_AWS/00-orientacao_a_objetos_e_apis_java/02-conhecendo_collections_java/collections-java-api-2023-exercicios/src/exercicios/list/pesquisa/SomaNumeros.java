package exercicios.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe.
 */
public class SomaNumeros {

  private List<Integer> list;

  /**
   * Constructor.
   */
  public SomaNumeros() {
    this.list = new ArrayList<>();
  }

  /**
   * @param numero Adiciona um número à lista de números
   */
  public void adicionarNumero(int numero) {
    list.add(numero);
    System.out.println(numero + " adicionado a lista.");
  }

  public void calcularSoma() {
    if (list.isEmpty()) {
      System.out.println("A lista está vazia!");
    } else {
      int total = 0;
      for (int item : list) {
        total += item;
      }
      System.out.println("O total é: " + total);
    }
  }

  public void encontrarMaiorNumero() {
    if (list.isEmpty()) {
      System.out.println("A lista está vazia!");
    } else {
      int MAX_NUM = 0;
      for (int item : list) {
        if (item > MAX_NUM) {
          MAX_NUM = item;
        }
      }
      System.out.println("O maior número da lista é: " + MAX_NUM);
    }
  }

  public void encontrarMenorNumero() {
    if (list.isEmpty()) {
      System.out.println("A lista está vazia!");
    } else {
      int MIN_NUM = 0;
      for (int item : list) {
        if (item < MIN_NUM) {
          MIN_NUM = item;
        }
      }
      System.out.println("O menor número da lista é: " + MIN_NUM);
    }
  }

  public void exibirNumeros() {
    if (list.isEmpty()) {
      System.out.println("A lista está vazia!");
    } else {
      System.out.println(list);
    }
  }
}
