package exercicios.set.ordenacao;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

  private Set<Tarefa> tarefasSet;

  public ListaTarefas() {
    this.tarefasSet = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefasSet.add(new Tarefa(descricao, false));
    System.out.println("Tarefa adicionada com sucesso!");
  }

  public void removerTarefa(String descricao) {
    if (tarefasSet.isEmpty()) {
      System.out.println("Lista de tarefa vazia!");
    } else {
      Tarefa removerTarefa = null;
      for (Tarefa tarefa : tarefasSet) {
        if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
          removerTarefa = tarefa;
          break;
        }
      }
      if (removerTarefa == null) {
        System.out.println("Tarefa não encontrada");
      } else {
        tarefasSet.remove(removerTarefa);
      }
    }
  }

  public void exibirTarefas() {
    if (tarefasSet.isEmpty()) {
      System.out.println("Lista de tarefa vazia!");
    } else {
      System.out.println(tarefasSet);
    }
  }

  public void contarTarefas() {
    if (tarefasSet.isEmpty()) {
      System.out.println("Lista de tarefa vazia!");
    } else {
      System.out.println("Existe " + tarefasSet.size() + " tarefa(s) na lista.");
    }
  }

  public void obterTarefasConcluidas() {
    if (tarefasSet.isEmpty()) {
      System.out.println("Lista de tarefa vazia!");
    } else {
      Set<Tarefa> tarefasTrue = new HashSet<>();
      for (Tarefa tarefa : tarefasSet) {
        if (tarefa.isStatus()) {
          tarefasTrue.add(tarefa);
        }
      }

      if (tarefasTrue.isEmpty()) {
        System.out.println("Lista de tarefa concluída vazia!");
      } else {
        System.out.println(tarefasTrue);
      }
    }
  }

  public void obterTarefasPendentes() {
    if (tarefasSet.isEmpty()) {
      System.out.println("Lista de tarefa vazia!");
    } else {
      Set<Tarefa> tarefasFalse = new HashSet<>();
      for (Tarefa tarefa : tarefasSet) {
        if (!tarefa.isStatus()) {
          tarefasFalse.add(tarefa);
        }
      }

      if (tarefasFalse.isEmpty()) {
        System.out.println("Lista de tarefa pendente vazia!");
      } else {
        System.out.println(tarefasFalse);
      }
    }
  }

  public void marcarTarefaConcluida(String descricao) {
    if (tarefasSet.isEmpty()) {
      System.out.println("Lista de tarefa vazia!");
    } else {
      //Set<Tarefa> tarefasFalse = new HashSet<>();
      for (Tarefa tarefa : tarefasSet) {
        if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
          if (!tarefa.isStatus()) {
            tarefa.setStatus(true);
          } else {
            System.out.println("Tarefa já concluída!");
          }
        }
      }
    }
  }

  public void marcarTarefaPendente(String descricao) {
    if (tarefasSet.isEmpty()) {
      System.out.println("Lista de tarefa vazia!");
    } else {
      //Set<Tarefa> tarefasFalse = new HashSet<>();
      for (Tarefa tarefa : tarefasSet) {
        if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
          if (tarefa.isStatus()) {
            tarefa.setStatus(false);
          } else {
            System.out.println("Tarefa já pendente!");
          }
        }
      }
    }
  }

  public void limparListaTarefas() {
    if (tarefasSet.isEmpty()) {
      System.out.println("Lista de tarefa vazia!");
    } else {
      tarefasSet.clear();
      System.out.println("Lista de tarefa limpa.");
    }
  }
}
