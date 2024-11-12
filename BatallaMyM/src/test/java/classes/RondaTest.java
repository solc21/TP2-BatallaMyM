package classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.personajes.Auror;
import classes.personajes.Comandante;
import classes.personajes.Profesor;
import classes.personajes.Seguidor;

public class RondaTest {

    private Batallon batallon1;
    private Batallon batallon2;
    private Ronda ronda;

    @BeforeEach
    public void setUp() {
        batallon1 = new Batallon();
        batallon2 = new Batallon();

        // Agregar personajes a los batallones
        batallon1.agregarPersonaje(new Auror("Auror1", true));
        batallon1.agregarPersonaje(new Profesor("Profesor1", true));
        batallon2.agregarPersonaje(new Seguidor("Seguidor1", false));
        batallon2.agregarPersonaje(new Comandante("Comandante1", true));

        ronda = new Ronda(batallon1.getMiembros(), batallon2.getMiembros());
    }

    @Test
    public void testEjecutarRonda() {
        ronda.ejecutarRonda();
    }
}