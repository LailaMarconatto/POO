import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        /*
         * Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade
         * de centenas, dezenas e unidades do mesmo.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor que 1000: ");
        int num = input.nextInt();

        if (num < 0 || num >= 1000) {
            System.out.println("Número inválido! Deve ser entre 0 e 999.");
        } else {
            int centenas = num / 100;
            int dezenas = (num % 100) / 10;
            int unidades = num % 10;

            System.out.println("Centenas: " + centenas);
            System.out.println("Dezenas: " + dezenas);
            System.out.println("Unidades: " + unidades);
        }

        input.close();
    }
}
