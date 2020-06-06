
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class jsoutTesting2 {
    public static void main(String[] args) {
        final String url =
                "https://preciosmundi.com/comparacion/argentina_vs_chile/USD";

        try {
            final Document document = Jsoup.connect(url).get();

            for (Element row : document.select(
                    "div.table-responsive tr")) {
                if (row.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                }
                else {
                    final String ticker =
                            row.select("td:nth-of-type(1)").text();
                    final String name =
                            row.select("td.price:nth-of-type(2)").text();
                    final String tempPrice =
                            row.select("td.price:nth-of-type(3)").text();
                    final String tempPrice1 =
                            tempPrice.replace(",", "");
//                    final double price = Double.parseDouble(tempPrice1);

                    System.out.println(ticker + " " + name + " " + tempPrice1);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
