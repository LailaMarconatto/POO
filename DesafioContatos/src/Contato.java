//Classe Contato -> tem setter e getter de Contato
import java.time.LocalDate;

public class Contato {
	 private int id;
	 private String nome;
	 private String email; 
	 private String telefone;
	 private LocalDate data_nascimento;
	 
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 
	 public String getNome() {
		 return nome;
	 }
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	 
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 
	 public String getTelefone() {
		 return telefone;
	 }
	 public void setTelefone(String telefone) {
		 this.telefone = telefone;
	 }
	 
	 public LocalDate getData_nascimento() {
		 return data_nascimento;
	 }
	 public void setData_nascimento(LocalDate data_nascimento) {
		 this.data_nascimento = data_nascimento;
	 }
	 
	 @Override
	 public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contato [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", telefone=");
		builder.append(telefone);
		builder.append(", data_nascimento=");
		builder.append(data_nascimento);
		builder.append("]");
		return builder.toString();
	 }
}
