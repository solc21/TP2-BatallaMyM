
public class Seguidor extends Mortifago {
	
    public Seguidor(String nombre, int puntosDeVida, Varita varita, SistemaDefensivo sistemaDefensivo,
			CapacidadHechicero capacidadHechicero) {
		super(nombre, puntosDeVida, varita, sistemaDefensivo, capacidadHechicero);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void lanzarHechizo(Personaje personaje) {
        System.out.println("Seguidor lanza un hechizo de ataque");
        Hechizo hechizo = new Confringo(); // Ejemplo de hechizo
        hechizo.ejecutar(personaje);
    }

}
