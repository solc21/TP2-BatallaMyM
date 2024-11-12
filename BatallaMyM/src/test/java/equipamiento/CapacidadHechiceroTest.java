package equipamiento;

import classes.enums.Nivel;
import factories.HechizosAtaqueFactory;
import factories.HechizosDefensivosFactory;
import interfaces.Hechizo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CapacidadHechiceroTest {

    @Test
    public void testAgregarHechizo() {
        CapacidadHechicero capacidad = new CapacidadHechicero(10, 10);
        HechizosAtaqueFactory factory = new HechizosAtaqueFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.MUY_AVANZADA);
        capacidad.agregarHechizo(hechizo);
        assertTrue(capacidad.tieneHechizo(hechizo));
    }

    @Test
    public void testGetHechizoAtaque() {
        CapacidadHechicero capacidad = new CapacidadHechicero(10, 10);
        HechizosAtaqueFactory factory = new HechizosAtaqueFactory();
        Hechizo hechizo = factory.crearHechizo(Nivel.MUY_AVANZADA);
        capacidad.agregarHechizo(hechizo);
        assertEquals(hechizo, capacidad.getHechizoAtaque());
    }

    @Test
    public void testGetHechizoDefensa() {
        CapacidadHechicero capacidad = new CapacidadHechicero(10, 10);
        HechizosDefensivosFactory factoryDefensa = new HechizosDefensivosFactory();
        Hechizo hechizo = factoryDefensa.crearHechizo(Nivel.MUY_AVANZADA);
        capacidad.agregarHechizo(hechizo);
        assertEquals(hechizo, capacidad.getHechizoDefensa());
    }

    @Test
    public void testConsumirMagia() {
        CapacidadHechicero capacidad = new CapacidadHechicero(10, 10);
        capacidad.consumirMagia(5);
        assertEquals(5, capacidad.getNivelDeMagiaActual());
    }

    @Test
    public void testAumentarMagia() {
        CapacidadHechicero capacidad = new CapacidadHechicero(10, 5);
        capacidad.aumentarMagia(5);
        assertEquals(10, capacidad.getNivelDeMagiaActual());
    }
}