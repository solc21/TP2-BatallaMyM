
public class MortifagoFactory extends PersonajeFactory  {

    @Override
    protected Personaje crearMago(TipoPersonaje tipo) {
        throw new UnsupportedOperationException("MortifagoFactory no puede crear Magos.");
    }

    @Override
    protected Personaje crearMortifago(TipoPersonaje tipo) {
        switch (tipo) {
            case SEGUIDOR:
//                return new Seguidor();
            case COMANDANTE:
//                return new Comandante();
            default:
                throw new IllegalArgumentException("Tipo de Mortífago no válido.");
        }
    }

}
