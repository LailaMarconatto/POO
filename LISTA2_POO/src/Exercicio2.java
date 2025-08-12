import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um Programa que peça um valor e mostre na tela se o valor é positivo, negativo ou zero.
		Scanner input = new Scanner (System.in);
		
		System.out.println("insira um número: ");
		int n = input.nextInt();
		
		if (n > 0) {
			System.out.println("O número é positivo");
		} else if (n < 0) {
			System.out.println("O número é negativo");
		} else {
			System.out.println("O número é zero");
		}
		
		input.close();
	}

}
