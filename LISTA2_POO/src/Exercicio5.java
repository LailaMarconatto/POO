import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Faça um Programa que verifique se uma letra digitada é vogal.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("insira uma letra: ");
		String letra = input.nextLine();
		
		String[] vogais = {"A","E","I","O","U"};
		
		boolean ehVogal = false;
		
		for (String vogal : vogais) {
		    if (vogal.equals(letra)) {
		    	ehVogal = true;
		    	break;
		    }
		}
		
		if (ehVogal) {
			System.out.println("É vogal");
		} else {
			System.out.println("É consoante");
		}

		input.close();
	}

}
