import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        /*
         * Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
         * "Telefonou para a vítima?"
         * "Esteve no local do crime?"
         * "Mora perto da vítima?"
         * "Devia para a vítima?"
         * "Já trabalhou com a vítima?"
         * 
         * O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
         * Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
         * entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, será classificada como "Inocente".
         */

        Scanner input = new Scanner(System.in);
        int respostasPositivas = 0;

        String[] perguntas = {
            "Telefonou para a vítima? (S/N): ",
            "Esteve no local do crime? (S/N): ",
            "Mora perto da vítima? (S/N): ",
            "Devia para a vítima? (S/N): ",
            "Já trabalhou com a vítima? (S/N): "
        };

        for (String pergunta : perguntas) {
            System.out.print(pergunta);
            String resposta = input.nextLine().trim().toUpperCase();
            if (resposta.equals("S")) {
                respostasPositivas++;
            }
        }

        System.out.println();

        if (respostasPositivas == 5) {
            System.out.println("Classificação: Assassino");
        } else if (respostasPositivas >= 3) {
            System.out.println("Classificação: Cúmplice");
        } else if (respostasPositivas == 2) {
            System.out.println("Classificação: Suspeita");
        } else {
            System.out.println("Classificação: Inocente");
        }

        input.close();
    }
}
