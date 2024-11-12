package interfaces;

import classes.Personaje;

public interface PersonajeEstadoObserver {
    void onPersonajeMuerto(Personaje personaje);
}