import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre o maior e o menor deles.
		
		Scanner input = new Scanner (System.in);
		
		int[] num = new int[3];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Insira número "+(i+1)+": ");
	        num[i] = input.nextInt();
		}
		
        Arrays.sort(num);
        
        System.out.println("menor: "+num[0]);
        System.out.println("maior: "+num[num.length - 1]);

        input.close();
	}

}
