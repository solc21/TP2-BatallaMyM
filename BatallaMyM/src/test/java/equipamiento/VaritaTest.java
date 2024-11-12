package equipamiento;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VaritaTest {

    @Test
    public void testVaritaFuncional() {
        Varita varita = new Varita(true);
        assertTrue(varita.puedeUsarse());
    }

    @Test
    public void testVaritaNoFuncional() {
        Varita varita = new Varita(false);
        assertFalse(varita.puedeUsarse());
    }

    @Test
    public void testSetFuncional() {
        Varita varita = new Varita(false);
        varita.setFuncional(true);
        assertTrue(varita.puedeUsarse());
    }
}