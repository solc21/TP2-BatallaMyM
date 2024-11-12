package classes;

import org.jpl7.Query;
import org.jpl7.Term;

import interfaces.Combatiente;
import interfaces.Hechizo;

import java.util.*;

public class Ronda {
    private List<Personaje> ordenDeTurnos;
    private Map<Personaje, Hechizo> hechizosLanzados;
    private Set<Hechizo> hechizosUsados;
    private List<Combatiente> equipo1;
    private List<Combatiente> equipo2;

    public Ronda(List<Combatiente> equipo1, List<Combatiente> equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.hechizosLanzados = new HashMap<>();
        this.hechizosUsados = new HashSet<>();

        Random rand = new Random();

        boolean orden = rand.nextBoolean();
        if (orden) {
            this.ordenDeTurnos = combinarMiembrosAlternados(equipo1, equipo2);
        } else {
            this.ordenDeTurnos = combinarMiembrosAlternados(equipo2, equipo1);
        }

        // Inicializar Prolog
        String t1 = "consult('src/main/prolog/estrategiaDefensa.pl')";
        Query q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasSolution() ? "succeeded" : "failed"));

        String t2 = "consult('src/main/prolog/estrategiaAtaque.pl')";
        Query q2 = new Query(t2);
        System.out.println(t2 + " " + (q2.hasSolution() ? "succeeded" : "failed"));
    }

    private List<Personaje> combinarMiembrosAlternados(List<Combatiente> equipo1, List<Combatiente> equipo2) {
        List<Personaje> todosLosMiembros = new ArrayList<>();
        int maxSize = Math.max(equipo1.size(), equipo2.size());

        for (int i = 0; i < maxSize; i++) {
            if (i < equipo1.size()) {
                todosLosMiembros.add((Personaje) equipo1.get(i));
            }
            if (i < equipo2.size()) {
                todosLosMiembros.add((Personaje) equipo2.get(i));
            }
        }

        return todosLosMiembros;
    }

    public void ejecutarRonda() {
        System.out.println("-------------------------------------------");
        System.out.println("Comienza una nueva ronda");
        System.out.println("-------------------------------------------");
        this.quienAtacaPrimero(ordenDeTurnos.get(0));
        for (Personaje personaje : ordenDeTurnos) {
            if (!personaje.estaDerrotado()) {
                // Lógica para seleccionar un hechizo y un objetivo
                Personaje companieroDebil = generarEstrategiaAtaque(personaje);
                Hechizo hechizo;
                if(companieroDebil == null) {
                    hechizo = personaje.capacidadHechicero.getHechizoAtaque();
                } else {
                    hechizo = personaje.capacidadHechicero.getHechizoDefensa();

                    // Verificar que el hechizo no esté en el Set, si está, pierde el turno:
                    if (hechizosUsados.contains(hechizo)) {
                        System.out.println("El hechizo " + hechizo.getNombre() + " ya fue usado en esta ronda.");
                        continue;
                    }

                    if(personaje.puedeRealizarHechizo(hechizo)) {
                        hechizo.ejecutar(companieroDebil);
                        personaje.capacidadHechicero.consumirMagia(hechizo.getCoste());
                        registrarHechizo(personaje, hechizo);
                        personaje.capacidadHechicero.aumentarMagia(2);
                        continue;
                    } else {
                        System.out.println(personaje.getNombre() + " no puede proteger a su compañero, se quedó sin magia, pierde el turno mientras carga magia.");
                        personaje.capacidadHechicero.aumentarMagia(5);
                    }
                }

                Personaje objetivo = generarEstrategiaDefensa(personaje);

                // Verificar que el hechizo no esté en el Set, si está, pierde el turno:
                if (hechizosUsados.contains(hechizo)) {
                    System.out.println("El hechizo " + hechizo.getNombre() + " ya fue usado en esta ronda.");
                    continue;
                }

                if (hechizo != null && objetivo != null) {
                    if (personaje.puedeRealizarHechizo(hechizo)) {
                        hechizo.ejecutar(objetivo);
                        personaje.capacidadHechicero.consumirMagia(hechizo.getCoste());
                        registrarHechizo(personaje, hechizo);
                    } else {
                        System.out.println(personaje.getNombre() + " no puede realizar el hechizo, se quedó sin magia, pierde el turno mientras carga magia.");
                    }
                }
                personaje.capacidadHechicero.aumentarMagia(4);
            }
        }
        for (Personaje personaje : ordenDeTurnos) {
            if (!personaje.estaDerrotado()) {
                personaje.sistemaDefensivo.quitarProteccion();
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Fin de la ronda");
        System.out.println("-------------------------------------------");
    }

    private Personaje generarEstrategiaAtaque(Personaje combatiente) {
        // Actualizar la base de conocimiento en Prolog
        actualizarBaseDeConocimientoAtaque(combatiente);

        // Llamar al predicado Prolog para seleccionar el compañero débil
        String consulta = "seleccionar_companero_debil(Companero)";
        Query q = new Query(consulta);
        if (q.hasSolution()) {
            Term companeroTerm = q.oneSolution().get("Companero");
            String nombreCompanero = companeroTerm.name();
            for (Combatiente miembro : equipo1) {
                Personaje personaje = (Personaje) miembro;
                if (personaje.getNombre().equals(nombreCompanero)) {
                    System.out.println("El compañero débil es: " + personaje.getNombre() + " del equipo 1 con " + personaje.getPuntosDeVida() + " puntos de vida.");
                    return personaje;
                }
            }
            for (Combatiente miembro : equipo2) {
                Personaje personaje = (Personaje) miembro;
                if (personaje.getNombre().equals(nombreCompanero)) {
                    System.out.println("El compañero débil es: " + personaje.getNombre() + " del equipo 2 con " + personaje.getPuntosDeVida() + " puntos de vida.");
                    return personaje;
                }
            }
        }
        return null;
    }

    private Personaje generarEstrategiaDefensa(Personaje combatiente) {
        // Actualizar la base de conocimiento en Prolog
        actualizarBaseDeConocimientoDefensa(combatiente);

        // Llamar al predicado Prolog para seleccionar el objetivo de defensa
        String consulta = "seleccionar_objetivo_defensa(Objetivo)";
        Query q = new Query(consulta);
        if (q.hasSolution()) {
            Term objetivoTerm = q.oneSolution().get("Objetivo");
            String nombreObjetivo = objetivoTerm.name();
            for (Combatiente miembro : equipo1) {
                Personaje personaje = (Personaje) miembro;
                if (personaje.getNombre().equals(nombreObjetivo)) {
                    System.out.println("El objetivo de ataque es: " + personaje.getNombre() + " del equipo 1 ya que tiene " + personaje.getPuntosDeVida() + " puntos de vida.");
                    return (Personaje) miembro;
                }
            }
            for (Combatiente miembro : equipo2) {
                Personaje personaje = (Personaje) miembro;
                if (personaje.getNombre().equals(nombreObjetivo)) {
                    System.out.println("El objetivo de ataque es: " + personaje.getNombre() + " del equipo 2 ya que tiene " + personaje.getPuntosDeVida() + " puntos de vida.");
                    return (Personaje) miembro;
                }
            }
        }
        return null;
    }

    private void actualizarBaseDeConocimientoAtaque(Personaje combatiente) {
        // Limpiar la base de conocimiento actual
        Query q1 = new Query("retractall(personaje(_, _))");
        q1.hasSolution();

        // Agregar los personajes y sus puntos de vida a la base de conocimiento
        if (this.equipo1.contains(combatiente)) {
            List<Combatiente> equipoFiltrado = new ArrayList<>();
            for (Combatiente miembro : equipo1) {
                Personaje personaje = (Personaje) miembro;
                if(!personaje.estaDerrotado()) {
                    equipoFiltrado.add(personaje);
                }
            }
            if(equipoFiltrado.size() <= 1)
                return;
            for (Combatiente miembro : equipoFiltrado) {
                Personaje personaje = (Personaje) miembro;
                String consulta = String.format("assertz(personaje('%s', %d))", personaje.getNombre(), ((int)personaje.getPuntosDeVida() + (int)personaje.sistemaDefensivo.nivelDeProteccion()));
                Query q3 = new Query(consulta);
                q3.hasSolution();
            }
        } else {
            List<Combatiente> equipoFiltrado = new ArrayList<>();
            for (Combatiente miembro : equipo2) {
                Personaje personaje = (Personaje) miembro;
                if(!personaje.estaDerrotado()) {
                    equipoFiltrado.add(personaje);
                }
            }
            if(equipoFiltrado.size() <= 1)
                return;
            for (Combatiente miembro : equipoFiltrado) {
                Personaje personaje = (Personaje) miembro;
                if(personaje.estaDerrotado()) {
                    continue;
                }
                String consulta = String.format("assertz(personaje('%s', %d))", personaje.getNombre(), ((int) personaje.getPuntosDeVida() + (int) personaje.sistemaDefensivo.nivelDeProteccion()));
                Query q2 = new Query(consulta);
                q2.hasSolution();
            }
        }
    }

    private void actualizarBaseDeConocimientoDefensa(Personaje combatiente) {
        // Limpiar la base de conocimiento actual
        Query q1 = new Query("retractall(personaje(_, _))");
        q1.hasSolution();

        // Agregar los personajes y sus puntos de vida a la base de conocimiento
        if (this.equipo1.contains(combatiente)) {
            for (Combatiente miembro : equipo2) {
                Personaje personaje = (Personaje) miembro;
                if(personaje.estaDerrotado()) {
                    continue;
                }
                String consulta = String.format("assertz(personaje('%s', %d))", personaje.getNombre(), (((Personaje) miembro).getPuntosDeVida()) + personaje.sistemaDefensivo.nivelDeProteccion());
                Query q3 = new Query(consulta);
                q3.hasSolution();
            }
        } else {
            for (Combatiente miembro : equipo1) {
                Personaje personaje = (Personaje) miembro;
                if(personaje.estaDerrotado()) {
                    continue;
                }
                String consulta = String.format("assertz(personaje('%s', %d))", personaje.getNombre(), (((Personaje) miembro).getPuntosDeVida()) + personaje.sistemaDefensivo.nivelDeProteccion());
                Query q2 = new Query(consulta);
                q2.hasSolution();
            }
        }
    }

    private void registrarHechizo(Personaje combatiente, Hechizo hechizo) {
        hechizosUsados.add(hechizo);
        hechizosLanzados.put(combatiente, hechizo);
    }

    private void quienAtacaPrimero(Personaje combatiente) {
        if (this.equipo1.contains(combatiente)) {
            System.out.println("El equipo 1 ataca primero");
        } else {
            System.out.println("El equipo 2 ataca primero");
        }
    }

    public void reiniciarHechizos() {
        hechizosUsados.clear();
    }
}