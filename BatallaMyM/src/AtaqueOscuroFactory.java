
public class AtaqueOscuroFactory extends HechizoFactory {

	@Override
    public Hechizo crearHechizo(Nivel nivel) {
        switch (nivel) {
            case MEDIO:
                return new Crucio();
            case MUY_AVANZADA:
                return new AvadaKedavra();
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
