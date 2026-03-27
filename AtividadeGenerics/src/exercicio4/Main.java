package exercicio4;

public class Main {
    public static void main(String[] args) {

        Estrutura<Integer> est1 = new Estrutura<>();

        System.out.println(est1.add("a", 10));
        System.out.println(est1.add("b", 20));
        System.out.println(est1.add("a", 30));

        System.out.println(est1.buscar("a"));
        System.out.println(est1.buscar("x"));


        System.out.println("\n-------------------");

        Estrutura<String> est2 = new Estrutura<>();

        est2.add("nome", "Laila");
        System.out.println(est2.buscar("nome"));


        System.out.println("\n-------------------");

        Estrutura<ProdutoTeste> est3 = new Estrutura<>();

        est3.add("p1", new ProdutoTeste("Notebook"));
        est3.add("p2", new ProdutoTeste("Mouse"));

        System.out.println(est3.buscar("p1"));
    }
}