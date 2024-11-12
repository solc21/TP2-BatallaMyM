package classes.magias.ataque;

import interfaces.Combatiente;

public class Expelliarmus extends HechizoAtaque {
    private static final int DANIO = 90;
    private static final int COSTE = 9;

    public Expelliarmus() {
        super(COSTE, DANIO);
    }
    
    @Override
    public void ejecutar(Combatiente objetivo) {
        // Implement the logic for the Expelliarmus spell
        System.out.println("Expelliarmus executed, causing " + DANIO + " damage.");
        objetivo.recibirDanio(DANIO);
    }
}