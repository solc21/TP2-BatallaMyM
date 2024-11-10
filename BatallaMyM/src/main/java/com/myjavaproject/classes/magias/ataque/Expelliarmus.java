package com.myjavaproject.classes.magias.ataque;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Expelliarmus implements Hechizo {
    public static final int COSTE = 9;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Expelliarmus spell
        System.out.println("Expelliarmus executed");
    }
}