import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        /*
         * Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
         * Dica: utilize uma função de arredondamento.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = input.nextDouble();

        // Arredonda o número para inteiro
        long arredondado = Math.round(num);

        if (num == arredondado) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }

        input.close();
    }
}
