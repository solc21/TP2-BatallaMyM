package com.myjavaproject.classes.magias.especiales;

import com.myjavaproject.interfaces.Combatiente;

public class FiendFyre extends HechizoEspecial {
    private static final int COSTE = 10;
    private static final int PROTECCION = 100; // Protección máxima, pero muy peligrosa

    public FiendFyre() {
        super(COSTE, PROTECCION);
    }

    // Descripción: Un hechizo que invoca un fuego mágico incontrolable que consume todo a su paso.
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Fiendfyre spell
        System.out.println("Fiendfyre executed, providing " + PROTECCION + " protection");
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        return getClass() == obj.getClass();
    }
}