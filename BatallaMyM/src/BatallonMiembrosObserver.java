
public interface BatallonMiembrosObserver {

    void onMiembroPerdido(Batallon batallon, Combatiente miembro);
    void onMiembroDebilitado(Batallon batallon, Combatiente miembro);
}