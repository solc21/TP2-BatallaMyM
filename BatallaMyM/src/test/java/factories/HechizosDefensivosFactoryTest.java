package factories;

import classes.enums.Nivel;
import classes.magias.defensa.*;
import interfaces.Hechizo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HechizosDefensivosFactoryTest {

    @Test
    public void testCrearHechizoPrincipiante() {
    	HechizosDefensivosFactory factory = new HechizosDefensivosFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.PRINCIPIANTE);
        assertTrue(hechizo instanceof Protego);
    }

    @Test
    public void testCrearHechizoMedio() {
    	HechizosDefensivosFactory factory = new HechizosDefensivosFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.MEDIO);
        assertTrue(hechizo instanceof VulnerasSanentur);
    }

    @Test
    public void testCrearHechizoAvanzada() {
    	HechizosDefensivosFactory factory = new HechizosDefensivosFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.AVANZADA);
        assertTrue(hechizo instanceof CrassoArmorum);
    }

    @Test
    public void testCrearHechizoMuyAvanzada() {
    	HechizosDefensivosFactory factory = new HechizosDefensivosFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.MUY_AVANZADA);
        assertTrue(hechizo instanceof Abalio);
    }

    @Test
    public void testCrearHechizoNivelInvalido() {
    	HechizosDefensivosFactory factory = new HechizosDefensivosFactory();
        assertThrows(NullPointerException.class, () -> {
            factory.crearHechizo(null);
        });
    }
}