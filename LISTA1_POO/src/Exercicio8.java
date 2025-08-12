import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Faça um Programa que pergunte quanto você ganha por hora e o número de horas
		//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira o valor recebido por hora: ");
		double ganhoHora = input.nextDouble();
		
		System.out.println("Insira as horas trabalhadas: ");
		float horasTrab = input.nextFloat();
		
		double salario = ganhoHora * horasTrab;
		
		System.out.println("O seu salário esse mês é R$"+salario);
		
		input.close();
	}

}
