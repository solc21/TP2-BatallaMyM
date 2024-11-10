package com.myjavaproject.classes.personajes;

import com.myjavaproject.classes.Personaje;

public class Mortifago extends Personaje {
    private static final int PUNTOS_DE_VIDA_INICIAL = 10;
    private static final int NIVEL_DE_MAGIA_INICIAL = 10;

    public Mortifago(String nombre, boolean tieneVarita) {
        super(nombre, PUNTOS_DE_VIDA_INICIAL, NIVEL_DE_MAGIA_INICIAL, NIVEL_DE_MAGIA_INICIAL, tieneVarita);
    }
}