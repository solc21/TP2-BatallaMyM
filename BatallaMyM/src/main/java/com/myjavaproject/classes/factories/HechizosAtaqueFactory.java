package com.myjavaproject.classes.factories;

import com.myjavaproject.classes.magias.ataque.*;
import com.myjavaproject.interfaces.Hechizo;
import com.myjavaproject.enums.Nivel;

public class HechizosAtaqueFactory extends HechizoFactory {

    @Override
    public Hechizo crearHechizo(Nivel nivel) {
        return switch (nivel) {
            case PRINCIPIANTE -> new Expelliarmus();
            case MEDIO -> new Desmaius();
            case AVANZADA -> new Incendio();
            case MUY_AVANZADA -> new Expulso();
            default -> throw new IllegalArgumentException("Nivel no válido: " + nivel);
        };
    }
}