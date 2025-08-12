import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        /*
         * Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação
         * ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
         * - par ou ímpar;
         * - positivo ou negativo;
         * - inteiro ou decimal.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Opção: ");
        int opcao = input.nextInt();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false;
                } else {
                    resultado = num1 / num2;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.printf("Resultado: %.2f\n", resultado);
            if (resultado == Math.floor(resultado)) {
                long resInt = (long) resultado;
                if (resInt % 2 == 0) {
                    System.out.println("O número é par.");
                } else {
                    System.out.println("O número é ímpar.");
                }
            } else {
                System.out.println("O número não é inteiro, portanto não é possível determinar par ou ímpar.");
            }

            if (resultado > 0) {
                System.out.println("O número é positivo.");
            } else if (resultado < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é zero.");
            }

            if (resultado == Math.floor(resultado)) {
                System.out.println("O número é inteiro.");
            } else {
                System.out.println("O número é decimal.");
            }
        }

        input.close();
    }
}
