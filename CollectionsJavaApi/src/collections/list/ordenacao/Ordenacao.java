package collections.list.ordenacao;

import javax.swing.JOptionPane;

import collections.list.ordenacao.numeros.OrdenacaoNumeros;
import collections.list.ordenacao.pessoas.OrdenacaoPessoas;

public class Ordenacao {
	
	private static class InstanceHolder {
		public static Ordenacao instancia = new Ordenacao();
	}
	
	public static Ordenacao getInstancia() {
		return InstanceHolder.instancia;
	}
	
	static OrdenacaoNumeros numeros = new OrdenacaoNumeros();
	static OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
	
	public static void exibirMenu() {
		int opc;
		opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Lista Numeros \n 2 - Lista Pessoas"));
		do {
			switch(opc) {
				case 1:
					Numeros();
					break;
				case 2:
					Pessoas();
					break;
				default:
					System.out.println("Saindo de Ordenações");
			}
		} while(opc >= 1 && opc <= 2);
	}
	
	private static void Numeros() {
		
		int opc, num;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Número "
					+ "\n 2 - Ordem Ascendente \n 3 - Ordem Descedente \n 4 - Mostrar Números \n Outro - Sair"));
	
			switch(opc) {
				case 1: 
					num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
					numeros.adicionarNumero(num);
					break;
				case 2:
					System.out.println("A ordem ascendente dos números é: " + numeros.ordenarAscendente());
					break;
				case 3:
					System.out.println("A ordem descedente é: " + numeros.ordenarDescendente());
					break;
				case 4:
					System.out.println(numeros);
				default: 
					System.out.println("Saindo de Números");
					
			}
		} while(opc >= 1 && opc <= 4);
	}
	
	private static void Pessoas() {
		
		int opc, idade;
		String nome;
		double altura;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Pessoa "
					+ "\n 2 - Ordenar por Idade \n 3 - Ordernar por altura \n 4 - Mostrar Pessoas \n Outro - Sair"));
			switch(opc){
			case 1:
				nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa"));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa"));
				pessoas.adicionarPessoa(nome, idade, altura);
				break;
			case 2: 
				System.out.println(pessoas.ordenarPorIdade());
				
				break;
			case 3: 
				System.out.println(pessoas.ordenarPorAltura());
				break;
			case 4:
				System.out.println(pessoas);
			default:
				System.out.println("Saindo de Pessoas");
		    }
		} while(opc >= 1 && opc <= 4);
	}
}
