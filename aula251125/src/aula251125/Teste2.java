package aula251125;

public class Teste2 {

	public static void main(String[] args) {
		int n1 = 567;
		int n2 = 0;
		float result = 0;
		try {
			result = n1/n2;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		
		/* InterruptedException -> para alguma função/ação
		 * ArithmeticException -> para alguma conta/calculo
		 * Desafio: crie uma aplicação que armazene informações de contatos em um array lis, o contato deve ter as seguintes informações:
		 * 	-id : int
		 * 	-nome : String
		 *  -email : String
		 *  -telefone : int
		 *  -data_nascimento : LocalDate
		 *  
		 * sem usar banco, manter a persistencia usando arquivos(4-XML, 2-JSON, 1-CSV, 3-YAML, 5-TOON)
		 * 
		 * passos para aprovação:
		 * -> abrir arquivo;
		 * -> salvar alterações ou criações nos arquivos;
		 * -> salvar a cada contato;
		 */
	}
}
