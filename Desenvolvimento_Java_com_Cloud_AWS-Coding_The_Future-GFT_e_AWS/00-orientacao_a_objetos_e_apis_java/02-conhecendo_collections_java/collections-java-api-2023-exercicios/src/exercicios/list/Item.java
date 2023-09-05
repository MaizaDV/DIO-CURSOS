package exercicios.list;

/**
 * Classe item.
 */
public class Item {

  private String nome;
  private double preco;
  private int quantidade;

  /**
   * Constructor item.
   */
  public Item(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String toString() {
    return "Item{" +
        "nome='" + nome + '\'' +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        '}';
  }

  public String getNome() {
    return nome;
  }

  protected void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  protected void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  protected void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

}
