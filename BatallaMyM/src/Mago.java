//import java.util.Set;

public class Mago extends Personaje {
    protected static final int PUNTOS_DE_VIDA_INICIAL = 5;
    protected static final int NIVEL_DE_MAGIA_INICIAL = 10;

    public Mago(String nombre, int puntosDeVida, Varita varita, 
            SistemaDefensivo sistemaDefensivo, CapacidadHechicero capacidadHechicero) {
    	super(nombre, puntosDeVida, varita, sistemaDefensivo, capacidadHechicero);
        
    }

    public void lanzarHechizo(Personaje personaje) {
        if (this.capacidadHechicero.tieneSuficienteMagia(1)) {
            Hechizo hechizo = new Expelliarmus(); // Ejemplo de hechizo
            hechizo.ejecutar(personaje);
            this.capacidadHechicero.consumirMagia(1);
        }
    }

	@Override
	public int getNivelDePoder() {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
}