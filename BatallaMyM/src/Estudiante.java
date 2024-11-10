
public class Estudiante extends Mago {
	
    public Estudiante(String nombre, int puntosDeVida, Varita varita, SistemaDefensivo sistemaDefensivo,
			CapacidadHechicero capacidadHechicero) {
		super(nombre, puntosDeVida, varita, sistemaDefensivo, capacidadHechicero);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void lanzarHechizo(Personaje personaje) {
        System.out.println("Estudiante intenta lanzar un hechizo");
        Hechizo hechizo = new Desmaius(); // Ejemplo de hechizo
        hechizo.ejecutar(personaje);
    }
}
