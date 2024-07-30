package stream_api.map.ordenacao;

import java.util.*;
import java.util.stream.Collectors;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livros.put(link, livro);
    }

    public void removerLivro(String titulo) {
        livros.entrySet().removeIf(entry -> entry.getValue().getTitulo().equalsIgnoreCase(titulo));
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        return livros.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(Livro::getPreco)))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        return livros.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Livro::getAutor)))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        return livros.entrySet().stream()
                .filter(entry -> entry.getValue().getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    public List<Livro> obterLivroMaisCaro() {
        double precoMaisAlto = livros.values().stream()
                .mapToDouble(Livro::getPreco)
                .max()
                .orElseThrow(() -> new NoSuchElementException("A livraria está vazia!"));

        return livros.values().stream()
                .filter(livro -> livro.getPreco() == precoMaisAlto)
                .collect(Collectors.toList());
    }

    public List<Livro> obterLivroMaisBarato() {
        double precoMaisBaixo = livros.values().stream()
                .mapToDouble(Livro::getPreco)
                .min()
                .orElseThrow(() -> new NoSuchElementException("A livraria está vazia!"));

        return livros.values().stream()
                .filter(livro -> livro.getPreco() == precoMaisBaixo)
                .collect(Collectors.toList());
    }
}
