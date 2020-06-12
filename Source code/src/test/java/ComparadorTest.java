import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ComparadorTest {

    private Comparador test;

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
        test.comparador("estados-unidos"); // estructura de la tabla interfiere con recopilacion de datos, se arreglará en una futura versión
        test.comparador("pais que no existe");
        test.comparador("Chile");
        test.comparador("venezuela");// no hay datos disponibles en la base de datos
        test.comparador(null);


        
    }

    @Test
    public void porcentaje() {
        test.porcentaje("pais que no existe","estados-unidos");//metodo porcentaje depende de metodo comparador
    }
}