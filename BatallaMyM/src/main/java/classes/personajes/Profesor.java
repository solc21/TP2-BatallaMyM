package classes.personajes;

import classes.enums.Nivel;
import factories.HechizosAtaqueFactory;
import factories.HechizosDefensivosFactory;

public class Profesor extends Mago {

    public Profesor(String nombre, boolean tieneVarita) {
        super(nombre, tieneVarita);
        HechizosAtaqueFactory factory = new HechizosAtaqueFactory();
        HechizosDefensivosFactory factoryDefensa = new HechizosDefensivosFactory();
        capacidadHechicero.agregarHechizo(factory.crearHechizo(Nivel.AVANZADA));
        capacidadHechicero.agregarHechizo(factoryDefensa.crearHechizo(Nivel.AVANZADA));
    }
}