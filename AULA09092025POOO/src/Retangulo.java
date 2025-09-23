
public class Retangulo {
	private int ladoA = 2;
	private int ladoB = 4;
	private String cor = "Verde";
	
	public Retangulo(int ladoA, int ladoB, String cor) {
		setLadoA(ladoA);
		setLadoB(ladoB);
		setCor(cor);
	}
	
	public Retangulo(int ladoA, int ladoB) {
		setLadoA(ladoA);
		setLadoB(ladoB);
	}
	
	public Retangulo(String cor) {
		setCor(cor);
	}
	
	public Retangulo() {
		
	}
	
	public int getLadoA() {
		return ladoA;
	}
	public void setLadoA(int ladoA) {
		if(ladoA > 0)
			this.ladoA = ladoA;
	}
	
	public int getLadoB() {
		return ladoB;
	}
	public void setLadoB(int ladoB) {
		if(ladoA > 0)
			this.ladoB = ladoB;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		if(cor.length() > 3)
			this.cor = cor;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Retangulo [ladoA=");
		builder.append(ladoA);
		builder.append(", ladoB=");
		builder.append(ladoB);
		builder.append(", cor=");
		builder.append(cor);
		builder.append("]");
		return builder.toString();
	}
}
