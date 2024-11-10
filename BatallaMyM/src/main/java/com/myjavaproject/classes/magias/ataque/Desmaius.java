package com.myjavaproject.classes.magias.ataque;

import com.myjavaproject.interfaces.Hechizo;
import com.myjavaproject.interfaces.Combatiente;

public class Desmaius implements Hechizo {
    public static final int COSTE = 4;

    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Desmaius spell
        System.out.println("Desmaius executed");
    }
}