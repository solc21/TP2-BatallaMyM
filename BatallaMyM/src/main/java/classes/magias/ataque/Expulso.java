package classes.magias.ataque;

import interfaces.Combatiente;

public class Expulso extends HechizoAtaque {
    private static final int DANIO = 50;
    private static final int COSTE = 5;

    public Expulso() {
        super(COSTE, DANIO);
    }
    
    @Override
    public void ejecutar(Combatiente objetivo) {
        // Implement the logic for the Expulso spell
        System.out.println("Expulso executed, causing " + DANIO + " damage");
        objetivo.recibirDanio(DANIO);
    }
}