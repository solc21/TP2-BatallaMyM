import java.util.Set;

public class CapacidadHechicero {
    private int nivelDeMagia;
    private int nivelDeMagiaActual;
    private Set<Hechizo> hechizos;

    public CapacidadHechicero(int nivelDeMagia, Set<Hechizo> hechizos) {
        this.nivelDeMagia = nivelDeMagia;
        this.nivelDeMagiaActual = nivelDeMagia;
        this.hechizos = hechizos;
    }


    public boolean tieneHechizo(Hechizo hechizo) {
        return hechizos.contains(hechizo);
    }

    public boolean tieneSuficienteMagia(int coste) {
        return nivelDeMagiaActual >= coste;
    }

    public void consumirMagia(int cantidad) {
        nivelDeMagiaActual -= cantidad;
    }
}

