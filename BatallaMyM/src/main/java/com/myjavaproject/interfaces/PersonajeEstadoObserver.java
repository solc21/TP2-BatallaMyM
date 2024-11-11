package com.myjavaproject.interfaces;

import com.myjavaproject.classes.Personaje;

public interface PersonajeEstadoObserver {
    void onPersonajeMuerto(Personaje personaje);
}