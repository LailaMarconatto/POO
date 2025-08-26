import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*11. Faça um programa que tenha como entrada várias palavras separadas por ;
		 * (rodrigo;curvello;antonio;....) separe as palavras e coloque cada uma em uma posição do
		 * vetor
		 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira várias palavras separadas por ';' :");
		String texto = input.nextLine();
		
		String[] palavras = texto.split(";");

		for (String palavra : palavras) {
            System.out.println(palavra);
        }
		
		input.close();
	}

}
