package com.myjavaproject.observadores;

import com.myjavaproject.classes.Batallon;
import com.myjavaproject.interfaces.BatallonEstadoObserver;

public class BatallonEstadoLogger implements BatallonEstadoObserver {
    @Override
    public void onBatallonDerrotado(Batallon batallon) {
        System.out.println("El batallón ha sido derrotado: " + batallon);
    }

    @Override
    public void onBatallonDebilitado(Batallon batallon, int porcentaje) {
        System.out.println("El batallón ha sido debilitado: " + porcentaje + "% de su fuerza restante.");
    }
}