import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        /*
         * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
         * Até 5 Kg       | Acima de 5 Kg
         * Morango: R$ 2,50 por Kg | R$ 2,20 por Kg
         * Maçã: R$ 1,80 por Kg    | R$ 1,50 por Kg
         * 
         * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
         * ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
         * 
         * Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maçãs,
         * calcular o valor total a pagar, aplicando o desconto quando necessário.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de morangos (kg): ");
        double morangoKg = input.nextDouble();

        System.out.print("Digite a quantidade de maçãs (kg): ");
        double macaKg = input.nextDouble();

        double precoMorango;
        double precoMaca;

        if (morangoKg <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (macaKg <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double totalMorango = morangoKg * precoMorango;
        double totalMaca = macaKg * precoMaca;

        double totalKg = morangoKg + macaKg;
        double valorTotal = totalMorango + totalMaca;

        if (totalKg > 8 || valorTotal > 25) {
            valorTotal = valorTotal * 0.9;
        }

        System.out.printf("Valor total a pagar: R$ %.2f\n", valorTotal);

        input.close();
    }
}
