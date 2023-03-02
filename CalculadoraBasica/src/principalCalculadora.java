import java.util.Scanner;

public class principalCalculadora {
    public static void menu(){
        System.out.println("\n ############## MENU PRINCIPAL ##############\n");
        System.out.println("0- Salir");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.print("   " +
                ">> Ingrese una opción");
    }

    public static int suma(int num1, int num2){
        return num1 + num2;
    }
    public static int resta(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplicacion(int num1, int num2){
        return num1 * num2;
    }
    public static int division(int num1, int num2){
        return num1 / num2;
    }

    public static int leerEntero(String promt){
        int entero = -999999999;
        int cont = 0;
        do{
            try {
                System.out.print(promt+": ");
                entero = new Scanner(System.in).nextInt();
                cont = 3;
            } catch (Exception e) {
                System.out.println("Numero inválido, intentelo nuevamente: ");
                cont++; // cont = cont + 1
            }
        } while(cont != 3); // este while temrina cuando cont = 3
        return entero;
    }

    public static void main(String[] args) {
        int num1, num2 = 0;
        int opcion;
        do {
            menu();
            opcion = leerEntero("");
            switch (opcion){
                case 0:
                    System.out.println(" Adios. Vuelve pronto ...");
                    break;
                case 1:
                    System.out.println(" VAMOS A SUMAR ");
                    num1 = leerEntero("  Ingrese el primer sumando");
                    if(num1!=-999999999)
                    {
                        num2 = leerEntero("  Ingrese el segundo sumando");
                        if (num2!=-999999999)
                        {
                            System.out.println("   El resultado es: "  +suma(num1, num2));
                        }else
                        {
                            System.out.println("El valor no es entero, intentelo nuevamente: ");
                        }
                    }else
                    {
                        System.out.println("El valor no es entero, intentelo nuevamente: ");
                    }

                    break;
                case 2:
                    System.out.println(" VAMOS A RESTAR ");
                    num1 = leerEntero("  Ingrese el primer Número");
                    if(num1!=-999999999)
                    {
                        num2 = leerEntero("  Ingrese el segundo numero");
                        if (num2!=-999999999)
                        {
                            System.out.println("   El resultado es: "  +resta(num1, num2));
                        }else
                        {
                            System.out.println("El valor no es entero, intentelo nuevamente: ");
                        }
                    }else
                    {
                        System.out.println("El valor no es entero, intentelo nuevamente: ");
                    }
                    break;
                case 3:
                    System.out.println(" VAMOS A multiplicar ");
                    num1 = leerEntero("  Ingrese el primer Número");
                    if(num1!=-999999999)
                    {
                        num2 = leerEntero("  Ingrese el segundo numero");
                        if (num2!=-999999999)
                        {
                            System.out.println("   El resultado es: "  +resta(num1, num2));
                        }else
                        {
                            System.out.println("El valor no es entero, intentelo nuevamente: ");
                        }
                    }else
                    {
                        System.out.println("El valor no es entero, intentelo nuevamente: ");
                    }
                    break;
                case 4:
                    System.out.println(" VAMOS A DIVIDIR ");
                    num1 = leerEntero("  Ingrese el primer Número");
                    if(num1!=-999999999)
                    {
                        num2 = leerEntero("  Ingrese el segundo numero");
                        if (num2!=-999999999)
                        {
                            System.out.println("   El resultado es: "  +resta(num1, num2));
                        }else
                        {
                            System.out.println("El valor no es entero, intentelo nuevamente: ");
                        }
                    }else
                    {
                        System.out.println("El valor no es entero, intentelo nuevamente: ");
                    }
                    break;
                default:
                    System.out.print("Opcion inválida. Intentelo nuevamente: ");
                    break;
            }
        } while( opcion != 0 );
    }
}