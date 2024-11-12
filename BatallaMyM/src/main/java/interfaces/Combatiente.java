package interfaces;

import java.util.List;

public interface Combatiente {
    void atacar(Combatiente objetivo);
    void recibirDanio(int cantidad);
    void recibirProteccion(int cantidad);
    boolean estaActivo();
    boolean estaDerrotado();
    List<Combatiente> getMiembros();
}