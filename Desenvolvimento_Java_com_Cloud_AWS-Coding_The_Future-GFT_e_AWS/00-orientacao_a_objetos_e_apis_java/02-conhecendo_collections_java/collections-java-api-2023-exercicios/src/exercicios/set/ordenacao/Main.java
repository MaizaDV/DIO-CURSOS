package exercicios.set.ordenacao;

public class Main {

  public static void main(String[] args) {
    // Criando uma instância do GerenciadorAlunos
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    // Adicionando alunosSet ao gerenciador
    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

    // Exibindo todos os alunosSet no gerenciador
    System.out.println("Alunos no gerenciador:");
    System.out.println(gerenciadorAlunos.alunosSet);

    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
    gerenciadorAlunos.removerAluno(000L);
    gerenciadorAlunos.removerAluno(123457L);
    System.out.println(gerenciadorAlunos.alunosSet);

    // Exibindo alunosSet ordenados por nome
    gerenciadorAlunos.exibirAlunosPorNome();

    // Exibindo alunosSet ordenados por nota
    gerenciadorAlunos.exibirAlunosPorNota();
  }
}
