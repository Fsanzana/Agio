import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
<<<<<<< Updated upstream
        jsoutTesting2 Comp = new jsoutTesting2();
        menu(Comp);
=======
        jsoutTesting3 Comp = new jsoutTesting3();

        Scanner tec = new Scanner(System.in);

        int eleccion = tec.nextInt();

        menu(eleccion, Comp);


>>>>>>> Stashed changes
    }

    private static void menu(jsoutTesting2 comp) {
        String pais0="";
        String pais1="";
        System.out.println("1- Chile"+'\n'+"2- Argentina");
        System.out.println("Ingrese país base:");
        int eleccion = tec.nextInt();
        switch (eleccion){
<<<<<<< Updated upstream
            case 1:
                pais0 = "chile";
=======
            case 1: String pais0 = "chile";
                    String pais1 = "argentina";
                    porcentaje(comp.jsoutTesting2(pais0), comp.jsoutTesting3(pais1));

>>>>>>> Stashed changes
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
        porcentaje(comp.jsoutTesting2(pais0), comp.jsoutTesting2(pais1));
    }

    private static void porcentaje(List<Double> jsoutTesting2, List<Double> jsoutTesting3) {
        double divisor = jsoutTesting2.size();

        double porcentaje=0;
        for (int i = 0; i < jsoutTesting2.size(); i++) {
            porcentaje += (jsoutTesting3.get(i)*100)/jsoutTesting2.get(i);

        }
        porcentaje = porcentaje/divisor;
        System.out.println(porcentaje);


    }


}
