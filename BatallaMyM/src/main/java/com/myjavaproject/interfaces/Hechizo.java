package com.myjavaproject.interfaces;

import com.myjavaproject.enums.TipoDeMagia;

public interface Hechizo {

    TipoDeMagia getTipoHechizo();
    void ejecutar(Combatiente personaje);
    String getNombre();
    int getCoste();
}