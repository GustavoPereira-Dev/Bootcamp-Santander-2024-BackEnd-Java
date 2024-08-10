package stream_api.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (!tarefaList.isEmpty()) {
            tarefaList = tarefaList.stream()
                    .filter(t -> !t.getDescricao().equalsIgnoreCase(descricao))
                    .collect(Collectors.toList());
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        if (!tarefaList.isEmpty()) {
            tarefaList.forEach(System.out::println);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

}
