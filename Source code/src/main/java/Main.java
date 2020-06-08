import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        Comparador Comp = new Comparador();
        menu(Comp);
    }

    private static void menu(Comparador comp) {
        int eleccion = 0;
        String pais0 = "";
        String pais1 = "";
        String seleccion="";
        do {
            try {
                System.out.println("1- Chile" + '\n' + "2- Argentina" + '\n' + "3- México" + '\n' + "4- Perú" + '\n' + "5- Bolivia");
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
                        eleccion = -1;
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
                        eleccion = -1;
                        System.out.println("Por favor ingrese una opción valida");
                        break;
                }


            } catch (InputMismatchException e) {
                System.out.println("Por favor ingrese un número entero");
                tec = new Scanner(System.in);
                eleccion = -1;
            }
            if (eleccion>0) { // programa se vuelve a ejecutar automaticamente en caso de error
                double porcentaje = 100 - comp.porcentaje(pais0, pais1);
                if (porcentaje > 0) {
                    System.out.println("El porcentaje de conveniencia es de: " + porcentaje + "%\n" + "comprar en " + pais1 + " es conveniente." + '\n');
                } else if (porcentaje < 0) {
                    System.out.println("El porcentaje de conveniencia es de: " + porcentaje + "%\n" + "comprar en " + pais1 + " no es conveniente." + '\n');
                } else if (porcentaje == 0) {
                    System.out.println("El porcentaje de conveniencia es de: " + porcentaje + "%\n" + "comprar en " + pais1 + " es lo mismo que comprar en " + pais0 + '\n');
                }
                do {
                    System.out.println("¿Desea ejecutar el programa nuevamente?(s/n)");
                    seleccion = tec.next();
                    if (seleccion.equalsIgnoreCase("s")) {
                        eleccion = 1;
                    } else if (seleccion.equalsIgnoreCase("n")) {
                        eleccion = 0;
                    } else {
                        System.out.println("por favor ingrese una opción válida");
                        eleccion = 2;
                    }

                } while (eleccion == 2);
            }

        } while (eleccion != 0);


    }

}

