import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        /*
         * Faça um Programa para leitura de três notas parciais de um aluno. O programa deve
         * calcular a média alcançada por aluno e apresentar:
         *
         * ◦ A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
         * ◦ A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
         * ◦ A mensagem "Aprovado com Distinção", se a média for igual a 10.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media == 10) {
            System.out.printf("Aprovado com Distinção! Média: %.2f\n", media);
        } else if (media >= 7) {
            System.out.printf("Aprovado! Média: %.2f\n", media);
        } else {
            System.out.printf("Reprovado! Média: %.2f\n", media);
        }

        input.close();
    }
}
