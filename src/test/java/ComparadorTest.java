import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComparadorTest {

    Comparador test;

    @Before
    public void setUp() throws Exception {
        test = new Comparador();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void comparador() {
        test.comparador("estados-unidos");
        test.comparador("afdhsfjdhj");

        
    }

    @Test
    public void porcentaje() {
    }
}