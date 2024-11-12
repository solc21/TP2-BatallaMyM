package observadores;

import classes.Batallon;
import classes.Personaje;
import interfaces.PersonajeEstadoObserver;

public class PersonajeEstadoNotifier implements PersonajeEstadoObserver {
    private Batallon batallon;

    public PersonajeEstadoNotifier(Batallon batallon) {
        this.batallon = batallon;
    }

    @Override
    public void onPersonajeMuerto(Personaje personaje) {
        batallon.onPersonajeMuerto(personaje);
    }
}