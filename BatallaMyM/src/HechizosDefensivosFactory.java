
public class HechizosDefensivosFactory extends HechizoFactory {

	@Override
    public Hechizo crearHechizo(Nivel nivel) {
        switch (nivel) {
            case PRINCIPIANTE:
                return new Protego();
            case MUY_AVANZADA:
                return new Abalio();
            default:
                throw new IllegalArgumentException("Nivel no soportado.");
        }
    }

	@Override
	public Hechizo crearHechizo(TipoDeMagia tipo, Nivel nivel) {
		// TODO Auto-generated method stub
		return null;
	}
}
