
public class PessoaMain {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Rodrigo","casa do caralho");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Rodrigo","casa do caralho");
		pf.setCpf("111.222.333.-44");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Rodrigo","casa do caralho");
		pj.setCnpj("23.432.453/0001-78");
		System.out.println(pj);
	}

}
