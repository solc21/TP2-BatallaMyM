package com.myjavaproject.interfaces;

import com.myjavaproject.classes.Batallon;

public interface BatallonMiembrosObserver {
    void onMiembroPerdido(Batallon batallon, Combatiente miembro);
    void onMiembroDebilitado(Batallon batallon, Combatiente miembro);
}