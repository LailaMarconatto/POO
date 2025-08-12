import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Faça um Programa que peça dois números e imprima a soma.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("insira num1: ");
		int num1 = input.nextInt();
		
		System.out.println("insira num2: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("A soma é: "+sum);
		
		input.close();
	}

}
