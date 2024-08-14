package stream_api.set.OperacoesBasicas.palavras;
import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> palavrasSet;
    
    public ConjuntoPalavrasUnicas() {
        palavrasSet = new HashSet<>();
    }
    
    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }
    
    public void removerPalavra(String palavra) {
        if (!palavrasSet.isEmpty()) {
            if (palavrasSet.remove(palavra)) {
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
        if (!palavrasSet.isEmpty()) {
            palavrasSet.forEach(System.out::println);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
}
