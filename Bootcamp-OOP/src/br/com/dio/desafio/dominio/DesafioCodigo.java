package br.com.dio.desafio.dominio;

public class DesafioCodigo extends Desafio {

	int quantidadeQuestoes;
	
	public DesafioCodigo(int cargaHoraria, int dificuldade, int quantidadeQuestoes) {
		super();
	}
	
	@Override
	double calcularModelo() {
		return quantidadeQuestoes / 1.20;
	}

		
}
