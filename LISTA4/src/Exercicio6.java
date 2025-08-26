import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/* 6. Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a
		 * média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.
		 */
		Scanner input = new Scanner (System.in);

		final int ALUNOS = 10;
		final int NOTAS = 4;
		
		float notasAlunos[][] = new float[ALUNOS][NOTAS];
		float medias[] = new float[ALUNOS];
		
		for (int y = 0; y < ALUNOS; y++) {
			for(int x = 0; x < NOTAS; x++) {
				System.out.print("Digite a "+(x+1)+"° nota do "+(y+1)+"° aluno: ");
				float nota = input.nextFloat();
				notasAlunos[y][x] = nota;
				medias[y] += nota;
			}
		}
		
		int alunosAprov = 0;
		for (int y = 0; y < ALUNOS; y++) {
			medias[y] = medias[y]/(float)NOTAS;
			if(medias[y] >= 7f) {
				alunosAprov++;
			}
		}
		
		System.out.println("A quantidade de alunos aprovados é: "+alunosAprov);
		
		input.close();
	}

}
