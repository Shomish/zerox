import javax.swing.*;
import java.util.Scanner;

public  class Main {
    public static void nombreD(int decenas){
        switch (decenas){
            case 1:
                System.out.println(decenas+"- Uno");
                break;
        }
    }
    public static void nombre(int unidades){
        String[] unidades2={"Cero","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve"};
        String[] decenas2={"Veinte","Veinti"};
        int cont=0;
        int U=0;
        int D=0;
        System.out.println(cont);
        cont++;
        if (cont==1){
            U=unidades;
            System.out.println(U);

        } else if (cont==2) {
            D=unidades;

        }
//        do {
        switch (unidades){
            case 0:
                System.out.println("0-"+unidades2[0]);
                break;
            case 1:
                System.out.println("1-"+unidades2[1]);
                break;
            case 2:
                if (cont<1)
                    System.out.println("1-"+unidades2[2]);

                else if (cont<2) {
                    System.out.println("1-"+decenas2[1]+ U);
                }
                else
                    System.out.println("1-"+decenas2[1]);
                break;
            case 3:
                System.out.println("-"+unidades);
                break;
            case 4:
                System.out.println(unidades+"- Cuatro");
                break;
            case 5:
                System.out.println(unidades+"- Cinco");
                break;
            case 6:
                System.out.println(unidades+"- Seis");
                break;
            case 7:
                System.out.println(unidades+"- Siete");
                break;
            case 8:
                System.out.println(unidades+"- Ocho");
                break;
            case 9:
                System.out.println(unidades+"- Nueve");
                break;
        }
    }
    public static void Descomponer(int num)
    {
        int unidadesP = num % 10;
        int decenasP = ( num / 10 ) % 10;
        int centenasP = ( num/100 ) % 10;
        if (unidadesP <10) {
            System.out.println("Hay "+ unidadesP+" Unidades" );
            nombre(unidadesP);
        }
        if ((decenasP*10)<100) {
            System.out.println("Hay "+ decenasP+" Decenas" );
            nombre(decenasP);
        }
        else{
            System.out.println("Hay "+ centenasP+" Centenas" );
            nombre(centenasP);
        }
    }
    public static void main(String[] args) {
        System.out.print("Escriba un numero maximo de tres cifras :" );
        int numero = new Scanner(System.in).nextInt();
        Descomponer(numero);
    }
}