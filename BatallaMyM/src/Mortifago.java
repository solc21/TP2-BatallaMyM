
public class Mortifago extends Personaje {

    protected static final int PUNTOS_DE_VIDA_INICIAL = 10;
    protected static final int NIVEL_DE_MAGIA_INICIAL = 10;
    
	public Mortifago(String nombre, int puntosDeVida, Varita varita, SistemaDefensivo sistemaDefensivo,
			CapacidadHechicero capacidadHechicero) {
		super(nombre, puntosDeVida, varita, sistemaDefensivo, capacidadHechicero);
		// TODO Auto-generated constructor stub
	}

    public void lanzarHechizo(Personaje personaje) {
        if (this.capacidadHechicero.tieneSuficienteMagia(2)) {
            Hechizo hechizo = new Crucio(); // Ejemplo de hechizo oscuro
            hechizo.ejecutar(personaje);
            this.capacidadHechicero.consumirMagia(2);
        }
    }

	@Override
	public int getNivelDePoder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
