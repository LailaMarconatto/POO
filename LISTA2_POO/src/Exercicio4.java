import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Faça um Programa que peça para entrar com um ano com 4 dígitos e determine se o
		//mesmo é ou não bissexto.
		Scanner input = new Scanner (System.in);
		
		System.out.println("insira um ano (YYYY): ");
		int ano = input.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("É bissexto");
		} else {
			System.out.println("Não é bissexto");
		}
		
		input.close();
	}

}
