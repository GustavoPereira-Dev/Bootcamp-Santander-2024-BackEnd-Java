import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected List<String> historico;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.historico = new ArrayList<>();
	}

	@Override
	public void sacar(double valor) {
		this.historico.add(cliente.getNome() + " fez saque de " + valor + " reais");
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.historico.add(cliente.getNome() + " fez depósito de " + valor + " reais");
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.historico.add(cliente.getNome() + " fez transferência do valor de " + valor + " reais" + " para uma outra conta");
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public List<String> getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico.add(historico);
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}