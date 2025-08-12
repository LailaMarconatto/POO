import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        /*
         * Faça um Programa para ler três idades de alunos e seguir as seguintes instruções:
         * ◦ Se a média de idade dos alunos é inferior a 25, apresentar a mensagem "Turma Jovem";
         * ◦ Se a média de idade dos alunos é entre 25 e 40, apresentar a mensagem "Turma Adulta";
         * ◦ Se a média de idade dos alunos é acima de 40 anos, apresentar a mensagem "Turma Idosa".
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade do aluno 1: ");
        int idade1 = input.nextInt();

        System.out.print("Digite a idade do aluno 2: ");
        int idade2 = input.nextInt();

        System.out.print("Digite a idade do aluno 3: ");
        int idade3 = input.nextInt();

        double media = (idade1 + idade2 + idade3) / 3.0;

        if (media < 25) {
            System.out.println("Turma Jovem");
        } else if (media <= 40) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }

        input.close();
    }
}
