import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/* Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa a
		 * ordem lida.
		 */
		Scanner input = new Scanner (System.in);
		
		float numeros[] = new float[10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Insira o "+(i+1)+"° número do vetor: ");
			numeros[i] = input.nextFloat();
		}
		
		for(int i = numeros.length-1; i >= 0 ; i--) {
			System.out.print(" "+numeros[i]);
		}
		
		input.close();
	}

}
