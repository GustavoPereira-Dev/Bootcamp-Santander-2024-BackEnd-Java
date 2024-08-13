package collections.set;


import collections.list.OperacoesBasicas.Operacoes;
import collections.list.ordenacao.Ordenacao;
import collections.list.pesquisa.Pesquisa;
import collections.set.OperacoesBasicas.palavras.ConjuntoPalavrasUnicas;
import collections.set.ordenacao.alunos.GerenciadorAlunos;
import collections.set.pesquisa.tarefas.ListaTarefas;

import javax.swing.JOptionPane;

public class Set {
	private static class InstanceHolder {
		public static Set instancia = new Set();
	}
	
	public static Set getInstancia() {
		return InstanceHolder.instancia;
	}
	
	public void chamarMenu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n"
					+ " 1 - Operações Básicas \n 2 - Pesquisa \n 3 - Ordenação \n Outro - Finalizar"));
			try {
				switch(opc) {
					case 1: 
						Operacoes.exibirMenu();
						break;
					case 2: 
						Pesquisa.exibirMenu();
						break;
					case 3: Ordenacao.exibirMenu();
						break;
					default:
						System.out.println("Saindo do Set");
				}
			} catch(NumberFormatException n) {
				System.out.println("Formato de número incorreto");
			} catch(RuntimeException e) {
				System.out.println("Erro: " + e.getMessage());
			} 
		} while(opc >= 1 && opc <= 3);
	}
	
}
