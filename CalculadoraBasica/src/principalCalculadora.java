import java.util.Scanner;

public class principalCalculadora {
    public static void menu(){
        System.out.println("0- Salir");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.print("   >> Ingrese una opción: ");
    }

    public static int suma(int num1, int num2){
        int suma1;
        return suma1=num1 + num2;
    }
    public static int resta(int num1, int num2){
        int resta;
        return resta=num1 - num2;
    }
    public static int multiplicacion(int num1, int num2){
        int multiplicacion1;
        return multiplicacion1=num1 * num2;
    }
    public static int division(int num1, int num2){
        int division1;
        return division1=num1 / num2;
    }

    public static void main(String[] args) {
        int opcion;
        int num1;
        int num2;
        do {
            menu();
            opcion = new Scanner(System.in).nextInt();
            switch (opcion){

                case 0:
                    System.out.print(" Adios. Vuelve pronto ...");
                    break;
                case 1:
                    System.out.println(" VAMOS A SUMAR ");
                    System.out.println(" Ingrese el primer numero: ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.println(" Ingrese el segundo numero:");
                    num2 = new Scanner(System.in).nextInt();

                    System.out.println("la suma es: " + suma(num1,num2) );
                    break;
                case 2:
                    System.out.println(" VAMOS A RESTAR ");

                    System.out.println(" Ingrese el primer numero: ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.println(" Ingrese el segundo numero:");
                    num2 = new Scanner(System.in).nextInt();

                    System.out.println("la resta es: " + resta(num1,num2) );
                    break;
                case 3:
                    System.out.println(" VAMOS A MULTIPLICAR ");

                    System.out.println(" Ingrese el primer numero: ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.println(" Ingrese el segundo numero:");
                    num2 = new Scanner(System.in).nextInt();

                    System.out.println("la multiplicacion  es: " + multiplicacion(num1,num2) );
                    break;
                case 4:
                    System.out.println(" VAMOS A DIVIDIR ");

                    System.out.println(" Ingrese el primer numero: ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.println(" Ingrese el segundo numero:");
                    num2 = new Scanner(System.in).nextInt();

                    System.out.println("la division es: " + division(num1,num2) );
                    break;
                default:
                    System.out.print("Opcion inválida. Intentelo nuevamente: ");

                    break;
            }
        } while( opcion != 0 );
    }
}