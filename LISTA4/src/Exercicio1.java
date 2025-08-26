import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
		Scanner input = new Scanner (System.in);
		
		int numeros[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Insira o "+(i+1)+"° número do vetor: ");
			numeros[i] = input.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print(" "+numeros[i]);
		}
		
		input.close();
	}

}
