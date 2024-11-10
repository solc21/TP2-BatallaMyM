package com.myjavaproject.interfaces;

public interface Combatiente {
    void atacar(Hechizo hechizo, Combatiente objetivo);
    void recibirDanio(int cantidad);
    boolean estaActivo();
    boolean estaDerrotado();
}