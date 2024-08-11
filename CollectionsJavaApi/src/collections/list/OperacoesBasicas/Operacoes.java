package collections.list.OperacoesBasicas;

import javax.swing.JOptionPane;

import collections.list.OperacoesBasicas.Compras.CarrinhoDeCompras;
import collections.list.OperacoesBasicas.Tarefas.ListaTarefa;

public class Operacoes {
	private static class InstanceHolder {
		public static Operacoes instancia = new Operacoes();
	}
	
	public static Operacoes getInstancia() {
		return InstanceHolder.instancia;
	}
	
	static CarrinhoDeCompras compras = new CarrinhoDeCompras();
	static ListaTarefa tarefas = new ListaTarefa();
	
	public static void exibirMenu() {
		int opc;
		opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Lista Compras \n 2 - Lista Tarefas"));
		do {
			switch(opc) {
				case 1:
					Compras();
					break;
				case 2:
					Tarefas();
					break;
			}
		} while(opc >= 1 && opc <= 2);
	}
	private static void Compras() {
		
		int opc, quant;
		String nome;
		double preco;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - adicionar item "
					+ "\n 2 - remover item \n 3 - calcular valor total \n 4 - Mostra carrinho Outro - Sair"));
	
			switch(opc) {
				case 1: 
					nome = JOptionPane.showInputDialog("Digite o nome do item");
					quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do item"));
					preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item"));
					compras.adicionarItem(nome, preco, quant);
					break;
				case 2:
					nome = JOptionPane.showInputDialog("Digite a opção");
					compras.removerItem(nome);
					break;
				case 3:
					System.out.println(compras.calcularValorTotal());
					break;
				case 4:
					compras.exibirItens();
					break;
				default: 
					System.out.println("Saindo de Operações básicas");
					
			}
		} while(opc >= 1 && opc <= 4);
	}
	
	private static void Tarefas() {
		
		int opc;
		String descricao;
	
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - adicionar item "
					+ "\n 2 - remover item \n 3 - calcular valor total \n 4 - Mostra carrinho Outro - Sair"));
	
			switch(opc){
				case 1:
					descricao = JOptionPane.showInputDialog("Digite a descrição");
					tarefas.adicionarTarefa(descricao);
					break;
				case 2:
					descricao = JOptionPane.showInputDialog("Digite a descrição");
					tarefas.removerTarefa(descricao);
					break;
				case 3: 
					System.out.println("Total: " + tarefas.obterNumeroTotalTarefas());
					
					break;
				case 4: 
					System.out.println("Total: " + tarefas.obterNumeroTotalTarefas());
					break;
		    }
		} while(opc >= 1 && opc <= 4);
	}
}
