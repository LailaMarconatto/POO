import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/*9. Faça um programa que peça um texto e coloque-o em um vetor onde cada carácter ocupará
		 *  uma posição do vetor.
		 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira um texto: ");
		String texto = input.nextLine();
		
		char[] vetor = texto.toCharArray();

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
		
		input.close();
	}

}
