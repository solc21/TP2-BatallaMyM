package classes.personajes;

import classes.enums.Nivel;
import factories.AtaqueOscuroFactory;
import factories.HabilidadesEspecialFactory;

public class Seguidor extends Mortifago {

    public Seguidor(String nombre, boolean tieneVarita) {
        super(nombre, tieneVarita);
        AtaqueOscuroFactory factory = new AtaqueOscuroFactory();
        HabilidadesEspecialFactory factoryDefensa = new HabilidadesEspecialFactory();
        capacidadHechicero.agregarHechizo(factory.crearHechizo(Nivel.MEDIO));
        capacidadHechicero.agregarHechizo(factoryDefensa.crearHechizo(Nivel.MEDIO));
    }
}