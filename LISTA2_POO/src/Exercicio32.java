import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {
        /*
         * O Hipermercado Tabajara está com uma promoção de carnes que é imperdível:
         * Até 5 Kg           | Acima de 5 Kg
         * File Duplo: R$4,90 | R$5,80
         * Alcatra: R$5,90    | R$6,80
         * Picanha: R$6,90    | R$7,80
         * 
         * Cada cliente pode levar apenas um tipo de carne e quantidade ilimitada.
         * Se a compra for no cartão Tabajara, recebe 5% de desconto sobre o total.
         * 
         * O programa deve pedir tipo, quantidade e forma de pagamento e gerar cupom fiscal.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Tipos de carne disponíveis:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Escolha o tipo de carne (1-3): ");
        int tipoCarne = input.nextInt();

        System.out.print("Digite a quantidade de carne (kg): ");
        double qtdKg = input.nextDouble();

        System.out.print("Pagamento no cartão Tabajara? (S/N): ");
        input.nextLine();
        String pagamento = input.nextLine().trim().toUpperCase();

        double precoKg = 0;
        String nomeCarne = "";

        switch (tipoCarne) {
            case 1:
                nomeCarne = "File Duplo";
                precoKg = (qtdKg <= 5) ? 4.90 : 5.80;
                break;
            case 2:
                nomeCarne = "Alcatra";
                precoKg = (qtdKg <= 5) ? 5.90 : 6.80;
                break;
            case 3:
                nomeCarne = "Picanha";
                precoKg = (qtdKg <= 5) ? 6.90 : 7.80;
                break;
            default:
                System.out.println("Tipo de carne inválido.");
                input.close();
                return;
        }

        double valorTotal = precoKg * qtdKg;
        double desconto = 0;
        if (pagamento.equals("S")) {
            desconto = valorTotal * 0.05;
        }
        double valorAPagar = valorTotal - desconto;

        System.out.println("\n--- CUPOM FISCAL ---");
        System.out.printf("Tipo de carne: %s\n", nomeCarne);
        System.out.printf("Quantidade: %.2f kg\n", qtdKg);
        System.out.printf("Preço por kg: R$ %.2f\n", precoKg);
        System.out.printf("Preço total: R$ %.2f\n", valorTotal);
        System.out.printf("Pagamento no cartão Tabajara: %s\n", (pagamento.equals("S") ? "Sim" : "Não"));
        System.out.printf("Valor do desconto: R$ %.2f\n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f\n", valorAPagar);

        input.close();
    }
}
