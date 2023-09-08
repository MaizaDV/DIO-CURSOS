package exercicios.map.ordenacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class LivrariaOnline {

  private Map<String, Livro> livrariaMap;

  public LivrariaOnline() {
    this.livrariaMap = new HashMap<>();
  }

  public void adicionarLivro(String link, Livro livro) {
    livrariaMap.put(link, livro);
    System.out.println(livro.getAutor() + " adicionado.");
  }

  public void removerLivro(String titulo) {
    if (livrariaMap.isEmpty()) {
      System.out.println("Vazio");
    } else {
      List<String> chavesRemover = new ArrayList<>();
      for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
        if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
          chavesRemover.add(entry.getKey());
        }
      }
      for (String chave : chavesRemover) {
        livrariaMap.remove(chave);
        System.out.println(chave + " removido");
      }
    }
  }

  public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
    return new TreeMap<>(livrariaMap);
  }

  public void pesquisarLivrosPorAutor(String autor) {
    if (livrariaMap.isEmpty()) {
      System.out.println("Vazio");
    } else {
      Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
      for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
        Livro livro = entry.getValue();
        if (livro.getAutor().equals(autor)) {
          livrosPorAutor.put(entry.getKey(), livro);
        }
      }
      System.out.println(livrosPorAutor);
    }
  }


  public List<Livro> obterLivroMaisCaro() {
    List<Livro> livrosMaisCaros = new ArrayList<>();
    double precoMaisAlto = Double.MIN_VALUE;

    if (!livrariaMap.isEmpty()) {
      for (Livro livro : livrariaMap.values()) {
        if (livro.getPreco() > precoMaisAlto) {
          precoMaisAlto = livro.getPreco();
        }
      }
    } else {
      throw new NoSuchElementException("A livraria está vazia!");
    }

    for (Entry<String, Livro> entry : livrariaMap.entrySet()) {
      if (entry.getValue().getPreco() == precoMaisAlto) {
        Livro livroComPrecoMaisAlto = livrariaMap.get(entry.getKey());
        livrosMaisCaros.add(livroComPrecoMaisAlto);
      }
    }
    return livrosMaisCaros;
  }

  public List<Livro> obterLivroMaisBarato() {
    List<Livro> livrosMaisBaratos = new ArrayList<>();
    double precoMaisBaixo = Double.MAX_VALUE;

    if (!livrariaMap.isEmpty()) {
      for (Livro livro : livrariaMap.values()) {
        if (livro.getPreco() < precoMaisBaixo) {
          precoMaisBaixo = livro.getPreco();
        }
      }
    } else {
      throw new NoSuchElementException("A livraria está vazia!");
    }

    for (Entry<String, Livro> entry : livrariaMap.entrySet()) {
      if (entry.getValue().getPreco() == precoMaisBaixo) {
        Livro livroComPrecoMaisBaixo = livrariaMap.get(entry.getKey());
        livrosMaisBaratos.add(livroComPrecoMaisBaixo);
      }
    }
    return livrosMaisBaratos;
  }
}
