package com.myjavaproject.observadores;

import com.myjavaproject.classes.Batallon;
import com.myjavaproject.interfaces.BatallonEstadoObserver;

public class BatallonEstadoNotifier implements BatallonEstadoObserver {
    @Override
    public void onBatallonDerrotado(Batallon batallon) {
        System.out.println("El batallón ha sido derrotado");
    }

    @Override
    public void onBatallonDebilitado(Batallon batallon) {
        System.out.println("El batallón ha perdido un jugador.");
    }
}