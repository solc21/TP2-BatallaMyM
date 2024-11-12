package factories;

import classes.enums.Nivel;
import interfaces.Hechizo;

public abstract class HechizoFactory {

    public abstract Hechizo crearHechizo(Nivel nivel);
}