package collections.set.ordenacao;

import javax.swing.JOptionPane;

import collections.set.ordenacao.alunos.GerenciadorAlunos;
import collections.set.ordenacao.produtos.CadastroProdutos;



public class Ordenacao {
	
	static GerenciadorAlunos alunos = new GerenciadorAlunos();
	static CadastroProdutos produtos = new CadastroProdutos();
	
	public static void exibirMenu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Conjunto Alunos \n 2 - Conjunto Produtos \n Outro - Sair"));
			switch(opc) {
				case 1:
					Alunos();
					break;
				case 2:
					Produtos();
					break;
				default:
					System.out.println("Saindo de ordenação");
					break;
			}
		} while(opc >= 1 && opc <= 2);
	}
	private static void Alunos() {
		int opc;
		String nome;
		Long matricula;
		double media;
		
		do {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Aluno "
					+ "\n 2 - Remover Aluno \n 3 - Exibir Alunos por Nome \n 4 - Exibir Alunos por Nota \n 5 - Exibir Alunos \n Outro - Sair"));
			switch(opc) {
				case 1:
					nome = JOptionPane.showInputDialog("Digite o nome do aluno");
					matricula = Long.parseLong(JOptionPane.showInputDialog("Digite o nome do aluno"));
					media = Double.parseDouble(JOptionPane.showInputDialog("Digite o nome do aluno"));
					alunos.adicionarAluno(nome, matricula, media);
					break;
				case 2:
					matricula = Long.parseLong(JOptionPane.showInputDialog("Digite o nome do aluno"));
					alunos.removerAluno(matricula);
					break;
				case 3:
					alunos.exibirAlunosPorNome();
					break;
				case 4:
					alunos.exibirAlunosPorNota();
					break;
				case 5:
					System.out.println(alunos);
					break;
				default:
					System.out.println("Saindo de Alunos");
					break;
			}
		} while(opc >= 1 && opc <= 5);
	}
	
	private static void Produtos() {
		int opc, quantidade;
		long codigo;
		String nome;
		double preco;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Produto "
					+ "\n 2 - Exibir por nome \n 3 - Exibir por Preço \n 4 - Exibir Produtos \n Outro - Sair"));
			switch(opc){
			case 1:
				codigo = Long.parseLong(JOptionPane.showInputDialog("Digite o código do produto"));
				nome = JOptionPane.showInputDialog("Digite o nome do produto");
				preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto"));
				quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto"));
				produtos.adicionarProduto(codigo,nome,preco,quantidade);
				break;
			case 2: 
				System.out.println(produtos.exibirProdutosPorNome());
				break;
			case 3: 
				System.out.println(produtos.exibirProdutosPorPreco());
				break;
			case 4:
				System.out.println(produtos);
			default:
				System.out.println("Saindo de Produtos");
				break;
		    } 
		} while(opc >= 1 && opc <= 4);
	}
}
