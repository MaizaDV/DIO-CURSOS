package exercicios.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

  private Map<String, String> dicionarioMap;

  public Dicionario() {
    this.dicionarioMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao) {
    dicionarioMap.put(palavra, definicao);
    System.out.println(palavra + " adicionada com sucesso!");
  }

  public void removerPalavra(String palavra) {
    if (dicionarioMap.isEmpty()) {
      System.out.println("Dicionário Vazio!");
    } else {
      dicionarioMap.remove(palavra);
      System.out.println(palavra + " removida(o).");
    }
  }

  public void exibirPalavras() {
    if (dicionarioMap.isEmpty()) {
      System.out.println("Dicionário Vazio!");
    } else {
      System.out.println("Exibindo dicionário ==>");
      System.out.println(dicionarioMap);
    }
  }

  public String pesquisarPorPalavra(String palavra) {
    if (dicionarioMap.isEmpty()) {
      return "Dicionário Vazio!";
    } else {
      String palavraPesquisada = dicionarioMap.get(palavra);
      if (palavraPesquisada == null) {
        return "Palavra não encontrado no Dicionário.";
      } else {
        System.out.println(palavraPesquisada);
        return palavraPesquisada;
      }
    }
  }
}
