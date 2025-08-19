import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        /*
         *  19. Faça um programa que mostre todos os primos entre 1 e N
         *  sendo N um número inteiro fornecido pelo usuário. O programa
         *  deverá mostrar também o número de divisões que ele executou
         *  para encontrar os números primos.
         */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro N: ");
        int n = input.nextInt();
        
        int divisoes = 0;
        
        System.out.println("Números primos entre 1 e " + n + ":");
        
        for (int num = 2; num <= n; num++) {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                divisoes++;
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(num + " ");
            }
        }
        
        System.out.println("Número total de divisões executadas: " + divisoes);
        
        input.close();
    }
}
