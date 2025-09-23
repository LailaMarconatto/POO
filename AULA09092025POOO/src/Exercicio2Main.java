import java.util.Scanner;

public class Exercicio2Main {

    public static void main(String[] args) {
        /*
         * Faça um programa que mostre os números que constam no intervalo entre
         * dois números que serão informados, se o usuário entrar com os valores em
         * ordem inversa o programa deve dar um aviso ao usuário que irá fazer
         * a inversão.
         */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o primeiro num: ");
        int num1 = input.nextInt();
        
        System.out.print("Insira o segundo num: ");
        int num2 = input.nextInt();
        
        Exercicio2 intervalo = new Exercicio2(num1, num2);

        if (num1 > num2) {
            System.out.println("Valores invertidos! O programa fará a inversão.");
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        System.out.println("Números no intervalo:");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nObjeto criado: " + intervalo);

        input.close();
    }
}
