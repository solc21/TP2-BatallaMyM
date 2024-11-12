package interfaces;

import classes.enums.TipoDeMagia;

public interface Hechizo {

    TipoDeMagia getTipoHechizo();
    void ejecutar(Combatiente personaje);
    String getNombre();
    int getCoste();
}