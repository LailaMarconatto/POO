import java.util.Scanner;

public class Exercicio7Main {

    public static void main(String[] args) {
        /*
         * 7. Crie uma classe que modele uma pessoa:
         * Atributos: nome, idade, peso e altura
         * Métodos: Envelhecer, engordar, emagrecer, crescer.
         * Obs: Por padrão a cada ano que nossa pessoa envelhece e se a idade dela
         * for menor que 21 anos ela deve crescer 0,5 cm por ano.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Idade: ");
        int idade = input.nextInt();

        System.out.print("Peso (kg): ");
        float peso = input.nextFloat();

        System.out.print("Altura (m): ");
        float altura = input.nextFloat();

        Exercicio7 pessoa = new Exercicio7(nome, idade, peso, altura);

        System.out.println("\nPessoa criada: " + pessoa);

        pessoa.envelhecer();
        pessoa.engordar(2);
        pessoa.emagrecer(1);
        pessoa.crescer(0.03f);

        System.out.println("\nDepois das mudanças: " + pessoa);

        input.close();
    }
}
