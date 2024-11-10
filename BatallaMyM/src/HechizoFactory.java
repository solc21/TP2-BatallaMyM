
public abstract class HechizoFactory {

    public abstract Hechizo crearHechizo(Nivel nivel);

    public abstract Hechizo crearHechizo(TipoDeMagia tipo, Nivel nivel) ;
    /*{
        switch (tipo) {
            case DEFENSA:
                return new HechizosDefensivosFactory().crearHechizo(nivel);
            case ATAQUE:
                return new HechizosAtaqueFactory().crearHechizo(nivel);
            case OSCURA:
                return new AtaqueOscuroFactory().crearHechizo(nivel);
            case ESPECIAL:
                return new HabilidadesEspecialFactory().crearHechizo(nivel);
            default:
                throw new IllegalArgumentException("Tipo de magia no válido.");
        }
    }*/
}
