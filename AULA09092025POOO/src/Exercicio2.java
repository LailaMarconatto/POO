
public class Exercicio2 {
	
	private int num1 = 0;
	private int num2 = 0;
	
	public Exercicio2(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
	}
	
	public Exercicio2(int num1) {
		setNum1(num1);
	}
	
	public Exercicio2() {
		
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Exercicio2 [num1=");
		builder.append(num1);
		builder.append(", num2=");
		builder.append(num2);
		builder.append("]");
		return builder.toString();
	}
}
