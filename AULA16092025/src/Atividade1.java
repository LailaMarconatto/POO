import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// mostrar quantidades de sábados e domingos entre duas datas
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Insira a primeira data");
		String data1 = input.nextLine();
		System.out.println("Insira a segunda data");
		String data2 = input.nextLine();
		
		LocalDate dt1 = LocalDate.parse(data1);
		LocalDate dt2 = LocalDate.parse(data2);
		
		int FDS_Count = 0;
		for (LocalDate dataAtual = dt1; !dataAtual.isAfter(dt2); dataAtual = dataAtual.plusDays(1)) {
			DayOfWeek diaDaSemana = dataAtual.getDayOfWeek();
			//System.out.println("Processando: " + dataAtual);
            //System.out.println(diaDaSemana);
            if (diaDaSemana.toString() == "SATURDAY" || diaDaSemana.toString() == "SUNDAY") {
            	FDS_Count++;
            }
        }
		
		System.out.println(FDS_Count);
		
		input.close();
	}

}
