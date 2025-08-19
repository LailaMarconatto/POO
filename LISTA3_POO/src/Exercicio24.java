import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        /*
         *  24. Faça um programa que calcule o valor total investido por um colecionador
         *  em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário
         *  deverá informar a quantidade de CDs e o valor de cada um.
         */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de CDs: ");
        int numCDs = input.nextInt();
        
        double somaValores = 0;
        
        for (int i = 1; i <= numCDs; i++) {
            System.out.print("Digite o valor do " + i + "º CD: ");
            double valor = input.nextDouble();
            somaValores += valor;
        }
        
        double valorMedio = somaValores / numCDs;
        
        System.out.println("Valor total investido: R$ " + somaValores);
        System.out.println("Valor médio gasto por CD: R$ " + valorMedio);
        
        input.close();
    }
}
