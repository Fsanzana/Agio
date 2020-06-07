import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class jsoutTesting2Test {
     Comparador p;

    @Before
    public void setUp() throws Exception {
        p = new Comparador();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void jsoutTesting2() {
        String url1= "https://preciosmundi.com/argentina/precios-supermercado";

        System.out.println(p.comparador(url1));

    }
}