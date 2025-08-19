import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia e valide as seguintes informações:
		 * a. Nome: maior que 3 caracteres;
		 * b. Idade: entre 0 e 150;
		 * c. Salário: maior que zero;
		 * d. Sexo: 'f' ou 'm';
		 * e. Estado Civil: 's', 'c', 'v', 'd';
		 */
		Scanner input = new Scanner(System.in);
		
		String nome = "";
		int idade = 0;
		double sal = 0;
		String sexo = "";
		String estadoCivil = "";
		
		//nome
		int count = 0; 
		do {
			if (count>0) {
				System.out.println("O nome deve ser maior que 3 caracteres!");
			}
			System.out.println("Insira seu nome: ");
			nome = input.nextLine();
			count++;
		} while(nome.length() <= 3);
		
		//idade
		count = 0; 
		do {
			if (count>0) {
				System.out.println("A idade deve ser no mínimo 1 e no máximo 150!");
			}
			System.out.println("Insira sua idade: ");
			idade = input.nextInt();
			count++;
		} while(idade < 1 || idade > 150);
		
		//salario
		count = 0; 
		do {
			if (count>0) {
				System.out.println("O salario deve ser maior que 0!");
			}
			System.out.println("Insira seu salário: ");
			sal = input.nextDouble();
			count++;
		} while(sal <= 0);
		
		//sexo
		count = 0; 
		boolean sexoVerifica = false;
		do {
			if (count>0) {
				System.out.println("O sexo deve ser representado por F se feminido e M se masculino");
			}
			System.out.println("Insira seu sexo(F ou M): ");
			sexo = input.nextLine();
			count++;
			if (sexo.equals("F")) {
				sexoVerifica = true;
			} else if (sexo.equals("M")) {
				sexoVerifica = true;
			}
		} while(!sexoVerifica);		

		//Estado Civil
		count = 0; 
		boolean estadoCivilVerifica = false;
		do {
			if (count>0) {
				System.out.println("O estado civil deve ser representado por S, C, V ou D");
			}
			System.out.println("Insira seu estado civil(S, C, V ou D): ");
			estadoCivil = input.nextLine();
			count++;
			
			if (estadoCivil.equals("S")) {
				estadoCivilVerifica = true;
			} else if (estadoCivil.equals("C")) {
				estadoCivilVerifica = true;
			} else if (estadoCivil.equals("V")) {
				estadoCivilVerifica = true;
			} else if (estadoCivil.equals("D")) {
				estadoCivilVerifica = true;
			}
		} while(!estadoCivilVerifica);
		
		input.close();

	}

}
