package com.myjavaproject.classes.magias.defensa;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class VulnerasSanentur implements Hechizo {
    public static final int COSTE = 8;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Vulneras Sanentur spell effect
        System.out.println("Vulneras Sanentur executed");
        // Additional logic for the spell effect can be added here
    }
}