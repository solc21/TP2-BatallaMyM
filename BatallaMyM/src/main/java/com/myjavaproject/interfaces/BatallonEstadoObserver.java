package com.myjavaproject.interfaces;

import com.myjavaproject.classes.Batallon;

public interface BatallonEstadoObserver {
    void onBatallonDerrotado(Batallon batallon);
    void onBatallonDebilitado(Batallon batallon);
}