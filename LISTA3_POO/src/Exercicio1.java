import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
		 * seja inválido e continue pedindo até que o usuário informe um valor válido.
		 */
		Scanner input = new Scanner(System.in);
		
		int nota = 0;
		int count = 0;
		do {
			if (count>0) {
				System.out.println("Ops! A nota inserida deve estar entre zero e dez... ");
			}
			System.out.println("Insira uma nota, entre zero e dez: ");
			nota = input.nextInt();
			count++;
		} while(nota < 0 || nota > 10);
		
		System.out.println("Nota inserida com sucesso!");
		
		input.close();
	}

}
