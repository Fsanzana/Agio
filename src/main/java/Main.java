import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        jsoutTesting2 Comp = new jsoutTesting2();

        Scanner tec = new Scanner(System.in);

        int eleccion = tec.nextInt();

        menu(eleccion, Comp);


    }

    private static void menu(int eleccion, jsoutTesting2 comp) {
        switch (eleccion){
            case 1: String pais0 = "chile";
                    String pais1 = "argentina";
                    porcentaje(comp.jsoutTesting2(pais0), comp.jsoutTesting2(pais1), (comp.getDivisor()/2));

                    break;


        }
    }

    private static void porcentaje(List<Double> jsoutTesting2, List<Double> jsoutTesting21, double divisor) {
        double porcentaje=0;
        for (int i = 0; i < jsoutTesting2.size(); i++) {
            porcentaje += (jsoutTesting21.get(i)*100)/jsoutTesting2.get(i);

        }
        porcentaje = porcentaje/divisor;
        System.out.println(porcentaje);


    }


}
