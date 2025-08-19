import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        /*
         *  29. Desenvolva um programa que faça a tabuada de um número qualquer inteiro
         *  que será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1
         *  e terminar em 10, o valor inicial e final devem ser informados também pelo usuário.
         *  Você deve verificar se o usuário não digitou o final menor que o inicial.
         */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Montar a tabuada de: ");
        int numero = input.nextInt();
        
        System.out.print("Começar por: ");
        int inicio = input.nextInt();
        
        System.out.print("Terminar em: ");
        int fim = input.nextInt();
        
        if (fim < inicio) {
            System.out.println("Erro: o valor final não pode ser menor que o valor inicial.");
        } else {
            System.out.println("Vou montar a tabuada de " + numero + " começando em " + inicio + " e terminando em " + fim + ":");
            for (int i = inicio; i <= fim; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
        
        input.close();
    }
}
