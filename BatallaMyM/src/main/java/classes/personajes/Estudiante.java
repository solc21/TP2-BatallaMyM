package classes.personajes;

import classes.enums.Nivel;
import factories.HechizosAtaqueFactory;
import factories.HechizosDefensivosFactory;

public class Estudiante extends Mago {

    public Estudiante(String nombre, boolean tieneVarita) {
        super(nombre, tieneVarita);
        HechizosAtaqueFactory factory = new HechizosAtaqueFactory();
        HechizosDefensivosFactory factoryDefensa = new HechizosDefensivosFactory();
        capacidadHechicero.agregarHechizo(factory.crearHechizo(Nivel.PRINCIPIANTE));
        capacidadHechicero.agregarHechizo(factoryDefensa.crearHechizo(Nivel.PRINCIPIANTE));
    }
}