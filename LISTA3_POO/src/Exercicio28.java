import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        /*
         *  28. O Departamento Estadual de Meteorologia lhe contratou para desenvolver
         *  um programa que leia as um conjunto indeterminado de temperaturas, e informe
         *  ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.
         */
        
        Scanner input = new Scanner(System.in);
        
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        int count = 0;
        double temperatura;
        
        System.out.println("Digite as temperaturas (digite 999 para encerrar):");
        
        while (true) {
            System.out.print("Temperatura: ");
            temperatura = input.nextDouble();
            
            if (temperatura == 999) {
                break;
            }
            
            if (temperatura < menor) {
                menor = temperatura;
            }
            
            if (temperatura > maior) {
                maior = temperatura;
            }
            
            soma += temperatura;
            count++;
        }
        
        if (count > 0) {
            double media = soma / count;
            System.out.println("Menor temperatura: " + menor);
            System.out.println("Maior temperatura: " + maior);
            System.out.println("Média das temperaturas: " + media);
        } else {
            System.out.println("Nenhuma temperatura válida foi informada.");
        }
        
        input.close();
    }
}
