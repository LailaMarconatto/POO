import java.util.Scanner;

public class OlaIMundo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um Inteiro:");
		int num1 = input.nextInt();
		System.out.println("num1: " + num1);
		
		System.out.println("Informe um Float:");
		float float1 = input.nextFloat();
		System.out.println("float1: " + float1);
		
		System.out.println("Informe um Double:");
		double double1 = input.nextDouble();
		System.out.println("double1: " + double1);
		
		input.nextLine();
		
		System.out.println("Informe um String:");
		String string1 = input.nextLine();
		System.out.println("string1: " + string1);
		input.close();
	}

}
