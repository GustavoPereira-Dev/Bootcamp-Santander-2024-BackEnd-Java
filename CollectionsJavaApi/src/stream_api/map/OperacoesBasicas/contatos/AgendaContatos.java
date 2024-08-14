package stream_api.map.OperacoesBasicas.contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.forEach((nome, telefone) -> 
                System.out.println("Nome: " + nome + ", Telefone: " + telefone));
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            return agendaContatoMap.getOrDefault(nome, null);
        } else {
            System.out.println("A agenda de contatos está vazia.");
            return null;
        }
    }

}
