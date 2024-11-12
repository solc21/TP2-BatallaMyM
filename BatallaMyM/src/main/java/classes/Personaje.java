package classes;

import java.util.ArrayList;
import java.util.List;

import equipamiento.*;
import interfaces.Combatiente;
import interfaces.Hechizo;
import interfaces.PersonajeEstadoObserver;

public abstract class Personaje implements Combatiente {
    protected String nombre;
    protected int puntosDeVida;
    protected Varita varita;
    protected SistemaDefensivo sistemaDefensivo;
    protected CapacidadHechicero capacidadHechicero;
    private List<PersonajeEstadoObserver> observadoresEstado;

    public Personaje(String nombre, int puntosDeVida, int nivelDeMagia, int nivelDeMagiaActual, boolean tieneVarita) {
    	//Agregar un numero aleatorio para identificar al nombre:
        this.nombre = nombre + Math.random();
        this.puntosDeVida = puntosDeVida;
        this.varita = new Varita(tieneVarita);
        this.sistemaDefensivo = new SistemaDefensivo(0);
        this.capacidadHechicero = new CapacidadHechicero(nivelDeMagia, nivelDeMagiaActual);
        this.observadoresEstado = new ArrayList<>();
    }

    @Override
    public void atacar(Combatiente objetivo) {
    }

    @Override
    public void recibirDanio(int cantidadOriginal) {
        // Implementar lógica de recibir daño
    	int cantidad = sistemaDefensivo.calcularDanioReducido(cantidadOriginal);
    	sistemaDefensivo.atacarProteccion(cantidadOriginal);
    	this.puntosDeVida = Math.max(this.puntosDeVida - cantidad, 0);
        if (estaDerrotado()) {
            notificarMuerte();
        }
    }

    @Override
    public void recibirProteccion(int cantidad) {
    	sistemaDefensivo.subirProteccion(cantidad);
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
        return capacidadHechicero.tieneHechizo(hechizo) && capacidadHechicero.tieneSuficienteMagia(hechizo.getCoste());
    }

    public int getNivelDePoder() {
        return capacidadHechicero.getNivelDeMagiaActual();
    }

    public List<Combatiente> getMiembros() {
    	List<Combatiente> Personaje = new ArrayList<Combatiente>();
    	Personaje.add(this);
    	return Personaje;
    }

    public void agregarObservadorEstado(PersonajeEstadoObserver observador) {
        observadoresEstado.add(observador);
    }

    private void notificarMuerte() {
        for (PersonajeEstadoObserver observador : observadoresEstado) {
            observador.onPersonajeMuerto(this);
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public int getNivelDeProteccion() {
        return sistemaDefensivo.nivelDeProteccion();
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        if(obj instanceof Personaje) {
            Personaje personaje = (Personaje) obj;
            return this.nombre.equals(personaje.nombre);
        }
        return false;
    }
}