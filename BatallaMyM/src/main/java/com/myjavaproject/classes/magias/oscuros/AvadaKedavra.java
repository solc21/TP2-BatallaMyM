package com.myjavaproject.classes.magias.oscuros;

import com.myjavaproject.interfaces.Hechizo;
import com.myjavaproject.interfaces.Combatiente;

public class AvadaKedavra implements Hechizo {
    public static final int COSTE = 10;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Avada Kedavra spell
        System.out.println("Avada Kedavra executed");
    }
}