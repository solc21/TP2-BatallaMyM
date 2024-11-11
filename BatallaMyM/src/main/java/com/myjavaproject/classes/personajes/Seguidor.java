package com.myjavaproject.classes.personajes;

import com.myjavaproject.classes.factories.AtaqueOscuroFactory;
import com.myjavaproject.classes.factories.HabilidadesEspecialFactory;
import com.myjavaproject.enums.Nivel;

public class Seguidor extends Mortifago {

    public Seguidor(String nombre, boolean tieneVarita) {
        super(nombre, tieneVarita);
        AtaqueOscuroFactory factory = new AtaqueOscuroFactory();
        HabilidadesEspecialFactory factoryDefensa = new HabilidadesEspecialFactory();
        capacidadHechicero.agregarHechizo(factory.crearHechizo(Nivel.MEDIO));
        capacidadHechicero.agregarHechizo(factoryDefensa.crearHechizo(Nivel.MEDIO));
    }
}