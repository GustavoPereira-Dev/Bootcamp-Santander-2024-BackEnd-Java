package collections.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String,String> dicionarioMap;
	
	public Dicionario() {
		dicionarioMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if(!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		} else {
			System.out.println("O dicionário está vazio!");
		}
	}
	
	public void exibirPalavras() {
		if(!dicionarioMap.isEmpty()) {
			System.out.println(dicionarioMap);
		} else {
			System.out.println("O dicionário está vazio!");
		}
	}
	
	public String pesquisarPorPalavras(String palavra) {
		String palavraPorNome = null;
	    if (!dicionarioMap.isEmpty()) {
	    	palavraPorNome = dicionarioMap.get(palavra);
	      if (palavraPorNome == null) {
	        System.out.println("Contato não encontrado na agenda.");
	      }
	    } else {
	      System.out.println("A agenda de contatos está vazia.");
	    }
	    return palavraPorNome;
	}
}
