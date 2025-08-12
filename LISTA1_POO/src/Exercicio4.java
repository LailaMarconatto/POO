import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira a nota 1: ");
		float n1 = input.nextFloat();
		
		System.out.println("Insira a nota 2: ");
		float n2 = input.nextFloat();
		
		System.out.println("Insira a nota 3: ");
		float n3 = input.nextFloat();
		
		System.out.println("Insira a nota 4: ");
		float n4 = input.nextFloat();
		
		float media = (n1+n2+n3+n4)/4;
		
		System.out.println("A média: "+media);
		
		input.close();
	}
}
