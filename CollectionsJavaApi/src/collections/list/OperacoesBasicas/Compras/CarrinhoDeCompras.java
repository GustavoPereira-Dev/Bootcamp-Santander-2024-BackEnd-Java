package collections.list.OperacoesBasicas.Compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> carrinhoCompras;
	
	public CarrinhoDeCompras() {
		this.carrinhoCompras = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoCompras.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
	    List<Item> ItemsParaRemover = new ArrayList<>();
	    int tamanhoAnterior;
	    if (!carrinhoCompras.isEmpty()) {
	      for (Item i : carrinhoCompras) {
	        if (i.getNome().equalsIgnoreCase(nome)) {
	        	ItemsParaRemover.add(i);
	        }
	      }
	      tamanhoAnterior = carrinhoCompras.size();
	      
	      carrinhoCompras.removeAll(ItemsParaRemover);
	      
	      if(tamanhoAnterior > carrinhoCompras.size()) System.out.println("Foi removido o(s) item(ns)");
	      if(tamanhoAnterior == carrinhoCompras.size()) System.out.println("Não foi encontrado nenhum item");
	    } else {
	    	System.out.println("O carrinho está vazio!!");
	    }
	  }
	
	public double calcularValorTotal() {
		double valorTotal = 0d;
	    if (!carrinhoCompras.isEmpty()) {
	      for (Item i : carrinhoCompras) {
	        valorTotal = i.getPreco() * i.getQuant();
	      }
	      return valorTotal;
	    } else {
	    	throw new RuntimeException("O carrinho está vazio!!");
	    }
	  }
	
	public void exibirItens() {
		System.out.println(carrinhoCompras);
	}
	
	 
	
}
