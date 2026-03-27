package aula2003;

public class testeMain {

	public static void main(String[] args) {
		Integer[] meuArray = {1,2,3,4,5,6,7,8};
		Integer valor = 3;
		int cont = testeUtil.<Integer> contar(meuArray,valor);
		System.out.println(cont);
	}

}
