package pilarespoo;

/**
 * Classe Carro.
 */
public class Carro extends Veiculo {
  /**
   * Método de ligar o carro, usando encapsulamento.
   * Chama o carro e os métodos necessários para ligar o carro.
   */
  public void ligar() {
    confereCambio();
    confereCombustivel();
    System.out.println("Carro ligado!");
  }
 
  private void confereCombustivel() {
    System.out.println("Conferindo combustível...");
  }

  private void confereCambio() {
    System.out.println("Conferindo Câmbio...");
  }
}
