package stream_api.set.pesquisa;

import javax.swing.JOptionPane;

import stream_api.map.OperacoesBasicas.contatos.AgendaContatos;
import stream_api.set.pesquisa.tarefas.ListaTarefas;

public class Pesquisa {

	static ListaTarefas tarefas = new ListaTarefas();
	static AgendaContatos contatos = new AgendaContatos();
	
	public static void exibirMenu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Tarefa \n 2 - \n Outro - Sair"));
			switch(opc) {
				case 1:
					Tarefas();
					break;
				case 2:
					Contatos();
					break;
				default:
					break;
			}
		} while(opc >= 1 && opc <= 2);
	}
	
	private static void Tarefas() {
		int opc;
		String tarefa;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Tarefa \n 2 - Remover Tarefa \n "
					+ "3 - Exibir Tarefas nº \n 4 - Contar Tarefas nº \n 5 - Obter Tarefas Concluídas \n 6 - Obter Tarefas Pendentes "
					+ "\n 7 - Marcar Tarefa Concluída \n 8 - Marcar Tarefa Pendente \n 9 - Limpar Lista Tarefas \n Outro - Sair"));
			switch(opc) {
				case 1:
					tarefa = JOptionPane.showInputDialog("Digite o nome da tarefa");
					tarefas.adicionarTarefa(tarefa);
					break;
				case 2:
					tarefa = JOptionPane.showInputDialog("Digite o nome da tarefa");
					tarefas.removerTarefa(tarefa);
					break;
				case 3:
					System.out.println(tarefas);
					break;
				case 4:
					System.out.println(tarefas.contarTarefas());
					break;
				case 5:
					System.out.println(tarefas.obterTarefasConcluidas());
					break;
				case 6:
					System.out.println(tarefas.obterTarefasPendentes());
					break;
				case 7:
					tarefa = JOptionPane.showInputDialog("Digite o nome da tarefa");
					tarefas.marcarTarefaConcluida(tarefa);
					break;
				case 8:
					tarefa = JOptionPane.showInputDialog("Digite o nome da tarefa");
					tarefas.marcarTarefaPendente(tarefa);
					break;
				case 9:
					tarefas.limparListaTarefas();
					break;
				default:
					System.out.println("Saindo da Pesquisa");
					break;
			}
		} while(opc >= 1 && opc <= 9);
	}
	
	private static void Contatos() {
		int opc, numero;
		String nome;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Tarefa \n 2 - \n Outro - Sair"));
			switch(opc){
				case 1:
					nome = JOptionPane.showInputDialog("Digite o nome do contato");
					numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do contato"));
					contatos.adicionarContato(nome,numero);
					break;
				case 2:
					contatos.exibirContatos();
					break;
				case 3: 
					nome = JOptionPane.showInputDialog("Digite o nome do contato");
					contatos.pesquisarPorNome(nome);
					break;
				case 4: 
					nome = JOptionPane.showInputDialog("Digite o nome do contato");
					numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do contato"));
					contatos.removerContato(nome);
					break;
		    } 
		} while(opc >= 1 && opc <= 4);
	}

}
