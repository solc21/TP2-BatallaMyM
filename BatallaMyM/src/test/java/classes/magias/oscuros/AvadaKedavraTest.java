package classes.magias.oscuros;

import classes.personajes.Auror;
import interfaces.Combatiente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AvadaKedavraTest {

    private AvadaKedavra hechizo;
    private Combatiente objetivo;

    @BeforeEach
    public void setUp() {
        hechizo = new AvadaKedavra();
        objetivo = new Auror("Auror1", true);
    }

    @Test
    public void testEjecutar() {
        hechizo.ejecutar(objetivo);
        assertEquals(0, ((Auror) objetivo).getPuntosDeVida());
    }

    @Test
    public void testGetCoste() {
        assertEquals(10, hechizo.getCoste());
    }

    @Test
    public void testGetDanio() {
        assertEquals(100, hechizo.getDanio());
    }
}