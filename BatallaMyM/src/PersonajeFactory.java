public abstract class PersonajeFactory {
    
    // Método para crear un personaje según el tipo de personaje
    public Personaje crearPersonaje(TipoPersonaje tipo) {
        switch (tipo) {
            case AUROR:
            case PROFESOR:
            case ESTUDIANTE:
                return crearMago(tipo);
            case SEGUIDOR:
            case COMANDANTE:
                return crearMortifago(tipo);
            default:
                throw new IllegalArgumentException("Tipo de personaje no reconocido.");
        }
    }

    // Métodos que serán implementados en subclases
    protected abstract Personaje crearMago(TipoPersonaje tipo);
    protected abstract Personaje crearMortifago(TipoPersonaje tipo);
}