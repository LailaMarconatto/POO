import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*
		 * 14. Faça um programa que mostre os n termos da Série a seguir:
		 * • S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
		 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira um número: ");
		int num = input.nextInt();
		
		int n = 1;
		int m = 1;
		System.out.print("S =");
		for (int i = 1; i <= num; i++) {
			System.out.print(" "+n+"/"+m);
			n = n+1;
			m = m+2;
		}
		
		input.close();
	}

}
