import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class jsoutTesting {
    public static void main(String[] args) throws IOException {
        final String url = "https://www.numbeo.com/food-prices/country_result.jsp?country=Chile";


        try{
            final Document documento = Jsoup.connect(url).get();

            for(Element row : documento.select("table tr")){
                if(row.select("td:nth-of-type(2)").text().equals("")){
                    continue;
                }else {
                    final String ticker = row.select("td:nth-of-type(2)").text();
                    System.out.println(ticker);
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
