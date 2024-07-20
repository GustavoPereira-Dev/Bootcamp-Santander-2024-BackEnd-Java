package br.com.dio.desafio.dominio;

public abstract class Desafio extends Conteudo {
	private int cargaHoraria;
	private int dificuldade;
	@Override
	
	public double calcularXp() {
		return ((XP_PADRAO * cargaHoraria) * dificuldade) * calcularModelo();
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}


	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


	public int getDificuldade() {
		return dificuldade;
	}


	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}

	abstract double calcularModelo();
	

}
