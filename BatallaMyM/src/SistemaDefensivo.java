
public class SistemaDefensivo {
    private boolean proteccionContraHechizosBasicos;
    private boolean proteccionContraDanioFisico;

    public SistemaDefensivo(boolean proteccionMagica, boolean proteccionFisica) {
        this.proteccionContraHechizosBasicos = proteccionMagica;
        this.proteccionContraDanioFisico = proteccionFisica;
    }

    public int calcularDanioReducido(int danioOriginal) {
        if (proteccionContraHechizosBasicos || proteccionContraDanioFisico) {
            return danioOriginal / 2;
        }
        return danioOriginal;
    }
}
