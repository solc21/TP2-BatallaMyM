package factories;

import classes.enums.Nivel;
import classes.magias.defensa.*;
import interfaces.Hechizo;

public class HechizosDefensivosFactory extends HechizoFactory {

    @Override
    public Hechizo crearHechizo(Nivel nivel) {
        return switch (nivel) {
            case PRINCIPIANTE -> new Protego();
            case MEDIO -> new VulnerasSanentur();
            case AVANZADA -> new CrassoArmorum();
            case MUY_AVANZADA -> new Abalio();
            default -> throw new IllegalArgumentException("Nivel no válido: " + nivel);
        };
    }
}