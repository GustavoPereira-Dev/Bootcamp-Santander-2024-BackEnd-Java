package stream_api.list.pesquisa.livros;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoLivros {
    // atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        if (!livroList.isEmpty()) {
            return livroList.stream()
                    .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                    .collect(Collectors.toList());
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        if (!livroList.isEmpty()) {
            return livroList.stream()
                    .filter(l -> l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                    .collect(Collectors.toList());
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Livro pesquisarPorTitulo(String titulo) {
        if (!livroList.isEmpty()) {
            return livroList.stream()
                    .filter(l -> l.getTitulo().equalsIgnoreCase(titulo))
                    .findFirst()
                    .orElse(null);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}
