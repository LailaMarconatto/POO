import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        /*
         *  22. Numa eleição existem três candidatos. Faça um programa que peça
         *  o número total de votantes. Peça para cada votante votar e ao final
         *  mostrar o número de votos de cada candidato.
         */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o número total de votantes: ");
        int n = input.nextInt();
        
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Votante " + i + ":");
            System.out.println("Digite 1 para Candidato 1, 2 para Candidato 2, 3 para Candidato 3");
            int voto = input.nextInt();
            
            if (voto == 1) {
                votosCandidato1++;
            } else if (voto == 2) {
                votosCandidato2++;
            } else if (voto == 3) {
                votosCandidato3++;
            } else {
                System.out.println("Voto inválido. Nenhum voto contabilizado.");
            }
        }
        
        System.out.println("Resultado da eleição:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");
        
        input.close();
    }
}
