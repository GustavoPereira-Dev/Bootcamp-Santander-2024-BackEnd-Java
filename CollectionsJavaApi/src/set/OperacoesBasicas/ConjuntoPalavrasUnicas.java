package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	
	private Set<String> palavrasSet;
	
	public ConjuntoPalavrasUnicas() {
		palavrasSet = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavrasSet.add(new String(palavra));
	}
	
	public void removerPalavra(String palavra) {
	    if (!palavrasSet.isEmpty()) {
	      
	    	if (palavrasSet.contains(palavra)) {
	    		palavrasSet.remove(palavra);
	    		System.out.println("Palavra encontrada e removida do conjunto!");
	    	} else {
	    	    System.out.println("Palavra não encontrada no conjunto!");
	    	}
	    } else {
	    	System.out.println("O conjunto está vazio!");
	    }
	}
	
	public boolean verificarPalavra(String palavra) {
	    return palavrasSet.contains(palavra);
	 }
	
	public void exibirPalavrasUnicas() {
	    if(!palavrasSet.isEmpty()) {
	      System.out.println(palavrasSet);
	    } else {
	      System.out.println("O conjunto está vazio!");
	    }
	  }
}
