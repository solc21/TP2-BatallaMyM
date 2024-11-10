package com.myjavaproject.classes.magias.oscuros;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Confringo implements Hechizo {
    public static final int COSTE = 7;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Confringo spell
        System.out.println("Confringo executed");
    }
}