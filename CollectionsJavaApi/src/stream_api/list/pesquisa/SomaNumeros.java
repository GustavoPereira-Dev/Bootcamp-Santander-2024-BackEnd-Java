package stream_api.list.pesquisa;

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
        return numeroList.stream()
                .mapToInt(Numero::getNumero)
                .sum();
    }
    
    public int encontrarMaiorNumero() {
        return numeroList.stream()
                .mapToInt(Numero::getNumero)
                .max()
                .orElseThrow(() -> new RuntimeException("A lista de números está vazia!"));
    }
    
    public int encontrarMenorNumero() {
        return numeroList.stream()
                .mapToInt(Numero::getNumero)
                .min()
                .orElseThrow(() -> new RuntimeException("A lista de números está vazia!"));
    }
    
    public void exibirNumeros() {
        numeroList.forEach(System.out::println);
    }
}
