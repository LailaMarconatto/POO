import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao
		 * nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
		 */
		Scanner input = new Scanner(System.in);
		
		String user = "";
		String senha = "";
		int count = 0;
		do {
			if (count>0) {
				System.out.println("O nome e senha de usuário não podem ser iguais");
			}
			System.out.println("Insira o nome de usuário: ");
			user = input.nextLine();
			
			System.out.println("Insira a senha: ");
			senha = input.nextLine();
			
			count++;
		} while(user.equals(senha));
		
		System.out.println("Conta cadastrada!");
		
		input.close();
	}

}
