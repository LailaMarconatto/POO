import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        /*
         * Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário o
         * valor do saque e depois informar quantas notas de cada valor serão fornecidas.
         * As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.
         * O valor mínimo é de 10 reais e o máximo de 600 reais.
         * O programa não deve se preocupar com a quantidade de notas existentes na máquina.
         * 
         * Exemplos:
         * Para sacar 256 reais: 2 notas de 100, 1 nota de 50, 1 nota de 5, 1 nota de 1
         * Para sacar 399 reais: 3 notas de 100, 1 nota de 50, 4 notas de 10, 1 nota de 5, 4 notas de 1
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do saque (10 a 600): R$ ");
        int valor = input.nextInt();

        if (valor < 10 || valor > 600) {
            System.out.println("Valor inválido! Deve ser entre 10 e 600 reais.");
            input.close();
            return;
        }

        int restante = valor;

        int notas100 = restante / 100;
        restante = restante % 100;

        int notas50 = restante / 50;
        restante = restante % 50;

        int notas10 = restante / 10;
        restante = restante % 10;

        int notas5 = restante / 5;
        restante = restante % 5;

        int notas1 = restante;

        System.out.println("Notas fornecidas:");

        if (notas100 > 0) System.out.println(notas100 + " nota(s) de 100");
        if (notas50 > 0) System.out.println(notas50 + " nota(s) de 50");
        if (notas10 > 0) System.out.println(notas10 + " nota(s) de 10");
        if (notas5 > 0) System.out.println(notas5 + " nota(s) de 5");
        if (notas1 > 0) System.out.println(notas1 + " nota(s) de 1");

        input.close();
    }
}
