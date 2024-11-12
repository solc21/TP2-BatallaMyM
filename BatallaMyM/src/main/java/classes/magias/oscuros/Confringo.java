package classes.magias.oscuros;

import interfaces.Combatiente;

public class Confringo extends HechizoOscuro {
    private static final int COSTE = 7;
    private static final int DANIO = 70; // Causa una explosión

    public Confringo() {
        super(COSTE, DANIO);
    }

    // Descripción: Un hechizo que provoca una explosión en el objetivo.
    @Override
    public void ejecutar(Combatiente objetivo) {
        // Implement the logic for the Confringo spell
        System.out.println("Confringo executed, causing " + DANIO + " damage");
        objetivo.recibirDanio(DANIO);
    }
}