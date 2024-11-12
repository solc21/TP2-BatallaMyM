package classes.magias.defensa;

import interfaces.Combatiente;

public class VulnerasSanentur extends HechizoDefensa {

    public VulnerasSanentur() {
        super(8, 50);
    }

    // Descripción: Un hechizo curativo que sana heridas graves.
    
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Vulneras Sanentur spell effect
        System.out.println("Vulneras Sanentur executed");
        personaje.recibirProteccion(this.getProteccion());
        // Additional logic for the spell effect can be added here
    }
}