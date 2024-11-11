package com.myjavaproject.classes.personajes;

import com.myjavaproject.classes.factories.HechizosAtaqueFactory;
import com.myjavaproject.classes.factories.HechizosDefensivosFactory;
import com.myjavaproject.enums.Nivel;

public class Profesor extends Mago {

    public Profesor(String nombre, boolean tieneVarita) {
        super(nombre, tieneVarita);
        HechizosAtaqueFactory factory = new HechizosAtaqueFactory();
        HechizosDefensivosFactory factoryDefensa = new HechizosDefensivosFactory();
        capacidadHechicero.agregarHechizo(factory.crearHechizo(Nivel.AVANZADA));
        capacidadHechicero.agregarHechizo(factoryDefensa.crearHechizo(Nivel.AVANZADA));
    }
}