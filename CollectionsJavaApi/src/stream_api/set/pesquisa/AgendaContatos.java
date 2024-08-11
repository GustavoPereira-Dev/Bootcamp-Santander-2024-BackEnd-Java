package stream_api.set.pesquisa;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {

    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if (!contatosSet.isEmpty()) {
            contatosSet.forEach(System.out::println);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        if (!contatosSet.isEmpty()) {
            return contatosSet.stream()
                    .filter(c -> c.getNome().startsWith(nome))
                    .collect(Collectors.toSet());
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        if (!contatosSet.isEmpty()) {
            return contatosSet.stream()
                    .filter(c -> c.getNome().equalsIgnoreCase(nome))
                    .peek(c -> c.setNumero(novoNumero))
                    .findFirst()
                    .orElse(null);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }



  public static void main(String[] args) {

    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContatos();

    agendaContatos.adicionarContato("João", 123456789);
    agendaContatos.adicionarContato("Maria", 987654321);
    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
    agendaContatos.adicionarContato("Ana", 88889999);
    agendaContatos.adicionarContato("Fernando", 77778888);
    agendaContatos.adicionarContato("Carolina", 55555555);

    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("Maria"));

    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
    System.out.println("Contato atualizado: " + contatoAtualizado);

    System.out.println("Contatos na agenda após atualização:");
    agendaContatos.exibirContatos();
  }
}
