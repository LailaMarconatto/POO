import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // feriados (mes começa em 0 no array, mas em LocalDate é 1 a 12)
        int[][] feriados = {
            {0, 1},   // 01/01
            {3, 21},  // 21/04
            {4, 1},   // 01/05
            {8, 7},   // 07/09
            {9, 12},  // 12/10
            {10, 2},  // 02/11
            {10, 15}, // 15/11
            {11, 25}  // 25/12
        };

        System.out.println("Insira a primeira data (yyyy-MM-dd):");
        String data1 = input.nextLine();
        System.out.println("Insira a segunda data (yyyy-MM-dd):");
        String data2 = input.nextLine();

        LocalDate dt1 = LocalDate.parse(data1);
        LocalDate dt2 = LocalDate.parse(data2);

        int totalDias = 0;
        int diasUteis = 0;

        for (LocalDate dataAtual = dt1; !dataAtual.isAfter(dt2); dataAtual = dataAtual.plusDays(1)) {
            totalDias++;
            DayOfWeek diaDaSemana = dataAtual.getDayOfWeek();

            // pula finais de semana
            if (diaDaSemana == DayOfWeek.SATURDAY || diaDaSemana == DayOfWeek.SUNDAY) {
                continue;
            }

            // verifica se é feriado
            boolean ehFeriado = false;
            for (int[] f : feriados) {
                int mes = f[0] + 1; // ajustar para LocalDate
                int dia = f[1];
                if (dataAtual.getMonthValue() == mes && dataAtual.getDayOfMonth() == dia) {
                    ehFeriado = true;
                    break;
                }
            }

            if (!ehFeriado) {
                diasUteis++;
            }
        }

        System.out.println("Total de dias no período: " + totalDias);
        System.out.println("Dias úteis: " + diasUteis);

        input.close();
    }
}
