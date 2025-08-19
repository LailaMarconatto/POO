import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio36 {

    public static void main(String[] args) {
        /*
         *  36. Em uma eleição presidencial existem quatro candidatos. Os votos são informados por
         *  meio de código. Os códigos utilizados são:
         *  • 1 , 2, 3, 4 - Votos para os respectivos candidatos
         *  (você deve montar a tabela ex: 1- Jose / 2- João / etc)
         *  5  Voto Nulo
         *  6  Voto em Branco
         *
         *  Faça um programa que calcule e mostre:
         *  • O total de votos para cada candidato;
         *  • O total de votos nulos;
         *  • O total de votos em branco;
         *  • A percentagem de votos nulos sobre o total de votos;
         *  • A percentagem de votos em branco sobre o total de votos. Para finalizar o conjunto de votos
         *    tem-se o valor zero.
         */
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        int voto;
        int[] votosCandidatos = new int[4];
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;
        
        System.out.println("Candidatos:");
        System.out.println("1 - Jose");
        System.out.println("2 - João");
        System.out.println("3 - Maria");
        System.out.println("4 - Ana");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("Digite 0 para encerrar a votação.");
        
        while (true) {
            System.out.print("Digite o código do voto: ");
            voto = input.nextInt();
            
            if (voto == 0) {
                break;
            }
            
            switch (voto) {
                case 1:
                case 2:
                case 3:
                case 4:
                    votosCandidatos[voto - 1]++;
                    totalVotos++;
                    break;
                case 5:
                    votosNulos++;
                    totalVotos++;
                    break;
                case 6:
                    votosBrancos++;
                    totalVotos++;
                    break;
                default:
                    System.out.println("Código inválido.");
            }
        }
        
        System.out.println("Total de votos por candidato:");
        System.out.println("Jose: " + votosCandidatos[0]);
        System.out.println("João: " + votosCandidatos[1]);
        System.out.println("Maria: " + votosCandidatos[2]);
        System.out.println("Ana: " + votosCandidatos[3]);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);
        
        double percNulos = totalVotos > 0 ? (double) votosNulos / totalVotos * 100 : 0;
        double percBrancos = totalVotos > 0 ? (double) votosBrancos / totalVotos * 100 : 0;
        
        System.out.println("Percentual de votos nulos: " + df.format(percNulos) + "%");
        System.out.println("Percentual de votos em branco: " + df.format(percBrancos) + "%");
        
        input.close();
    }
}
