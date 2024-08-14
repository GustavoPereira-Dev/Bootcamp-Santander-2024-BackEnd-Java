package stream_api.set.OperacoesBasicas.convidados;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ConjuntoConvidados {
    // atributo
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        if (!convidadosSet.isEmpty()) {
            convidadosSet = convidadosSet.stream()
                    .filter(c -> c.getCodigoConvite() != codigoConvite)
                    .collect(Collectors.toSet());
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        if (!convidadosSet.isEmpty()) {
            convidadosSet.forEach(System.out::println);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
}

