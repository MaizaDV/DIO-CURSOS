package exercicios.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

  private Map<String, Integer> palavrasMap;

  public ContagemPalavras() {
    this.palavrasMap = new HashMap<>();
  }

  public void adicionarPalavras(String palavra, Integer contagem) {
    palavrasMap.put(palavra, contagem);
    System.out.println(palavra + " adicionada com sucesso!");
  }

  public void removerPalavra(String palavra) {
    if (palavrasMap.isEmpty()) {
      System.out.println("Está vazio.");
    } else {
      palavrasMap.remove(palavra);
      System.out.println(palavra + " removida.");
    }
  }

  public int exibirContagemPalavras() {
    if (palavrasMap.isEmpty()) {
      System.out.println("Está vazio.");
      return 0;
    } else {
      int total = 0;
      for (Integer numero : palavrasMap.values()) {
        total += numero;
      }
      return total;
    }
  }

  public String encontrarPalavraMaisFrequente() {
    if (palavrasMap.isEmpty()) {
      // System.out.println("Está vazio.");
      return "Vazio";
    } else {
      String linguagemMaisFrequente = null;
      int maiorContagem = 0;
      for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
        if (entry.getValue() > maiorContagem) {
          maiorContagem = entry.getValue();
          linguagemMaisFrequente = entry.getKey();
        }
      }
      return linguagemMaisFrequente;
    }
  }
}
