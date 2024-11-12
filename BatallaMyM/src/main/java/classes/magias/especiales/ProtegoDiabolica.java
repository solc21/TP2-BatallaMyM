package classes.magias.especiales;

import interfaces.Combatiente;

public class ProtegoDiabolica extends HechizoEspecial {
    private static final int COSTE = 8;
    private static final int PROTECCION = 40; // Daño significativo

    public ProtegoDiabolica() {
        super(COSTE, PROTECCION);
    }

    // Descripción: Un hechizo que crea un escudo de fuego negro que quema a los enemigos.
    @Override
    public void ejecutar(Combatiente personaje) {
        // Implement the logic for the Protego Diabolica spell
        System.out.println("Protego Diabolica executed, causing " + PROTECCION + " damage");
        personaje.recibirProteccion(PROTECCION);
    }
}