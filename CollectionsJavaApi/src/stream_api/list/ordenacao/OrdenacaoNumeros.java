package stream_api.list.ordenacao;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class OrdenacaoNumeros {
    // atributos
    private List<Integer> numerosList;

    // construtor
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        if (!numerosList.isEmpty()) {
            return numerosList.stream()
                    .sorted()
                    .collect(Collectors.toList());
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        if (!numerosList.isEmpty()) {
            return numerosList.stream()
                    .sorted((a, b) -> b - a)
                    .collect(Collectors.toList());
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}