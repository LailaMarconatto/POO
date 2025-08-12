import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        /*
         * Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax² + bx + c.
         * O programa deverá tratar as seguintes situações:
         * - Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa deve encerrar.
         * - Se o delta calculado for negativo, a equação não possui raízes reais. Informe ao usuário e encerre o programa.
         * - Se o delta for igual a zero, a equação possui apenas uma raiz real; informe-a.
         * - Se o delta for positivo, a equação possui duas raízes reais; informe-as.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = input.nextDouble();

        if (a == 0) {
            System.out.println("O valor de A não pode ser zero. A equação não é do segundo grau.");
            input.close();
            return;
        }

        System.out.print("Digite o valor de B: ");
        double b = input.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.printf("A equação possui uma raiz real: %.2f\n", raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equação possui duas raízes reais: %.2f e %.2f\n", raiz1, raiz2);
        }

        input.close();
    }
}
