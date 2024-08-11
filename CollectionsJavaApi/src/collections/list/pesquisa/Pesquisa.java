package collections.list.pesquisa;

import javax.swing.JOptionPane;

import collections.list.pesquisa.livros.CatalogoLivros;
import collections.list.pesquisa.numeros.SomaNumeros;



public class Pesquisa {
	
	private static class InstanceHolder {
		public static Pesquisa instancia = new Pesquisa();
	}
	
	public static Pesquisa getInstancia() {
		return InstanceHolder.instancia;
	}
	
	static CatalogoLivros livros = new CatalogoLivros();
	static SomaNumeros numeros = new SomaNumeros(); 
	
	public static void exibirMenu() {
		int opc;
		opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Lista Livros \n 2 - Lista Numeros"));
		do {
			switch(opc) {
				case 1:
					Livros();
					break;
				case 2:
					Numeros();
					break;
			}
		} while(opc >= 1 && opc <= 2);
	}
	
	private static void Numeros() {
		int opc, num;
		
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Número \n 2 - Calcular Soma \n "
					+ "3 - Encontrar o maior nº \n 4 - Encontrar o menor nº \n 5 - Exibir Números \n Outro - Sair"));
	
			switch(opc) {
				case 1: 
					num = Integer.parseInt(JOptionPane.showInputDialog("Digite a número"));
					numeros.adicionarNumero(num);
					break;
				case 2:
					System.out.println("A soma dos números é: " + numeros.calcularSoma());
					break;
				case 3:
					System.out.println("O maior número é: " + numeros.encontrarMaiorNumero());
					break;
				case 4:
					System.out.println("O maior número é: " + numeros.encontrarMenorNumero());
					break;
				case 5:
					numeros.exibirNumeros();
					break;
				default: 
					System.out.println("Saindo de Pesquisa");
					
			}
		} while(opc >= 1 && opc <= 5);
	}
	
	private static void Livros() {
		int opc, anoPublicacao, anoInicial, anoFinal;
		String titulo, autor;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Número \n 2 - Calcular Soma \n "
					+ "3 - Encontrar o maior nº \n 4 - Encontrar o menor nº \n 5 - Exibir Números \n Outro - Sair"));
			switch(opc) {
				case 1:
					titulo = JOptionPane.showInputDialog("Digite o título do livro");
					autor = JOptionPane.showInputDialog("Digite o autor do livro");
					anoPublicacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de publicação do livro"));
					livros.adicionarLivro(titulo, autor, anoPublicacao);
					break;
				case 2:
					autor = JOptionPane.showInputDialog("Digite o autor do livro");
					System.out.println(livros.pesquisarPorTitulo(autor));
					break;
				case 3: 
					anoInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano inicial do intervalo"));
					anoFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano final do intervalo"));
					livros.pesquisarPorIntervaloAnos(anoInicial,anoFinal);
					break;
				case 4: 
					titulo = JOptionPane.showInputDialog("Digite o titulo do livro");
					livros.pesquisarPorTitulo(titulo);
					break;
		    }
		} while(opc >= 1 && opc <= 4);
	}
}
