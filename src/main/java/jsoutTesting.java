import org.jsoup.Jsoup;

import java.io.IOException;

public class jsoutTesting {
    public static void main(String[] args) throws IOException {
        System.out.println( Jsoup.parse("https://preciosmundi.com/chile/precios-supermercado","UTF-8"));

    }
}
