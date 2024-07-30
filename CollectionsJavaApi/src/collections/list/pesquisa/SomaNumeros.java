package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	private List<Numero> numeroList;

	public SomaNumeros() {
		this.numeroList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeroList.add(new Numero(numero));
	}
	
	public int calcularSoma() {
		int soma = 0;
		if(!numeroList.isEmpty()) {
			for(Numero n: numeroList) {
				soma += n.getNumero();
			}
			return soma;
		} else {
			throw new RuntimeException("A lista de números está vazia!");
		}
	}
	
	public int encontrarMaiorNumero() {
		int maior = Integer.MIN_VALUE;
		if(!numeroList.isEmpty()) {
			for(Numero n: numeroList) {
				if(n.getNumero() > maior) {
					maior = n.getNumero(); 
				}
			}
			return maior;
		} else {
			throw new RuntimeException("A lista de números está vazia!");
		}
	}
	
	public int encontrarMenorNumero() {
		int menor = Integer.MAX_VALUE;
		if(!numeroList.isEmpty()) {
			for(Numero n: numeroList) {
				if(n.getNumero() < menor) {
					menor = n.getNumero(); 
				}
			}
			return menor;
		} else {
			throw new RuntimeException("A lista de números está vazia!");
		}
	}
	
	public void exibirNumeros() {
		System.out.println(numeroList);
	}
}
