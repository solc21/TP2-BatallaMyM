package classes.magias.ataque;

import interfaces.Combatiente;

public class Incendio extends HechizoAtaque {
    private static final int DANIO = 70;
    private static final int COSTE = 7;

    public Incendio() {
        super(COSTE, DANIO);
    }
    
    @Override
    public void ejecutar(Combatiente objetivo) {
        // Implement the logic for the Incendio spell
        System.out.println("Incendio executed, causing " + DANIO + " damage");
        objetivo.recibirDanio(DANIO);
    }
}