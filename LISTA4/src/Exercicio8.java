import java.util.Scanner;
import java.util.Random;

public class Exercicio8 {
    public static void main(String[] args) {
    	/* 8. Dado um vetor contendo todas as letras do nosso alfabeto (minúsculas) gere uma senha para
    	 * o usuário. Para isto o usuário deve informar o tamanho da senha que deseja, este tamanho
    	 * deve ser menor que a quantidade de letras no vetor. A senha gerada deve seguir o padrão
    	 * consoante+vogal para tamanhos pares e consoante+vogal e terminada em consoante para
    	 * tamanhos ímpares. 
    	 */
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        char[] consoantes = new char[alfabeto.length - vogais.length];

        int index = 0;
        for (char c : alfabeto) {
            boolean isVogal = false;
            for (char v : vogais) {
                if (c == v) {
                    isVogal = true;
                    break;
                }
            }
            if (!isVogal) {
                consoantes[index++] = c;
            }
        }

        int tamanho;
        do {
            System.out.print("Informe o tamanho da senha (<26): ");
            tamanho = input.nextInt();
        } while (tamanho <= 0 || tamanho >= alfabeto.length);

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) {
                senha.append(consoantes[rand.nextInt(consoantes.length)]);
            } else {        
                senha.append(vogais[rand.nextInt(vogais.length)]);
            }
        }

        if (tamanho % 2 != 0) {
            senha.setCharAt(tamanho - 1, consoantes[rand.nextInt(consoantes.length)]);
        }

        System.out.println("Senha gerada: " + senha);

        input.close();
    }
}
