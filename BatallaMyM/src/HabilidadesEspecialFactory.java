
public class HabilidadesEspecialFactory extends HechizoFactory {

	@Override
    public Hechizo crearHechizo(Nivel nivel) {
        switch (nivel) {
            case PRINCIPIANTE:
                return new ProtegoDiabolica();
            case AVANZADA:
                return new SectumSempra();
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
