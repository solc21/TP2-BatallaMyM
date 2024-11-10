package com.myjavaproject.classes.magias.especiales;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Inferius implements Hechizo {
    public static final int COSTE = 6;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Inferius spell here
        System.out.println("Inferius executed");
    }
}