package com.myjavaproject.classes.factories;

import com.myjavaproject.interfaces.Hechizo;
import com.myjavaproject.classes.magias.especiales.*;
import com.myjavaproject.enums.Nivel;

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