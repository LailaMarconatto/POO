import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teste2 {

	public static void main(String[] args) {
		
		//Data atual
		LocalDate dt = LocalDate.now();
		System.out.println(dt);
		
		//Data e hora atual
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		
		//Data, hora e Local atual
		Instant ins = Instant.now();
		System.out.println(ins);
		
		//Data definida manualmente
		LocalDate dt2 = LocalDate.parse("1978-04-24");
		System.out.println(dt2.getMonthValue());
		
		//Data e hora definida manualmente
		LocalDateTime time2 = LocalDateTime.parse("1978-04-24T15:27:21");
		System.out.println(time2);
		
		//Data, hora e local definida manualmente, negativo da linha de greenwich
		Instant ins2 = Instant.parse("1978-04-24T15:27:21-03:00");
		System.out.println(ins2);
		
		//Data, hora e local definida manualmente, positivo da linha de greenwich
		Instant ins3 = Instant.parse("1978-04-24T15:27:21+03:00");
		System.out.println(ins3);
		
		//Data, hora e local definida pela localização do usuário
		Instant ins4 = Instant.parse("1978-04-24T15:27:21Z");
		System.out.println(ins4);
		
		//identificação de formato de data. Ex.: Formato brasileiro
		DateTimeFormatter dtfDataBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dt3 = LocalDate.parse("24/04/1978", dtfDataBrasil);
		System.out.println(dt3);
		
		DateTimeFormatter dtfDataHoraBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime time3 = LocalDateTime.parse("24/04/1978 15:01:27", dtfDataHoraBrasil);
		System.out.println(time3);
		
		//Data por inteiros, o primeiro é o ano, segundo o mes e terceiro o dia. Se não seguir o padrão nao funciona
		LocalDate dt4 = LocalDate.of(1978, 4, 24);
		System.out.println(dt4);
		
		//Data e hora por inteiros, o primeiro é o ano, segundo o mes, terceiro o dia, quarto a hora, quinto o minuto e sexto e ultimo os segundos. Se não seguir o padrão nao funciona
		LocalDateTime time5 = LocalDateTime.of(1978, 4, 24, 15, 45, 58);
		System.out.println(time5);
	}

}
