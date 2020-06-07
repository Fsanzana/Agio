import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class jsoutTesting3 {

    public String url0;
    public String url1;
    public double porcentaje;

    public jsoutTesting3(String url0, String url1, double porcentaje) {
        this.url0 = url0;
        this.url1 = url1;
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getUrl0() {
        return url0;
    }

    public void setUrl0(String url0) {
        this.url0 = url0;
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }
    double porcentaje(String url0, String url1){
        ArrayList<Double> precio1 = (ArrayList<Double>) jsoutTesting2(url0);
        ArrayList<Double> precio2 = (ArrayList<Double>) jsoutTesting2(url1);
        double divisor = precio1.size();
        for (int i = 0; i <divisor ; i++) {
            this.porcentaje+= (precio2.get(i)*100)/precio1.get(i);
        }
        return this.porcentaje;

    }

    public List<Double> jsoutTesting2(String url) {
        final String URL = "https://preciosmundi.com/"+url+"/precios-supermercado";
        ArrayList<Double> precio= new ArrayList<Double>();

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
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return (precio);
    }
}
