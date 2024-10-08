package stream_api.set.ordenacao.alunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private long matricula;
	private double media;
	
	public Aluno(String nome, long matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = nota;
	}

	public String getNome() {
		return nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public double getMedia() {
		return media;
	}

	@Override
	  public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Aluno aluno)) return false;
	    return Objects.equals(getMatricula(), aluno.getMatricula());
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(getMatricula());
	  }

	  @Override
	  public int compareTo(Aluno aluno) {
	    return nome.compareTo(aluno.getNome());
	  }

	  @Override
	  public String toString() {
	    return "Aluno{" +
	        "nome='" + nome + '\'' +
	        ", matricula=" + matricula +
	        ", media=" + media +
	        '}';
	  }
	
	
	
	
}

class ComparatorNota implements Comparator<Aluno> {
	  @Override
	  public int compare(Aluno o1, Aluno o2) {
	    return Double.compare(o1.getMedia(), o2.getMedia());
	  }
	}
