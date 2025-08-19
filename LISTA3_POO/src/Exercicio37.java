import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {
        /*
         *  37. Desenvolver um programa para verificar a nota do aluno em uma prova com 10
         *  questões, o programa deve perguntar ao aluno a resposta de cada questão e ao final
         *  comparar com o gabarito da prova e assim calcular o total de acertos e a nota 
         *  (atribuir 1 ponto por resposta certa). Após cada aluno utilizar o sistema deve ser
         *  feita uma pergunta se outro aluno vai utilizar o sistema. Após todos os alunos terem
         *  respondido informar:
         *  a. Maior e Menor Acerto;
         *  b. Total de Alunos que utilizaram o sistema;
         *  c. A Média das Notas da Turma.
         *  
         *  Gabarito da Prova:
         *  01  A
         *  02  B
         *  03  C
         *  04  D
         *  05  E
         *  06  E
         *  07  D
         *  08  C
         *  09  B
         *  10  A
         *  
         *  Após concluir isto você poderia incrementar o programa permitindo que o professor
         *  digite o gabarito da prova antes dos alunos usarem o programa.
         */
        
        Scanner input = new Scanner(System.in);
        
        // Gabarito fixo (poderia ser digitado pelo professor)
        char[] gabarito = {'A','B','C','D','E','E','D','C','B','A'};
        // Se quiser que o professor digite, basta descomentar as linhas abaixo:
        /*
        char[] gabarito = new char[10];
        System.out.println("Professor, digite o gabarito da prova (A,B,C,D,E) para cada questão:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Questão " + (i+1) + ": ");
            gabarito[i] = input.next().toUpperCase().charAt(0);
        }
        */
        
        int maiorAcerto = Integer.MIN_VALUE;
        int menorAcerto = Integer.MAX_VALUE;
        int totalAlunos = 0;
        int somaNotas = 0;
        
        boolean outroAluno = true;
        
        while (outroAluno) {
            totalAlunos++;
            int acertos = 0;
            char[] respostas = new char[10];
            
            System.out.println("Aluno " + totalAlunos + ", digite suas respostas (A,B,C,D,E):");
            for (int i = 0; i < 10; i++) {
                System.out.print("Questão " + (i+1) + ": ");
                respostas[i] = input.next().toUpperCase().charAt(0);
                
                if (respostas[i] == gabarito[i]) {
                    acertos++;
                }
            }
            
            System.out.println("Total de acertos: " + acertos);
            
            if (acertos > maiorAcerto) {
                maiorAcerto = acertos;
            }
            if (acertos < menorAcerto) {
                menorAcerto = acertos;
            }
            
            somaNotas += acertos;
            
            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            char opcao = input.next().toUpperCase().charAt(0);
            outroAluno = opcao == 'S';
        }
        
        double mediaNotas = totalAlunos > 0 ? (double) somaNotas / totalAlunos : 0;
        
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos que utilizaram o sistema: " + totalAlunos);
        System.out.println("Média das notas da turma: " + mediaNotas);
        
        input.close();
    }
}
