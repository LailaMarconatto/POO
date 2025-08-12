import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira o raio do circulo: ");
		double raio = input.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área desse círculo é: "+area);
		
		input.close();
	}

}
