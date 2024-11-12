package factories;

import classes.enums.Nivel;
import classes.magias.oscuros.*;
import interfaces.Hechizo;

public class AtaqueOscuroFactory extends HechizoFactory {

    public Hechizo crearHechizo(Nivel nivel) {
        return switch (nivel) {
            case PRINCIPIANTE -> new Confringo();
            case MEDIO -> new Crucio();
            case AVANZADA -> new Imperius();
            case MUY_AVANZADA -> new AvadaKedavra();
            default -> throw new IllegalArgumentException("Nivel no válido: " + nivel);
        };
    }
}