
public class BatallonEstadoLogger implements BatallonEstadoObserver {

    @Override
    public void onBatallonDerrotado(Batallon batallon) {
        System.out.println("El batallón ha sido derrotado.");
    }

    @Override
    public void onBatallonDebilitado(Batallon batallon, int porcentaje) {
        System.out.println("El batallón está debilitado. Porcentaje de activos: " + porcentaje + "%");
    }
}
