package collections.map;

import javax.swing.JOptionPane;

import collections.list.OperacoesBasicas.Operacoes;
import collections.list.ordenacao.Ordenacao;
import collections.list.pesquisa.Pesquisa;

public class Map {
	
	public static void chamarMenu() {
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