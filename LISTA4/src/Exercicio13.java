import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/* 13. Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de
		 * 20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois
		 * outros vetores.
		 */
		Scanner input = new Scanner(System.in);

        final int TAM = 10;
        int[] vetorA = new int[TAM];
        int[] vetorB = new int[TAM];
        int[] vetorC = new int[TAM * 2];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = input.nextInt();
        }

        System.out.println("\nDigite os valores do vetor B:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = input.nextInt();
        }

        int indice = 0;
        for (int i = 0; i < TAM; i++) {
            vetorC[indice++] = vetorA[i];
            vetorC[indice++] = vetorB[i];
        }

        System.out.println("\n--- Vetor C (intercalado) ---");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

        input.close();
	}

}
