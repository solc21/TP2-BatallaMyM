package classes.personajes;

import classes.Personaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SeguidorTest {

    private Seguidor seguidor;

    @BeforeEach
    public void setUp() {
    	seguidor = new Seguidor("Seguidor1", true);
    }

    @Test
    public void testAtacar() {
        Personaje objetivo = new Auror("Auror1", false);
        assertTrue(100 <= objetivo.getPuntosDeVida());
        seguidor.atacar(objetivo);
        assertTrue(100 > objetivo.getPuntosDeVida());
    }

    @Test
    public void testConstructor() {
        assertTrue(seguidor.getNombre().contains("Seguidor1"));
    }
}