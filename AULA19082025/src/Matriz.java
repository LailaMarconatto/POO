import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira a quantidade de colunas: ");
		final int COL = input.nextInt();
		
		System.out.println("Insira a quantidade de linhas: ");
		final int LIN = input.nextInt();
		
		int[][] numeros = new int[LIN][COL];
		//int soma = 0;
		
		/*int maior = 0;
		int menor = 0;
		if (numeros[i] > numeros[maior]) {
			maior = i;
		}
		if (numeros[i] < numeros[menor]) {
			menor = i;
		}
		*/
		
		for (int y = 0; y < LIN; y++) {
			for(int x = 0; x < COL; x++) {
				System.out.print("Digite o "+(x+1)+"° número da "+(y+1)+"° linha: ");
				numeros[y][x] = input.nextInt();
				//soma += numeros[y][x];
			}
		}
		
		System.out.print("Colunas: ");
		for(int x = 0; x < COL; x++) {
			System.out.print(" "+x+" ");
		}
		
		System.out.println("");
		
		for (int y = 0; y < LIN; y++) {
			System.out.print("Linha "+y+" |");
			for(int x = 0; x < COL; x++) {
				System.out.print(" "+numeros[y][x]+" ");
			}
			System.out.println("");
		}
		
		//double media = soma / (float)(LIN*COL);
		//System.out.println("Soma: "+soma);
		//System.out.println("Média: "+media);
		//System.out.println("Maior número: "+numeros[maior]);
		//System.out.println("Menor número: "+numeros[menor]);
		
		input.close();

	}

}
