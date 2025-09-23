import java.util.Scanner;

public class Exercicio6Main {

    public static void main(String[] args) {
        /*
         * 6. Crie uma classe que modele um quadrado:
         * Atributos: Tamanho do lado
         * Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;
         */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do lado do quadrado: ");
        int lado = input.nextInt();
        
        Exercicio6 quadrado = new Exercicio6(lado);
        
        System.out.println("Lado atual: " + quadrado.getLado());
        System.out.println("Área do quadrado: " + quadrado.Area());
        
        System.out.print("\nDeseja mudar o valor do lado? (s/n): ");
        String resposta = input.next();
        
        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Informe o novo valor do lado: ");
            int novoLado = input.nextInt();
            quadrado.setLado(novoLado);
            
            System.out.println("Novo lado: " + quadrado.getLado());
            System.out.println("Nova área: " + quadrado.Area());
        }
        
        System.out.println("\nObjeto quadrado: " + quadrado);
        
        input.close();
    }
}
