import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        /*
         *  17. Faça um programa que peça um número inteiro e determine
         *  se ele é ou não um número primo. Um número primo é aquele que
         *  é divisível somente por ele mesmo e por 1.
         */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        
        boolean primo = true;
        
        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        
        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        
        input.close();
    }
}
