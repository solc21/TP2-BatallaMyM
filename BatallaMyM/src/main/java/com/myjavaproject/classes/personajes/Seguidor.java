package com.myjavaproject.classes.personajes;

import com.myjavaproject.classes.factories.AtaqueOscuroFactory;
import com.myjavaproject.classes.factories.HabilidadesEspecialFactory;
import com.myjavaproject.enums.Nivel;
import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Seguidor extends Mortifago {

    public Seguidor(String nombre, boolean tieneVarita) {
        super(nombre, tieneVarita);
        AtaqueOscuroFactory factory = new AtaqueOscuroFactory();
        HabilidadesEspecialFactory factoryDefensa = new HabilidadesEspecialFactory();
        capacidadHechicero.agregarHechizo(factory.crearHechizo(Nivel.MEDIO));
        capacidadHechicero.agregarHechizo(factoryDefensa.crearHechizo(Nivel.MEDIO));
    }

    @Override
    public void atacar(Hechizo hechizo, Combatiente objetivo) {
        // Implementar la lógica de ataque específica para Seguidor
    	if (this.puedeRealizarHechizo(hechizo))
    		hechizo.ejecutar(objetivo);
    }
}