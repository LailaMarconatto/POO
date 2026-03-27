package exercicio3;
import java.util.ArrayList;
import java.util.List;

public class Pedido<T extends ProdutoX> {

    private List<T> produtos;

    public Pedido() {
        produtos = new ArrayList<>();
    }

    public void adicionar(T produto) {
        produtos.add(produto);
    }

    public void mostrar() {
        for (T p : produtos) {
            System.out.println(p);
        }
    }
}
