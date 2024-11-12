package integracionProlog;

import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegracionTest {

    @Test
    public void testSeleccionarObjetivoDefensa() {
        // Inicializar Prolog
        String t1 = "consult('src/main/prolog/estrategiaDefensa.pl')";
        Query q1 = new Query(t1);
        assertTrue(q1.hasSolution());

        // Actualizar la base de conocimiento
        Query q2 = new Query("assertz(personaje('Harry', 100))");
        q2.hasSolution();
        Query q3 = new Query("assertz(personaje('Ron', 80))");
        q3.hasSolution();
        Query q4 = new Query("assertz(personaje('Hermione', 120))");
        q4.hasSolution();

        // Llamar al predicado seleccionar_objetivo_defensa
        String consulta = "seleccionar_objetivo_defensa(Objetivo)";
        Query q5 = new Query(consulta);
        assertTrue(q5.hasSolution());
        Term objetivoTerm = q5.oneSolution().get("Objetivo");
        assertEquals("Hermione", objetivoTerm.name());
    }

    @Test
    public void testSeleccionarCompaneroDebil() {
        // Inicializar Prolog
        String t1 = "consult('src/main/prolog/estrategiaAtaque.pl')";
        Query q1 = new Query(t1);
        assertTrue(q1.hasSolution());

        // Actualizar la base de conocimiento
        Query q2 = new Query("assertz(personaje('Harry', 25))");
        q2.hasSolution();
        Query q3 = new Query("assertz(personaje('Ron', 80))");
        q3.hasSolution();
        Query q4 = new Query("assertz(personaje('Hermione', 120))");
        q4.hasSolution();

        // Llamar al predicado seleccionar_companero_debil
        String consulta = "seleccionar_companero_debil(Companero)";
        Query q5 = new Query(consulta);
        assertTrue(q5.hasSolution());
        Term companeroTerm = q5.oneSolution().get("Companero");
        assertEquals("Harry", companeroTerm.name());
    }
}