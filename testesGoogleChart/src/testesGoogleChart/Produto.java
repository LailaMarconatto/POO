package testesGoogleChart;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)

public class Produto {

    @JsonProperty("product_title")
    private String nome;

    @JsonProperty("product_price")
    private double preco;
    
    public Produto() {}

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    
    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço: R$ " + preco;
    }
}