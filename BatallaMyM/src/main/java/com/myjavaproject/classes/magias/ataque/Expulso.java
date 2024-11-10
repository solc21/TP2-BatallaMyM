package com.myjavaproject.classes.magias.ataque;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Expulso implements Hechizo {
    public static final int COSTE = 5;
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Expulso spell
        System.out.println("Expulso executed");
    }
}