package com.myjavaproject.classes;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.BatallonMiembrosObserver;
import com.myjavaproject.interfaces.BatallonEstadoObserver;
import com.myjavaproject.interfaces.Hechizo;

import java.util.ArrayList;
import java.util.List;

public class Batallon implements Combatiente {
    private List<Combatiente> miembros;
    private List<BatallonMiembrosObserver> observadoresMiembros;
    private List<BatallonEstadoObserver> observadoresEstado;

    public Batallon() {
        this.miembros = new ArrayList<>();
        this.observadoresMiembros = new ArrayList<>();
        this.observadoresEstado = new ArrayList<>();
    }

    @Override
    public void atacar(Hechizo hechizo, Combatiente objetivo) {
        // Implementar la lógica de ataque
        for (Combatiente miembro : miembros) {
            miembro.atacar(hechizo, objetivo);
        }
    }

    public void recibirDanio(int cantidad) {
        // Implementar la lógica para recibir daño
    }

    public boolean estaActivo() {
        // Implementar la lógica para verificar si el batallón está activo
        return !miembros.isEmpty();
    }
    
    public boolean estaDerrotado() {
    	for (Combatiente miembro : miembros) {
    		if(!miembro.estaDerrotado()) 
    			return true;
    	}
    	return false;
    }
    
    public boolean tienePersonajesSaludables() {
    	for (Combatiente miembro : miembros) {
    		if(!miembro.estaDerrotado()) 
    			return true;
    	}
    	return false;
    }

    public void agregarMiembro(Combatiente miembro) {
        miembros.add(miembro);
        // Notificar a los observadores de miembros
    }

    public void agregarObservadorMiembros(BatallonMiembrosObserver observador) {
        observadoresMiembros.add(observador);
    }

    public void agregarObservadorEstado(BatallonEstadoObserver observador) {
        observadoresEstado.add(observador);
    }
}