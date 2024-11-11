package com.myjavaproject.classes.magias.especiales;

import com.myjavaproject.interfaces.Combatiente;

public class UmbraAegis extends HechizoEspecial {
    private static final int COSTE = 6;
    private static final int PROTECCION = 60; // Protege moderadamente

    public UmbraAegis() {
        super(COSTE, PROTECCION);
    }

    // Descripción: Un hechizo que envuelve al lanzador en sombras protectoras, absorbiendo parte del daño recibido.
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Umbra Aegis spell
        System.out.println("Umbra Aegis executed, providing " + PROTECCION + " protection");
    }
}