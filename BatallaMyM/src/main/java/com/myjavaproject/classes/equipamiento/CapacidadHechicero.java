package com.myjavaproject.classes.equipamiento;

import com.myjavaproject.interfaces.Hechizo;

import java.util.Set;
import java.util.HashSet;

public class CapacidadHechicero {
    private int nivelDeMagia;
    private int nivelDeMagiaActual;
    private Set<Hechizo> hechizos;

    public CapacidadHechicero(int nivelDeMagia, int nivelDeMagiaActual) {
        this.nivelDeMagia = nivelDeMagia;
        this.nivelDeMagiaActual = nivelDeMagiaActual;
        this.hechizos = new HashSet<>();
    }

    public boolean tieneHechizo(Hechizo hechizo) {
        return hechizos.contains(hechizo);
    }

    public boolean tieneSuficienteMagia(int coste) {
        return nivelDeMagiaActual >= coste;
    }

    public void consumirMagia(int cantidad) {
        nivelDeMagiaActual -= cantidad;
    }

    public int getNivelDeMagia() {
        return nivelDeMagia;
    }

    public int getNivelDeMagiaActual() {
        return nivelDeMagiaActual;
    }

    public void agregarHechizo(Hechizo hechizo) {
        hechizos.add(hechizo);
    }
}