package pilarespoo;

/**
 * Oferece informaçoes comuns a classe que forem herdar ela.
 *
 */
public abstract class Veiculo {
  private String chassi;

  public String getChassi() {
    return chassi;
  }

  public void setChassi(String chassi) {
    this.chassi = chassi;
  }
  // método abstrado, as classe que herdam veiculo precisaram implementar
  // este método

  public abstract void ligar();
}
