import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*14. Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine quantos
		 * alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.
		 */
		Scanner input = new Scanner(System.in);

        final int ALUNOS = 30;
        int[] idades = new int[ALUNOS];
        float[] alturas = new float[ALUNOS];

        for (int i = 0; i < ALUNOS; i++) {
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            idades[i] = input.nextInt();
            System.out.print("Digite a altura do aluno " + (i + 1) + " (em metros): ");
            alturas[i] = input.nextFloat();
        }
        
        float somaAlturas = 0;
        for (int i = 0; i < ALUNOS; i++) {
            somaAlturas += alturas[i];
        }
        
        float mediaAltura = somaAlturas / ALUNOS;

        int contador = 0;
        for (int i = 0; i < ALUNOS; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contador++;
            }
        }

        System.out.println("A média de altura é: "+mediaAltura);
        System.out.println("Quantidade de alunos com mais de 13 anos e altura abaixo da média: " + contador);

        input.close();
	}

}
