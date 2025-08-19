import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/* 9. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro
		 * entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve
		 * ser conforme o exemplo abaixo:
		 * • Tabuada de 5:
		 * 5 x 1 = 5
		 * 5 x 2 = 10
		 * ...
		 * 5 x 10 = 50
		 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira um número inteiro de 1 a 10: ");
		int num1 = input.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(num1+" x "+i+" = "+(num1*i));
		}
		
		input.close();
		
	}

}
