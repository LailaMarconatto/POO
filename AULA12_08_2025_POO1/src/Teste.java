import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		/*
		for(int x = 0; x < 10; x++) {
			System.out.println(x);
		}
		
		
		int y = 0;
		while(y < 10) {
			System.out.println(y);
			y++;
		}
		
		int z = 0;
		do {
			System.out.println(z);
			z++;
		} while (z < 10);
		
		*usuario escolhe a tabuada, onde começa e por onde termine. 
		*se for invertido, avisar o erro e reverter corretamente 
		*
		*/
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira a tabuada: ");
		int tabuada = input.nextInt();
		
		System.out.println("Insira por onde começa: ");
		int comeco = input.nextInt();

		System.out.println("Insira por onde termina: ");
		int termino = input.nextInt();
		
		
		if (comeco > termino) {
			System.out.println("Você trocou o começo e término! Já vamos arrumar para você");
			int novoComeco = termino;
			int novoTermino = comeco;
			
			comeco = novoComeco;
			termino = novoTermino;
		}
		
		System.out.println("A tabuada de "+tabuada+", iniciando em "+comeco+" e terminando em "+termino+" é: ");
		for(int x = comeco; x <= termino; x++) {
			System.out.println(tabuada+" x "+x+" = "+(tabuada*x));
		}
		
		input.close();
	}

}
