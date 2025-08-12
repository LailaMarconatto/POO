import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        /*
         * Altere o programa que calcula a média do aluno, e mostre a mensagem de acordo com a média.
         * De 0 a 3 - Reprovado,
         * De 3 a 6.9 - Em Exame,
         * De 7 a 10 - Aprovado
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a média do aluno (0 a 10): ");
        double media = input.nextDouble();

        if (media >= 0 && media <= 3) {
            System.out.println("Reprovado");
        } else if (media > 3 && media < 7) {
            System.out.println("Em Exame");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Média inválida!");
        }

        input.close();
    }
}
