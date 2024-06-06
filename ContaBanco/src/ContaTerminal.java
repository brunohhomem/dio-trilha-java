import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da conta");
		int numero = sc.nextInt();
		System.out.print("Usuário: " + numero);
		System.out.println();
		
		System.out.println("Por favor, digite o número da agência");
		String agencia = sc.next();
		System.out.println();
		
		System.out.println("Por favor, digite seu nome");
		String nome = sc.next();
		System.out.println();
		
		System.out.println("Por favor, digite seu saldo");
		double saldo = sc.nextDouble();
		System.out.println();
		
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
	}

}
