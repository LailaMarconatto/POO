import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/* 15. Faça um programa que use um vetor de tamanho N (constante), peça ao usuário para
		 * informar os valores que devem ser validados, somente devem ser aceitos valores entre 0 e 20
		 * (inclusive 0 e 20). Após isto deve ser gerado um gráfico com cada um dos valores conforme
		 * o exemplo abaixo (levando em consideração que os valores informados no vetor foram 4, 2
		 * e 1)
		 * 4: ####
		 * 2:##
		 * 1:#
		 */
		Scanner input = new Scanner(System.in);

        final int N = 5;
        int[] valores = new int[N];

        for (int i = 0; i < N; i++) {
            int numero;
            do {
                System.out.print("Digite um valor entre 0 e 20 para a posição " + (i + 1) + ": ");
                numero = input.nextInt();
                if (numero < 0 || numero > 20) {
                    System.out.println("Valor inválido! Digite novamente.");
                }
            } while (numero < 0 || numero > 20);

            valores[i] = numero;
        }

        System.out.println("\n--- Gráfico ---");
        for (int i = 0; i < N; i++) {
            System.out.print(valores[i] + ": ");
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        input.close();
	}

}
