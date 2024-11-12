package classes.personajes;

import classes.enums.Nivel;
import factories.AtaqueOscuroFactory;
import factories.HabilidadesEspecialFactory;

public class Comandante extends Mortifago {

    public Comandante(String nombre, boolean tieneVarita) {
        super(nombre, tieneVarita);
        AtaqueOscuroFactory factory = new AtaqueOscuroFactory();
        HabilidadesEspecialFactory factoryDefensa = new HabilidadesEspecialFactory();
        capacidadHechicero.agregarHechizo(factory.crearHechizo(Nivel.MUY_AVANZADA));
        capacidadHechicero.agregarHechizo(factoryDefensa.crearHechizo(Nivel.MUY_AVANZADA));
    }
}