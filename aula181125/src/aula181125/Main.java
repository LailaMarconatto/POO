package aula181125;

public class Main {
	public static void main(String[] args) {
		/*
		TipoUsuario tipo = TipoUsuario.CONTROLER;
		System.out.println(tipo.name());
		System.out.println(tipo.toString());
		System.out.println(tipo.ordinal());
		
		for (TipoUsuario item : TipoUsuario.values()) {
			System.out.println(item.name());
		}
		*/
		
		OpcoesMenu tipo = OpcoesMenu.ABRIR;
		
		switch (tipo) {
			case ABRIR:System.out.println("abrir");
				break;
			case IMPRIMIR:System.out.println("imprimir");
				break;
			default:System.out.println("error");
				break;
		}
		
		System.out.println(tipo.getValor());
	}
}

