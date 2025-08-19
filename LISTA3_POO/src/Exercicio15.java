
public class Exercicio15 {

	public static void main(String[] args) {
		// 15. Mostre e calcule a série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37.
		
		int iniMulti = 38;
		int iniDiv = 1;
		
		int total = 0;
		System.out.println("S = ");
		for (int i = 0; i < 37; i++) {
			System.out.print("(" + (iniMulti - (i+1)) + "*" + (iniMulti-i) + ")/" + (iniDiv+i));
			if (i < 36) {
				System.out.println(" + ");
			}
			total = total+((iniMulti - (i+1))*(iniMulti-i))/(iniDiv+i);
		}
		System.out.println(" ");
		System.out.println("O total é: "+total);
	}

}
