package factories;

import classes.enums.Nivel;
import classes.magias.ataque.*;
import interfaces.Hechizo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HechizosAtaqueFactoryTest {

    @Test
    public void testCrearHechizoPrincipiante() {
        HechizosAtaqueFactory factory = new HechizosAtaqueFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.PRINCIPIANTE);
        assertTrue(hechizo instanceof Expelliarmus);
    }

    @Test
    public void testCrearHechizoMedio() {
        HechizosAtaqueFactory factory = new HechizosAtaqueFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.MEDIO);
        assertTrue(hechizo instanceof Desmaius);
    }

    @Test
    public void testCrearHechizoAvanzada() {
        HechizosAtaqueFactory factory = new HechizosAtaqueFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.AVANZADA);
        assertTrue(hechizo instanceof Incendio);
    }

    @Test
    public void testCrearHechizoMuyAvanzada() {
        HechizosAtaqueFactory factory = new HechizosAtaqueFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.MUY_AVANZADA);
        assertTrue(hechizo instanceof Expulso);
    }

    @Test
    public void testCrearHechizoNivelInvalido() {
        HechizosAtaqueFactory factory = new HechizosAtaqueFactory();
        assertThrows(NullPointerException.class, () -> {
            factory.crearHechizo(null);
        });
    }
}