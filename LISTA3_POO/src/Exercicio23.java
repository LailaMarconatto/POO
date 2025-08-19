import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        /*
         *  23. Faça um programa que calcule o número médio de alunos por turma.
         *  Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma.
         *  As turmas não podem ter mais de 40 alunos.
         */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de turmas: ");
        int numTurmas = input.nextInt();
        
        int somaAlunos = 0;
        
        for (int i = 1; i <= numTurmas; i++) {
            int alunos;
            do {
                System.out.print("Digite a quantidade de alunos da " + i + "ª turma (máx. 40): ");
                alunos = input.nextInt();
                if (alunos > 40) {
                    System.out.println("Número inválido. A turma não pode ter mais de 40 alunos.");
                }
            } while (alunos > 40);
            
            somaAlunos += alunos;
        }
        
        double mediaAlunos = (double) somaAlunos / numTurmas;
        
        System.out.println("Número médio de alunos por turma: " + mediaAlunos);
        
        input.close();
    }
}
