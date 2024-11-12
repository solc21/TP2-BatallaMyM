package equipamiento;

import classes.enums.TipoDeMagia;
import interfaces.Hechizo;

import java.util.Set;
import java.util.HashSet;

public class CapacidadHechicero {
	protected int nivelDeMagia;
    protected int nivelDeMagiaActual;
    protected Set<Hechizo> hechizos;

    public CapacidadHechicero(int nivelDeMagia, int nivelDeMagiaActual) {
        this.nivelDeMagia = nivelDeMagia;
        this.nivelDeMagiaActual = nivelDeMagiaActual;
        this.hechizos = new HashSet<>();
    }

    public boolean tieneHechizo(Hechizo hechizo) {
        return hechizos.contains(hechizo);
    }
    
    public Hechizo getHechizoAtaque() {
        for (Hechizo hechizo : hechizos) {
            if (hechizo.getTipoHechizo().equals(TipoDeMagia.ATAQUE) || hechizo.getTipoHechizo().equals(TipoDeMagia.OSCURA)) {
                return hechizo;
            }
        }
        return null;
    }

    public Hechizo getHechizoDefensa() {
        for (Hechizo hechizo : hechizos) {
            if (hechizo.getTipoHechizo().equals(TipoDeMagia.DEFENSA) || hechizo.getTipoHechizo().equals(TipoDeMagia.ESPECIAL)) {
                return hechizo;
            }
        }
        return null;
    }

    public boolean tieneSuficienteMagia(int coste) {
        return nivelDeMagiaActual >= coste;
    }

    public void consumirMagia(int cantidad) {
        nivelDeMagiaActual -= cantidad;
        nivelDeMagiaActual = Math.max(nivelDeMagiaActual, 0);
    }

    public void aumentarMagia(int cantidad) {
        nivelDeMagiaActual += cantidad;
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