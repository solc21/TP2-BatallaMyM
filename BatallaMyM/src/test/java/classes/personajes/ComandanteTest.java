package classes.personajes;

import classes.Personaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComandanteTest {

    private Comandante comandante;

    @BeforeEach
    public void setUp() {
    	comandante = new Comandante("Comandante1", true);
    }

    @Test
    public void testAtacar() {
        Personaje objetivo = new Seguidor("Seguidor1", false);
        assertTrue(100 <= objetivo.getPuntosDeVida());
        comandante.atacar(objetivo);
        assertTrue(100 > objetivo.getPuntosDeVida());
    }

    @Test
    public void testConstructor() {
        assertTrue(comandante.getNombre().contains("Comandante1"));
    }
}