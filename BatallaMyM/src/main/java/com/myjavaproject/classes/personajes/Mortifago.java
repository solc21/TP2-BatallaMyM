package com.myjavaproject.classes.personajes;

import com.myjavaproject.classes.Personaje;
import com.myjavaproject.classes.magias.oscuros.HechizoOscuro;
import com.myjavaproject.interfaces.Combatiente;

public class Mortifago extends Personaje {
    private static final int PUNTOS_DE_VIDA_INICIAL = 100;
    private static final int NIVEL_DE_MAGIA_INICIAL = 10;

    public Mortifago(String nombre, boolean tieneVarita) {
        super(nombre, PUNTOS_DE_VIDA_INICIAL, NIVEL_DE_MAGIA_INICIAL, NIVEL_DE_MAGIA_INICIAL, tieneVarita);
    }

    @Override
    public void atacar(Combatiente objetivo) {
        // Implementar lógica de ataque específica para Auror
        HechizoOscuro hechizoAtaque = (HechizoOscuro) this.capacidadHechicero.getHechizoAtaque();

        if (hechizoAtaque != null) {
            if(puedeRealizarHechizo(hechizoAtaque)) {
                capacidadHechicero.consumirMagia(hechizoAtaque.getCoste());
                hechizoAtaque.ejecutar(objetivo);
            }
        }
    }
}