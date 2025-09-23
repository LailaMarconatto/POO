import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		final int X = 5;
		
		int matriz[][] = new int[X][X];
		int soma = 0;
		int maior = 0;
		int menor = 0;
		
		for(int y =0; y<X;y++) {
			for(int x =0; x<X;x++) {
				System.out.println("Insira um número inteiro: ");
				matriz[y][x] = input.nextInt();
				soma += matriz[y][x];
				if(y==0 && x==0) {
					maior = matriz[y][x];
					menor = matriz[y][x];
				} else {
					if(matriz[y][x] > maior) {
						maior = matriz[y][x];
					} else if(matriz[y][x] < menor) {
						menor= matriz[y][x];
					}
				}
			}	
		}
		
		float media = soma/(float)(X*X);
		
		for(int y =0; y<X;y++) {
			System.out.println("");
			for(int x =0; x<X;x++) {
				System.out.print(" "+matriz[y][x]+" ");
			}
		}
		
		System.out.println("\n Soma: "+soma);
		System.out.println("Média: "+media);
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);
		System.out.println("Gráfico: ");
		
		for(int y =0; y<X;y++) {
			for(int x =0; x<X;x++) {
				System.out.print(matriz[y][x]+": ");
				for(int i =0; i<matriz[y][x]; i++) {
					System.out.print("#");
				}
				System.out.println("");
			}
		}
		input.close();
		
	}

}
