package stream_api.list.ordenacao.pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        if (!pessoaList.isEmpty()) {
            return pessoaList.stream()
                    .sorted()
                    .collect(Collectors.toList());
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        if (!pessoaList.isEmpty()) {
            return pessoaList.stream()
                    .sorted((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()))
                    .collect(Collectors.toList());
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

}
