import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        Comparador Comp = new Comparador();
        menu(Comp);
    }


    private static void menu(Comparador comp) {
        int eleccion=0;
        String pais0 = "";
        String pais1 = "";
        do {
            try {
                System.out.println("1- Chile" + '\n' + "2- Argentina"+ '\n' + "3- México"+ '\n' + "4- Perú"+ '\n' + "5- Bolivia");
                System.out.println("Ingrese país base:");
                eleccion = tec.nextInt();
                switch (eleccion) {
                    case 1:
                        pais0 = "chile";
                        System.out.println("Ingrese país a comparar:");
                        eleccion = tec.nextInt();
                        break;
                    case 2:
                        pais0 = "argentina";
                        System.out.println("Ingrese país a comparar:");
                        eleccion = tec.nextInt();
                        break;
                    case 3:
                        pais0 = "mexico";
                        System.out.println("Ingrese país a comparar:");
                        eleccion = tec.nextInt();
                        break;
                    case 4:
                        pais0 = "peru";
                        System.out.println("Ingrese país a comparar:");
                        eleccion = tec.nextInt();
                        break;
                    case 5:
                        pais0 = "bolivia";
                        System.out.println("Ingrese país a comparar:");
                        eleccion = tec.nextInt();
                        break;
                    default:
                        eleccion = 0;
                        break;

                }
                switch (eleccion) {
                    case 1:
                        pais1 = "chile";
                        break;
                    case 2:
                        pais1 = "argentina";
                        break;
                    case 3:
                        pais1 = "mexico";
                        break;
                    case 4:
                        pais1 = "peru";
                        break;
                    case 5:
                        pais1 = "bolivia";
                        break;
                    default:
                        eleccion = 0;
                        System.out.println("Por favor ingrese una opción valida");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Por favor ingrese un número entero");
                tec = new Scanner(System.in);
                eleccion=0;
            }
        }while (eleccion==0);
        System.out.println(comp.porcentaje(pais0, pais1));

    }

}

