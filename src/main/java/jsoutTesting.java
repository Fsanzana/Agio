import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;


public class jsoutTesting {
    public static void main(String[] args) throws IOException {
        final String url1 = "https://preciosmundi.com/argentina/precios-supermercado";
        final String url2 = "https://preciosmundi.com/argentina/precios-supermercado";
        int divisor=0;
        double dividendo=0;
        try{
            final Document documento = Jsoup.connect(url1).get();
            final Document documento2 = Jsoup.connect(url2).get();
            for(Element row : documento.select("table tr")){
                if(row.select("td.price:nth-of-type(3)").text().equals("")){
                    continue;
                }else {
                    divisor++;
                    final String ticker = row.select("td.price:nth-of-type(3)").text();
                    System.out.println(ticker.replaceAll("[$]", "").replaceAll("[,]", "."));
                    dividendo+=Double.parseDouble(ticker.replaceAll("[$]", "").replaceAll("[,]", "."));
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(dividendo);
        System.out.println(divisor);
        double promedio=dividendo/divisor;
        System.out.println(promedio);
    }
}
