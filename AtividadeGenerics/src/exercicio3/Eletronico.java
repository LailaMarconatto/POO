package exercicio3;

public class Eletronico extends ProdutoX {

    private String marca;
    
    public Eletronico(String nome, double valor, String marca) {
		super(nome, valor);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Eletronico [marca=" + marca + ", getNome()=" + getNome() + ", getValor()=" + getValor() + "]";
	}
}