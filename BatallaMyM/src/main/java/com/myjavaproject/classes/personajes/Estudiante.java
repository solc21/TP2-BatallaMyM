package com.myjavaproject.classes.personajes;

import com.myjavaproject.classes.factories.HechizosAtaqueFactory;
import com.myjavaproject.classes.factories.HechizosDefensivosFactory;
import com.myjavaproject.enums.Nivel;

public class Estudiante extends Mago {

    public Estudiante(String nombre, boolean tieneVarita) {
        super(nombre, tieneVarita);
        HechizosAtaqueFactory factory = new HechizosAtaqueFactory();
        HechizosDefensivosFactory factoryDefensa = new HechizosDefensivosFactory();
        capacidadHechicero.agregarHechizo(factory.crearHechizo(Nivel.PRINCIPIANTE));
        capacidadHechicero.agregarHechizo(factoryDefensa.crearHechizo(Nivel.PRINCIPIANTE));
    }
}