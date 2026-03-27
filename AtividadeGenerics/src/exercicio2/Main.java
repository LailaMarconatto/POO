package exercicio2;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produto<Integer> produto1 = new Produto<>(1001,29.90,LocalDate.of(2026, 3, 1),LocalDate.of(2026, 6, 1));
        System.out.println("Produto com ID Integer:");
        System.out.println(produto1);

        Produto<String> produto2 = new Produto<>("ABC123",49.90,LocalDate.of(2026, 2, 15),LocalDate.of(2026, 7, 15));
        System.out.println("\nProduto com ID String:");
        System.out.println(produto2);
    }
}