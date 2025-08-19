import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        /*
         *  27. O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora
         *  possui uma loja de conveniências. Faça um programa que implemente uma caixa
         *  registradora rudimentar. O programa deverá receber um número desconhecido de valores
         *  referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador
         *  para indicar o final da compra. O programa deve então mostrar o total da compra e
         *  perguntar o valor em dinheiro que o cliente forneceu, para então calcular e mostrar
         *  o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial, para
         *  registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:
         *
         *  • Lojas Tabajara
         *  Produto 1: R$ 2.20
         *  Produto 2: R$ 5.80
         *  Produto 3: R$ 0
         *  Total: R$ 9.00
         *  Dinheiro: R$ 20.00
         *  Troco: R$ 11.00
         *  ...
         */
        
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Lojas Tabajara");
            
            double total = 0;
            int produto = 1;
            double preco;
            
            do {
                System.out.print("Produto " + produto + ": R$ ");
                preco = input.nextDouble();
                
                if (preco != 0) {
                    total += preco;
                    produto++;
                }
            } while (preco != 0);
            
            System.out.println("Total: R$ " + total);
            System.out.print("Dinheiro: R$ ");
            double dinheiro = input.nextDouble();
            double troco = dinheiro - total;
            System.out.println("Troco: R$ " + troco);
            
            System.out.println("Deseja registrar uma nova compra? (1 - Sim, 0 - Não)");
            int opcao = input.nextInt();
            if (opcao == 0) {
                break;
            }
        }
        
        input.close();
    }
}
