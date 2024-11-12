package classes;

import org.junit.jupiter.api.Test;

import classes.personajes.Auror;
import classes.personajes.Comandante;
import classes.personajes.Estudiante;
import classes.personajes.Seguidor;

import static org.junit.jupiter.api.Assertions.*;

public class BatallaTest {

    @Test
    public void testIniciarBatalla_Batallon1DeMagosGana() {
        // Simular la batalla hasta que uno de los batallones gane
        Batallon batallon1 = new Batallon();
        Batallon batallon2 = new Batallon();

        // Agregar personajes a los batallones
        batallon1.agregarPersonaje(new Auror("Auror1", true));
        batallon1.agregarPersonaje(new Auror("Auror2", true));
        batallon1.agregarPersonaje(new Auror("Auror3", true));
        batallon2.agregarPersonaje(new Seguidor("Seguidor1", false));

        Batalla batalla = new Batalla(batallon1, batallon2);
        
        batalla.iniciarBatalla();

        // Verificar que el batallón 1 ganó
        assertFalse(batallon1.estaDerrotado());
        assertTrue(batallon2.estaDerrotado());
    }

    @Test
    public void testIniciarBatalla_Batallon2DeMortifagosGana() {
        // Simular la batalla hasta que uno de los batallones gane
        Batallon batallon1 = new Batallon();
        Batallon batallon2 = new Batallon();

        // Agregar personajes a los batallones
        batallon1.agregarPersonaje(new Estudiante("Estudiante1", true));
        batallon2.agregarPersonaje(new Comandante("Comandante1", false));
        batallon2.agregarPersonaje(new Comandante("Comandante2", false));
        batallon2.agregarPersonaje(new Comandante("Comandante3", false));

        Batalla batalla = new Batalla(batallon1, batallon2);
        
        batalla.iniciarBatalla();

        // Verificar que el batallón 2 ganó
        assertTrue(batallon1.estaDerrotado());
        assertFalse(batallon2.estaDerrotado());
    }
}