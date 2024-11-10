package com.myjavaproject.classes;

import com.myjavaproject.classes.equipamiento.*;
import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public abstract class Personaje implements Combatiente {
    protected String nombre;
    protected int puntosDeVida;
    protected Varita varita;
    protected SistemaDefensivo sistemaDefensivo;
    protected CapacidadHechicero capacidadHechicero;

    public Personaje(String nombre, int puntosDeVida, int nivelDeMagia, int nivelDeMagiaActual, boolean tieneVarita) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.varita = new Varita(tieneVarita);
        this.sistemaDefensivo = new SistemaDefensivo(false, false);
        this.capacidadHechicero = new CapacidadHechicero(nivelDeMagia, nivelDeMagiaActual);
    }

    @Override
    public void atacar(Hechizo hechizo, Combatiente objetivo) {
        // Implementar lógica de ataque
    }

    @Override
    public void recibirDanio(int cantidad) {
        // Implementar lógica de recibir daño
    }

    @Override
    public boolean estaActivo() {
        return puntosDeVida > 0;
    }
    
    @Override
    public boolean estaDerrotado() {
    	return puntosDeVida <= 0;
    }

    protected boolean puedeRealizarHechizo(Hechizo hechizo) {
        // Implementar lógica para verificar si puede realizar el hechizo
        return capacidadHechicero.tieneHechizo(hechizo);
    }

    public int getNivelDePoder() {
        return capacidadHechicero.getNivelDeMagiaActual();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}