package com.myjavaproject.observadores;

import com.myjavaproject.classes.Batallon;
import com.myjavaproject.classes.Personaje;
import com.myjavaproject.interfaces.PersonajeEstadoObserver;

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