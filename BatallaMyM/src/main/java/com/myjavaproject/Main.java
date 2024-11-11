package com.myjavaproject;

import com.myjavaproject.classes.Batalla;
import com.myjavaproject.classes.Batallon;
import com.myjavaproject.classes.factories.PersonajeFactory;

public class Main {
    public static void main(String[] args) {
        Batallon batallonMagos = new Batallon();
        Batallon batallonMortifagos = new Batallon();

        for (int i = 0; i < 3; i++) {
          batallonMagos.agregarPersonaje(PersonajeFactory.crearMago());
          batallonMortifagos.agregarPersonaje(PersonajeFactory.crearMortifago());
        }

        // Iniciar la batalla
        Batalla batalla = new Batalla(batallonMagos, batallonMortifagos);
        batalla.iniciarBatalla();
    }
}