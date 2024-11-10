package com.myjavaproject.classes.magias.defensa;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Abalio implements Hechizo {
    public static final int COSTE = 3;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Abalio spell effect here
        System.out.println("ha lanzado el hechizo Abalio!");
    }
}