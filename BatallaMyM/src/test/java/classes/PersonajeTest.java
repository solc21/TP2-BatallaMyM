package classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.personajes.Auror;
import interfaces.Combatiente;
import interfaces.Hechizo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class PersonajeTest {

    private Personaje personaje;

    @BeforeEach
    public void setUp() {
        personaje = new Auror("Harry", true);
    }

    @Test
    public void testRecibirDanio() {
        personaje.recibirDanio(50);
        assertEquals(50, personaje.getPuntosDeVida());
    }

    @Test
    public void testRecibirDanio_Muerte() {
        personaje.recibirDanio(150);
        assertEquals(0, personaje.getPuntosDeVida());
        assertTrue(personaje.estaDerrotado());
    }

    @Test
    public void testRecibirProteccion() {
        personaje.recibirProteccion(20);
        assertEquals(20, personaje.sistemaDefensivo.nivelDeProteccion());
    }

    @Test
    public void testEstaActivo() {
        assertTrue(personaje.estaActivo());
        personaje.recibirDanio(100);
        assertFalse(personaje.estaActivo());
    }

    @Test
    public void testEstaDerrotado() {
        assertFalse(personaje.estaDerrotado());
        personaje.recibirDanio(100);
        assertTrue(personaje.estaDerrotado());
    }

    @Test
    public void testPuedeRealizarHechizo() {
        Hechizo hechizo = personaje.capacidadHechicero.getHechizoAtaque();
        assertTrue(personaje.puedeRealizarHechizo(hechizo));
    }

    @Test
    public void testGetNivelDePoder() {
        assertEquals(10, personaje.getNivelDePoder());
    }

    @Test
    public void testGetMiembros() {
        List<Combatiente> miembros = personaje.getMiembros();
        assertEquals(1, miembros.size());
        assertEquals(personaje, miembros.get(0));
    }
}