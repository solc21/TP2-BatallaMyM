package classes.personajes;

import classes.Personaje;
import classes.magias.ataque.HechizoAtaque;
import interfaces.Combatiente;

public class Mago extends Personaje {
    private static final int PUNTOS_DE_VIDA_INICIAL = 100;
    private static final int NIVEL_DE_MAGIA_INICIAL = 10;

    public Mago(String nombre, boolean tieneVarita) {
        super(nombre, PUNTOS_DE_VIDA_INICIAL, NIVEL_DE_MAGIA_INICIAL, NIVEL_DE_MAGIA_INICIAL, tieneVarita);
    }
    
    @Override
    public void atacar(Combatiente objetivo) {
        // Implementar lógica de ataque específica para Auror
        HechizoAtaque hechizoAtaque = (HechizoAtaque) this.capacidadHechicero.getHechizoAtaque();

        if (hechizoAtaque != null) {
            if(puedeRealizarHechizo(hechizoAtaque)) {
                capacidadHechicero.consumirMagia(hechizoAtaque.getCoste());
                hechizoAtaque.ejecutar(objetivo);
            }
        }
    }
}