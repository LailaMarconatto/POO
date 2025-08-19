import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/* 10. Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro
		 * número elevado ao segundo número. Não utilize a função de potência da linguagem.
		 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira dois números inteiros: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println(num1+" elevado a "+num2+" é igual a: ");
		
		int total = 1;
		for (int i = 1; i <= num2; i++) {
			if (i == 1) {
				System.out.print(num1);
			} else {
				System.out.print(" x "+num1);
			}
			total = total * num1;
		}
		
		System.out.println(" = "+ total);
		
		input.close();
	}

}
