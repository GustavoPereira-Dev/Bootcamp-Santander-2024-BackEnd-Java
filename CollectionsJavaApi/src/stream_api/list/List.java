package stream_api.list;


import stream_api.list.OperacoesBasicas.Operacoes;
import stream_api.list.pesquisa.Pesquisa;
import stream_api.list.ordenacao.Ordenacao;

import javax.swing.JOptionPane;

public class List {

	public static void chamarMenu() {
		
		
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n"
					+ " 1 - Operações Básicas \n 2 - Pesquisa \n 3 - Ordenação \n Outro - Finalizar"));
			try {
				switch(opc) {
					case 1: Operacoes.exibirMenu();
						break;
					case 2: Pesquisa.exibirMenu();
						break;
					case 3: Ordenacao.exibirMenu();
						break;
					default:
						System.out.println("Saindo da lista");
				}
			} catch(NumberFormatException n) {
				System.out.println("Formato de número incorreto");
			} catch(RuntimeException e) {
				System.out.println("Erro: " + e.getMessage());
			} 
		} while(opc >= 1 && opc <= 3);
	}
	
	
}
