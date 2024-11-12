package classes.magias.oscuros;

import interfaces.Combatiente;

public class AvadaKedavra extends HechizoOscuro {
    private static final int COSTE = 10;
    private static final int DANIO = 100; // Muerte instantánea

    public AvadaKedavra() {
        super(COSTE, DANIO);
    }

    // Descripción: Un hechizo que causa la muerte instantánea del objetivo.
    @Override
    public void ejecutar(Combatiente objetivo) {
        // Implement the logic for the Avada Kedavra spell
        System.out.println("Avada Kedavra executed, causing " + DANIO + " damage");
        objetivo.recibirDanio(DANIO);
    }

}