package com.myjavaproject.classes.equipamiento;

public class SistemaDefensivo {
    private int cantidadProteccion;

    public SistemaDefensivo(int cantidadProteccion) {
        this.cantidadProteccion = cantidadProteccion;
    }

    public int calcularDanioReducido(int danioOriginal) {
        return Math.max(danioOriginal - cantidadProteccion, 0);
    }

    public void subirProteccion(int cantidadProteccion) {
        this.cantidadProteccion += cantidadProteccion;
    }

    public void atacarProteccion(int cantidadDeDanio) {
        this.cantidadProteccion -= cantidadDeDanio;
        this.cantidadProteccion = Math.max(this.cantidadProteccion, 0);
    }

    public void quitarProteccion() {
        this.cantidadProteccion = 0;
    }

    public int nivelDeProteccion() {
        return cantidadProteccion;
    }
}