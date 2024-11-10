public abstract class Personaje implements Combatiente {
    protected String nombre;
    protected int puntosDeVida;
    protected Varita varita;
    protected SistemaDefensivo sistemaDefensivo;
    protected CapacidadHechicero capacidadHechicero;

    public Personaje(String nombre, int puntosDeVida, Varita varita, 
                     SistemaDefensivo sistemaDefensivo, CapacidadHechicero capacidadHechicero) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.varita = varita;
        this.sistemaDefensivo = sistemaDefensivo;
        this.capacidadHechicero = capacidadHechicero;
    }

    public void atacar(Hechizo hechizo, Combatiente objetivo) {
        if (puedeRealizarHechizo(hechizo)) {
            hechizo.ejecutar(this);
        }
    }

    public void recibirDanio(int cantidad) {
        int danioReducido = sistemaDefensivo.calcularDanioReducido(cantidad);
        puntosDeVida -= danioReducido;
    }

    public boolean estaActivo() {
        return puntosDeVida > 0;
    }

    protected boolean puedeRealizarHechizo(Hechizo hechizo) {
        return varita.puedeUsarse() && capacidadHechicero.tieneHechizo(hechizo);
    }
}
