package stream_api.list.OperacoesBasicas.compras;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class CarrinhoDeCompras {
    
    private List<Item> carrinhoCompras;
    
    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }
    
    public void removerItem(String nome) {
        int tamanhoAnterior = carrinhoCompras.size();
        
        carrinhoCompras = carrinhoCompras.stream()
                .filter(item -> !item.getNome().equalsIgnoreCase(nome))
                .collect(Collectors.toList());
        
        if (tamanhoAnterior > carrinhoCompras.size()) {
            System.out.println("Foi removido o(s) item(ns)");
        } else {
            System.out.println("Não foi encontrado nenhum item");
        }
    }
    
    public double calcularValorTotal() {
        return carrinhoCompras.stream()
                .mapToDouble(item -> item.getPreco() * item.getQuant())
                .sum();
    }
    
    public void exibirItens() {
        carrinhoCompras.forEach(System.out::println);
    }
}
