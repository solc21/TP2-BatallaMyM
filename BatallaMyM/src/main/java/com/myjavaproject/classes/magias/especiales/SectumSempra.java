package com.myjavaproject.classes.magias.especiales;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class SectumSempra implements Hechizo {
    public static final int COSTE = 9;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Sectum Sempra spell
        System.out.println("Embrujo executed");
    }
}