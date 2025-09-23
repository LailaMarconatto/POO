import java.util.Scanner;

public class Exercicio1Main {

	public static void main(String[] args) {
		/* Faça um programa que peça ao usuário nome e sobrenome separadamente
		e após junte-os com a mensagem “Seu nome completo é: Nome
		SobreNome”;*/
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		String nome = input.nextLine();
		
		System.out.println("Insira seu sobrenome: ");
		String sobrenome = input.nextLine();
		
		Exercicio1 pessoa = new Exercicio1(nome,sobrenome);
		
		System.out.println(pessoa);

		input.close();
	}

}
