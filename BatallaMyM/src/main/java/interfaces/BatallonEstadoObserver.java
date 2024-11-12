package interfaces;

import classes.Batallon;

public interface BatallonEstadoObserver {
    void onBatallonDerrotado(Batallon batallon);
    void onBatallonDebilitado(Batallon batallon);
}