package exercicios.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

  Set<Aluno> alunosSet;

  public GerenciadorAlunos() {
    this.alunosSet = new HashSet<>();
  }

  public void adicionarAluno(String nome, Long matricula, double media) {
    alunosSet.add(new Aluno(nome, matricula, media));
  }

  public void removerAluno(long matricula) {
    if (alunosSet.isEmpty()) {
      System.out.println("Lista de alunosSet vazia!");
    } else {
      Aluno removerAluno = null;
      for (Aluno aluno : alunosSet) {
        if (aluno.getMatricula().equals(matricula)) {
          removerAluno = aluno;
          break;
        }
      }

      if (removerAluno == null) {
        System.out.println("Aluno não encontrada");
      } else {
        alunosSet.remove(removerAluno);
        System.out.println("Aluno removido.");
      }

    }
  }

  public void exibirAlunosPorNome() {
    if (alunosSet.isEmpty()) {
      System.out.println("Lista de alunos vazia!");
    } else {
      Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
      System.out.println("Exibir Alunos Por Nome =>");
      System.out.println(alunosPorNome);

    }
  }

  public void exibirAlunosPorNota() {
    if (alunosSet.isEmpty()) {
      System.out.println("Lista de alunos vazia!");
    } else {
      Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
      alunosPorNota.addAll(alunosSet);
      System.out.println("Exibir Alunos Por Nota =>");
      System.out.println(alunosPorNota);
    }
  }
}
