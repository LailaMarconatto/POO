import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        /*
         * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
         * Álcool:
         *   até 20 litros, desconto de 3% por litro
         *   acima de 20 litros, desconto de 5% por litro
         * Gasolina:
         *   até 20 litros, desconto de 4% por litro
         *   acima de 20 litros, desconto de 6% por litro
         * 
         * Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
         * (A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que
         * o preço do litro da gasolina é R$ 2,50 e do álcool é R$ 1,90.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        String tipo = input.nextLine().trim().toUpperCase();

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = input.nextDouble();

        double precoLitro;
        double descontoPorLitro;

        if (tipo.equals("A")) {
            precoLitro = 1.90;
            if (litros <= 20) {
                descontoPorLitro = 0.03;
            } else {
                descontoPorLitro = 0.05;
            }
        } else if (tipo.equals("G")) {
            precoLitro = 2.50;
            if (litros <= 20) {
                descontoPorLitro = 0.04;
            } else {
                descontoPorLitro = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            input.close();
            return;
        }

        double valorBruto = precoLitro * litros;
        double desconto = valorBruto * descontoPorLitro;
        double valorFinal = valorBruto - desconto;

        System.out.printf("Valor a pagar: R$ %.2f\n", valorFinal);

        input.close();
    }
}
