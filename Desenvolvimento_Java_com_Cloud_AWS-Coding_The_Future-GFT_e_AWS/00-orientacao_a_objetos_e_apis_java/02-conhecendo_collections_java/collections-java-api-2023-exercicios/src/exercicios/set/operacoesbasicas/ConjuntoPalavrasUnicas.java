package exercicios.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

  private Set<String> palavrasSet;

  public ConjuntoPalavrasUnicas() {
    this.palavrasSet = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    palavrasSet.add(palavra);
    System.out.println(palavra + " adicionada a lista!");
  }

  public void removerPalavra(String palavra) {
    if (palavrasSet.isEmpty()) {
      System.out.println("Lista vazia!");
    } else {
      if (palavrasSet.contains(palavra)) {
        palavrasSet.remove(palavra);
        System.out.println("Palavra '" + palavra + "' removida do conjunto");
      } else {
        System.out.println("Palavra '" + palavra + "' não encontrada!");
      }
    }
  }

  public void verificarPalavra(String palavra) {
    boolean isInTheSet = palavrasSet.contains(palavra);
    if (isInTheSet) {
      System.out.println("A palavra '" + palavra + "' está no conjunto.");
    } else {
      System.out.println("A palavra '" + palavra + "' não está no conjunto.");
    }
  }

  public void exibirPalavrasUnicas() {
    if (palavrasSet.isEmpty()) {
      System.out.println("Lista vazia!");
    } else {
      System.out.println(palavrasSet);
    }
  }
}
