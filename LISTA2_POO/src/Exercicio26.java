import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        /*
         * Faça um Programa que peça um número inteiro e determine se ele é par ou ímpar.
         * Dica: utilize o operador módulo (resto da divisão).
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        input.close();
    }
}
