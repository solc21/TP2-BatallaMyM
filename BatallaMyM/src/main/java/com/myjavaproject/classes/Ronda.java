package com.myjavaproject.classes;

import com.myjavaproject.interfaces.Combatiente;
import com.myjavaproject.interfaces.Hechizo;

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
        if(orden) {
        	this.ordenDeTurnos = combinarMiembrosAlternados(equipo1, equipo2);
        } else {
        	this.ordenDeTurnos = combinarMiembrosAlternados(equipo2, equipo1);
        }
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
                Hechizo hechizo = generarEstrategiaAtaque(personaje);
                Personaje objetivo = generarEstrategiaDefensa(personaje, hechizo);

                //Verificar que el hechizo no esté en el Set, si está, pierde el turno:
                if(hechizosUsados.contains(hechizo)) {
                	System.out.println("El hechizo " + hechizo.getNombre() + " ya fue usado en esta ronda.");
                	continue;
                }

                if (hechizo != null && objetivo != null) {
                    if(personaje.puedeRealizarHechizo(hechizo)) {
                        hechizo.ejecutar(objetivo);
                        personaje.capacidadHechicero.consumirMagia(hechizo.getCoste());
                        registrarHechizo(personaje, hechizo);
                    } else {
                        System.out.println(personaje.getNombre() + " no puede realizar el hechizo, se quedó sin magia, pierde el turno mientras carga magia.");
                    }
                }
                personaje.capacidadHechicero.aumentarMagia(2);
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Fin de la ronda");
        System.out.println("-------------------------------------------");
    }

    private Hechizo generarEstrategiaAtaque(Personaje combatiente) {
        if (combatiente instanceof Personaje) {
            return ((Personaje) combatiente).capacidadHechicero.getHechizoAtaque();
        }
        return null;
    }

    private Personaje generarEstrategiaDefensa(Personaje combatiente, Hechizo hechizo) {
        List<Combatiente> equipoOpuesto = equipo1.contains(combatiente) ? equipo2 : equipo1;
        for (Combatiente miembro : equipoOpuesto) {
            if (!miembro.estaDerrotado()) {
                return (Personaje) miembro;
            }
        }
        return null;
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