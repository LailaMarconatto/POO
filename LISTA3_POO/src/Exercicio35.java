import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio35 {

    public static void main(String[] args) {
        /*
         *  35. O cardápio de uma lanchonete é o seguinte:
         *  • Especificação Código Preço
         *  Cachorro Quente 100 R$ 1,20
         *  Bauru Simples 101 R$ 1,30
         *  Bauru com ovo 102 R$ 1,50
         *  Hambúrguer 103 R$ 1,20
         *  Cheeseburguer 104 R$ 1,30
         *  Refrigerante 105 R$ 1,00
         *
         *  Faça um programa que leia o código dos itens pedidos e as quantidades desejadas.
         *  Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral
         *  do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado.
         */
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        int codigo, quantidade;
        double totalGeral = 0;
        
        System.out.println("Digite os pedidos (digite 0 no código para encerrar):");
        
        while (true) {
            System.out.print("Código do item: ");
            codigo = input.nextInt();
            
            if (codigo == 0) {
                break;
            }
            
            System.out.print("Quantidade: ");
            quantidade = input.nextInt();
            
            double preco = 0;
            String item = "";
            
            switch (codigo) {
                case 100:
                    preco = 1.20;
                    item = "Cachorro Quente";
                    break;
                case 101:
                    preco = 1.30;
                    item = "Bauru Simples";
                    break;
                case 102:
                    preco = 1.50;
                    item = "Bauru com ovo";
                    break;
                case 103:
                    preco = 1.20;
                    item = "Hambúrguer";
                    break;
                case 104:
                    preco = 1.30;
                    item = "Cheeseburguer";
                    break;
                case 105:
                    preco = 1.00;
                    item = "Refrigerante";
                    break;
                default:
                    System.out.println("Código inválido.");
                    continue;
            }
            
            double valorItem = preco * quantidade;
            totalGeral += valorItem;
            
            System.out.println(item + ": R$ " + df.format(valorItem));
        }
        
        System.out.println("Total geral do pedido: R$ " + df.format(totalGeral));
        
        input.close();
    }
}
