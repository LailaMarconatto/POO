package exercicio3;

public class Main {
    public static void main(String[] args) {

        Pedido<ProdutoX> pedido1 = new Pedido<>();
        pedido1.adicionar(new ProdutoX("Arroz", 25.0));
        pedido1.adicionar(new ProdutoX("Feijão", 10.0));

        System.out.println("Pedido 1:");
        pedido1.mostrar();

        Pedido<Eletronico> pedido2 = new Pedido<>();
        pedido2.adicionar(new Eletronico("Celular", 1500.0, "Samsung"));
        pedido2.adicionar(new Eletronico("Notebook", 3500.0, "Dell"));

        System.out.println("\nPedido 2:");
        pedido2.mostrar();
    }
}