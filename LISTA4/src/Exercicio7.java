import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/* 7. Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação
		 * e os números.
		 */
		Scanner input = new Scanner (System.in);
		
		int numeros[] = new int[5];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Insira o numero: ");
			numeros[i] = input.nextInt();
		}
		
		int soma = 0;
		int mult = 1;
		
		for (int numero : numeros) {
			System.out.print(" | "+numero);
			soma += numero;
			mult *= numero;
		}
		
		System.out.println(" | ");
		System.out.println("Soma: "+soma);
		System.out.println("Multiplicação: "+mult);
		
		input.close();
	}

}
