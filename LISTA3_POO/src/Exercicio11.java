import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/* 11. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de
		 * números pares e a quantidade de números impares.
		 */
		Scanner input = new Scanner (System.in);
		
		int numeros[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Insira o "+(i+1)+"° número: ");
			numeros[i] = input.nextInt();
		}
		
		int pares = 0;
		int imp = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				pares++;
			} else {
				imp++;
			}
		}
		
		System.out.println("Tiveram "+pares+" pares e "+imp+" impares entre esses números");
		
		input.close();
	}

}
