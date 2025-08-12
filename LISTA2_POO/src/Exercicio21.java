import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        /*
         * Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma
         * é uma data válida.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma data (dd/mm/aaaa): ");
        String data = input.nextLine();

        String[] partes = data.split("/");

        if (partes.length != 3) {
            System.out.println("Formato inválido.");
            input.close();
            return;
        }

        try {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

            boolean dataValida = true;

            if (ano < 1) {
                dataValida = false;
            } else if (mes < 1 || mes > 12) {
                dataValida = false;
            } else {
                int maxDias;

                switch (mes) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        maxDias = 31;
                        break;
                    case 4: case 6: case 9: case 11:
                        maxDias = 30;
                        break;
                    case 2:
                        if ( (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0) ) {
                            maxDias = 29;
                        } else {
                            maxDias = 28;
                        }
                        break;
                    default:
                        maxDias = 0;
                }

                if (dia < 1 || dia > maxDias) {
                    dataValida = false;
                }
            }

            if (dataValida) {
                System.out.println("Data válida.");
            } else {
                System.out.println("Data inválida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Data contém valores inválidos.");
        }

        input.close();
    }
}
