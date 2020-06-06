import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class jsoutTesting2Test {
     jsoutTesting2 p;

    @Before
    public void setUp() throws Exception {
        p = new jsoutTesting2();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void jsoutTesting2() {
        String url1= "https://preciosmundi.com/argentina/precios-supermercado";

        System.out.println(p.jsoutTesting2(url1));

    }
}