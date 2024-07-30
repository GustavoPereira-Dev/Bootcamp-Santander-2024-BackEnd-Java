package stream_api.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavras(String linguagem, Integer contagem) {
        palavras.put(linguagem, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            if (palavras.remove(palavra) != null) {
                System.out.println("Palavra removida com sucesso!");
            } else {
                System.out.println("Palavra não encontrada no Map!");
            }
        } else {
            System.out.println("O Map está vazio.");
        }
    }

    public int exibirContagemPalavras() {
        return palavras.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public String encontrarPalavrasMaisFrequente() {
        return palavras.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Nenhuma palavra encontrada.");
    }
}
