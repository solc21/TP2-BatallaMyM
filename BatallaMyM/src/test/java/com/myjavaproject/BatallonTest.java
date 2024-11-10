import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.myjavaproject.classes.Batallon;
import com.myjavaproject.magias.ataque.Expelliarmus;
import com.myjavaproject.personajes.Auror;
import com.myjavaproject.personajes.Mortifago;

class BatallonTest {
    private Batallon batallon;
    private Auror auror;
    private Mortifago mortifago;

    @BeforeEach
    void setUp() {
        batallon = new Batallon();
        auror = new Auror("Harry Potter");
        mortifago = new Mortifago("Bellatrix Lestrange");
        batallon.agregarMiembro(auror);
        batallon.agregarMiembro(mortifago);
    }

    @Test
    void testAgregarMiembro() {
        assertEquals(2, batallon.getMiembros().size());
    }

    @Test
    void testAtacar() {
        Expelliarmus hechizo = new Expelliarmus();
        batallon.atacar(hechizo, mortifago);
        assertTrue(mortifago.estaActivo());
    }

    @Test
    void testRecibirDanio() {
        mortifago.recibirDanio(5);
        assertTrue(mortifago.estaActivo());
    }

    @Test
    void testBatallonDerrotado() {
        mortifago.recibirDanio(10);
        assertFalse(mortifago.estaActivo());
        assertFalse(batallon.estaActivo());
    }
}