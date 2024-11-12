package equipamiento;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SistemaDefensivoTest {

    @Test
    public void testCalcularDanioReducido() {
        SistemaDefensivo sistema = new SistemaDefensivo(10);
        assertEquals(0, sistema.calcularDanioReducido(5));
        assertEquals(5, sistema.calcularDanioReducido(15));
    }

    @Test
    public void testSubirProteccion() {
        SistemaDefensivo sistema = new SistemaDefensivo(10);
        sistema.subirProteccion(5);
        assertEquals(15, sistema.nivelDeProteccion());
    }

    @Test
    public void testAtacarProteccion() {
        SistemaDefensivo sistema = new SistemaDefensivo(10);
        sistema.atacarProteccion(5);
        assertEquals(5, sistema.nivelDeProteccion());
        sistema.atacarProteccion(10);
        assertEquals(0, sistema.nivelDeProteccion());
    }

    @Test
    public void testQuitarProteccion() {
        SistemaDefensivo sistema = new SistemaDefensivo(10);
        sistema.quitarProteccion();
        assertEquals(0, sistema.nivelDeProteccion());
    }
}