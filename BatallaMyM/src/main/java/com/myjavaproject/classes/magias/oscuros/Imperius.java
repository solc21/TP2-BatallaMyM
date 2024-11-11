package com.myjavaproject.classes.magias.oscuros;

import com.myjavaproject.interfaces.Combatiente;

public class Imperius extends HechizoOscuro {
    private static final int COSTE = 8;
    private static final int DANIO = 80;

    public Imperius() {
        super(COSTE, DANIO);
    }
    
    @Override
    public void ejecutar(Combatiente objetivo) {
        // Implement the logic for the Imperius curse
        System.out.println("Imperius executed");
        objetivo.recibirDanio(DANIO);
    }
}