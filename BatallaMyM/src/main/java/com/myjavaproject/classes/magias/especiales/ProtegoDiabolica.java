package com.myjavaproject.classes.magias.especiales;

import com.myjavaproject.interfaces.Combatiente;

public class ProtegoDiabolica extends HechizoEspecial {
    private static final int COSTE = 8;
    private static final int DANIO = 40; // Daño significativo

    public ProtegoDiabolica() {
        super(COSTE, DANIO);
    }

    // Descripción: Un hechizo que crea un escudo de fuego negro que quema a los enemigos.
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Protego Diabolica spell
        System.out.println("Protego Diabolica executed, causing " + DANIO + " damage");
        personaje.recibirDanio(DANIO);
    }
}