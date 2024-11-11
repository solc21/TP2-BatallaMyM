package com.myjavaproject.classes.magias.defensa;

import com.myjavaproject.interfaces.Combatiente;

public class VulnerasSanentur extends HechizoDefensa {

    public VulnerasSanentur() {
        super(8, 80);
    }

    // Descripción: Un hechizo curativo que sana heridas graves.
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Vulneras Sanentur spell effect
        System.out.println("Vulneras Sanentur executed");
        // Additional logic for the spell effect can be added here
    }
}