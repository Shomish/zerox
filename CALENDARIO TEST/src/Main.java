import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.print("Escriba el mes en representación de un numero (1-12) o escriba 0 para salir año 2023: ");
            opcion = input.nextInt();
            switch (opcion) {
            case 1:
                System.out.println(" ........ENERO......");
                String[][] enero = {
                        {"L", "M", "M", "J", "V", "S", "D"},
                        {".", ".", ".", ".", ".", ".", "1"},
                        {"2", "3", "4", "5", "6", "7", "8"},
                        {"9","10","11","12","13","14","15"},
                        {"16","17", "18", "19", "20", "21"},
                        {"22", "23", "24", "25", "26","27"},
                        {"28", "29", "30", "31",},
                };
                for (int i = 0; i < enero.length; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < enero[i].length; j++) {
                        System.out.print( enero[i][j] + "  " );
                    }
                    System.out.println("|");
                }
                break;
            case 2:
                System.out.println(" ........febrero......");
                String[][] febrero = {
                        {"L", "M", "M", "J", "V", "S", "D"},
                        {".", ".", ".", ".", ".", ".", "1"},
                        {"2", "3", "4", "5", "6", "7", "8"},
                        {"9","10","11","12","13","14","15"},
                        {"16","17", "18", "19", "20", "21"},
                        {"22", "23", "24", "25", "26","27"},
                        {"28"},
                };
                for (int i = 0; i < febrero.length; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < febrero[i].length; j++) {
                        System.out.print( febrero[i][j] + "  " );
                    }
                    System.out.println("|");
                }
                break;
            case 3:
                System.out.println(" ........marzo......");
                String[][] marzo = {
                        {"L", "M", "M", "J", "V", "S", "D"},
                        {".", ".", ".", ".", ".", ".", "1"},
                        {"2", "3", "4", "5", "6", "7", "8"},
                        {"9","10","11","12","13","14","15"},
                        {"16","17", "18", "19", "20", "21"},
                        {"22", "23", "24", "25", "26","27"},
                        {"28", "29", "30", "31",},
                };
                for (int i = 0; i < marzo.length; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < marzo[i].length; j++) {
                        System.out.print( marzo[i][j] + "  " );
                    }
                    System.out.println("|");
                }
                break;
            case 4:
                System.out.println(" ........abril......");
                String[][] abril = {
                        {"L", "M", "M", "J", "V", "S", "D"},
                        {".", ".", ".", ".", ".", ".", "1"},
                        {"2", "3", "4", "5", "6", "7", "8"},
                        {"9","10","11","12","13","14","15"},
                        {"16","17", "18", "19", "20", "21"},
                        {"22", "23", "24", "25", "26","27"},
                        {"28", "29", "30",},
                };
                for (int i = 0; i < abril.length; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < abril[i].length; j++) {
                        System.out.print( abril[i][j] + "  " );
                    }
                    System.out.println("|");
                }
                break;
            case 5:
                System.out.println(" ........mayo......");
                String[][] mayo = {
                        {"L", "M", "M", "J", "V", "S", "D"},
                        {".", ".", ".", ".", ".", ".", "1"},
                        {"2", "3", "4", "5", "6", "7", "8"},
                        {"9","10","11","12","13","14","15"},
                        {"16","17", "18", "19", "20", "21"},
                        {"22", "23", "24", "25", "26","27"},
                        {"28", "29", "30", "31",},
                };
                for (int i = 0; i < mayo.length; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < mayo[i].length; j++) {
                        System.out.print( mayo[i][j] + "  " );
                    }
                    System.out.println("|");
                }
                break;

        case 6:
        System.out.println(" ........junio......");
        String[][] junio = {
                {"L", "M", "M", "J", "V", "S", "D"},
                {".", ".", ".", ".", ".", ".", "1"},
                {"2", "3", "4", "5", "6", "7", "8"},
                {"9","10","11","12","13","14","15"},
                {"16","17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26","27"},
                {"28", "29", "30"},
        };
        for (int i = 0; i < junio.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < junio[i].length; j++) {
                System.out.print( junio[i][j] + "  " );
            }
            System.out.println("|");
        }
        break;
        case 7:
        System.out.println(" ........julio......");
        String[][] julio = {
                {"L", "M", "M", "J", "V", "S", "D"},
                {".", ".", ".", ".", ".", ".", "1"},
                {"2", "3", "4", "5", "6", "7", "8"},
                {"9","10","11","12","13","14","15"},
                {"16","17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26","27"},
                {"28", "29", "30", "31",},
        };
        for (int i = 0; i < julio.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < julio[i].length; j++) {
                System.out.print( julio[i][j] + "  " );
            }
            System.out.println("|");
        }
        break;
        case 8:
        System.out.println(" ........agosto......");
        String[][] agosto = {
                {"L", "M", "M", "J", "V", "S", "D"},
                {".", ".", ".", ".", ".", ".", "1"},
                {"2", "3", "4", "5", "6", "7", "8"},
                {"9","10","11","12","13","14","15"},
                {"16","17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26","27"},
                {"28", "29", "30", "31",},
        };
        for (int i = 0; i < agosto.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < agosto[i].length; j++) {
                System.out.print( agosto[i][j] + "  " );
            }
            System.out.println("|");
        }
        break;
        case 9:
        System.out.println(" ........septiembre......");
        String[][] septiembre = {
                {"L", "M", "M", "J", "V", "S", "D"},
                {".", ".", ".", ".", ".", ".", "1"},
                {"2", "3", "4", "5", "6", "7", "8"},
                {"9","10","11","12","13","14","15"},
                {"16","17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26","27"},
                {"28", "29", "30"},
        };
        for (int i = 0; i < septiembre.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < septiembre[i].length; j++) {
                System.out.print( septiembre[i][j] + "  " );
            }
            System.out.println("|");
        }
        break;
        case 10:
        System.out.println(" ........octubre......");
        String[][] octubre = {
                {"L", "M", "M", "J", "V", "S", "D"},
                {".", ".", ".", ".", ".", ".", "1"},
                {"2", "3", "4", "5", "6", "7", "8"},
                {"9","10","11","12","13","14","15"},
                {"16","17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26","27"},
                {"28", "29", "30", "31",},
        };
        for (int i = 0; i < octubre.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < octubre[i].length; j++) {
                System.out.print( octubre[i][j] + "  " );
            }
            System.out.println("|");
        }
        break;
        case 11:
        System.out.println(" ........noviembre......");
        String[][] noviembre = {
                {"L", "M", "M", "J", "V", "S", "D"},
                {".", ".", ".", ".", ".", ".", "1"},
                {"2", "3", "4", "5", "6", "7", "8"},
                {"9","10","11","12","13","14","15"},
                {"16","17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26","27"},
                {"28", "29", "30"},
        };
        for (int i = 0; i < noviembre.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < noviembre[i].length; j++) {
                System.out.print( noviembre[i][j] + "  " );
            }
            System.out.println("|");
        }
        break;
        case 12:
        System.out.println(" ........diciembre......");
        String[][] diciembre = {
                {"L", "M", "M", "J", "V", "S", "D"},
                {".", ".", ".", ".", ".", ".", "1"},
                {"2", "3", "4", "5", "6", "7", "8"},
                {"9","10","11","12","13","14","15"},
                {"16","17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26","27"},
                {"28", "29", "30", "31",},
        };
        for (int i = 0; i < diciembre.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < diciembre[i].length; j++) {
                System.out.print( diciembre[i][j] + "  " );
            }
            System.out.println("|");
        }
            break;
                default:
                    System.out.println("que disfrutre del calendario vuelva pronto");
                    break;
            }
        } while (opcion != 0);
        input.close();
    }
}