package collections.map;


import javax.swing.JOptionPane;

import collections.list.List;
import collections.list.OperacoesBasicas.Operacoes;
import collections.list.ordenacao.Ordenacao;
import collections.list.pesquisa.Pesquisa;
import collections.map.OperacoesBasicas.dicionario.Dicionario;
import collections.map.ordenacao.livros.LivrariaOnline;
import collections.map.ordenacao.livros.Livro;
import collections.map.pesquisa.palavras.ContagemPalavras;

public class Map {
	private static class InstanceHolder {
		public static Map instancia = new Map();
	}
	
	public static Map getInstancia() {
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
						System.out.println("Saindo de Map");
						break;
				}
			} catch(NumberFormatException n) {
				System.out.println("Formato de número incorreto");
			} catch(RuntimeException e) {
				System.out.println("Erro: " + e.getMessage());
			} 
		} while(true);
	}
	
}