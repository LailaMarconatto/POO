import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        /*
         * Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao
         * longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
         *
         * Média de Aproveitamento   Conceito
         * Entre 9.0 e 10.0          A
         * Entre 7.5 e 9.0           B
         * Entre 6.0 e 7.5           C
         * Entre 4.0 e 6.0           D
         * Entre 0 e 4.0             E
         *
         * O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e
         * a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o
         * conceito for D ou E.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        char conceito;
        if (media >= 9.0 && media <= 10.0) {
            conceito = 'A';
        } else if (media >= 7.5 && media < 9.0) {
            conceito = 'B';
        } else if (media >= 6.0 && media < 7.5) {
            conceito = 'C';
        } else if (media >= 4.0 && media < 6.0) {
            conceito = 'D';
        } else if (media >= 0 && media < 4.0) {
            conceito = 'E';
        } else {
            System.out.println("Notas inválidas.");
            input.close();
            return;
        }

        System.out.printf("Nota 1: %.2f\n", nota1);
        System.out.printf("Nota 2: %.2f\n", nota2);
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Conceito: " + conceito);

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

        input.close();
    }
}
