import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Faça um Programa que peça um número inteiro e se este número for par, transforme-o
		// em impar e vice-versa.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("insira um número: ");
		int num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("É par: vira impar");
			num = num+1;
			System.out.println("Novo numero : "+num);
		} else {
			System.out.println("É impar: vira par");
			num = num+1;
			System.out.println("Novo numero : "+num);
		}

		input.close();
		
	}

}
