import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        /*
         *  31. Faça um programa que leia dez conjuntos de dois valores, o primeiro representando
         *  o número do aluno e o segundo representando a sua altura em centímetros. Encontre
         *  o aluno mais alto e o mais baixo. Mostre o número do aluno mais alto e o número
         *  do aluno mais baixo, junto com suas alturas.
         */
        
        Scanner input = new Scanner(System.in);
        
        int numAluno, alunoMaisAlto = 0, alunoMaisBaixo = 0;
        int altura;
        int maiorAltura = Integer.MIN_VALUE;
        int menorAltura = Integer.MAX_VALUE;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do " + i + "º aluno: ");
            numAluno = input.nextInt();
            
            System.out.print("Digite a altura do " + i + "º aluno (cm): ");
            altura = input.nextInt();
            
            if (altura > maiorAltura) {
                maiorAltura = altura;
                alunoMaisAlto = numAluno;
            }
            
            if (altura < menorAltura) {
                menorAltura = altura;
                alunoMaisBaixo = numAluno;
            }
        }
        
        System.out.println("Aluno mais alto: Número " + alunoMaisAlto + ", Altura " + maiorAltura + " cm");
        System.out.println("Aluno mais baixo: Número " + alunoMaisBaixo + ", Altura " + menorAltura + " cm");
        
        input.close();
    }
}
