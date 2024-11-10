package com.myjavaproject.classes.magias.oscuros;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Imperius implements Hechizo {
    public static final int COSTE = 8;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Imperius curse
        System.out.println("Imperius executed");
    }
}