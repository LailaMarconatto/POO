//final na classe proibe a criação de filhos
//abstract não permite intanciar, pois não esta pronta
//priobido static na classe, pois é fixo
public abstract class ClassePai {

	//final no atributo é constante
	//abstract no atributo não é possível
	//static no atributo torna o atributo pertencente a classe e não ao objeto
	private String Sobrenome;
	
	//final no método proibe sobreescrição
	//abstract torna o metodo incompleto a forma correta seria:
	// e abstract na clase também
	public abstract String Imprimir(); 
	//public void Imprimir() {
	//	System.out.println("Este print é do pai");
	//}
	
}
