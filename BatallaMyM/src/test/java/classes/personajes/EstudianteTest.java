package classes.personajes;

import classes.Personaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstudianteTest {

    private Estudiante estudiante;

    @BeforeEach
    public void setUp() {
    	estudiante = new Estudiante("Estudiante1", true);
    }

    @Test
    public void testAtacar() {
        Personaje objetivo = new Seguidor("Seguidor1", false);
        assertTrue(100 <= objetivo.getPuntosDeVida());
        estudiante.atacar(objetivo);
        assertTrue(100 > objetivo.getPuntosDeVida());
    }

    @Test
    public void testConstructor() {
        assertTrue(estudiante.getNombre().contains("Estudiante1"));
    }
}