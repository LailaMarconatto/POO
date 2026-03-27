package exercicio1;

public class Generico<T> {
	
	private T dado;

	public Generico(T dado) {
		setDado(dado);
	}

	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}
}
