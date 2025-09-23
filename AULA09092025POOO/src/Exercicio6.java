
public class Exercicio6 {

	private int lado = 0;
	
	public Exercicio6(int lado) {
		setLado(lado);
	}
	
	public Exercicio6() {

	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public float Area() {
		int lado = this.getLado();
		float area = lado*lado;
		return area;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Exercicio6 [lado=");
		builder.append(lado);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
