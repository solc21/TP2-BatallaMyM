package com.myjavaproject.classes.magias.defensa;

import com.myjavaproject.interfaces.Combatiente;

public class Abalio extends HechizoDefensa { // Protege moderadamente

    // Descripción: Un hechizo defensivo que crea una barrera mágica para proteger al lanzador.

    public Abalio() {
        super(3, 20);
    }

    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Abalio spell effect here

    }
}