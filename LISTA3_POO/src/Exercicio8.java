import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// 8. Altere o programa anterior para mostrar no final a soma dos números.
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira dois números inteiros: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int soma = 0;
		for (int i = num1; i <= num2; i++) {
			System.out.print(i+" ");
			soma = soma+i;
		}
		
		System.out.println("A soma final é: "+ soma);
		
		input.close();
	}

}
