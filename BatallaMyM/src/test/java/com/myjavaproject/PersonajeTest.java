import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.myjavaproject.classes.Personaje;
import com.myjavaproject.equipamiento.Varita;
import com.myjavaproject.equipamiento.SistemaDefensivo;

class PersonajeTest {

    private Personaje personaje;

    @BeforeEach
    void setUp() {
        personaje = new Personaje("Test Character", 10) {
            @Override
            public void atacar(Hechizo hechizo, Combatiente objetivo) {
                // Implementación de prueba
            }
        };
    }

    @Test
    void testInicializacion() {
        assertNotNull(personaje.getVarita());
        assertNotNull(personaje.getSistemaDefensivo());
        assertEquals("Test Character", personaje.getNombre());
        assertEquals(10, personaje.getPuntosDeVida());
    }

    @Test
    void testRecibirDanio() {
        personaje.recibirDanio(5);
        assertEquals(5, personaje.getPuntosDeVida());
    }

    @Test
    void testEstaActivo() {
        assertTrue(personaje.estaActivo());
        personaje.recibirDanio(10);
        assertFalse(personaje.estaActivo());
    }
}