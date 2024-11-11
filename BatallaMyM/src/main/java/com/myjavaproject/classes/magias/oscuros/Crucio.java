package com.myjavaproject.classes.magias.oscuros;

import com.myjavaproject.interfaces.Combatiente;

public class Crucio extends HechizoOscuro {
    private static final int COSTE = 9;
    private static final int DANIO = 90; // Causa un dolor extremo

    public Crucio() {
        super(COSTE, DANIO);
    }

    // Descripción: Un hechizo que inflige un dolor insoportable en el objetivo.
    @Override
    public void ejecutar(Combatiente objetivo) {
        // Implement the logic for the Crucio spell
        System.out.println("Crucio executed, causing " + DANIO + " damage");
        objetivo.recibirDanio(DANIO);
    }
}