package com.myjavaproject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.myjavaproject.magias.ataque.Expelliarmus;
import com.myjavaproject.personajes.Mago;

class HechizoTest {

    private Mago mago;
    private Expelliarmus hechizo;

    @BeforeEach
    void setUp() {
        mago = new Mago("Harry Potter");
        hechizo = new Expelliarmus();
    }

    @Test
    void testEjecutarHechizo() {
        String resultado = hechizo.ejecutar(mago);
        assertEquals("Hechizo Expelliarmus ejecutado por Harry Potter", resultado);
    }
}