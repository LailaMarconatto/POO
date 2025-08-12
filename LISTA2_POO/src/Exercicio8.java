import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
    	//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve
    	//calcular a média alcançada pelo aluno e apresentar:
    	//o A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    	//o A mensagem "Reprovado", se a média for menor do que sete;
    	
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        input.close();
    }
}
