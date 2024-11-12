package classes.magias.ataque;

import interfaces.Combatiente;

public class Desmaius extends HechizoAtaque {
    private static final int DANIO = 40;
    private static final int COSTE = 4;

    public Desmaius() {
        super(COSTE, DANIO);
    }

    @Override
    public void ejecutar(Combatiente objetivo) {
        // Implement the logic for the Desmaius spell
        System.out.println("Desmaius executed");
        objetivo.recibirDanio(DANIO);
    }
}