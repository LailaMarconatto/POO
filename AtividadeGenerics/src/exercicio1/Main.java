package exercicio1;

public class Main {

	public static void main(String[] args) {
		
        Generico<String> g1 = new Generico<>("Oi");
        String x = g1.getDado();
        System.out.println("String: " + x);

        Generico<Integer> g2 = new Generico<>(10);
        Integer y = g2.getDado();
        System.out.println("Integer: " + y);

        Pessoa p = new Pessoa("Laila");
        Generico<Pessoa> g3 = new Generico<>(p);
        Pessoa z = g3.getDado();
        System.out.println(z);
	}

}
