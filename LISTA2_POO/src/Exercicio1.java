import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um Programa que peça dois números e imprima o maior deles.
		Scanner input = new Scanner (System.in);
		
		System.out.println("insira num1: ");
		int num1 = input.nextInt();
		
		System.out.println("insira num2: ");
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("num1 é maior");
		} else {
			System.out.println("num2 é maior");
		}
		
		input.close();
	}

}
