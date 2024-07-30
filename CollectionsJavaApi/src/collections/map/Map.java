package collections.map;


import javax.swing.JOptionPane;

import collections.list.List;
import collections.map.OperacoesBasicas.Dicionario;
import collections.map.ordenacao.LivrariaOnline;
import collections.map.ordenacao.Livro;
import collections.map.pesquisa.ContagemPalavras;

public class Map {
	private static class InstanceHolder {
		public static Map instancia = new Map();
	}
	
	public static Map getInstancia() {
		return InstanceHolder.instancia;
	}
	
	static Dicionario operacoes = new Dicionario();
	static ContagemPalavras pesquisa = new ContagemPalavras();
	static LivrariaOnline ordenacao = new LivrariaOnline();
	
	
	public void chamarMenu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n"
					+ " 1 - Operações Básicas \n 2 - Pesquisa \n 3 - Ordenação \n Outro - Finalizar"));
			try {
				switch(opc) {
					case 1: OperacoesBasicas();
						break;
					case 2: Pesquisa();
						break;
					case 3: Ordenacao();
						break;
					default:
						System.out.println("Saindo do Map");
						System.exit(1);
				}
			} catch(NumberFormatException n) {
				System.out.println("Formato de número incorreto");
			} catch(RuntimeException e) {
				System.out.println("Erro: " + e.getMessage());
			} 
		} while(true);
	}
	
	private static void OperacoesBasicas() {
		int opc;
		String palavra, definicao;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Palavra "
					+ "\n 2 - Remover Palavra \n 3 - Exibir Palavras \n 4 - Pesquisa por Palavra \n Outro - Sair"));
			switch(opc) {
				case 1:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					definicao = JOptionPane.showInputDialog("Digite a definicao da palavra");
					operacoes.adicionarPalavra(palavra, definicao);
					break;
				case 2:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					operacoes.removerPalavra(palavra);
					break;
				case 3:
					System.out.println(operacoes);
					break;
				case 4:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					operacoes.pesquisarPorPalavras(palavra);
					break;
				default:
					System.out.println("Saindo da operações");
					break;
				
			}
		} while(opc >= 1 && opc <= 4);
	}
	
	private static void Pesquisa() {
		int opc, cont;
		String palavra;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Palavra "
					+ "\n 2 - Remover Palavra \n 3 - Exibir Contagem Palavras \n 4 - Encontrar Palavra mais Frequente \n Outro - Sair"));
			switch(opc) {
				case 1:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					cont = Integer.parseInt(JOptionPane.showInputDialog("Digite a contagem da palavra"));
					pesquisa.adicionarPalavras(palavra, cont);
					break;
				case 2:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					pesquisa.removerPalavra(palavra);
					break;
				case 3:
					System.out.println(pesquisa.exibirContagemPalavras());
					break;
				case 4:
					System.out.println(pesquisa.encontrarPalavrasMaisFrequente());
					break;
				default:
					System.out.println("Saindo da Pesquisa");
					break;
				
			}
		} while(opc >= 1 && opc <= 4);
	}
	
	private static void Ordenacao() {
		int opc;
		String link, titulo, autor;
		double preco;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Livro "
					+ "\n 2 - Remover Livro \n 3 - Livros Ordenados por Preço \n 4 - Ordenar Livros por Autor "
					+ "\n 5 - Pesquisa livros por Autor 6 - Livro mais Caro \n 7 - Livro mais Barato \n Outro - Sair"));
			switch(opc) {
				case 1:
					link = JOptionPane.showInputDialog("Digite o link do livro: ");
					titulo = JOptionPane.showInputDialog("Digite o título da livro: ");
					autor = JOptionPane.showInputDialog("Digite o autor do livro: ");
					preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do livro: "));
					ordenacao.adicionarLivro(link, new Livro(titulo, autor, preco));
					break;
				case 2:
					titulo = JOptionPane.showInputDialog("Digite o título da livro: ");
					ordenacao.removerLivro(titulo);
					break;
				case 3:
					System.out.println(ordenacao.exibirLivrosOrdenadosPorPreco());
					break;
				case 4:
					System.out.println(ordenacao.exibirLivrosOrdenadosPorAutor());
					break;
				case 5:
					autor = JOptionPane.showInputDialog("Digite o autor do livro: ");
					System.out.println(ordenacao.pesquisarLivrosPorAutor(autor));
					break;
				case 6:
					System.out.println(ordenacao.obterLivroMaisCaro());
					break;
				case 7:
					System.out.println(ordenacao.obterLivroMaisBarato());
					break;
				default:
					System.out.println("Saindo da Ordenação");
					break;
			}
		} while(opc >= 1 && opc <= 7);
	}
}