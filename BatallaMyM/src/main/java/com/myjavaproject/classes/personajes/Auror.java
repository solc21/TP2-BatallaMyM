package com.myjavaproject.classes.personajes;

import com.myjavaproject.classes.factories.HechizosAtaqueFactory;
import com.myjavaproject.classes.factories.HechizosDefensivosFactory;
import com.myjavaproject.enums.Nivel;
import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Auror extends Mago {

    public Auror(String nombre, boolean tieneVarita) {
        super(nombre, tieneVarita);
        HechizosAtaqueFactory factory = new HechizosAtaqueFactory();
        HechizosDefensivosFactory factoryDefensa = new HechizosDefensivosFactory();
        capacidadHechicero.agregarHechizo(factory.crearHechizo(Nivel.MUY_AVANZADA));
        capacidadHechicero.agregarHechizo(factoryDefensa.crearHechizo(Nivel.MUY_AVANZADA));
    }

    @Override
    public void atacar(Hechizo hechizo, Combatiente objetivo) {
        // Implementar lógica de ataque específica para Auror
    	if (this.puedeRealizarHechizo(hechizo))
    		hechizo.ejecutar(objetivo);
    }
}