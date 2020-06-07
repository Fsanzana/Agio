
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;


public class jsoutTesting2 {


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

    public List<Double> jsoutTesting3(String url2){
        return jsoutTesting2(url2);


    }


}
