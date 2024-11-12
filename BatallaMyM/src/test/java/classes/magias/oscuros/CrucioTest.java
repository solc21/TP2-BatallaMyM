package classes.magias.oscuros;

import classes.personajes.Auror;
import interfaces.Combatiente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CrucioTest {

    private Crucio hechizo;
    private Combatiente objetivo;

    @BeforeEach
    public void setUp() {
        hechizo = new Crucio();
        objetivo = new Auror("Auror1", true);
    }

    @Test
    public void testEjecutar() {
        hechizo.ejecutar(objetivo);
        assertEquals(10, ((Auror) objetivo).getPuntosDeVida());
    }

    @Test
    public void testGetCoste() {
        assertEquals(9, hechizo.getCoste());
    }

    @Test
    public void testGetDanio() {
        assertEquals(90, hechizo.getDanio());
    }
}