import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
        jsoutTesting2 Comp = new jsoutTesting2();
        menu(Comp);
    }


    private static void menu(jsoutTesting2 comp) {
        String pais0="";
        String pais1="";
        System.out.println("1- Chile"+'\n'+"2- Argentina");
        System.out.println("Ingrese país base:");
        int eleccion = tec.nextInt();
        switch (eleccion){
            case 1:
                pais0 = "chile";
                    break;
            case 2:
                pais0 = "argentina";
                break;
            default:
                break;
        }

        System.out.println("1- Chile"+'\n'+"2- Argentina");
        System.out.println("Ingrese país a comparar:");
        eleccion = tec.nextInt();
        switch (eleccion){
            case 1:
                pais1 = "chile";
                break;
            case 2:
                pais1 = "argentina";
                break;
            default:
                break;




        }

        System.out.println(comp.jsoutTesting3(pais0, pais1));

    }

}

