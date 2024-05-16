package estabelecimento;

import navegadorinternet.NavegadorInternet;
import reprodutormusical.IPod;
import reprodutormusical.ReprodutorMusical;

import aparelhotelefonico.AparelhoTelefonico;
import aparelhotelefonico.Phone;
import navegadorinternet.Internet;

import iphone.IPhone;

public class Fabrica {
	public static void main(String args[]) {
		IPod iPod = new IPod();
		Phone phone = new Phone();
		Internet internet = new Internet();
		
		ReprodutorMusical reprodutorMusical = iPod;
		AparelhoTelefonico aparelhoTelefonico = phone;
		NavegadorInternet navegadorInternet = internet;
		
		IPhone iphone = new IPhone();
		
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		reprodutorMusical.selecionarMusica();
		
		aparelhoTelefonico.ligar();
		aparelhoTelefonico.atender();
		aparelhoTelefonico.iniciarCorreioVoz();
		
		navegadorInternet.exibirPagina();
		navegadorInternet.adicionarNovaAba();
		navegadorInternet.atualizarPagina();
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
	}
}
