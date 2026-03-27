package aula2003;

public class Main {

	public static void main(String[] args) {
		Pair<Integer,String> p1 = new Pair<>(1,"Apple");
		Pair<Integer,String> p2 = new Pair<>(1,"Apple");
		boolean same = Util.<Integer,String> compare(p1,p2);
		// boolean same = Util.compare(p1,p2);
		System.out.println(same);
		
		// escreva metodo generico que conte numero de elementos em um array T que sejam maiores que um elemento E
	}

}
