
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class Comparador {


    List<Double> comparador(String url) {
        final String URL = "https://preciosmundi.com/" + url + "/precios-supermercado"; // url dinamica
        ArrayList<Double> precios = new ArrayList<Double>();

        try {
            final Document document = Jsoup.connect(URL).get();         //recoleccion de el codigo html de la pagina objetivo

            for (Element row : document.select("div.table-responsive tr")) {    //filtracion de datos especificos en la pagina
                if (row.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                } else {
                    final String tempPrice =
                            row.select("td.price:nth-of-type(3)").text();
                    final String tempPrice1 =
                            tempPrice.replaceAll(",", ".").replaceAll("[$]", "");
                    final double precio = Double.parseDouble(tempPrice1);

                    precios.add(precio);      //datos almacenados en arraylist


                }

            }
        } catch (NumberFormatException ex) {              //algunas tablas de la pagina tienen un formato distintos, causando un fallo en
            System.out.println("Error, país no válido");  //el programa, esto se solucionara en versiones futuras

        } catch (IOException e) {
            System.out.println("Error de entrada, por favor ingrese un país valido");

        }

        return (precios);
    }

    double porcentaje(String url1, String url2) {
        double porcentaje = 0;
        ArrayList<Double> precio1 = (ArrayList<Double>) comparador(url1);
        ArrayList<Double> precio2 = (ArrayList<Double>) comparador(url2);
        double divisor = precio1.size();

        for (int i = 0; i < divisor; i++) {
            porcentaje += (precio2.get(i) * 100) / precio1.get(i);
        }
        porcentaje = porcentaje / divisor;
        return porcentaje;


    }


}
