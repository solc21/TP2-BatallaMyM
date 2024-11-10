package com.myjavaproject.classes.factories;

import com.myjavaproject.interfaces.Hechizo;
import com.myjavaproject.enums.Nivel;

public abstract class HechizoFactory {

    public abstract Hechizo crearHechizo(Nivel nivel);
}