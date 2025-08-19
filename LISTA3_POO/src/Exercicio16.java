import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        /*
         *  16. Faça um programa que, dado um conjunto de N números,
         *  determine o menor valor, o maior valor e a soma dos valores.
         */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de números: ");
        int n = input.nextInt();
        
        int menor, maior, soma;
        
        System.out.print("Digite o 1º número: ");
        int numero = input.nextInt();
        
        menor = numero;
        maior = numero;
        soma = numero;
        
        for (int i = 2; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = input.nextInt();
            
            soma += numero;
            
            if (numero < menor) {
                menor = numero;
            }
            
            if (numero > maior) {
                maior = numero;
            }
        }
        
        System.out.println("\nMenor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
        
        input.close();
    }
}
