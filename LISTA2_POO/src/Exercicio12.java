import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// As Organizações Tabajara resolveram dar um aumento de salário aos seus
		//colaboradores e lhe contrataram para desenvolver o programa que calculará os
		//reajustes.
		//  Faça um programa que recebe o salário de um colaborador e calcule o reajuste
		//segundo o seguinte critério, baseado no salário atual:
		//  salários até R$ 280,00 (incluindo) : aumento de 20%
		//  salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
		//  salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		//  salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
		//realizado, informe na tela:
		//  salário antes do reajuste;
		//  o percentual de aumento aplicado;
		//  o valor do aumento;
		//  o novo salário, após o aumento.
		Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário atual: R$ ");
        double salario = input.nextDouble();

        double percentual = 0;
        if (salario <= 280) {
            percentual = 0.20;
        } else if (salario <= 700) {
            percentual = 0.15;
        } else if (salario <= 1500) {
            percentual = 0.10;
        } else {
            percentual = 0.05;
        }

        double aumento = salario * percentual;
        double novoSalario = salario + aumento;

        System.out.println("\n--- Resultado ---");
        System.out.printf("Salário antes do reajuste: R$ %.2f\n", salario);
        System.out.printf("Percentual de aumento aplicado: %.0f%%\n", percentual * 100);
        System.out.printf("Valor do aumento: R$ %.2f\n", aumento);
        System.out.printf("Novo salário após aumento: R$ %.2f\n", novoSalario);

        input.close();
	}

}
