import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;
import java.util.ArrayList;


public class jsoutTesting {
    public void Comparador(String paisBase, String paisComparacion) throws IOException {
        final String url1 = "https://preciosmundi.com/"+paisBase+"/precios-supermercado";
        final String url2 = "https://preciosmundi.com/"+paisComparacion+"/precios-supermercado";
        ArrayList<Double> preciosA = new ArrayList<Double>();
        ArrayList<Double> preciosB = new ArrayList<Double>();
        int divisor=17;
        double dividendoA=0;
        double dividendoB=0;
        try{
            final Document documento1 = Jsoup.connect(url1).get();
            final Document documento2 = Jsoup.connect(url2).get();
            for(Element row : documento1.select("table tr")){
                if(row.select("td.price:nth-of-type(3)").text().equals("")){
                    continue;
                }else {
                    final String ticker = row.select("td.price:nth-of-type(3)").text();
                    double precio = Double.parseDouble(ticker.replaceAll("[$]", "").replaceAll("[,]", "."));
                    dividendoA+= precio;
                    preciosA.add(precio);
                }
            }
            for(Element row : documento2.select("table tr")){
                if(row.select("td.price:nth-of-type(3)").text().equals("")){
                    continue;
                }else {
                    final String ticker = row.select("td.price:nth-of-type(3)").text();
                    double precio = Double.parseDouble(ticker.replaceAll("[$]", "").replaceAll("[,]", "."));
                    dividendoB+= precio;
                    preciosB.add(precio);
                }
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        double promedio=0;


            for (int i = 0; i < preciosA.size(); i++) {
                promedio += (preciosB.get(i) * 100) / preciosA.get(i);
            }
            promedio=(promedio/divisor);
            System.out.println(promedio);


}
}
