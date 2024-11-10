package com.myjavaproject.classes.magias.defensa;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Protego implements Hechizo {
    public static final int COSTE = 5;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Protego spell
        System.out.println("Protego executed by");
    }
}