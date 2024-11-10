package com.myjavaproject.classes.factories;

import com.myjavaproject.interfaces.Hechizo;
import com.myjavaproject.classes.magias.especiales.*;
import com.myjavaproject.enums.Nivel;

public class HabilidadesEspecialFactory extends HechizoFactory{

    public Hechizo crearHechizo(Nivel nivel) {
        return switch (nivel) {
            case PRINCIPIANTE -> new ProtegoDiabolica();
            case MEDIO -> new Embrujo();
            case AVANZADA -> new Inferius();
            case MUY_AVANZADA -> new SectumSempra();
            default -> throw new IllegalArgumentException("Nivel no válido: " + nivel);
        };
    }
}