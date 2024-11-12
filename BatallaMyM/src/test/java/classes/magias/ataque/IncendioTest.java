package classes.magias.ataque;

import classes.personajes.Auror;
import interfaces.Combatiente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IncendioTest {

    private Incendio hechizo;
    private Combatiente objetivo;

    @BeforeEach
    public void setUp() {
        hechizo = new Incendio();
        objetivo = new Auror("Auror1", true);
    }

    @Test
    public void testEjecutar() {
        hechizo.ejecutar(objetivo);
        assertEquals(30, ((Auror) objetivo).getPuntosDeVida());
    }

    @Test
    public void testGetCoste() {
    	System.out.println(hechizo.getCoste());
        assertEquals(7, hechizo.getCoste());
    }

    @Test
    public void testGetDanio() {
    	System.out.println(hechizo.getDanio());
        assertEquals(70, hechizo.getDanio());
    }
}