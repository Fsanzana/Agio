import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class jsoutTestingTest {
    private jsoutTesting c;
    @Before
    public void setUp() throws Exception {
        c = new jsoutTesting();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void comparador() throws IOException {
        c.Comparador("chile","argentina");
        c.Comparador("argentina","chile");
        c.Comparador("chile","mexico");
        c.Comparador("mexico","argentina");
    }
}