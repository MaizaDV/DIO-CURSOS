package exercicios.list.pesquisa;

public class Main {

  public static void main(String[] args) {
    // Criando uma instância da classe SomaNumeros
    SomaNumeros somaNumeros = new SomaNumeros();

    // Adicionando números à lista
    somaNumeros.adicionarNumero(5);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(-2);
    somaNumeros.adicionarNumero(10);

    // Exibindo a lista de números adicionados
    System.out.println("Números adicionados:");
    somaNumeros.exibirNumeros();

    // Calculando e exibindo a soma dos números na lista
    somaNumeros.calcularSoma();

    // Encontrando e exibindo o maior número na lista
    somaNumeros.encontrarMaiorNumero();

    // Encontrando e exibindo o menor número na lista
    somaNumeros.encontrarMenorNumero();
  }
}
