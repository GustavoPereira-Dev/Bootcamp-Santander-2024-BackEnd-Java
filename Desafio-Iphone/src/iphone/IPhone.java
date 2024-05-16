package iphone;

import aparelhotelefonico.AparelhoTelefonico;
import navegadorinternet.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA VIA IPHONE");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA VIA IPHONE");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA VIA IPHONE");
	}

	@Override
	public void ligar() {
		System.out.println("LIGANDO VIA IPHONE");
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO VIA IPHONE");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO VOZ VIA IPHONE");
	}

	@Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA VIA IPHONE");		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MÚSICA VIA IPHONE");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MÚSICA VIA IPHONE");
	}

}
