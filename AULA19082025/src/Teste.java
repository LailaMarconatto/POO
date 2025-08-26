import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		/* x = 10 , v = vetor
		 * Exemplo vetor
		 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira a quantidade de números: ");
		final int TAM = input.nextInt();
		
		int[] numeros = new int[TAM];
		int soma = 0;
		
		int maior = 0;
		int menor = 0;
		
		for(int i = 0; i < TAM; i++) {
			System.out.print("Digite o "+(i+1)+"° número: ");
			numeros[i] = input.nextInt();
			soma += numeros[i];
			
			if (numeros[i] > numeros[maior]) {
				maior = i;
			}
			if (numeros[i] < numeros[menor]) {
				menor = i;
			}
		}
		
		double media = soma / (float)TAM;
		System.out.println("Soma: "+soma);
		System.out.println("Média: "+media);
		System.out.println("Maior número: "+numeros[maior]);
		System.out.println("Menor número: "+numeros[menor]);
		
		input.close();
	}

}
