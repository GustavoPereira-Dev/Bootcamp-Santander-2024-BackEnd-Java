package stream_api.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            if (dicionarioMap.remove(palavra) != null) {
                System.out.println("Palavra removida com sucesso!");
            } else {
                System.out.println("Palavra não encontrada no dicionário!");
            }
        } else {
            System.out.println("O dicionário está vazio!");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.forEach((palavra, definicao) -> 
                System.out.println(palavra + ": " + definicao));
        } else {
            System.out.println("O dicionário está vazio!");
        }
    }

    public String pesquisarPorPalavras(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            return dicionarioMap.getOrDefault(palavra, "Palavra não encontrada no dicionário.");
        } else {
            return "O dicionário está vazio!";
        }
    }
}
