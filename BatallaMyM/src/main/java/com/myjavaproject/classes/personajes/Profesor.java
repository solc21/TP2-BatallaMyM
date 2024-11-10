package com.myjavaproject.classes.personajes;

import com.myjavaproject.classes.factories.HechizosAtaqueFactory;
import com.myjavaproject.classes.factories.HechizosDefensivosFactory;
import com.myjavaproject.enums.Nivel;
import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Profesor extends Mago {

    public Profesor(String nombre, boolean tieneVarita) {
        super(nombre, tieneVarita);
        HechizosAtaqueFactory factory = new HechizosAtaqueFactory();
        HechizosDefensivosFactory factoryDefensa = new HechizosDefensivosFactory();
        capacidadHechicero.agregarHechizo(factory.crearHechizo(Nivel.AVANZADA));
        capacidadHechicero.agregarHechizo(factoryDefensa.crearHechizo(Nivel.AVANZADA));
    }

    @Override
    public void atacar(Hechizo hechizo, Combatiente objetivo) {
        // Implementación específica del ataque para el Profesor
    	if (this.puedeRealizarHechizo(hechizo))
    		hechizo.ejecutar(objetivo);
    }
}