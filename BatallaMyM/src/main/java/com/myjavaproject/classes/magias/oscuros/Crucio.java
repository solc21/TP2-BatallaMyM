package com.myjavaproject.classes.magias.oscuros;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Crucio implements Hechizo {
    public static final int COSTE = 9;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Crucio spell
        System.out.println("Crucio executed");
    }
}