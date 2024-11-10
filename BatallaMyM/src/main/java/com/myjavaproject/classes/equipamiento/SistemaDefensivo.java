package com.myjavaproject.classes.equipamiento;

public class SistemaDefensivo {
    private boolean proteccionContraHechizosBasicos;
    private boolean proteccionContraDanioFisico;

    public SistemaDefensivo(boolean proteccionContraHechizosBasicos, boolean proteccionContraDanioFisico) {
        this.proteccionContraHechizosBasicos = proteccionContraHechizosBasicos;
        this.proteccionContraDanioFisico = proteccionContraDanioFisico;
    }

    public int calcularDanioReducido(int danioOriginal) {
        int danioReducido = danioOriginal;

        if (proteccionContraHechizosBasicos) {
            danioReducido -= danioOriginal * 0.2; // Reduce 20% if protected against basic spells
        }

        if (proteccionContraDanioFisico) {
            danioReducido -= danioOriginal * 0.3; // Reduce 30% if protected against physical damage
        }

        return (int) Math.max(danioReducido, 0); // Ensure damage does not go below 0
    }

    public boolean isProteccionContraHechizosBasicos() {
        return proteccionContraHechizosBasicos;
    }

    public boolean isProteccionContraDanioFisico() {
        return proteccionContraDanioFisico;
    }
}