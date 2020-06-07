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
            case 1: String pais0 = "https://preciosmundi.com/chile/precios-supermercado";
                    String pais1 = "https://preciosmundi.com/argentina/precios-supermercado";
                    porsentaje(comp.jsoutTesting2(pais0), comp.jsoutTesting2(pais1));
                    break;
            case 2: String pais2 = "https://preciosmundi.com/chile/precios-supermercado";
                String pais3 = "https://preciosmundi.com/argentina/precios-supermercado";
                porsentaje(comp.jsoutTesting2(pais3), comp.jsoutTesting2(pais2));

        }
    }

    private static void porsentaje(double jsoutTesting2, double jsoutTesting21) {
        double porcentaje = (jsoutTesting21*100)/jsoutTesting2;
        System.out.println(porcentaje);
    }
}
