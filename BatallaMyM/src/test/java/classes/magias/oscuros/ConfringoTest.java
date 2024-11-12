package classes.magias.oscuros;

import classes.personajes.Auror;
import interfaces.Combatiente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConfringoTest {

    private Confringo hechizo;
    private Combatiente objetivo;

    @BeforeEach
    public void setUp() {
        hechizo = new Confringo();
        objetivo = new Auror("Auror1", true);
    }

    @Test
    public void testEjecutar() {
        hechizo.ejecutar(objetivo);
        assertEquals(30, ((Auror) objetivo).getPuntosDeVida());
    }

    @Test
    public void testGetCoste() {
        assertEquals(7, hechizo.getCoste());
    }

    @Test
    public void testGetDanio() {
        assertEquals(70, hechizo.getDanio());
    }
}