package classes.magias.ataque;

import classes.personajes.Auror;
import interfaces.Combatiente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExpulsoTest {

    private Expulso hechizo;
    private Combatiente objetivo;

    @BeforeEach
    public void setUp() {
        hechizo = new Expulso();
        objetivo = new Auror("Auror1", true);
    }

    @Test
    public void testEjecutar() {
        hechizo.ejecutar(objetivo);
        assertEquals(50, ((Auror) objetivo).getPuntosDeVida());
    }

    @Test
    public void testGetCoste() {
        assertEquals(5, hechizo.getCoste());
    }

    @Test
    public void testGetDanio() {
        assertEquals(50, hechizo.getDanio());
    }
}