package com.myjavaproject.classes.personajes;

import com.myjavaproject.classes.factories.AtaqueOscuroFactory;
import com.myjavaproject.classes.factories.HabilidadesEspecialFactory;
import com.myjavaproject.enums.Nivel;
import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

public class Comandante extends Mortifago {

    public Comandante(String nombre, boolean tieneVarita) {
        super(nombre, tieneVarita);
        AtaqueOscuroFactory factory = new AtaqueOscuroFactory();
        HabilidadesEspecialFactory factoryDefensa = new HabilidadesEspecialFactory();
        capacidadHechicero.agregarHechizo(factory.crearHechizo(Nivel.MUY_AVANZADA));
        capacidadHechicero.agregarHechizo(factoryDefensa.crearHechizo(Nivel.MUY_AVANZADA));
    }

    @Override
    public void atacar(Hechizo hechizo, Combatiente objetivo) {
        // Implementar la lógica de ataque específica para Comandante
    	if (this.puedeRealizarHechizo(hechizo))
    		hechizo.ejecutar(objetivo);
    }
}