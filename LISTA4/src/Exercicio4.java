import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram
		 * lidas. Imprima as consoantes.
		 */
		Scanner input = new Scanner (System.in);
		
		char letras[] = new char[10];
		
		for(int i = 0; i < letras.length; i++) {
			System.out.println("Insira a "+(i+1)+"° letra: ");
			letras[i] = Character.toUpperCase(input.nextLine().charAt(0));
		}
		
		int countCons = 0;
		for(int i = 0; i < letras.length ; i++) {
			if(letras[i] != 'A' && letras[i] != 'E' && letras[i] != 'I' && letras[i] != 'O' && letras[i] != 'U') {
				countCons++;
				System.out.println(letras[i]);
			}
		}
		System.out.println("Há "+countCons+" consoantes!");
		
		input.close();

	}

}
