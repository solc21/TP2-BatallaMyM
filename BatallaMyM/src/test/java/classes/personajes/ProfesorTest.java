package classes.personajes;

import classes.Personaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfesorTest {

    private Profesor profesor;

    @BeforeEach
    public void setUp() {
    	profesor = new Profesor("Profesor1", true);
    }

    @Test
    public void testAtacar() {
        Personaje objetivo = new Seguidor("Seguidor1", false);
        assertTrue(100 <= objetivo.getPuntosDeVida());
        profesor.atacar(objetivo);
        assertTrue(100 > objetivo.getPuntosDeVida());
    }

    @Test
    public void testConstructor() {
        assertTrue(profesor.getNombre().contains("Profesor1"));
    }
}