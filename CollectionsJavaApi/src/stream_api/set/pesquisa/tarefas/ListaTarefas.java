package stream_api.set.pesquisa.tarefas;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (!tarefasSet.isEmpty()) {
            boolean removed = tarefasSet.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
            if (removed) {
                System.out.println("Palavra encontrada e removida do conjunto!");
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirTarefas() {
        if (!tarefasSet.isEmpty()) {
            tarefasSet.forEach(System.out::println);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        return tarefasSet.stream()
                .filter(Tarefa::isConcluida)
                .collect(Collectors.toSet());
    }

    public Set<Tarefa> obterTarefasPendentes() {
        return tarefasSet.stream()
                .filter(t -> !t.isConcluida())
                .collect(Collectors.toSet());
    }

    public void marcarTarefaConcluida(String descricao) {
        tarefasSet.stream()
                .filter(t -> t.getDescricao().equalsIgnoreCase(descricao))
                .forEach(t -> t.setConcluida(true));
    }

    public void marcarTarefaPendente(String descricao) {
        tarefasSet.stream()
                .filter(t -> t.getDescricao().equalsIgnoreCase(descricao))
                .findFirst()
                .ifPresentOrElse(
                        t -> t.setConcluida(false),
                        () -> System.out.println("Tarefa não encontrada na lista.")
                );
    }

    public void limparListaTarefas() {
        if (tarefasSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            tarefasSet.clear();
        }
    }
}
