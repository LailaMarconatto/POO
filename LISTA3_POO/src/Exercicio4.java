import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa
		 * anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de
		 * crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários
		 * para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
		 * taxas de crescimento. Altere o programa anterior permitindo ao usuário informar as
		 * populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a
		 * operação.
		 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira a população da cidade A: ");
		float popA = input.nextFloat();
		
		System.out.println("Insira a taxa de crescimento da cidade A: ");
		float taxaA = input.nextFloat();
		
		System.out.println("Insira a população da cidade B: ");
		float popB = input.nextFloat();
		
		System.out.println("Insira a taxa de crescimento da cidade B: ");
		float taxaB = input.nextFloat();
		
		taxaA = (taxaA/100)+1;
		taxaB = (taxaB/100)+1;
		
		int anos = 0;
		while (popA <= popB) {
			popA = popA*taxaA;
			popB = popB*taxaB;
			anos++;
		}
		
		System.out.println("A quantidade de anos necessários será: "+anos);
		
		input.close();
	}
}

