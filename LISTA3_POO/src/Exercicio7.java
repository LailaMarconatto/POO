import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		 * 7. Faça um programa que receba dois números inteiros e gere os números inteiros que estão
		 * no intervalo compreendido por eles.
		 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira dois números inteiros: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			System.out.print(i+" ");
		}
		
		input.close();
	}

}
