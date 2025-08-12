import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
    	//Tendo como dado de entrada a altura, peso e sexo, construa um algoritmo que calcule
    	//o peso ideal, utilizando as seguintes fórmulas:
    	//Para homens: (72.7*h) - 58
    	//Para mulheres: (62.1*h) - 44.7
    	//(h = altura)
    	//Ao final o algoritmo deve mostrar:
    	//- Altura, peso e sexo;
    	//- Peso Ideal;
    	//- Mensagem se está acima, abaixo ou no peso ideal;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double altura = input.nextDouble();

        System.out.print("Digite o peso (em kg): ");
        double peso = input.nextDouble();

        System.out.print("Digite o sexo (M/F): ");
        String sexo = input.next();

        double pesoIdeal;

        if (sexo.equals("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equals("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido! Use 'M' para masculino ou 'F' para feminino.");
            input.close();
            return;
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Sexo: " + sexo);
        System.out.printf("Peso ideal: %.2f kg\n", pesoIdeal);

        if (peso > pesoIdeal) {
            System.out.println("Você está acima do peso ideal.");
        } else if (peso < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal.");
        } else {
            System.out.println("Você está no peso ideal.");
        }

        input.close();
    }
}
