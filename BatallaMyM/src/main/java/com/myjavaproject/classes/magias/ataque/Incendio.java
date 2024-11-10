package com.myjavaproject.classes.magias.ataque;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Incendio implements Hechizo {
    public static final int COSTE = 7;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Incendio spell
        System.out.println("Incendio executed");
    }
}