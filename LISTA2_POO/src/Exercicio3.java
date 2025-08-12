import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra
		// escrever: F - Feminino, M - Masculino.
		Scanner input = new Scanner (System.in);
		
		System.out.println("insira seu sexo (F ou M): ");
		String sexo = input.nextLine();
		
		if  (sexo.equals("F")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Masculino");
		}
		
		input.close();
	}

}
