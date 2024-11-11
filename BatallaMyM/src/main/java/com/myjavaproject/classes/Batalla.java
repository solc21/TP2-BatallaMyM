package com.myjavaproject.classes;

import java.util.ArrayList;
import java.util.List;

import com.myjavaproject.interfaces.BatallonEstadoObserver;
import com.myjavaproject.interfaces.BatallonMiembrosObserver;
import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.observadores.BatallonEstadoNotifier;
import com.myjavaproject.observadores.BatallonMiembrosNotifier;

public class Batalla implements BatallonEstadoObserver, BatallonMiembrosObserver {
    private List<Ronda> rondas;
    private Batallon batallon1;
    private Batallon batallon2;

    public Batalla(Batallon batallon1, Batallon batallon2) {
        this.batallon1 = batallon1;
        this.batallon2 = batallon2;
        this.rondas = new ArrayList<>();

        // Se registran los observadores
        BatallonEstadoNotifier estadoNotifier = new BatallonEstadoNotifier();
        BatallonMiembrosNotifier miembrosNotifier = new BatallonMiembrosNotifier();

        batallon1.agregarObservadorEstado(estadoNotifier);
        batallon1.agregarObservadorMiembros(miembrosNotifier);
        batallon2.agregarObservadorEstado(estadoNotifier);
        batallon2.agregarObservadorMiembros(miembrosNotifier);
    }

    public void iniciarBatalla() {
        while (!batallon1.estaDerrotado() && !batallon2.estaDerrotado()) {
            Ronda ronda = new Ronda(batallon1.getMiembros(), batallon2.getMiembros());
            ronda.ejecutarRonda();
            rondas.add(ronda);
            ronda.reiniciarHechizos();
        }

        if (!batallon1.estaDerrotado()) {
            System.out.println("Batallon 1 gana la batalla!");
        } else {
            System.out.println("Batallon 2 gana la batalla!");
        }
    }

    @Override
    public void onBatallonDerrotado(Batallon batallon) {
        System.out.println("El batallón ha sido derrotado: " + batallon);
    }

    @Override
    public void onBatallonDebilitado(Batallon batallon) {
        System.out.println("El batallón ha perdido un jugador.");
    }

    @Override
    public void onMiembroPerdido(Batallon batallon, Combatiente miembro) {
        System.out.println("Miembro perdido: " + miembro);
    }

    @Override
    public void onMiembroDebilitado(Batallon batallon, Combatiente miembro) {
        System.out.println("Miembro debilitado: " + miembro);
    }
}