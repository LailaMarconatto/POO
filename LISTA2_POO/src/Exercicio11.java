import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
    	//Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-
    	//Matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" , conforme o caso.
    	
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o turno que você estuda (M - Matutino, V - Vespertino, N - Noturno): ");
        char turno = input.next().toUpperCase().charAt(0);

        switch (turno) {
            case 'M':
                System.out.println("Bom Dia!");
                break;
            case 'V':
                System.out.println("Boa Tarde!");
                break;
            case 'N':
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Turno inválido!");
        }

        input.close();
    }
}
