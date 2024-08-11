package stream_api.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        estoqueProdutosMap.forEach((cod, produto) -> 
            System.out.println("Código: " + cod + ", Produto: " + produto));
    }

    public double calcularValorTotalEstoque() {
        return estoqueProdutosMap.values().stream()
                .mapToDouble(p -> p.getQuantidade() * p.getPreco())
                .sum();
    }

    public Produto obterProdutoMaisCaro() {
        return estoqueProdutosMap.values().stream()
                .max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                .orElse(null);
    }

    public Produto obterProdutoMaisBarato() {
        return estoqueProdutosMap.values().stream()
                .min((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                .orElse(null);
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        return estoqueProdutosMap.values().stream()
                .max((p1, p2) -> Double.compare(p1.getPreco() * p1.getQuantidade(), p2.getPreco() * p2.getQuantidade()))
                .orElse(null);
    }

}
