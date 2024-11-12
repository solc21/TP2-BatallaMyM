package classes.magias.ataque;

import classes.personajes.Auror;
import interfaces.Combatiente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DesmaiusTest {

    private Desmaius hechizo;
    private Combatiente objetivo;

    @BeforeEach
    public void setUp() {
        hechizo = new Desmaius();
        objetivo = new Auror("Auror1", true);
    }

    @Test
    public void testEjecutar() {
        hechizo.ejecutar(objetivo);
        assertEquals(60, ((Auror) objetivo).getPuntosDeVida());
    }

    @Test
    public void testGetCoste() {
        assertEquals(4, hechizo.getCoste());
    }

    @Test
    public void testGetDanio() {
        assertEquals(40, hechizo.getDanio());
    }
}