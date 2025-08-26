import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 * 12. Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no
		 * seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida. Mostrar
		 * também idade e altura do mais velho, mais novo, mais baixo e mais alto. Mostrar idade e
		 * altura de quem está abaixo e acima da média de idade e altura;
		 */
        Scanner input = new Scanner(System.in);

        final int PESSOAS = 5;
        int[] idades = new int[PESSOAS];
        float[] alturas = new float[PESSOAS];

        for (int i = 0; i < PESSOAS; i++) {
            System.out.print("Digite a idade da " + (i + 1) + "° pessoa: ");
            idades[i] = input.nextInt();
            System.out.print("Digite a altura (em metros) da " + (i + 1) + "° pessoa: ");
            alturas[i] = input.nextFloat();
        }

        System.out.println("---- Idade e Altura na ordem inversa ----");
        for (int i = PESSOAS - 1; i >= 0; i--) {
            System.out.println("Pessoa "+ (i + 1) +" -> Idade: "+ idades[i] +" | Altura: "+ alturas[i]);
        }

        int maisVelho = 0, maisNovo = 0, maisAlto = 0, maisBaixo = 0;
        for (int i = 1; i < PESSOAS; i++) {
            if (idades[i] > idades[maisVelho]) maisVelho = i;
            if (idades[i] < idades[maisNovo]) maisNovo = i;
            if (alturas[i] > alturas[maisAlto]) maisAlto = i;
            if (alturas[i] < alturas[maisBaixo]) maisBaixo = i;
        }

        System.out.println("--- Mais velho ---");
        System.out.println("Idade: "+idades[maisVelho]+" | Altura: "+alturas[maisVelho]);

        System.out.println("--- Mais novo ---");
        System.out.println("Idade: "+idades[maisNovo]+" | Altura: "+alturas[maisNovo]);

        System.out.println("--- Mais alto ---");
        System.out.println("Idade: "+idades[maisAlto]+" | Altura: "+alturas[maisAlto]);

        System.out.println("--- Mais baixo ---");
        System.out.println("Idade: "+idades[maisBaixo]+" | Altura: "+alturas[maisBaixo]);

        float somaIdade = 0, somaAltura = 0;
        for (int i = 0; i < PESSOAS; i++) {
            somaIdade += idades[i];
            somaAltura += alturas[i];
        }
        float mediaIdade = somaIdade / PESSOAS;
        float mediaAltura = somaAltura / PESSOAS;

        System.out.println("--- Média ---");
        System.out.println("Idade média: "+mediaIdade);
        System.out.println("Altura média: "+mediaAltura);

        System.out.println("--- Pessoas abaixo da média ---");
        for (int i = 0; i < PESSOAS; i++) {
            if (idades[i] < mediaIdade || alturas[i] < mediaAltura) {
                System.out.println("Pessoa "+(i + 1)+" -> Idade: "+idades[i]+" | Altura: "+alturas[i]);
            }
        }

        System.out.println("--- Pessoas acima da média ---");
        for (int i = 0; i < PESSOAS; i++) {
            if (idades[i] > mediaIdade || alturas[i] > mediaAltura) {
            	System.out.println("Pessoa "+(i + 1)+" -> Idade: "+idades[i]+" | Altura: "+alturas[i]);
            }
        }

        input.close();

	}

}
