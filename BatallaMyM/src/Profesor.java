
public class Profesor extends Mago {
	
    public Profesor(String nombre, int puntosDeVida, Varita varita, SistemaDefensivo sistemaDefensivo,
			CapacidadHechicero capacidadHechicero) {
		super(nombre, puntosDeVida, varita, sistemaDefensivo, capacidadHechicero);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void lanzarHechizo(Personaje personaje) {
        System.out.println("Profesor lanza un hechizo educativo");
        Hechizo hechizo = new Incendio(); // Ejemplo de hechizo
        hechizo.ejecutar(personaje);
    }
}
