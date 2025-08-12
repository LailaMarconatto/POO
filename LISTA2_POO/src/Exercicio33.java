import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {
        /*
         * Tendo em uma prova com 10 questões o seguinte gabarito (a,a,b,b,c,c,d,d,e,e)
         * crie um programa que peça os resultados das questões assinaladas pelo candidato
         * e ao final mostre as respostas dadas e o resultado conforme o exemplo:
         * Q1 : a : Correto
         * Q2 : b : Errada, resposta correta (a)
         * ...
         * Pontuação Final: 9
         */

        Scanner input = new Scanner(System.in);
        char[] gabarito = {'a','a','b','b','c','c','d','d','e','e'};
        char[] respostas = new char[10];
        int pontuacao = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a resposta da questão " + (i + 1) + " (a,b,c,d,e): ");
            String respStr = input.nextLine().trim().toLowerCase();
            while (respStr.length() != 1 || "abcde".indexOf(respStr.charAt(0)) == -1) {
                System.out.print("Resposta inválida. Digite a resposta da questão " + (i + 1) + " (a,b,c,d,e): ");
                respStr = input.nextLine().trim().toLowerCase();
            }
            respostas[i] = respStr.charAt(0);
        }

        System.out.println("\nResultado da prova:");

        for (int i = 0; i < 10; i++) {
            if (respostas[i] == gabarito[i]) {
                System.out.println("Q" + (i + 1) + " : " + respostas[i] + " : Correto");
                pontuacao++;
            } else {
                System.out.println("Q" + (i + 1) + " : " + respostas[i] + " : Errada, resposta correta (" + gabarito[i] + ")");
            }
        }

        System.out.println("Pontuação Final: " + pontuacao);

        input.close();
    }
}
