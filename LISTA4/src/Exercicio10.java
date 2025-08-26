import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*10. Faça um programa que peça uma data no padrão dd/mm/aaaa, valide esta data e coloque
		 * cada item em uma posição de um vetor de inteiros de tamanho 3.
		 */
		Scanner input = new Scanner(System.in);
	
	    System.out.print("Digite uma data (dd/mm/aaaa): ");
	    String data = input.nextLine();
	
	    String[] partes = data.split("/");

	    if (partes.length != 3) {
	        System.out.println("Data inválida! Formato correto: dd/mm/aaaa");
	        input.close();
	        return;
	    }
	
	    int[] vetorData = new int[3];
	    try {
	        vetorData[0] = Integer.parseInt(partes[0]); // dia
	        vetorData[1] = Integer.parseInt(partes[1]); // mês
	        vetorData[2] = Integer.parseInt(partes[2]); // ano
	    } catch (NumberFormatException e) {
	        System.out.println("Data inválida! Deve conter apenas números.");
	        input.close();
	        return;
	    }

        int dia = vetorData[0];
        int mes = vetorData[1];
        int ano = vetorData[2];
        
        if (validarData(dia, mes, ano)) {
            System.out.println("Data válida!");
            System.out.println("Vetor: [" + vetorData[0] + ", " + vetorData[1] + ", " + vetorData[2] + "]");
        } else {
            System.out.println("Data inválida!");
        }

	    input.close();
	}
    public static boolean validarData(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int[] diasPorMes = {31, (isBissexto(ano) ? 29 : 28), 31, 30, 31, 30,
                            31, 31, 30, 31, 30, 31};

        return dia <= diasPorMes[mes - 1];
    }
    public static boolean isBissexto(int ano) {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }
}
