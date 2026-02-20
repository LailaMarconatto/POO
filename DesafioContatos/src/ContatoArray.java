//Classe ContatoArray -> responsável pela criação, edição e exclusão de contato e salvar no arquivo a cada contato(com try catch)
import java.time.LocalDate;
import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class ContatoArray {
	private List<Contato> contatos;
	
    public ContatoArray() {
        this.contatos = new ArrayList<>(); // INICIALIZA A LISTA
    }
    
	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public void createContato (int id, String nome, String email, String telefone, String data_nascimento) {
		Contato contato = new Contato();
		contato.setId(id);
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setTelefone(telefone);
		contato.setData_nascimento(LocalDate.parse(data_nascimento));
		try {
			this.getContatos().add(contato);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		try {
			this.toCSV();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public void clearContatos() {
	    this.contatos.clear();
	    System.out.println("Lista de contatos limpa!");
	}

	public void toCSV() {
	    String filePath = "contatos.csv";

	    try (FileWriter fileWriter = new FileWriter(filePath);
	         PrintWriter printWriter = new PrintWriter(fileWriter)) {

	        // Cabeçalho do CSV
	        printWriter.println("Id,Nome,Email,Telefone,DataNascimento");

	        // Percorrer a lista de contatos
	        for (Contato c : this.contatos) {
	            printWriter.printf(
	                "%d,%s,%s,%s,%s%n",
	                c.getId(),
	                c.getNome(),
	                c.getEmail(),
	                c.getTelefone(),
	                c.getData_nascimento()
	            );
	        }

	        System.out.println("CSV criado com sucesso em: " + filePath);

	    } catch (IOException e) {
	        System.err.println("Erro ao escrever CSV: " + e.getMessage());
	    }
	}

	
	/*
	public void toJSON() {
			
	}
	
	public void toYAML() {
		
	}
	
	public void toXML() {
		
	}
	
	public void toTOON() {
		
	}*/
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContatoArray [contatos=");
		builder.append(contatos);
		builder.append("]");
		return builder.toString();
	}
	
}
