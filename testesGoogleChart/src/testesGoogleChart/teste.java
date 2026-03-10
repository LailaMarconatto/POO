package testesGoogleChart;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.databind.DeserializationFeature;

public class teste {

    private String caminhoArquivo;
    private List<Produto> produtos; // Assumindo que você tem uma classe Produto
    private final ObjectMapper mapper = new ObjectMapper();

    public teste(String caminhoArquivo){
        this.caminhoArquivo = caminhoArquivo;
        this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // 1. Carregar Dados: Responsável por ler o arquivo do disco
    public void carregarDados() throws IOException {
        File arquivo = new File(this.caminhoArquivo);
        if (!arquivo.exists()) {
            throw new IOException("Arquivo não encontrado em: " + caminhoArquivo);
        }
        
        // Passa o arquivo para o parse
        this.parseJson(arquivo);
    }

    // 2. Parse JSON: Converte o conteúdo do arquivo em objetos Java
    private void parseJson(File arquivo) throws IOException {
        // O Jackson lê o arquivo e mapeia para uma List<Produto> automaticamente
        this.produtos = mapper.readValue(arquivo, new TypeReference<List<Produto>>() {});
    }

    // 3. Buscar Dados: Um método de conveniência para acessar a lista
    public void buscarDados() {
        try {
            carregarDados();
            System.out.println("Dados carregados com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao buscar dados: " + e.getMessage());
        }
    }

    // 4. Get Produtos: Retorna a lista carregada
    public List<Produto> getProdutos() {
        return this.produtos;
    }
}