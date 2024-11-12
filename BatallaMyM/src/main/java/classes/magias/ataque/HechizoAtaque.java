package classes.magias.ataque;

import classes.enums.TipoDeMagia;
import interfaces.Combatiente;
import interfaces.Hechizo;

public class HechizoAtaque implements Hechizo {
    private static TipoDeMagia TIPOHECHIZO = TipoDeMagia.ATAQUE;
    private int COSTE;
    private int DANIO;

    public HechizoAtaque(int coste, int danio) {
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
        HechizoAtaque that = (HechizoAtaque) obj;
        return getNombre().equals(that.getNombre());
    }

    @Override
    public int hashCode() {
        return getNombre().hashCode();
    }
}