import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {
        /*
         *  32. Foi feita uma estatística em cinco cidades brasileiras para coletar dados
         *  sobre acidentes de trânsito. Foram obtidos os seguintes dados:
         *  a. Código da cidade;
         *  b. Número de veículos de passeio (em 1999);
         *  c. Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
         *  d. Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
         *  e. Qual a média de veículos nas cinco cidades juntas;
         *  f. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
         */
        
        Scanner input = new Scanner(System.in);
        
        int codigo, veiculos, acidentes;
        int totalVeiculos = 0;
        int totalAcidentesMenos2000 = 0;
        int countMenos2000 = 0;
        
        int maiorAcidente = Integer.MIN_VALUE;
        int cidadeMaiorAcidente = 0;
        
        int menorAcidente = Integer.MAX_VALUE;
        int cidadeMenorAcidente = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Código da cidade " + i + ": ");
            codigo = input.nextInt();
            
            System.out.print("Número de veículos de passeio (em 1999): ");
            veiculos = input.nextInt();
            
            System.out.print("Número de acidentes de trânsito com vítimas (em 1999): ");
            acidentes = input.nextInt();
            
            totalVeiculos += veiculos;
            
            if (veiculos < 2000) {
                totalAcidentesMenos2000 += acidentes;
                countMenos2000++;
            }
            
            if (acidentes > maiorAcidente) {
                maiorAcidente = acidentes;
                cidadeMaiorAcidente = codigo;
            }
            
            if (acidentes < menorAcidente) {
                menorAcidente = acidentes;
                cidadeMenorAcidente = codigo;
            }
        }
        
        double mediaVeiculos = (double) totalVeiculos / 5;
        double mediaAcidentesMenos2000 = countMenos2000 > 0 ? (double) totalAcidentesMenos2000 / countMenos2000 : 0;
        
        System.out.println("Cidade com maior número de acidentes: Código " + cidadeMaiorAcidente + ", Acidentes " + maiorAcidente);
        System.out.println("Cidade com menor número de acidentes: Código " + cidadeMenorAcidente + ", Acidentes " + menorAcidente);
        System.out.println("Média de veículos nas cinco cidades: " + mediaVeiculos);
        System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + mediaAcidentesMenos2000);
        
        input.close();
    }
}
