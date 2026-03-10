package testesGoogleChart;

public class Main {
    public static void main(String[] args) {
        // 1. Instancia o seu gerenciador passando o caminho do arquivo
        teste gerenciador = new teste("teste.json");

        // 2. Chama o método para buscar/ler os dados
        gerenciador.buscarDados();

        // 3. Verifica se carregou e imprime a lista
        if (gerenciador.getProdutos() != null) {
            for (Produto p : gerenciador.getProdutos()) {
                System.out.println("Encontrado: " + p);
            }
        } else {
            System.out.println("A lista de produtos está vazia ou houve erro.");
        }
    }
}