import java.util.Scanner;
import java.util.Arrays;

public class Exercicio7 {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre-os em ordem decrescente.
		
		Scanner input = new Scanner (System.in);
		
		int[] num = new int[3];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Insira número "+(i+1)+": ");
	        num[i] = input.nextInt();
		}
		
        Arrays.sort(num);
        
        System.out.println("Ordem decrescente: ");
        for (int i = 2; i >= 0; i--) {
        	System.out.println(num[i]);
		}

        input.close();

	}

}
