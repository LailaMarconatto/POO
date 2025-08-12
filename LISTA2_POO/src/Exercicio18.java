import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        /*
         * Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se
         * os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo
         * é: equilátero, isósceles ou escaleno.
         * 
         * Dicas:
         * Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
         * Triângulo Equilátero: três lados iguais;
         * Triângulo Isósceles: quaisquer dois lados iguais;
         * Triângulo Escaleno: três lados diferentes;
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        double lado1 = input.nextDouble();

        System.out.print("Digite o lado 2: ");
        double lado2 = input.nextDouble();

        System.out.print("Digite o lado 3: ");
        double lado3 = input.nextDouble();

        boolean formaTriangulo = (lado1 + lado2 > lado3) &&
                                (lado1 + lado3 > lado2) &&
                                (lado2 + lado3 > lado1);

        if (!formaTriangulo) {
            System.out.println("Os valores não formam um triângulo.");
        } else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }
        }

        input.close();
    }
}
