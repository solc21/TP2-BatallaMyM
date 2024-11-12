package classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.personajes.Auror;
import classes.personajes.Seguidor;

import static org.junit.jupiter.api.Assertions.*;

public class BatallonTest {

    private Batallon batallon;

    @BeforeEach
    public void setUp() {
        batallon = new Batallon();
    }

    @Test
    public void testAgregarPersonaje() {
        Personaje auror = new Auror("Auror1", true);
        batallon.agregarPersonaje(auror);
        assertEquals(1, batallon.getMiembros().size());
        assertEquals(auror, batallon.getMiembros().get(0));
    }

    @Test
    public void testAtacar() {
        Personaje auror = new Auror("Auror1", true);
        Personaje seguidor = new Seguidor("Seguidor1", false);
        assertTrue(100 <= seguidor.getPuntosDeVida());
        batallon.agregarPersonaje(auror);
        batallon.atacar(seguidor);
        assertTrue(100 > seguidor.getPuntosDeVida());
    }

    @Test
    public void testRecibirDanio() {
        Personaje auror = new Auror("Auror1", true);
        batallon.agregarPersonaje(auror);
        batallon.recibirDanio(50);
        assertEquals(50, auror.getPuntosDeVida());
    }

    @Test
    public void testEstaDerrotado() {
        Personaje auror = new Auror("Auror1", true);
        batallon.agregarPersonaje(auror);
        assertFalse(batallon.estaDerrotado());
        auror.recibirDanio(100);
        assertTrue(batallon.estaDerrotado());
    }

    @Test
    public void testTienePersonajesSaludables() {
        Personaje auror = new Auror("Auror1", true);
        batallon.agregarPersonaje(auror);
        assertTrue(batallon.tienePersonajesSaludables());
        auror.recibirDanio(100);
        assertFalse(batallon.tienePersonajesSaludables());
    }

    @Test
    public void testMoverAlPrincipio() {
        Personaje auror1 = new Auror("Auror1", true);
        Personaje auror2 = new Auror("Auror2", true);
        batallon.agregarPersonaje(auror1);
        batallon.agregarPersonaje(auror2);
        batallon.moverAlPrincipio(auror2);
        assertEquals(auror2, batallon.getMiembros().get(0));
    }

    @Test
    public void testRecibirProteccion() {
        Personaje auror = new Auror("Auror1", true);
        batallon.agregarPersonaje(auror);
        batallon.recibirProteccion(20);
        assertEquals(20, auror.sistemaDefensivo.nivelDeProteccion());
    }

    @Test
    public void testOnPersonajeMuerto() {
        Personaje auror = new Auror("Auror1", true);
        batallon.agregarPersonaje(auror);
        auror.recibirDanio(150);
        assertTrue(batallon.estaDerrotado());
    }
}