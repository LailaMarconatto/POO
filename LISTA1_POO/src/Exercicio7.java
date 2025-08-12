import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Faça um Programa que calcule e mostre a área de um quadrado.
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira a medida do lado do quadrado: ");
		float lado = input.nextFloat();
		
		float area = lado * lado;
		
		System.out.println("A área desse quadrado é: "+area);
		
		input.close();
	}

}
