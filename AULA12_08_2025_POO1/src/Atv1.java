import java.util.Scanner;

public class Atv1 {

	public static void main(String[] args) {
		// pergutar valor, só aceitar se(dowhile) for par. avisar que não é par.
		Scanner input = new Scanner (System.in);
		
		int count = 0;
		int num = 0;
		do {
			if (count > 0) {
				System.out.println("Você não informou um valor par! Por favor, insira um valor par:");
			} else {
				System.out.println("Informe um valor par: ");
			}
			num = input.nextInt();
			count++;
		} while (num % 2 != 0); 
		
		if (count <= 1) {
			System.out.println("Parabéns! Você tem um cérebro. Tentativas: "+count);
		} else if (count < 3) {
			System.out.println("Você errou o digito não é? quem erraria o que é um par hahaha. Tentativas: "+count);
		} else if (count >= 3) {
			System.out.println("Você é burro? Tentativas: "+count);
		}
		
		
		input.close();
	}

}
