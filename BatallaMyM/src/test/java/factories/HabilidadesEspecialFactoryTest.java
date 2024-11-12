package factories;

import classes.enums.Nivel;
import classes.magias.especiales.*;
import interfaces.Hechizo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HabilidadesEspecialFactoryTest {

    @Test
    public void testCrearHechizoPrincipiante() {
    	HabilidadesEspecialFactory factory = new HabilidadesEspecialFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.PRINCIPIANTE);
        assertTrue(hechizo instanceof UmbraAegis);
    }

    @Test
    public void testCrearHechizoMedio() {
    	HabilidadesEspecialFactory factory = new HabilidadesEspecialFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.MEDIO);
        assertTrue(hechizo instanceof MurusIgnis);
    }

    @Test
    public void testCrearHechizoAvanzada() {
    	HabilidadesEspecialFactory factory = new HabilidadesEspecialFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.AVANZADA);
        assertTrue(hechizo instanceof ProtegoDiabolica);
    }

    @Test
    public void testCrearHechizoMuyAvanzada() {
    	HabilidadesEspecialFactory factory = new HabilidadesEspecialFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.MUY_AVANZADA);
        assertTrue(hechizo instanceof FiendFyre);
    }

    @Test
    public void testCrearHechizoNivelInvalido() {
    	HabilidadesEspecialFactory factory = new HabilidadesEspecialFactory();
        assertThrows(NullPointerException.class, () -> {
            factory.crearHechizo(null);
        });
    }
}