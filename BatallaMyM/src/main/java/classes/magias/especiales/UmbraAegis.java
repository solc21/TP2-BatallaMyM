package classes.magias.especiales;

import interfaces.Combatiente;

public class UmbraAegis extends HechizoEspecial {
    private static final int COSTE = 6;
    private static final int PROTECCION = 20; // Protege moderadamente

    public UmbraAegis() {
        super(COSTE, PROTECCION);
    }

    // Descripción: Un hechizo que envuelve al lanzador en sombras protectoras, absorbiendo parte del daño recibido.
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Umbra Aegis spell
        System.out.println("Umbra Aegis executed, providing " + PROTECCION + " protection");
        personaje.recibirProteccion(this.getProteccion());
    }
}