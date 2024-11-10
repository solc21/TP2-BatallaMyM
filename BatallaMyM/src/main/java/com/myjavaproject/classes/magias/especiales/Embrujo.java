package com.myjavaproject.classes.magias.especiales;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Embrujo implements Hechizo {
    public static final int COSTE = 6;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Embrujo spell here
        System.out.println("Embrujo executed");
    }
}