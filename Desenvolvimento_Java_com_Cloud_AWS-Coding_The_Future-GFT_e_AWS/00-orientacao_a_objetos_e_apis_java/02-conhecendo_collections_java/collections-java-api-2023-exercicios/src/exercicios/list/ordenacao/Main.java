package exercicios.list.ordenacao;

public class Main {

  public static void main(String[] args) {
// Criando uma instância da classe OrdenacaoNumeros
    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

    // Adicionando números à lista
    numeros.adicionarNumero(2);
    numeros.adicionarNumero(5);
    numeros.adicionarNumero(4);
    numeros.adicionarNumero(1);
    numeros.adicionarNumero(99);

    // Ordenando e exibindo em ordem ascendente
    numeros.ordenarAscendente();

    // Ordenando e exibindo em ordem descendente
    numeros.ordenarDescendente();
    
  }
}
