import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio33 {

    public static void main(String[] args) {
        /*
         *  33. Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes
         *  dados: valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.
         *  • Os juros e a quantidade de parcelas seguem a tabela abaixo:
         *  Quantidade de Parcelas % de Juros sobre o valor inicial da dívida
         *  1 0
         *  3 10
         *  6 15
         *  9 20
         *  12 25
         *
         *  Exemplo de saída do programa:
         *  Valor da Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela
         *  R$ 1.000,00 0 1 R$ 1.000,00
         *  R$ 1.100,00 100 3 R$ 366,00
         *  R$ 1.150,00 150 6 R$ 191,67
         */
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.print("Digite o valor da dívida: R$ ");
        double valorDivida = input.nextDouble();
        
        int[] parcelas = {1, 3, 6, 9, 12};
        double[] jurosPercent = {0, 10, 15, 20, 25};
        
        System.out.println("Valor da Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela");
        
        for (int i = 0; i < parcelas.length; i++) {
            double juros = valorDivida * jurosPercent[i] / 100;
            double valorTotal = valorDivida + juros;
            double valorParcela = valorTotal / parcelas[i];
            
            System.out.println("R$ " + df.format(valorTotal) + " " + df.format(juros) + " " + parcelas[i] + " R$ " + df.format(valorParcela));
        }
        
        input.close();
    }
}
