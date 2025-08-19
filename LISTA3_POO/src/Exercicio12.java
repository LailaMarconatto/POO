import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 *  12. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um
		 *  programa capaz de gerar a série até o n−ésimo termo.
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira a quantidade de números a serem gerados: ");
		int num = input.nextInt();
		
		int anterior = 0;
		int atual = 1;
		int aux = 0;
		
		for (int i = 0; i < num; i++) {
			System.out.println(atual);
			aux = anterior + atual;
			anterior = atual;
			atual = aux;
		}
		
		
		input.close();
	}

}
