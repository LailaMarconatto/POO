import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        /*
         * Faça um Programa que tendo como dados de entrada o preço de custo de um produto e
         * um código de origem, emita o preço junto de sua procedência. Caso o código não seja
         * nenhum dos especificados, o produto deve ser classificado como importado.
         * 
         * Código de origem:
         * 1 - Sul
         * 2 - Norte
         * 3 - Leste
         * 4 - Oeste
         * 5 ou 6 - Nordeste
         * 7 ou 8 - Centro-oeste
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço de custo do produto: R$ ");
        double preco = input.nextDouble();

        System.out.print("Digite o código de origem do produto: ");
        int codigo = input.nextInt();

        String procedencia;

        switch (codigo) {
            case 1:
                procedencia = "Sul";
                break;
            case 2:
                procedencia = "Norte";
                break;
            case 3:
                procedencia = "Leste";
                break;
            case 4:
                procedencia = "Oeste";
                break;
            case 5:
            case 6:
                procedencia = "Nordeste";
                break;
            case 7:
            case 8:
                procedencia = "Centro-oeste";
                break;
            default:
                procedencia = "Importado";
        }

        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Procedência: " + procedencia);

        input.close();
    }
}
