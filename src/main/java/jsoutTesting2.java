
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class jsoutTesting2 {

    public void jsoutTesting2(String url) {
        final String URL = url;
        int i = 0;
        try {
            final Document document = Jsoup.connect(URL).get();

            for (Element row : document.select("div.table-responsive tr")) {
                if (row.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                } else {
                    final String tempPrice =
                            row.select("td.price:nth-of-type(3)").text();
                    final String tempPrice1 =
                            tempPrice.replace(",", ".").replace("$", "");
                    final double price = Double.parseDouble(tempPrice1);

                    System.out.println(tempPrice1);

                }
                i++;
                System.out.println(i);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
