package list;


import list.OperacoesBasicas.CarrinhoDeCompras;
import list.pesquisa.SomaNumeros;
import list.ordenacao.OrdenacaoNumeros;
import javax.swing.JOptionPane;

public class Principal {
	static CarrinhoDeCompras operacoes = new CarrinhoDeCompras();
	static SomaNumeros pesquisa = new SomaNumeros();
	static OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();
	
	
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
						System.out.println("Saindo da lista");
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
		int opc, quant;
		String nome;
		double preco;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - adicionar item "
					+ "\n 2 - remover item \n 3 - calcular valor total \n 4 - Mostra carrinho Outro - Sair"));
	
			switch(opc) {
				case 1: 
					nome = JOptionPane.showInputDialog("Digite o nome do item");
					quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do item"));
					preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item"));
					operacoes.adicionarItem(nome, preco, quant);
					break;
				case 2:
					nome = JOptionPane.showInputDialog("Digite a opção");
					operacoes.removerItem(nome);
					break;
				case 3:
					System.out.println(operacoes.calcularValorTotal());
					break;
				case 4:
					operacoes.exibirItens();
					break;
				default: 
					System.out.println("Saindo de Operações básicas");
					
			}
		} while(opc >= 1 && opc <= 4);
	}
	
	private static void Pesquisa() {
		int opc, num;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Número \n 2 - Calcular Soma \n "
					+ "3 - Encontrar o maior nº \n 4 - Encontrar o menor nº \n 5 - Exibir Números \n Outro - Sair"));
	
			switch(opc) {
				case 1: 
					num = Integer.parseInt(JOptionPane.showInputDialog("Digite a número"));
					pesquisa.adicionarNumero(num);
					break;
				case 2:
					System.out.println("A soma dos números é: " + pesquisa.calcularSoma());
					break;
				case 3:
					System.out.println("O maior número é: " + pesquisa.encontrarMaiorNumero());
					break;
				case 4:
					System.out.println("O maior número é: " + pesquisa.encontrarMenorNumero());
					break;
				case 5:
					pesquisa.exibirNumeros();
					break;
				default: 
					System.out.println("Saindo de Pesquisa");
					
			}
		} while(opc >= 1 && opc <= 5);
	}
	
	private static void Ordenacao() {
		int opc, num;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n 1 - Adicionar Número "
					+ "\n 2 - Ordem Ascendente \n 3 - Ordem Descedente \n Outro - Sair"));
	
			switch(opc) {
				case 1: 
					num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
					ordenacao.adicionarNumero(num);
					break;
				case 2:
					System.out.println("A ordem ascendente dos números é: " + ordenacao.ordenarAscendente());
					break;
				case 3:
					System.out.println("A ordem descedente é: " + ordenacao.ordenarDescendente());
					break;
				default: 
					System.out.println("Saindo de Ordenação");
					
			}
		} while(opc >= 1 && opc <= 3);
	}
}
