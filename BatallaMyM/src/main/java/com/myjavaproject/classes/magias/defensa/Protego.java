package com.myjavaproject.classes.magias.defensa;

import com.myjavaproject.interfaces.Combatiente;

public class Protego extends HechizoDefensa {

    public Protego() {
        super(6, 60);
    }

    // Descripción: Un hechizo que crea un escudo mágico para desviar hechizos.
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Protego spell
        System.out.println("Protego executed");
    }
}