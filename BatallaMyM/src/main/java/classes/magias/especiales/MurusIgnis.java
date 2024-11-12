package classes.magias.especiales;

import interfaces.Combatiente;

public class MurusIgnis extends HechizoEspecial {
    private static final int COSTE = 7;
    private static final int PROTECCION = 30; // Protege significativamente

    public MurusIgnis() {
        super(COSTE, PROTECCION);
    }

    // Descripción: Un hechizo que crea una pared de fuego para bloquear ataques y enemigos.
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Murus Ignis spell
        System.out.println("Murus Ignis executed, providing " + PROTECCION + " protection");
        personaje.recibirProteccion(this.getProteccion());
    }
}