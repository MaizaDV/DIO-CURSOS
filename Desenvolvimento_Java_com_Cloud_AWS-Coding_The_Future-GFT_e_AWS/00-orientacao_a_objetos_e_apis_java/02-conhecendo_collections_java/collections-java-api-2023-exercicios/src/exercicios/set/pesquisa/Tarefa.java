package exercicios.set.pesquisa;

public class Tarefa {

  String descricao;
  boolean status;

  public Tarefa(String descricao, boolean status) {
    this.descricao = descricao;
    this.status = status;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
  
  public String toString() {
    return "Tarefa{" +
        "descricao='" + descricao + '\'' +
        ", status=" + status +
        '}';
  }
}
