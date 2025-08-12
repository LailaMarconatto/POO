import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// Faça um Programa que peça um número correspondente a um determinado ano e em
		//seguida informe se este ano é ou não bissexto.
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
