package aula1410;
import java.util.*;
import java.time.*;

public class ListaPessoa {
	
	private List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public boolean Adicionar(Pessoa p) {
		if(buscarPorNome(p.getNome()) == null)
			lista.add(p);	
		return true;
	}
	
	public List<Pessoa> buscarPessoas() {
		return lista;
	}
	
	public Pessoa buscarPorNome(String nome) {
	    for (Pessoa p : lista) {
	        if (p.getNome().equalsIgnoreCase(nome)) {
	            return p;
	        }
	    }
	    return null;
	}
	
	public List<Pessoa> buscarAniversariantes(int mes) {
		List<Pessoa> aniversariantes = new ArrayList<>();
		
	    for (Pessoa p : lista) {
	    	LocalDate dataBusca = LocalDate.parse(p.getDataNascimento());
	        if (dataBusca.getMonthValue() == mes) {
	        	aniversariantes.add(p);
	        }
	    }
	    
	    return aniversariantes;
	}
	
	public List<Pessoa> buscarEmail(String dominio) {
		List<Pessoa> pessoas = new ArrayList<>();
		
	    for (Pessoa p : lista) {
	    	String email = p.getEmail();		
	        if (email.contains(dominio)) {
	        	pessoas.add(p);
	        }
	    } 
	    return pessoas;
	}
}
