
public class Exercicio1 {

	private String nome = "";
	private String sobrenome = "";
	private int idade = 0;
	
	public Exercicio1(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	public Exercicio1(String nome, String sobrenome) {
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	public Exercicio1() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Exercicio1 [nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append("]");
		return builder.toString();
	}
	
}
