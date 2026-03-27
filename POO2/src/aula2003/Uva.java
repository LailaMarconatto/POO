package aula2003;

public class Uva {
	private String cor;

	public Uva() {
	}
	
	public Uva(String cor) {
		super();
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Uva [cor=" + cor + "]";
	}
	
}
