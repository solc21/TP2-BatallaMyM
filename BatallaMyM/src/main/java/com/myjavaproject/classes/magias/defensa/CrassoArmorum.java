package com.myjavaproject.classes.magias.defensa;

import com.myjavaproject.interfaces.Combatiente;

public class CrassoArmorum extends HechizoDefensa {

    public CrassoArmorum() {
        super(6, 60);
    }

    // Descripción: Un hechizo que refuerza la armadura del lanzador.
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Crasso Armorum spell effect here
        System.out.println("lanza Crasso Armorum!");
        // Additional effects can be added here
    }
}