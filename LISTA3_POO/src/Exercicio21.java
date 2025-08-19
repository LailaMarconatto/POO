import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        /*
         *  21. Faça um programa que peça para n pessoas a sua idade,
         *  ao final o programa deverá verificar se a média de idade da turma
         *  varia entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a
         *  turma é jovem, adulta ou idosa, conforme a média calculada.
         */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de pessoas: ");
        int n = input.nextInt();
        
        int soma = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = input.nextInt();
            soma += idade;
        }
        
        double media = (double) soma / n;
        
        System.out.println("\nMédia de idade da turma: " + media);
        
        if (media >= 0 && media <= 25) {
            System.out.println("A turma é jovem.");
        } else if (media >= 26 && media <= 60) {
            System.out.println("A turma é adulta.");
        } else if (media > 60) {
            System.out.println("A turma é idosa.");
        } else {
            System.out.println("Erro: média inválida.");
        }
        
        input.close();
    }
}
