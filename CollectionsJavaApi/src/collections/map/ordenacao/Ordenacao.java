package collections.map.ordenacao;

import javax.swing.JOptionPane;

import collections.map.ordenacao.eventos.AgendaEventos;
import collections.map.ordenacao.livros.LivrariaOnline;
import collections.map.ordenacao.livros.Livro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ordenacao {
	
	static LivrariaOnline livraria = new LivrariaOnline();
	static  AgendaEventos agenda = new AgendaEventos();
	
	public static void exibirMenu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Map Livros \n 2 - Map Eventos "
					+ "\n Outro - Sair"));
			switch(opc) {
				case 1:
					Livros();
					break;
				case 2:
					Eventos();
					break;
				default:
					System.out.println("Saindo de Ordenação");
					break;
			}
		} while(opc >= 1 && opc <= 2);
	}
	private static void Livros() {
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
					livraria.adicionarLivro(link, new Livro(titulo, autor, preco));
					break;
				case 2:
					titulo = JOptionPane.showInputDialog("Digite o título da livro: ");
					livraria.removerLivro(titulo);
					break;
				case 3:
					System.out.println(livraria.exibirLivrosOrdenadosPorPreco());
					break;
				case 4:
					System.out.println(livraria.exibirLivrosOrdenadosPorAutor());
					break;
				case 5:
					autor = JOptionPane.showInputDialog("Digite o autor do livro: ");
					System.out.println(livraria.pesquisarLivrosPorAutor(autor));
					break;
				case 6:
					System.out.println(livraria.obterLivroMaisCaro());
					break;
				case 7:
					System.out.println(livraria.obterLivroMaisBarato());
					break;
				default:
					System.out.println("Saindo da Livraria");
					break;
			}
		} while(opc >= 1 && opc <= 7);
	}
	
	private static void Eventos() {
		int opc;
		String data, nomeEvento, descricaoAtracao;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Evento "
					+ "\n 2 - Exibir Agenda \n 3 - Próximo Evento \n Outro - Sair"));
			switch(opc) {
				case 1:
					data = JOptionPane.showInputDialog("Digite a data do evento no formato 'dd-MM-yyyy' ");
					nomeEvento = JOptionPane.showInputDialog("Digite o nome do evento");
					descricaoAtracao = JOptionPane.showInputDialog("Digite a descrição da atração");
					agenda.adicionarEvento(LocalDate.parse(data, formatter), nomeEvento, descricaoAtracao);
					break;
				case 2:
					agenda.exibirAgenda();
					break;
				case 3:
					agenda.obterProximoEvento();
					break;
				default:
					System.out.println("Saindo de Agenda");
					break;
			}
		} while(opc >= 1 && opc <= 3);
		
	}
}
