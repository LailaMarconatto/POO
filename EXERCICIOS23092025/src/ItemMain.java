import java.util.Scanner;

public class ItemMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cadastre um livro:");
		System.out.println("Código do livro:");
		int codLivro = input.nextInt();
		System.out.println("Nome do livro:");
		input.nextLine();
		String descLivro = input.nextLine();
		System.out.println("Autor do livro:");
		String autorLivro = input.nextLine();
		
		Livro livro = new Livro(codLivro,descLivro,autorLivro);
		
		System.out.println(livro);
		
		input.close();

	}

}
