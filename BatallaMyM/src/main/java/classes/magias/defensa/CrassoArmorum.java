package classes.magias.defensa;

import interfaces.Combatiente;

public class CrassoArmorum extends HechizoDefensa {

    public CrassoArmorum() {
        super(6, 30);
    }

    // Descripción: Un hechizo que refuerza la armadura del lanzador.
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Crasso Armorum spell effect here
        System.out.println("lanza Crasso Armorum!");
        personaje.recibirProteccion(this.getProteccion());
        // Additional effects can be added here
    }
}