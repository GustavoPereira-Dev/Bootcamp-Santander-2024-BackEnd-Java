package set;


import set.OperacoesBasicas.ConjuntoPalavrasUnicas;
import set.ordenacao.GerenciadorAlunos;
import set.pesquisa.ListaTarefas;

import javax.swing.JOptionPane;

public class Principal {
	static ConjuntoPalavrasUnicas operacoes = new ConjuntoPalavrasUnicas();
	static ListaTarefas pesquisa = new ListaTarefas();
	static GerenciadorAlunos ordenacao = new GerenciadorAlunos();
	
	
	public static void main(String args[]) {
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
						System.out.println("Saindo do Set");
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
		String palavra;

		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Palavra "
					+ "\n 2 - Remover Palavra \n 3 - Verificar Palavra \n 4 - Exibir Palavras \n Outro - Sair"));
			switch(opc) {
				case 1:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					operacoes.adicionarPalavra(palavra);
					break;
				case 2:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					operacoes.removerPalavra(palavra);
					break;
				case 3:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					operacoes.verificarPalavra(palavra);
					break;
				case 4:
					System.out.println(operacoes);
					break;
				default:
					System.out.println("Saindo de Operações");
					break;
			}
			
		} while(opc >= 1 && opc <= 4);
	}
	
	private static void Pesquisa() {
		int opc;
		String tarefa;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Tarefa \n 2 - Remover Tarefa \n "
					+ "3 - Exibir Tarefas nº \n 4 - Contar Tarefas nº \n 5 - Obter Tarefas Concluídas \n 6 - Obter Tarefas Pendentes "
					+ "\n 7 - Marcar Tarefa Concluída \n 8 - Marcar Tarefa Pendente \n 9 - Limpar Lista Tarefas \n Outro - Sair"));
			switch(opc) {
				case 1:
					tarefa = JOptionPane.showInputDialog("Digite o nome da tarefa");
					pesquisa.adicionarTarefa(tarefa);
					break;
				case 2:
					tarefa = JOptionPane.showInputDialog("Digite o nome da tarefa");
					pesquisa.removerTarefa(tarefa);
					break;
				case 3:
					System.out.println(pesquisa);
					break;
				case 4:
					System.out.println(pesquisa.contarTarefas());
					break;
				case 5:
					System.out.println(pesquisa.obterTarefasConcluidas());
					break;
				case 6:
					System.out.println(pesquisa.obterTarefasPendentes());
					break;
				case 7:
					tarefa = JOptionPane.showInputDialog("Digite o nome da tarefa");
					pesquisa.marcarTarefaConcluida(tarefa);
					break;
				case 8:
					tarefa = JOptionPane.showInputDialog("Digite o nome da tarefa");
					pesquisa.marcarTarefaPendente(tarefa);
					break;
				case 9:
					pesquisa.limparListaTarefas();
					break;
				default:
					System.out.println("Saindo da Pesquisa");
					break;
			}
		} while(opc >= 1 && opc <= 9);
	}
	
	private static void Ordenacao() {
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
					ordenacao.adicionarAluno(nome, matricula, media);
					break;
				case 2:
					matricula = Long.parseLong(JOptionPane.showInputDialog("Digite o nome do aluno"));
					ordenacao.removerAluno(matricula);
					break;
				case 3:
					ordenacao.exibirAlunosPorNome();
					break;
				case 4:
					ordenacao.exibirAlunosPorNota();
					break;
				case 5:
					System.out.println(ordenacao);
					break;
				default:
					System.out.println("Saindo da Ordenação");
					break;
			}
		} while(opc >= 1 && opc <= 5);
	}
}
