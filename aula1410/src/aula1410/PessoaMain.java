package aula1410;
import java.util.*;

public class PessoaMain {

	public static void main(String[] args) {
		/* permita a criação de data de nascimento, email e telefone. - feito 
		 * não pode pessoas com o mesmo nome. - feito  
		 * obrigatorio nome e email - feito
		 * metodo que retorna os aniversariantes de um determinado mes - feito
		 * saber todas as pessoas que tem email de um determinado dominio - feito
		 * */
		
		ListaPessoa l = new ListaPessoa();
		
		Pessoa p = new Pessoa("Rodrigo", "1978-04-24", "rodrigo@gmail.com", "(47) 99494-9939");
		l.Adicionar(p);

		p = new Pessoa("Nara","1978-02-24", "Nara@gmail.com", "(47) 93494-9439");
		l.Adicionar(p);
		
		p = new Pessoa("teste","1978-04-24", "teste@outlook.com", "(45) 98964-9434");
		l.Adicionar(p);
		
		//p = new Pessoa("Nara","1978-04-24", "teste@outlook.com", "(45) 98964-9434");
		//l.Adicionar(p);
		
		//List<Pessoa> pessoas = l.buscarPessoas();
		//List<Pessoa> pessoas = l.buscarAniversariantes(4);
		List<Pessoa> pessoas = l.buscarEmail("outlook");
		
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
