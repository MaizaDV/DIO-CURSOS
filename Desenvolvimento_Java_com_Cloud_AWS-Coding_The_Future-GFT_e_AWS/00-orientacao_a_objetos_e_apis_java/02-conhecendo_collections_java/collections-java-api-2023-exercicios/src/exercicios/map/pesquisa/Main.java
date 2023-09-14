package exercicios.map.pesquisa;

public class Main {

  public static void main(String[] args) {
    ContagemPalavras contagemLinguagens = new ContagemPalavras();

    // Adiciona linguagens e suas contagens
    contagemLinguagens.adicionarPalavras("Java", 2);
    contagemLinguagens.adicionarPalavras("Python", 8);
    contagemLinguagens.adicionarPalavras("JavaScript", 1);
    contagemLinguagens.adicionarPalavras("C#", 6);

    // Exibe a contagem total de linguagens

    System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");
//    contagemLinguagens.exibirContagemPalavras();
    // Encontra e exibe a linguagem mais frequente
    String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
  }
}
