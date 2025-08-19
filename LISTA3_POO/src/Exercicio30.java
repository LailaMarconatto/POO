import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        /*
         *  30. Uma academia deseja fazer um senso entre seus clientes para descobrir
         *  o mais alto, o mais baixo, a mais gordo e o mais magro, para isto você deve
         *  fazer um programa que pergunte a cada um dos clientes da academia seu código,
         *  sua altura e seu peso. O final da digitação de dados deve ser dada quando o usuário
         *  digitar 0 (zero) no campo código. Ao encerrar o programa também deve ser informados
         *  os códigos e valores do cliente mais alto, do mais baixo, do mais gordo e do mais magro,
         *  além da média das alturas e dos pesos dos clientes.
         */
        
        Scanner input = new Scanner(System.in);
        
        int codigo, codMaisAlto = 0, codMaisBaixo = 0, codMaisGordo = 0, codMaisMagro = 0;
        double altura, peso;
        double maiorAltura = Double.MIN_VALUE, menorAltura = Double.MAX_VALUE;
        double maiorPeso = Double.MIN_VALUE, menorPeso = Double.MAX_VALUE;
        double somaAltura = 0, somaPeso = 0;
        int count = 0;
        
        while (true) {
            System.out.print("Código do cliente (0 para encerrar): ");
            codigo = input.nextInt();
            
            if (codigo == 0) {
                break;
            }
            
            System.out.print("Altura do cliente: ");
            altura = input.nextDouble();
            
            System.out.print("Peso do cliente: ");
            peso = input.nextDouble();
            
            somaAltura += altura;
            somaPeso += peso;
            count++;
            
            if (altura > maiorAltura) {
                maiorAltura = altura;
                codMaisAlto = codigo;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
                codMaisBaixo = codigo;
            }
            if (peso > maiorPeso) {
                maiorPeso = peso;
                codMaisGordo = codigo;
            }
            if (peso < menorPeso) {
                menorPeso = peso;
                codMaisMagro = codigo;
            }
        }
        
        if (count > 0) {
            double mediaAltura = somaAltura / count;
            double mediaPeso = somaPeso / count;
            
            System.out.println("Cliente mais alto: Código " + codMaisAlto + ", Altura " + maiorAltura);
            System.out.println("Cliente mais baixo: Código " + codMaisBaixo + ", Altura " + menorAltura);
            System.out.println("Cliente mais gordo: Código " + codMaisGordo + ", Peso " + maiorPeso);
            System.out.println("Cliente mais magro: Código " + codMaisMagro + ", Peso " + menorPeso);
            System.out.println("Média das alturas: " + mediaAltura);
            System.out.println("Média dos pesos: " + mediaPeso);
        } else {
            System.out.println("Nenhum dado válido foi informado.");
        }
        
        input.close();
    }
}
