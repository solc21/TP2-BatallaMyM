package observadores;

import classes.Batallon;
import interfaces.BatallonMiembrosObserver;
import interfaces.Combatiente;

public class BatallonMiembrosNotifier implements BatallonMiembrosObserver {

    @Override
    public void onMiembroPerdido(Batallon batallon, Combatiente miembro) {
        System.out.println("Miembro perdido: " + miembro);
    }

    @Override
    public void onMiembroDebilitado(Batallon batallon, Combatiente miembro) {
        System.out.println("Miembro debilitado: " + miembro);
    }
}