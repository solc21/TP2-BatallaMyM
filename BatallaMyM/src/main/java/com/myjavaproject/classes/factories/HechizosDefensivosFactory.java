package com.myjavaproject.classes.factories;

import com.myjavaproject.interfaces.Hechizo;
import com.myjavaproject.classes.magias.defensa.*;
import com.myjavaproject.enums.Nivel;

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