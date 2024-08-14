package stream_api.set.ordenacao.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        if (!produtoSet.isEmpty()) {
            return produtoSet.stream()
                    .sorted()
                    .collect(Collectors.toCollection(TreeSet::new));
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Produto> exibirProdutosPorPreco() {
        if (!produtoSet.isEmpty()) {
            return produtoSet.stream()
                    .sorted(new ComparatorPorPreco())
                    .collect(Collectors.toCollection(TreeSet::new));
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
}
