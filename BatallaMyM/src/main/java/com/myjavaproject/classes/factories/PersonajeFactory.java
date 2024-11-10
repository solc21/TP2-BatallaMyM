package com.myjavaproject.classes.factories;

import com.myjavaproject.classes.Personaje;
import com.myjavaproject.enums.TipoPersonaje;
import com.myjavaproject.classes.personajes.*;

public class PersonajeFactory {

    public Personaje crearPersonaje(TipoPersonaje tipo, String nombre) {
        return switch (tipo) {
            case AUROR -> new Auror(nombre, true);
            case PROFESOR -> new Profesor(nombre, true);
            case ESTUDIANTE -> new Estudiante(nombre, false);
            case SEGUIDOR -> new Seguidor(nombre, false);
            case COMANDANTE -> new Comandante(nombre, true);
            default -> throw new IllegalArgumentException("Tipo de personaje no reconocido: " + tipo);
        };
    }
}