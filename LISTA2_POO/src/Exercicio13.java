import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// 13.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
		//descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela
		//abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas
		//não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao
		//Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua
		//hora e a quantidade de horas trabalhadas no mês.
		//Desconto do IR:
		//Salário Bruto até 900 (inclusive) - isento
		//Salário Bruto até 1500 (inclusive) - desconto de 5%
		//Salário Bruto até 2500 (inclusive) - desconto de 10%
		//Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas
		//conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
		//Salário Bruto: (5 * 220) : R$ 1100,00
		//(-) IR (5%) : R$ 55,00
		//(-) INSS ( 10%) : R$ 110,00
		//FGTS (11%) : R$ 121,00
		//Total de descontos : R$ 165,00
		//Salário Liquido : R$ 935,00
		Scanner input = new Scanner(System.in);

        System.out.print("Valor da hora trabalhada: R$ ");
        double valorHora = input.nextDouble();

        System.out.print("Quantidade de horas trabalhadas no mês: ");
        int horas = input.nextInt();

        double salarioBruto = valorHora * horas;

        double descontoIR;
        if (salarioBruto <= 900) {
            descontoIR = 0;
        } else if (salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.10;
        } else {
            descontoIR = salarioBruto * 0.20;
        }

        double descontoSindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;  
        double totalDescontos = descontoIR + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("\n--- Folha de Pagamento ---");
        System.out.printf("Salário Bruto: (%.2f * %d) : R$ %.2f\n", valorHora, horas, salarioBruto);
        System.out.printf("(-) IR (%.0f%%) : R$ %.2f\n", (descontoIR > 0 ? (descontoIR / salarioBruto * 100) : 0), descontoIR);
        System.out.printf("(-) Sindicato (3%%) : R$ %.2f\n", descontoSindicato);
        System.out.printf("FGTS (11%%) : R$ %.2f\n", fgts);
        System.out.printf("Total de descontos : R$ %.2f\n", totalDescontos);
        System.out.printf("Salário Líquido : R$ %.2f\n", salarioLiquido);

        input.close();
	}

}
