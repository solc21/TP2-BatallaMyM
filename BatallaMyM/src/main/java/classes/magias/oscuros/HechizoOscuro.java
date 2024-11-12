package classes.magias.oscuros;

import classes.enums.TipoDeMagia;
import interfaces.Combatiente;
import interfaces.Hechizo;

public class HechizoOscuro implements Hechizo {
    private static TipoDeMagia TIPOHECHIZO = TipoDeMagia.OSCURA;
    private static int COSTE;
    private static int DANIO;

    public HechizoOscuro(int coste, int danio) {
        COSTE = coste;
        DANIO = danio;
    }

    public int getCoste() {
        return COSTE;
    }

    public int getDanio() {
        return DANIO;
    }

    public TipoDeMagia getTipoHechizo() {
        return TIPOHECHIZO;
    }

    @Override
    public void ejecutar(Combatiente personaje) {
    }

    @Override
    public String getNombre() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HechizoOscuro that = (HechizoOscuro) obj;
        return getNombre().equals(that.getNombre());
    }

    @Override
    public int hashCode() {
        return getNombre().hashCode();
    }
}