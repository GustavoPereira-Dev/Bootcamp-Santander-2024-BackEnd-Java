package stream_api.set.ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        if (!alunosSet.isEmpty()) {
            boolean removed = alunosSet.removeIf(aluno -> aluno.getMatricula() == matricula);
            if (removed) {
                System.out.println("Aluno removido com sucesso!");
            } else {
                System.out.println("Matricula não encontrada!");
            }
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNome() {
        if (!alunosSet.isEmpty()) {
            Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
            alunosPorNome.forEach(System.out::println);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        if (!alunosSet.isEmpty()) {
            Set<Aluno> alunosPorNota = alunosSet.stream()
                    .sorted(Comparator.comparingDouble(Aluno::getMedia))
                    .collect(Collectors.toCollection(TreeSet::new));
            alunosPorNota.forEach(System.out::println);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
}
