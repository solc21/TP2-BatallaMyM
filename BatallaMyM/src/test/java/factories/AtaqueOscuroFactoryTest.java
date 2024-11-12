package factories;

import classes.enums.Nivel;
import classes.magias.oscuros.*;
import interfaces.Hechizo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AtaqueOscuroFactoryTest {

    @Test
    public void testCrearHechizoPrincipiante() {
    	AtaqueOscuroFactory factory = new AtaqueOscuroFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.PRINCIPIANTE);
        assertTrue(hechizo instanceof Confringo);
    }

    @Test
    public void testCrearHechizoMedio() {
    	AtaqueOscuroFactory factory = new AtaqueOscuroFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.MEDIO);
        assertTrue(hechizo instanceof Crucio);
    }

    @Test
    public void testCrearHechizoAvanzada() {
    	AtaqueOscuroFactory factory = new AtaqueOscuroFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.AVANZADA);
        assertTrue(hechizo instanceof Imperius);
    }

    @Test
    public void testCrearHechizoMuyAvanzada() {
    	AtaqueOscuroFactory factory = new AtaqueOscuroFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.MUY_AVANZADA);
        assertTrue(hechizo instanceof AvadaKedavra);
    }

    @Test
    public void testCrearHechizoNivelInvalido() {
    	AtaqueOscuroFactory factory = new AtaqueOscuroFactory();
        assertThrows(NullPointerException.class, () -> {
            factory.crearHechizo(null);
        });
    }
}