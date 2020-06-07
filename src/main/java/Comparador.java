
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Comparador {


    public List<Double> comparador(String url) {
        final String URL = "https://preciosmundi.com/" + url + "/precios-supermercado";
        ArrayList<Double> precio = new ArrayList<Double>();

        try {
            final Document document = Jsoup.connect(URL).get();

            for (Element row : document.select("div.table-responsive tr")) {
                if (row.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                } else {
                    final String tempPrice =
                            row.select("td.price:nth-of-type(3)").text();
                    final String tempPrice1 =
                            tempPrice.replaceAll(",", ".").replaceAll("[$]", "");
                    final double price = Double.parseDouble(tempPrice1);

                    precio.add(price);


                }

            }
        } catch (NumberFormatException ex) {
            System.out.println("Error, país no válido");
        }catch (IOException e){
            System.out.println("Error de entrada, por favor ingrese un país valido");
        }

        return (precio);
    }

    public double porcentaje(String url1, String url2) {
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
