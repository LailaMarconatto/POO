import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		// Faça um Programa que peça um número e então mostre a mensagem O número
		// informado foi [número].
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira um número: ");
		int num = input.nextInt();
		System.out.println("O número informado foi: "+num);
		
		input.close();
	}
}
