package com.myjavaproject.observadores;

import com.myjavaproject.classes.Batallon;
import com.myjavaproject.interfaces.BatallonMiembrosObserver;
import com.myjavaproject.interfaces.Combatiente;

public class BatallonMiembrosLogger implements BatallonMiembrosObserver {

    @Override
    public void onMiembroPerdido(Batallon batallon, Combatiente miembro) {
        System.out.println("Miembro perdido: " + miembro);
    }

    @Override
    public void onMiembroDebilitado(Batallon batallon, Combatiente miembro) {
        System.out.println("Miembro debilitado: " + miembro);
    }
}