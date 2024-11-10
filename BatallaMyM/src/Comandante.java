
public class Comandante extends Mortifago {
	
    public Comandante(String nombre, int puntosDeVida, Varita varita, SistemaDefensivo sistemaDefensivo,
			CapacidadHechicero capacidadHechicero) {
		super(nombre, puntosDeVida, varita, sistemaDefensivo, capacidadHechicero);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void lanzarHechizo(Personaje personaje) {
        System.out.println("Comandante lanza un hechizo oscuro");
        Hechizo hechizo = new AvadaKedavra(); // Ejemplo de hechizo
        hechizo.ejecutar(personaje);
    }
}
