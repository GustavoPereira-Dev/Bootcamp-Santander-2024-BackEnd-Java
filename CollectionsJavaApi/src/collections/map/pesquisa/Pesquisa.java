package collections.map.pesquisa;

import javax.swing.JOptionPane;

import collections.map.pesquisa.palavras.ContagemPalavras;
import collections.map.pesquisa.produtos.EstoqueProdutos;

public class Pesquisa {
	
	static ContagemPalavras palavras = new ContagemPalavras();
	static EstoqueProdutos produtos = new EstoqueProdutos();
	
	public static void exibirMenu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Map Palavras \n 2 - Map Produto \n Outro - Sair"));
			switch(opc) {
				case 1:
					Palavras();
					break;
				case 2:
					Produtos();
					break;
				default:
					System.out.println("Saindo de Pesquisa");
					break;
			}
		} while(opc >= 1 && opc <= 2);
		
	}
	private static void Palavras() {
		int opc, cont;
		String palavra;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Palavra "
					+ "\n 2 - Remover Palavra \n 3 - Exibir Contagem Palavras \n 4 - Encontrar Palavra mais Frequente \n 5 - Exibir Palavras \n Outro - Sair"));
			switch(opc) {
				case 1:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					cont = Integer.parseInt(JOptionPane.showInputDialog("Digite a contagem da palavra"));
					palavras.adicionarPalavras(palavra, cont);
					break;
				case 2:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					palavras.removerPalavra(palavra);
					break;
				case 3:
					System.out.println(palavras.exibirContagemPalavras());
					break;
				case 4:
					System.out.println(palavras.encontrarPalavrasMaisFrequente());
					break;
				case 5:
					System.out.println(palavras);
				default:
					System.out.println("Saindo de Palavras");
					break;
				
			}
		} while(opc >= 1 && opc <= 5);
	}
	
	private static void Produtos() {
		int opc, quantidade;
		long cod;
		String nome;
		double preco;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Produto \n 2 - Exibir Estoque "
					+ "\n 3 - Calcular valor total no estoque \n 4 - Produto mais caro \n 5 - Produto mais Barato \n 6 - Produto com maior quantidade no Estoque - Sair"));
			switch(opc) {
				case 1:
					cod = Long.parseLong(JOptionPane.showInputDialog("Digite o código do produto"));
					nome = JOptionPane.showInputDialog("Digite o nome do produto");
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto"));
					preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
					produtos.adicionarProduto(cod, nome, quantidade, preco);
					break;
				case 2:
					produtos.exibirProdutos();
					break;
				case 3:
					System.out.println(produtos.calcularValorTotalEstoque());
					break;
				case 4:
					System.out.println(produtos.obterProdutoMaisCaro());
					break;
				case 5:
					System.out.println(produtos.obterProdutoMaisBarato());
					break;
				case 6:
					System.out.println(produtos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
					break;
				default:
					System.out.println("Saindo de Estoque");
					break;
			}
		} while(opc >= 1 && opc <= 6);
		
	}
	
}
