package classes.personajes;

import classes.Personaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AurorTest {

    private Auror auror;

    @BeforeEach
    public void setUp() {
        auror = new Auror("Auror1", true);
    }

    @Test
    public void testAtacar() {
        Personaje objetivo = new Seguidor("Seguidor1", false);
        assertTrue(100 <= objetivo.getPuntosDeVida());
        auror.atacar(objetivo);
        assertTrue(100 > objetivo.getPuntosDeVida());
    }

    @Test
    public void testConstructor() {
        assertTrue(auror.getNombre().contains("Auror1"));
    }
}