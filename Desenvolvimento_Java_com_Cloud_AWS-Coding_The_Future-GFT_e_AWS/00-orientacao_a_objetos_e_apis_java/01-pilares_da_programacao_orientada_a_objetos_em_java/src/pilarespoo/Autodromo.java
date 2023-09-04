package pilarespoo;

/**
 * Classe.
 */
public class Autodromo {
  /**
   * Para ligar o carro é necessario a verificação de combustível.
   * Para o cliente, não é interessante deixar visível os métodos
   * necessários para ligar o carro.
   */
  public static void main(final String[] args) {
    Carro jeep = new Carro();
    //jeep.confereCambio();
    //jeep.confereCombustivel();
    jeep.setChassi("245254");
    //jeep.ligar();
    
    Moto z400 = new Moto();
    z400.setChassi("123456");
    //z400.ligar();
    
    // ela mantém o método correspondente, mas não sabe qual vai ser
    // o comportamento, depende do polimorfismo da classe que a estendem
    Veiculo coriga = jeep;
    // Veiculo coriga = z400;
    coriga.ligar();
  }

}
