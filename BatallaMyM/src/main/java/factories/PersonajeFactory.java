package factories;

import classes.Personaje;
import classes.enums.TipoPersonaje;
import classes.personajes.*;

public class PersonajeFactory {

    public Personaje crearPersonaje(TipoPersonaje tipo, String nombre) {
        return switch (tipo) {
            case AUROR -> new Auror(nombre, true);
            case PROFESOR -> new Profesor(nombre, true);
            case ESTUDIANTE -> new Estudiante(nombre, false);
            case SEGUIDOR -> new Seguidor(nombre, false);
            case COMANDANTE -> new Comandante(nombre, true);
            default -> throw new IllegalArgumentException("Tipo de personaje no reconocido: " + tipo);
        };
    }

    public static Personaje crearMortifago() {
        // Crea aleatoriamente un Seguidor o un Comandante:

        if (Math.random() < 0.8) {
            return new Seguidor("Seguidor", false);
        } else {
            return new Comandante("Comandante", true);
        }
    }

    public static Personaje crearMago() {
        // Crea aleatoriamente un Estudiante, un Profesor o un Auror:

        double random = Math.random();
        if (random < 0.5) {
            return new Estudiante("Estudiante", false);
        } else if (random < 0.8) {
            return new Profesor("Profesor", true);
        } else {
            return new Auror("Auror", true);
        }

    }
}