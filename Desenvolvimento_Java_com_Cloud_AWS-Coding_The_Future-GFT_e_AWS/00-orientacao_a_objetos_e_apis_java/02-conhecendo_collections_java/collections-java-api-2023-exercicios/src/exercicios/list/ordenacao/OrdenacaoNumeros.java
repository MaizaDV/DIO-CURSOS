package exercicios.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

  private List<Integer> list;

  public OrdenacaoNumeros() {
    this.list = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    list.add(numero);
    System.out.println(numero + " adicionado a lista.");
  }

  public void ordenarAscendente() {
    if (list.isEmpty()) {
      System.out.println("Lista vazia!");
    } else {
      List<Integer> listCopy = new ArrayList<>(list);
      Collections.sort(listCopy);
      System.out.println("Ordem Ascendente => " + listCopy);
    }
  }

  public void ordenarDescendente() {
    if (list.isEmpty()) {
      System.out.println("Lista vazia!");
    } else {
      List<Integer> listCopy = new ArrayList<>(list);

      listCopy.sort(Comparator.reverseOrder());
      System.out.println("Ordem Descendente => " + listCopy);
    }
  }
}
