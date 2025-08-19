import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        /*
         *  20. Faça um programa que calcule e mostre
         *  a média aritmética de N notas.
         */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de notas: ");
        int n = input.nextInt();
        
        double soma = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            double nota = input.nextDouble();
            soma += nota;
        }
        
        double media = soma / n;
        
        System.out.println("A média aritmética das notas é: " + media);
        
        input.close();
    }
}
