import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
		 * Ex.: 5!=5.4.3.2.1=120
		 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira um número: ");
		int n = input.nextInt();
		
		int fat = 1;
		System.out.print(n+"! = ");
		for (int i = n; i > 0; i--) {
			fat = fat*i;
			if (i > 1) {
				System.out.print(i+".");
			} else {
				System.out.print(i);
			}
		}
		
		System.out.print(" = "+fat);
		
		input.close();
	}

}
