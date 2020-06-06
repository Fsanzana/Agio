import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class jsoutTesting {
    public static void main(String[] args) throws IOException {
        final String url = "https://preciosmundi.com/chile/precios-supermercado";


        try{
            final Document documento = Jsoup.connect(url).get();
            System.out.println(documento);
            for(Element row : documento.select("table.tableresponsive tr")){

            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
