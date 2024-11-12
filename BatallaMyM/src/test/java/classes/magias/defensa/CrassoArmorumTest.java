package classes.magias.defensa;

import classes.personajes.Auror;
import classes.Personaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CrassoArmorumTest {

    private CrassoArmorum hechizo;
    private Personaje personaje;

    @BeforeEach
    public void setUp() {
        hechizo = new CrassoArmorum();
        personaje = new Auror("Auror1", true);
    }

    @Test
    public void testEjecutar() {
        assertEquals(0, personaje.getNivelDeProteccion());
        hechizo.ejecutar(personaje);
        assertEquals(30, personaje.getNivelDeProteccion());
    }

    @Test
    public void testGetCoste() {
        assertEquals(6, hechizo.getCoste());
    }

    @Test
    public void testGetProteccion() {
        assertEquals(30, hechizo.getProteccion());
    }
}