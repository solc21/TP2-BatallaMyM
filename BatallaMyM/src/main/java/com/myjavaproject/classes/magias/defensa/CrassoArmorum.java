package com.myjavaproject.classes.magias.defensa;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class CrassoArmorum implements Hechizo {
    public static final int COSTE = 6;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Crasso Armorum spell effect here
        System.out.println("lanza Crasso Armorum!");
        // Additional effects can be added here
    }
}