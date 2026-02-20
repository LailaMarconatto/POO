package aula1410;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	private String email;
	private String telefone;

	public Pessoa(String nome, String dataNascimento, String email, String telefone) {
		setNome(nome);
		setDataNascimento(dataNascimento);
		setEmail(email);
		setTelefone(telefone);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 3 && nome != null)
			this.nome = nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email != null)
			this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", email=");
		builder.append(email);
		builder.append(", telefone=");
		builder.append(telefone);
		builder.append("]");
		return builder.toString();
	}
}
