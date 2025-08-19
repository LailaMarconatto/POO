import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        /*
         *  18. Altere o programa de cálculo dos números primos, informando,
         *  caso o número não seja primo, por quais números ele é divisível.
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
            System.out.print(numero + " não é um número primo. Divisível por: ");
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        
        input.close();
    }
}
