import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /* Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
         * Armazene os números pares no vetor PAR e os números ÍMPARES no vetor impar.
         * Imprima os três vetores.
         */
        Scanner input = new Scanner(System.in);

        int numeros[] = new int[20];

        int countPares = 0;
        int countImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o " + (i + 1) + "º número do vetor: ");
            numeros[i] = input.nextInt();

            if (numeros[i] % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        int pares[] = new int[countPares];
        int impares[] = new int[countImpares];

        int indicePar = 0, indiceImpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[indicePar++] = numeros[i];
            } else {
                impares[indiceImpar++] = numeros[i];
            }
        }

        System.out.println("\n--- Vetor Original ---");
        imprimirVetor(numeros);

        System.out.println("\n--- Vetor Pares ---");
        imprimirVetor(pares);

        System.out.println("\n--- Vetor Ímpares ---");
        imprimirVetor(impares);

        input.close();
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
