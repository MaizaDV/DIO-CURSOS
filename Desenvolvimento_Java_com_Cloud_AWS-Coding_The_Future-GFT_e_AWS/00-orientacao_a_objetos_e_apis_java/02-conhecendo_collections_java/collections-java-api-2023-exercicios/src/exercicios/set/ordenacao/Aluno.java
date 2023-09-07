package exercicios.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

  String nome;
  Long matricula;
  double media;

  public Aluno(String nome, Long matricula, double media) {
    this.nome = nome;
    this.matricula = matricula;
    this.media = media;
  }

  @Override
  public int compareTo(Aluno aluno) {
    return nome.compareToIgnoreCase(aluno.getNome());
  }

  @Override
  public String toString() {
    return "Aluno{" +
        "nome='" + nome + '\'' +
        ", matricula=" + matricula +
        ", media=" + media +
        '}';
  }

  public String getNome() {
    return nome;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Aluno aluno)) {
      return false;
    }
    return Objects.equals(getMatricula(), aluno.getMatricula());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getMatricula());
  }

  public Long getMatricula() {
    return matricula;
  }

  public double getMedia() {
    return media;
  }
}

class ComparatorPorNota implements Comparator<Aluno> {

  @Override
  public int compare(Aluno aluno1, Aluno aluno2) {
    return Double.compare(aluno1.getMedia(), aluno2.getMedia());
  }
}
