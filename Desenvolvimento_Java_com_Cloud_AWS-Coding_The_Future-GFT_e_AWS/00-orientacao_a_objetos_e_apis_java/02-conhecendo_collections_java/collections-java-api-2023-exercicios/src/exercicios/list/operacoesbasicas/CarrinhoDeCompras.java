package exercicios.list.operacoesbasicas;

import exercicios.list.operacoesbasicas.Item;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe Carrinho de Compras.
 */
public class CarrinhoDeCompras {

  private List<Item> itemList;

  /**
   * Inicia o carrinho de compras com um array vazio.
   */
  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }

  /**
   * Adiciona item ao carrinho.
   */
  public void adicionarItem(String nome, double preco, int quantidade) {
    itemList.add(
        new Item(nome, preco, quantidade)
    );
    System.out.println(nome + " adicionado ao carrinho!");
  }

  /**
   * Remove itens do carrinho, fazendo a busca pelo nome.
   */
  public void removerItem(String nome) {
    List<Item> removeItemList = new ArrayList<Item>();

    if (itemList.isEmpty()) {
      System.out.println("Sem itens no carrinho!");
    } else {
      for (Item item : itemList) {
        if (item.getNome().equalsIgnoreCase(nome)) {
          removeItemList.add(item);
        }
      }
      itemList.removeAll(removeItemList);
      System.out.println(nome + " removido");
    }
  }

  /**
   * Exibe o valor total da lista do carrinho.
   */
  public void calcularValorTotal() {
    double total = 0d;
    if (itemList.isEmpty()) {
      System.out.println("Sem itens no carrinho!");
    } else {
      for (Item item : itemList) {
        double valorItens = item.getPreco() * item.getQuantidade();
        total += valorItens;
      }

      System.out.println("Total: " + total);
    }
  }

  /**
   * Exibe os itens no carrinho de compras.
   */
  public void exibirItens() {
    if (itemList.isEmpty()) {
      System.out.println("Sem itens no carrinho!");
    } else {
      for (Item item : itemList) {
        System.out.println(item.toString());
      }
    }
  }
}
