package collections.set.OperacoesBasicas;

import javax.swing.JOptionPane;

import collections.set.OperacoesBasicas.convidados.ConjuntoConvidados;
import collections.set.OperacoesBasicas.palavras.ConjuntoPalavrasUnicas;


public class Operacoes {
	
	static ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
	static ConjuntoConvidados convidados = new ConjuntoConvidados();
	
	public static void exibirMenu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Conjunto Palavras "
					+ "\n 2 - Conjunto Convidados \n Outro - Sair"));
			switch(opc) {
				case 1:
					Palavras();
					break;
				case 2:
					Convidados();
					break;
				default:
					System.out.println("Saindo de Operações");
					break;
			}
			
		} while(opc >= 1 && opc <= 4);
	}
	
	private static void Palavras() {
		
		int opc;
		String palavra;

		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Palavra "
					+ "\n 2 - Remover Palavra \n 3 - Verificar Palavra \n 4 - Exibir Palavras \n Outro - Sair"));
			switch(opc) {
				case 1:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					palavrasUnicas.adicionarPalavra(palavra);
					break;
				case 2:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					palavrasUnicas.removerPalavra(palavra);
					break;
				case 3:
					palavra = JOptionPane.showInputDialog("Digite a palavra");
					palavrasUnicas.verificarPalavra(palavra);
					break;
				case 4:
					System.out.println(palavrasUnicas);
					break;
				default:
					System.out.println("Saindo de Palavras");
					break;
			}
			
		} while(opc >= 1 && opc <= 4);
	}
	
	private static void Convidados() {
		int opc, codigoConvite;
		String nome;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Convidado "
					+ "\n 2 - Remover Convidado \n 3 - Contar Convidados \n 4 - Exibir Convidados \n Outro - Sair"));
			switch(opc) {
				case 1:
					nome = JOptionPane.showInputDialog("Digite o nome do convidado");
					codigoConvite = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do convite"));
					convidados.adicionarConvidado(nome,codigoConvite);
					break;
				case 2:
					codigoConvite = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do convite"));
					convidados.removerConvidadoPorCodigoConvite(codigoConvite);
					break;
				case 3: 
					System.out.println(convidados.contarConvidados());
					break;
				case 4: 
					convidados.exibirConvidados();
					break;
				default:
					System.out.println("Saindo de Convidados");
					break;
		    }
		} while(opc >= 1 && opc <= 4);
	}
}
