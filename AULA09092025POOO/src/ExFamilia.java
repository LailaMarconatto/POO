
public class ExFamilia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Familia rodrigo = new Familia();
		rodrigo.setNome("Rodrigo");
		Familia.setSobrenome("Curvello");
		
		Familia iran = new Familia();
		iran.setNome("Iran");
		Familia.setSobrenome("Outra Familía");
		
		System.out.println(rodrigo.getNome() + " " + Familia.getSobrenome());
		System.out.println(iran.getNome() + " " + Familia.getSobrenome());
	}

}
