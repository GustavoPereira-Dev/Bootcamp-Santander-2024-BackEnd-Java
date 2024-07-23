package bootcamp.backendjava.gof;

import bootcamp.backendjava.gof.facade.Facade;
import bootcamp.backendjava.gof.singleton.SingletonEager;
import bootcamp.backendjava.gof.singleton.SingletonLazy;
import bootcamp.backendjava.gof.singleton.SingletonLazyHolder;
import bootcamp.backendjava.gof.strategy.Comportamento;
import bootcamp.backendjava.gof.strategy.ComportamentoAgressivo;
import bootcamp.backendjava.gof.strategy.ComportamentoDefensivo;
import bootcamp.backendjava.gof.strategy.ComportamentoNormal;
import bootcamp.backendjava.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Gustavo", "03652000");
	}

}
