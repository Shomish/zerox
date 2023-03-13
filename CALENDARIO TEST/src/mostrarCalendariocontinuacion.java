import java.time.LocalDate;
import java.util.Scanner;

public class mostrarCalendariocontinuacion {
    public static void proceso(int year,int month) {
        LocalDate date = LocalDate.of(year, month, 1);// crear un objeto localdate para el inicio de cada,mes

        System.out.println("   Calendario de " + year);
        System.out.println("       "+obtenerNombreMes(month));
        System.out.println("---------------------------");
        System.out.println("Lu  Ma  Mi  Ju  Vi  Sa  Do");


        int primerDiaSemana = date.getDayOfWeek().getValue(); //obtener el primer dia de la semana

        int y;
        int i ;
        for (y = 1; y < primerDiaSemana; y++) {
            System.out.print("    ");
        }
        for ( i = 1; i <= date.lengthOfMonth(); i++) {

            if (i<=9){
                System.out.printf("%2d",i);
            }else {
                System.out.print(i);
            }
            if ((i + primerDiaSemana - 1) % 7 == 0 || i == date.lengthOfMonth()) {
                System.out.println();
            } else {
                System.out.print("  ");
            }
        } // culminacion del bucle que comienza en 1 y termina en date.lenght para imprimir los dias del mes

    }
    public static void menu() {
        Scanner aoomes=new Scanner(System.in);
        System.out.println("    _____AÑO Y MES_______");
        System.out.println("Se muestra el mes del año que des a conocer.");
        System.out.println("Agregue el valor numericamente ");
        System.out.print("Ingrese el Año: ");
        int aoo = aoomes.nextInt(); // Año que quieres imprimir
        System.out.print("Ingrese el Mes: ");
        int mes = aoomes.nextInt();// Mes que quieres imprimir (1 = Enero, 2 = Febrero, etc.)
        System.out.println(" ");
        System.out.println("---------------------------");
        proceso(aoo,mes);
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        do {
            menu();
        }while (num1 != 0);

    }
    public static String obtenerNombreMes(int mes) { // estructura condicional para cambiar de meses (enero,febrero,etc)
        switch (mes) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "";
        }
    }
}

