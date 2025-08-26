import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
		Scanner input = new Scanner (System.in);
		
		float notas[] = new float[4];
		
		float soma = 0;
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Insira a "+(i+1)+"° nota: ");
			notas[i] = input.nextFloat();
			soma += notas[i];
		}
		
		float media = soma/(float)notas.length;
		
		System.out.println("As notas foram: ");
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota "+(i+1)+": "+notas[i]);
		}
		System.out.println("A média das notas foi: "+media);
		
		input.close();
	}

}
