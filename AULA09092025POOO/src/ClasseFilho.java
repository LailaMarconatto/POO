
public class ClasseFilho extends ClassePai {

	private String nome;
	
	//public void Imprimir() {
	//	System.out.println("Este print é do Filho");
	//}
	
	public String Imprimir() {
		String saida = "Nome: " + nome;
		return saida;
	}
}
