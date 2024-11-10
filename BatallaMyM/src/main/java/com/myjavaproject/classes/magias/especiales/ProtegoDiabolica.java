package com.myjavaproject.classes.magias.especiales;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class ProtegoDiabolica implements Hechizo {
    public static final int COSTE = 7;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Protego Diabolica spell
        System.out.println("Protego Diabolica executed");
    }
}