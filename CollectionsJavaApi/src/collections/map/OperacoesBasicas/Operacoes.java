package collections.map.OperacoesBasicas;

import javax.swing.JOptionPane;

import collections.map.OperacoesBasicas.contatos.AgendaContatos;
import collections.map.OperacoesBasicas.dicionario.Dicionario;

public class Operacoes {
	
	static Dicionario dicionario = new Dicionario();
	static AgendaContatos contatos = new AgendaContatos();
	
	
	public static void exibirMenu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Map Palavras \n 2 - Map Contatos "
					+ "\n Outro - Sair"));
			switch(opc) {
				case 1:
					Palavras();
					break;
				case 2:
					Contatos();
					break;
				default:
					System.out.println("Saindo de operações");
					break;
			}
		} while(opc >= 1 && opc <= 2);
	}
	
	private static void Palavras() {
		
		int opc; 
		String palavra, definicao;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Palavra "
					+ "\n 2 - Remover Palavra \n 3 - Exibir Dicionário \n 4 - Pesquisa por Palavra \n Outro - Sair"));
			switch(opc) {
				case 1:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					definicao = JOptionPane.showInputDialog("Digite a definicao da palavra");
					dicionario.adicionarPalavra(palavra, definicao);
					break;
				case 2:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					dicionario.removerPalavra(palavra);
					break;
				case 3:
					System.out.println(dicionario);
					break;
				case 4:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					dicionario.pesquisarPorPalavras(palavra);
					break;
				default:
					System.out.println("Saindo da Dicionário");
					break;
				
			}
		} while(opc >= 1 && opc <= 4);
	}
	
	private static void Contatos() {
		int opc, telefone;
		String nome;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Contato "
					+ "\n 2 - Remover Contato \n 3 - Exibir Agenda \n 4 - Pesquisa por Nome \n Outro - Sair"));
			switch(opc) {
				case 1:
					nome = JOptionPane.showInputDialog("Digite o nome do Contato");
					telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome do Contato"));
					contatos.adicionarContato(nome, telefone);
					break;
				case 2:
					nome = JOptionPane.showInputDialog("Digite o nome do Contato");
					contatos.removerContato(nome);
					break;
				case 3:
					contatos.exibirContatos();
					break;
				case 4:
					nome = JOptionPane.showInputDialog("Digite o nome do Contato");
					contatos.pesquisarPorNome(nome);
					break;
				default:
					System.out.println("Saindo de Contatos");
					break;
			}
		} while(opc >= 1 && opc <= 4);
		
	}
	
}
