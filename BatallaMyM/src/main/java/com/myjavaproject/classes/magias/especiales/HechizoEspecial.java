package com.myjavaproject.classes.magias.especiales;

import com.myjavaproject.enums.TipoDeMagia;
import com.myjavaproject.interfaces.Hechizo;
import com.myjavaproject.interfaces.Combatiente;

public class HechizoEspecial implements Hechizo {
    private static TipoDeMagia TIPOHECHIZO = TipoDeMagia.ESPECIAL;
    private static int COSTE;
    private static int PROTECCION;

    public HechizoEspecial(int coste, int proteccion) {
        COSTE = coste;
        PROTECCION = proteccion;
    }

    public int getCoste() {
        return COSTE;
    }

    public int getProteccion() {
        return PROTECCION;
    }

    public TipoDeMagia getTipoHechizo() {
        return TIPOHECHIZO;
    }

    @Override
    public void ejecutar(Combatiente personaje) {
    }

    @Override
    public String getNombre() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HechizoEspecial that = (HechizoEspecial) obj;
        return getNombre().equals(that.getNombre());
    }

    @Override
    public int hashCode() {
        return getNombre().hashCode();
    }
}