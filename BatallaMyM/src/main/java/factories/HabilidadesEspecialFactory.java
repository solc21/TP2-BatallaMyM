package factories;

import classes.enums.Nivel;
import classes.magias.especiales.*;
import interfaces.Hechizo;

public class HabilidadesEspecialFactory extends HechizoFactory{

    public Hechizo crearHechizo(Nivel nivel) {
        return switch (nivel) {
            case PRINCIPIANTE -> new UmbraAegis();
            case MEDIO -> new MurusIgnis();
            case AVANZADA -> new ProtegoDiabolica();
            case MUY_AVANZADA -> new FiendFyre();
            default -> throw new IllegalArgumentException("Nivel no válido: " + nivel);
        };
    }
}