import java.time.LocalDate;
import java.time.YearMonth;

public class calendario {
    public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Obtener el año y el mes actual
        int año = fechaActual.getYear();
        int mes = fechaActual.getMonthValue();

        // Crear un objeto YearMonth para el mes y el año actual
        YearMonth añoMes = YearMonth.of(año, mes);

        // Imprimir el encabezado del calendario
        System.out.println("      " + añoMes.getMonth().getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.getDefault()) + " " + año);
        System.out.println("===================================");

        // Imprimir los nombres de los días de la semana
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        // Obtener el número de días del mes
        int numDias = añoMes.lengthOfMonth();

        // Obtener el día de la semana del primer día del mes
        LocalDate primerDiaMes = añoMes.atDay(1);
        int diaSemana = primerDiaMes.getDayOfWeek().getValue();

        // Imprimir los espacios en blanco correspondientes al primer día de la semana
        for (int i = 1; i < diaSemana; i++) {
            System.out.print("     ");
        }

        // Imprimir los días del mes
        for (int i = 1; i <= numDias; i++) {
            // Imprimir el número del día
            System.out.printf(" %3d ", i);

            // Saltar a una nueva línea si es sábado
            if (diaSemana == 7) {
                System.out.println();
            }

            // Incrementar el día de la semana
            diaSemana = (diaSemana % 7) + 1;
        }
    }
}