import java.util.Scanner;

public class ContaTerminal {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		String agencia, nomeCliente;
		float saldo;
		
		System.out.println("Por favor digite o número da sua conta: ");
		numero = scan.nextInt();
		
		scan.nextLine();
		System.out.println("Por favor digite o número da agência: ");
		agencia = scan.nextLine();
		
		System.out.println("Por favor digite seu nome: ");
		nomeCliente = scan.nextLine();

		System.out.println("Por favor digite o valor de seu saldo: ");
		saldo = scan.nextFloat();
	
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
		+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
		
		scan.close();
	}
}
