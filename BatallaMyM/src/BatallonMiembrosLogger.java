
public class BatallonMiembrosLogger implements BatallonMiembrosObserver {

    @Override
    public void onMiembroPerdido(Batallon batallon, Combatiente miembro) {
        System.out.println("Miembro perdido en el batallón: " + miembro);
    }

    @Override
    public void onMiembroDebilitado(Batallon batallon, Combatiente miembro) {
        System.out.println("Miembro debilitado en el batallón: " + miembro);
    }
}
